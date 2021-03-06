SELECT VAL_I18N, DES_REGI, VAL_NOMB_PERI, POSTULANTES, ATEN_RETRASO, ATEN_A_TIEMPO, ELIMINADAS, CONSULTORAS,
       (CONSULTORAS / POSTULANTES) VAR_CON, POS_EST_PEND_REG, POS_EST_PEND_APRO,
    (POSTULANTES - (POS_EST_PEND_APRO + POS_EST_PEND_REG)) ATENDIDAS, NUME_POS_CANAL,POS_CAN_CON
FROM
(
SELECT VAL_I18N, MARC_OID_MARC, CANA_OID_CANA, COD_REGI, OID_TIPO_CLIE, DES_REGI, VAL_NOMB_PERI, 
  	   NVL(COUNT(*), 0) POSTULANTES, NVL(SUM(ATEN_RETRASO), 0) ATEN_RETRASO, NVL(SUM(ATEN_A_TIEMPO), 0) ATEN_A_TIEMPO,
	   NVL(SUM(ELIMINADAS), 0) ELIMINADAS, NVL(SUM(CONSULTORAS),0) CONSULTORAS, 
	   NVL(SUM(POS_EST_PEND_REG),0) POS_EST_PEND_REG, NVL(SUM(POS_EST_PEND_APRO), 0) POS_EST_PEND_APRO,
	   NVL(SUM(NUME_POS_CANAL), 0) NUME_POS_CANAL, NVL(SUM(POS_CAN_CON), 0) POS_CAN_CON	     
FROM(
	SELECT GEN_PAIS.VAL_I18N, CON.OID_CONT, REG.MARC_OID_MARC, REG.CANA_OID_CANA, REG.COD_REGI, ZON.COD_ZONA, REG.DES_REGI, 
	       FECHA.VAL_NOMB_PERI, ZON.DES_ZONA, MAE_TIP_CLI.OID_TIPO_CLIE, CON.CLIE_OID_CLIE,		  
			(
			SELECT 1              -- NUMERO DE ATENDIDAS CON RETRASO --
		  	FROM CAL_CONTA CAL_CON,
				 CAL_ATRIB_ESTAD_CONTA ATR_EST, 
				 CAL_TIPO_ESTAD_CONTA TIP_EST				 
			WHERE  TIP_EST.COD_ESTA = '03'
				   AND ATR_EST.TECO_OID_TIPO_ESTA_CONT = TIP_EST.OID_TIPO_ESTA_CONT
				   AND CAL_CON.ATEC_OID_ATRI_ESTA_CONT = ATR_EST.OID_ATRI_ESTA_CONT
				   AND CAL_CON.OID_CONT = CON.OID_CONT
				   AND CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
				   AND (trunc((((86400*(DECODE(CON.FEC_HORA_CIER, NULL, SYSDATE, CON.FEC_HORA_CIER) - CON.VAL_HORA_INIC))/60)/60)/24)) > 7  
		    ) ATEN_RETRASO,
			(
			SELECT 1 	          -- NUMERO DE ATENDIDAS A TIEMPO -- 
		  	FROM CAL_CONTA CAL_CON,
				 CAL_ATRIB_ESTAD_CONTA ATR_EST, 
				 CAL_TIPO_ESTAD_CONTA TIP_EST				 	 
			WHERE TIP_EST.COD_ESTA = '03'
				   AND ATR_EST.TECO_OID_TIPO_ESTA_CONT = TIP_EST.OID_TIPO_ESTA_CONT
				   AND CAL_CON.ATEC_OID_ATRI_ESTA_CONT = ATR_EST.OID_ATRI_ESTA_CONT
				   AND CAL_CON.OID_CONT = CON.OID_CONT
				   AND CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
				   AND (trunc((((86400*(DECODE(CON.FEC_HORA_CIER, NULL, SYSDATE, CON.FEC_HORA_CIER) - CON.VAL_HORA_INIC))/60)/60)/24)) <= 7  
		    ) ATEN_A_TIEMPO,
			(
			SELECT 1              -- NUMERO DE ELIMINADAS -- 
			FROM CAL_TIPO_ESTAD_CONTA TIP_EST,
				 CAL_ATRIB_ESTAD_CONTA ATR_EST,
				 CAL_CONTA CAL_CON
			WHERE TIP_EST.COD_ESTA = '03' 
				  AND ATR_EST.TECO_OID_TIPO_ESTA_CONT = TIP_EST.OID_TIPO_ESTA_CONT
				  AND ATR_EST.COD_ATRI = '14'
				  AND CAL_CON.ATEC_OID_ATRI_ESTA_CONT = ATR_EST.OID_ATRI_ESTA_CONT
				  AND CAL_CON.OID_CONT = CON.OID_CONT
				  AND CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
			) ELIMINADAS,
			(
			SELECT 1                -- NUMERO DE CONSULTORAS --
			FROM CAL_TIPO_ESTAD_CONTA TIP_EST,
				 CAL_ATRIB_ESTAD_CONTA ATR_EST,
				 CAL_CONTA CAL_CON
			WHERE TIP_EST.COD_ESTA = '03' 
				  AND ATR_EST.TECO_OID_TIPO_ESTA_CONT = TIP_EST.OID_TIPO_ESTA_CONT
				  AND ATR_EST.COD_ATRI = '13'
				  AND CAL_CON.ATEC_OID_ATRI_ESTA_CONT = ATR_EST.OID_ATRI_ESTA_CONT
				  AND CAL_CON.OID_CONT = CON.OID_CONT
				  AND CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
			) CONSULTORAS,
			(
			SELECT 1                -- NUMERO DE POSTULANTES POR ESTADO PENDIENTE DE REGISTRO --
			FROM CAL_CONTA CAL_CON,
			     CAL_TIPO_ESTAD_CONTA TIP_EST,
			     CAL_ATRIB_ESTAD_CONTA ATR_CON
			WHERE CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
			 	  AND CAL_CON.CLIE_OID_CLIE = CON.CLIE_OID_CLIE
				  AND TIP_EST.COD_ESTA = '01'
				  AND TIP_EST.OID_TIPO_ESTA_CONT = ATR_CON.TECO_OID_TIPO_ESTA_CONT
				  AND ATR_CON.OID_ATRI_ESTA_CONT = CAL_CON.ATEC_OID_ATRI_ESTA_CONT
				  AND ATR_CON.COD_ATRI = '02'
		    ) POS_EST_PEND_REG,
			(
			SELECT 1                -- NUMERO DE POSTULANTES POR ESTADO PENDIENTE DE APROBACION --
			FROM CAL_CONTA CAL_CON,
				 CAL_MOTIV_CONTA CAL_MOT,
				 CAL_TIPO_ESTAD_CONTA TIP_EST, 
				 CAL_ATRIB_ESTAD_CONTA ATR_EST
			WHERE CAL_CON.PAIS_OID_PAIS = CON.PAIS_OID_PAIS
				  AND CAL_CON.CLIE_OID_CLIE = CON.CLIE_OID_CLIE
				  AND (TIP_EST.COD_ESTA <> '01'
				  OR TIP_EST.COD_ESTA <> '03')
				  AND (ATR_EST.COD_ATRI <> '02'   -- DATOS IMCOMPLETOS --
				  OR ATR_EST.COD_ATRI <> '13'	 -- INCORPORADOS -- 
				  OR ATR_EST.COD_ATRI <> '14')   -- NO INCORPORADOS --
				  AND ATR_EST.TECO_OID_TIPO_ESTA_CONT = TIP_EST.OID_TIPO_ESTA_CONT
				  AND CAL_CON.ATEC_OID_ATRI_ESTA_CONT = ATR_EST.OID_ATRI_ESTA_CONT
			GROUP BY CON.CLIE_OID_CLIE
			) POS_EST_PEND_APRO,
			(
			SELECT 1            -- NUMERO DE POSTULANTES POR CANAL OTROS --
			FROM MAE_CLIEN_PRIME_CONTA CLI_PR_CON,
				 SEG_CANAL SEG_CAN
			WHERE CLI_PR_CON.CLIE_OID_CLIE = CON.CLIE_OID_CLIE
				  AND SEG_CAN.COD_CANA <> 'VD'
				  AND SEG_CAN.OID_CANA = CLI_PR_CON.CANA_OID_CANA
			) NUME_POS_CANAL,
			(
			SELECT 1            -- NUMERO DE POSTULANTES POR CANAL CONSULTORA --
			FROM MAE_TIPO_CLIEN T_CLI,
                 MAE_CLIEN_TIPO_SUBTI TIP_SUB,
		         MAE_CLIEN_PRIME_CONTA CLI_PR_CON				
			WHERE T_CLI.COD_TIPO_CLIE = '02' 
				  AND CLI_PR_CON.CLIE_OID_CLIE = CON.CLIE_OID_CLIE				   
				  AND TIP_SUB.TICL_OID_TIPO_CLIE = T_CLI.OID_TIPO_CLIE
				  AND CLI_PR_CON.CTSU_CLIE_CONT = TIP_SUB.OID_CLIE_TIPO_SUBT
			) POS_CAN_CON
	 FROM ZON_REGIO REG,
	 	  ZON_SUB_GEREN_VENTA SUB_GEN,
          ZON_ZONA ZON,
		  ZON_SECCI SEC,
		  ZON_TERRI_ADMIN TER,
		  MAE_CLIEN_UNIDA_ADMIN UNI_ADMIN,
		  CAL_CONTA CON,
		  CAL_MOTIV_TIPO_CLIEN CAL_MOT_TIP,
		  MAE_TIPO_CLIEN MAE_TIP_CLI,
          CAL_MOTIV_CONTA MOT_CON,
		  MAE_CLIEN_TIPO_SUBTI SUB_CLI,		  
          (
          SELECT CRA.FEC_INIC, CRA.FEC_FINA, VAL_NOMB_PERI, OID_PERI -- DE LA TABLA CRA_PERIO SELECCIONO FECHA DE INICIO Y FECHA DE FIN, FILTRANDO POR PAIS, MARCA, CANAL Y PERIODO --
   		  FROM CRA_PERIO CRA
		  WHERE CRA.CANA_OID_CANA = 1 -- PARAMETRO ID CANAL --
	 	  		AND CRA.PAIS_OID_PAIS = 1 -- PARAMETRO ID PAIS --
				AND CRA.MARC_OID_MARC = 1 -- PARAMETRO ID MARCA --
				AND CRA.OID_PERI = 57 -- PARAMETRO ID PERIODO --
		  ) FECHA,
		  (
 		  SELECT VAL_OID, VAL_I18N 
 		  FROM V_GEN_I18N_SICC GEN_I18
		  WHERE GEN_I18.ATTR_ENTI = 'SEG_PAIS'
	 	  		AND GEN_I18.IDIO_OID_IDIO = 1   -- PARAMETRO DE IDIOMA --
		  ) GEN_PAIS
		  WHERE REG.ZSGV_OID_SUBG_VENT = SUB_GEN.OID_SUBG_VENT
		        AND ZON.ZORG_OID_REGI = REG.OID_REGI
				AND SEC.ZZON_OID_ZONA = ZON.OID_ZONA
				AND TER.ZSCC_OID_SECC = SEC.OID_SECC
				AND UNI_ADMIN.ZTAD_OID_TERR_ADMI = TER.OID_TERR_ADMI
				AND UNI_ADMIN.PERD_OID_PERI_INI = FECHA.OID_PERI
				AND CON.CLIE_OID_CLIE = UNI_ADMIN.CLIE_OID_CLIE
				AND GEN_PAIS.VAL_OID(+) = CON.PAIS_OID_PAIS
				AND CAL_MOT_TIP.MOCO_OID_MOTI_CONT = MOT_CON.OID_MOTI_CONT
				AND MAE_TIP_CLI.OID_TIPO_CLIE = CON.TICL_OID_TIPO_CLIE
				AND MAE_TIP_CLI.OID_TIPO_CLIE = CAL_MOT_TIP.TICL_OID_TIPO_CLIE
				AND CAL_MOT_TIP.MOCO_OID_MOTI_CONT = MOT_CON.OID_MOTI_CONT
				AND MAE_TIP_CLI.OID_TIPO_CLIE = SUB_CLI.TICL_OID_TIPO_CLIE
				AND SUB_CLI.CLIE_OID_CLIE = CON.CLIE_OID_CLIE
  				AND CON.FEC_CONT >= FECHA.FEC_INIC
				AND CON.FEC_CONT <= FECHA.FEC_FINA
				AND CON.MOCO_OID_MOTI_CONT = MOT_CON.OID_MOTI_CONT
                AND (MOT_CON.COD_MOTI = '18' OR MOT_CON.COD_MOTI = '19')
--				AND SUB_GEN.CANA_OID_CANA = 1        -- PARAMETRO ID CANAL --
--				AND SUB_GEN.PAIS_OID_PAIS = 1        -- PARAMETRO ID PAIS --
--				AND SUB_GEN.MARC_OID_MARC = 1        -- PARAMETRO ID MARCA -- 
--				AND SUB_GEN.OID_SUBG_VENT = 1        -- PARAMETRO ID SUBGERENCIA DE VENTAS --  
--				AND REG.OID_REGI = 1                 -- PARAMETRO DE ID DE REGION --
--				AND ZON.OID_ZONA = 1				   -- PARAMETRO DE ID DE ZONA --
--				AND UNI_ADMIN.IND_ACTI = 1	 	   -- INDICADOR ACTIVO = TRUE --
--				AND CON.PAIS_OID_PAIS = 1			   -- PARAMETRO DE PAIS --
			)	
GROUP BY VAL_I18N,
         MARC_OID_MARC,
		 CANA_OID_CANA,
		 COD_REGI,
		 OID_TIPO_CLIE,
		 DES_REGI,
		 VAL_NOMB_PERI		
ORDER BY VAL_I18N,
	  	 MARC_OID_MARC,
		 CANA_OID_CANA,
		 COD_REGI, 
		 OID_TIPO_CLIE 
)
	  
	  
	
	 