  
SELECT DES_SUBG_VENT,
	   DES_REGI,
	   DES_ZONA,
	   NUM_CONC NUM_CONCURSO,
	   VAL_NOMB,
	   PERIODO_DESDE,
	   PERIODO_HASTA,
	   GRUPO_DES,
	   GRUPO_HAS,
	   TOTAL_CON_RANGO,
	   PORC_CONS_RANGO,
	   SUM(PORC_CONS_RANGO) OVER (PARTITION BY DES_SUBG_VENT, DES_REGI, DES_ZONA, NUM_CONC ORDER BY ROWNUM) ACUM,
       N_CON_META,
	   PORC_CUM_METAS
FROM
(
	SELECT DES_SUBG_VENT,
		   DES_REGI,
		   DES_ZONA,
		   NUM_CONC,
		   VAL_NOMB,
		   PERIODO_DESDE,
		   PERIODO_HASTA,
		   GRUPO,
		   CASE WHEN (GRUPO = 1000) THEN
		   	   GRUPO
		   ELSE
		   	   GRUPO + 1
		   END GRUPO_DES,
		   CASE WHEN (GRUPO < 3000) THEN
		   		GRUPO + 500
		   ELSE
		   	    GRUPO + 1000
		   END GRUPO_HAS,	   
		   TOTAL_CONSULTORAS,
		   COUNT(*) TOTAL_CON_RANGO,
		   DECODE(COUNT(*),0,0,(COUNT(*)/TOTAL_CONSULTORAS)*100) PORC_CONS_RANGO,
		   SUM(IND_SUPE_MET) N_CON_META,
		   DECODE(COUNT(*),0,0,(SUM(IND_SUPE_MET)/COUNT(*))*100) PORC_CUM_METAS
	FROM
	(
			SELECT PC.NUM_CONC,
				   PC.VAL_NOMB,
				   PER_DESDE.VAL_NOMB_PERI PERIODO_DESDE,
				   PER_HASTA.VAL_NOMB_PERI PERIODO_HASTA,
				   SUBG.DES_SUBG_VENT,
				   REG.DES_REGI,
				   ZONA.DES_ZONA,
				   MET.CLIE_OID_CLIE,
				   own_peru.FN_072_RANGO(MET.VAL_META * MONEDA.TIP_CAM) GRUPO,
				   --------------------------------------------------------------------------------------------
				   NVL((
				   SELECT 1
				   FROM INC_CANDI_GANAD CG
				   WHERE CG.CLIE_OID_CLIE = MET.CLIE_OID_CLIE
				   		 AND CG.COPA_OID_PARA_GRAL = PC.OID_PARA_GRAL
						 AND CG.IND_META_SUPE = 1
						 AND ROWNUM = 1
				   ), 0) IND_SUPE_MET,
				 COUNT(DISTINCT met.CLIE_OID_CLIE) OVER (PARTITION BY DES_SUBG_VENT, DES_REGI, DES_ZONA, NUM_CONC) TOTAL_CONSULTORAS								
			FROM INC_CONCU_PARAM_GENER PC,
				 INC_PLANT_CONCU PLA_CON,
				 INC_METAS_TIPO_VENTA MET,
				 MAE_CLIEN_UNIDA_ADMIN CLI_UA,
				 ZON_SUB_GEREN_VENTA SUBG,
				 ZON_REGIO REG,
				 ZON_ZONA ZONA,
				 ZON_SECCI SEC,
				 ZON_TERRI_ADMIN TER_ADM,
				 MAE_CLIEN_TIPO_SUBTI CLI_SUB,
				 MAE_CLIEN_CLASI CLA,
				 CRA_PERIO PER_DESDE,
				 CRA_PERIO PER_HASTA,
				 (
				 SELECT CASE WHEN (PAIS.MONE_OID_MONE = 1) THEN			 -- PARAMETRO DE MONEDA DE REFENCIA --
				 			 1
						ELSE
							 (SELECT TC.VAL_TIPO_CAMB
							 FROM SEG_TIPO_CAMBI TC
							 WHERE TC.MONE_OID_MON1 = PAIS.MONE_OID_MONE 
							 	   AND TC.MONE_OID_MON2 = 1				 -- PARAMETRO DE MONEDA REFENCIA --
								   AND TC.FEC_DESD <= SYSDATE
								   AND TC.FEC_HAST >= SYSDATE
							 )
						END TIP_CAM
				 FROM SEG_PAIS PAIS
				 WHERE PAIS.OID_PAIS = 1	  		 	   	   			 -- PARAMETRO DE PAIS --
				 ) MONEDA
			WHERE PC.OID_PARA_GRAL = 1						-- PARAMETRO DE NUMERO DE CONCURSO --
				  AND MET.COPA_OID_PARA_GRAL = PC.OID_PARA_GRAL
				  AND CLI_UA.CLIE_OID_CLIE = MET.CLIE_OID_CLIE
				  AND SUBG.OID_SUBG_VENT = REG.ZSGV_OID_SUBG_VENT
				  AND REG.OID_REGI = ZONA.ZORG_OID_REGI
				  AND ZONA.OID_ZONA = SEC.ZZON_OID_ZONA
				  AND SEC.OID_SECC = TER_ADM.ZSCC_OID_SECC
				  AND TER_ADM.OID_TERR_ADMI = CLI_UA.ZTAD_OID_TERR_ADMI
				  AND CLI_UA.IND_ACTI = 1
				  AND PC.IND_ACTI = 1
				  AND PLA_CON.OID_PLAN_CONC = PC.PLC2_OID_PLAN_CONC
				  AND PC.PERD_OID_PERI_DESD = PER_DESDE.OID_PERI
				  AND PC.PERD_OID_PERI_HAST = PER_HASTA.OID_PERI
				  ---------------------------------------------------------------------------------------------
				  AND CLI_SUB.CLIE_OID_CLIE = CLI_UA.CLIE_OID_CLIE
				  ---------------------------------------------------------------------------------------------
				  AND CLA.CTSU_OID_CLIE_TIPO_SUBT = CLI_SUB.OID_CLIE_TIPO_SUBT
				  AND CLA.IND_PPAL = 1
				  AND CLI_SUB.IND_PPAL = 1
				  AND PLA_CON.VAL_FASE_CALI = 1 
				  AND SUBG.CANA_OID_CANA = 1 				   	 -- PARAMETRO DE CANAL --
				  AND SUBG.MARC_OID_MARC = 1					 -- PARAMETRO DE MARCA --
				  AND SUBG.PAIS_OID_PAIS = 1					 -- PARAMETRO DE PAIS --
				  AND SUBG.OID_SUBG_VENT IN (1,2,3,4,5,6,7,8,9)  -- PARAMETRO DE SUBGERENCIA DE VENTAS --
				  AND REG.OID_REGI IN (1,2,3,4,5,6,7,8,9) 		 -- PARAMETRO DE REGION --
				  AND ZONA.OID_ZONA IN (1,2,3,4,5,6,7,8,9)		 -- PARAMETRO DE ZONA -- 
--				  AND CLA.TCCL_OID_TIPO_CLASI in (1)		  							  	   	   -- PARAMETRO DE TIPO DE CLASIFICACION --
--				  AND CLA.CLAS_OID_CLAS in (1)				  							  	   	   -- PARAMETRO DE CLASIFICION -- 
--				  AND CLI_SUB.TICL_OID_TIPO_CLIE in (2)	   							   	   -- PARAMETRO DE TIPO DE CLIENTE --
--				  AND CLI_SUB.SBTI_OID_SUBT_CLIE in (1)									   -- PARAMETRO DE SUBTIPO DE CLIENTE --
				  AND PLA_CON.TVEN_OID_TIPO_VENT = 1									   -- PARAMETRO DE TIPO DE VENTA --
	)   
	GROUP BY DES_SUBG_VENT,
		   DES_REGI,
		   DES_ZONA,
		   NUM_CONC,
		   VAL_NOMB,
		   GRUPO,
		   TOTAL_CONSULTORAS,
		   PERIODO_DESDE,
		   PERIODO_HASTA
)
WHERE GRUPO IN (0,49000) 	 					   -- PARAMETRO DE RANGO DE VENTA --

