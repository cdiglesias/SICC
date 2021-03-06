SELECT *
FROM
	(
	 	SELECT PRO.STRINGVALUE SOCIEDAD_DEFECTO
		FROM PRINCIPALS PRI,
			PROPERTYVALUES PRO			
		WHERE PRI.NAME = 'USUARIO1'			   	  	 -- PARAMETRO DE USUARIO POR DEFECTO --
			 AND PRO.IDPROPERTY = 48
			 AND PRO.IDPRINCIPAL = PRI.IDPRINCIPAL
	),
	(
SELECT REG.DES_REGI REGION,
	   ZONA.DES_ZONA ZONA,
	   (
	   SELECT SEC.COD_SECC
	   FROM MAE_CLIEN_UNIDA_ADMIN UA,
	   		ZON_TERRI_ADMIN TER_ADM,
			ZON_SECCI SEC,
			ZON_ZONA Z
	   WHERE UA.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND TER_ADM.OID_TERR_ADMI = UA.ZTAD_OID_TERR_ADMI
			 AND SEC.OID_SECC = TER_ADM.ZSCC_OID_SECC
			 AND Z.OID_ZONA = SEC.ZZON_OID_ZONA
			 AND Z.OID_ZONA = ZONA.OID_ZONA
			 AND ROWNUM = 1
	   		 AND (SELECT FEC_INIC
			 	  FROM CRA_PERIO
				  WHERE OID_PERI = UA.PERD_OID_PERI_INI) <= (SELECT FEC_INIC FROM CRA_PERIO WHERE OID_PERI = 58) -- PARAMETRO DE PERIODO HASTA --
			 AND (CASE WHEN (UA.PERD_OID_PERI_FIN IS NULL) THEN
			 	 	   	TO_DATE('31/12/2999', 'DD/MM/YYYY')
				  ELSE
				  	   (SELECT FEC_FINA
					   FROM CRA_PERIO
					   WHERE OID_PERI = UA.PERD_OID_PERI_INI)
				  END) >= (SELECT FEC_FINA FROM CRA_PERIO WHERE OID_PERI = 61) -- PARAMETRO DE PERIODO HASTA --				  	  		 				  
	   ) SECCION,
	   (
	   SELECT TER.COD_TERR
	   FROM MAE_CLIEN_UNIDA_ADMIN UA,
	   		ZON_TERRI_ADMIN TER_ADM,
			ZON_SECCI SEC,
			ZON_ZONA Z,
			ZON_TERRI TER
	   WHERE UA.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND TER_ADM.OID_TERR_ADMI = UA.ZTAD_OID_TERR_ADMI
			 AND SEC.OID_SECC = TER_ADM.ZSCC_OID_SECC
			 AND Z.OID_ZONA = SEC.ZZON_OID_ZONA
			 AND Z.OID_ZONA = ZONA.OID_ZONA
			 AND TER_ADM.TERR_OID_TERR = TER.OID_TERR
			 AND ROWNUM = 1
	   		 AND (SELECT FEC_INIC
			 	  FROM CRA_PERIO
				  WHERE OID_PERI = UA.PERD_OID_PERI_INI) <= (SELECT FEC_INIC FROM CRA_PERIO WHERE OID_PERI = 58) -- PARAMETRO DE PERIODO HASTA --
			 AND (CASE WHEN (UA.PERD_OID_PERI_FIN IS NULL) THEN
			 	 	   	TO_DATE('31/12/2999', 'DD/MM/YYYY')
				  ELSE
				  	   (SELECT FEC_FINA
					   FROM CRA_PERIO
					   WHERE OID_PERI = UA.PERD_OID_PERI_INI)
				  END) >= (SELECT FEC_FINA FROM CRA_PERIO WHERE OID_PERI = 61) -- PARAMETRO DE PERIODO HASTA --	   ) TERRITORIO,
		) TERRITORIO,
		CLI.COD_CLIE COD_CLIENTE,
	   SUBSTR(CLI.VAL_APE1||' '||CLI.VAL_APE2||' '||CLI.VAL_NOM1||' '||CLI.VAL_NOM2, 0, 40) NOMBRE,
	   (
	   SELECT CLI_COM.VAL_TEXT_COMU
	   FROM MAE_CLIEN_COMUN CLI_COM,
	   		MAE_TIPO_COMUN TIP_COM
	   WHERE CLI_COM.CLIE_OID_CLIE = CLI.OID_CLIE
	   		 AND CLI_COM.TICM_OID_TIPO_COMU = TIP_COM.OID_TIPO_COMU
	  		 AND TIP_COM.COD_TIPO_COMU = 'TF'
 	   ) TEL1,
	   NULL AS TEL2,
	   (
	   SELECT COUNT(HIS.OID_HIST)
	   FROM EDU_HISTO_CURSO HIS,
	        EDU_MATRI_CURSO MAT,
			EDU_TIPO_CURSO TIP_COR
	   WHERE HIS.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND HIS.MCUR_OID_CURS = MAT.OID_CURS
			 AND MAT.TICU_OID_TIPO_CURS = TIP_COR.OID_TIPO_CURS
			 AND TIP_COR.COD_TIPO_CURS = '1'
	   ) CI,
	   (
	   SELECT COUNT(HIS.OID_HIST)
	   FROM EDU_HISTO_CURSO HIS,
	        EDU_MATRI_CURSO MAT,
			EDU_TIPO_CURSO TIP_COR
	   WHERE HIS.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND HIS.MCUR_OID_CURS = MAT.OID_CURS
			 AND MAT.TICU_OID_TIPO_CURS = TIP_COR.OID_TIPO_CURS
			 AND TIP_COR.COD_TIPO_CURS = '2'
	   ) C1,
	   (
	   SELECT COUNT(HIS.OID_HIST)
	   FROM EDU_HISTO_CURSO HIS,
	        EDU_MATRI_CURSO MAT,
			EDU_TIPO_CURSO TIP_COR
	   WHERE HIS.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND HIS.MCUR_OID_CURS = MAT.OID_CURS
			 AND MAT.TICU_OID_TIPO_CURS = TIP_COR.OID_TIPO_CURS
			 AND TIP_COR.COD_TIPO_CURS = '3'
	   ) C2,	   
	   (
	   SELECT PERI.VAL_NOMB_PERI
	   FROM MAE_CLIEN_HISTO_ESTAT EST,
	   		CRA_PERIO PERI
	   WHERE EST.CLIE_OID_CLIE = CLI.OID_CLIE
	   		 AND EST.ESTA_OID_ESTA_CLIE = 2
			 AND PERI.OID_PERI = EST.PERD_OID_PERI 
	   ) CAMP_INGRESO,
	   NULL AS VISITA,
	   (
	   SELECT VAL_NOMB_PERI
	   FROM CRA_PERIO
	   WHERE OID_PERI = 61 	   	 			-- PARAMETRO DE PERIODO DESDE --
	   ) PERIODO_1,
--------------------------- PERIODO 2 -----------------------------------------------------------			   
	   (
	   SELECT VAL_NOMB_PERI
	   FROM CRA_PERIO
	   WHERE OID_PERI = (
		   SELECT OWN_PERU.FN_008_CALC_OID_PER_ANT(1,1,1,65,3)   -- PARAMETRO DE PAIS, MARCA, CANAL, PERIODO HASTA --
		   FROM DUAL
		   )
	   ) PERIODO_2,
---------------------------- PERIODO 3 ----------------------------------------------------------			   
	   (
	   SELECT VAL_NOMB_PERI
	   FROM CRA_PERIO
	   WHERE OID_PERI =(
		   SELECT OWN_PERU.FN_008_CALC_OID_PER_ANT(1,1,1,65,2)   -- PARAMETRO DE PAIS, MARCA, CANAL, PERIODO HASTA --
		   FROM DUAL
		   )
	   ) PERIODO_3,
	   (
	   SELECT VAL_NOMB_PERI
	   FROM CRA_PERIO
	   WHERE OID_PERI = 65 	   	 			-- PARAMETRO DE PERIODO HASTA --
	   ) PERIODO_4,
   	   (
	   SELECT VAL_TEXT
	   FROM MAE_CLIEN_OBSER CLI_OBS
	   WHERE CLI_OBS.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   		 AND CLI_OBS.MARC_OID_MARC = PERI.MARC_OID_MARC
	   ) OBSERVACIONES,
	   (
	   SELECT SUM(SEG.VAL_VENT)
	   FROM DTR_SEGME_CLIEN SEG
	   WHERE SEG.PERD_OID_PERI = 61			-- PARAMETRO DE PERIODO DESDE--
	   		 AND SEG.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   ) VTA_PUB_P1,
	   (
	   SELECT SUM(SEG.VAL_VENT)
	   FROM DTR_SEGME_CLIEN SEG
	   WHERE SEG.PERD_OID_PERI =
	   			   (
				   SELECT OWN_PERU.FN_008_CALC_OID_PER_ANT(1,1,1,65,3)   -- PARAMETRO DE PAIS, MARCA, CANAL, PERIODO HASTA --
				   FROM DUAL
				   )
	   	   		 AND SEG.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   ) VTA_PUB_P2,
	   (
	   SELECT SUM(SEG.VAL_VENT)
	   FROM DTR_SEGME_CLIEN SEG
	   WHERE SEG.PERD_OID_PERI =
				   (
				   SELECT OWN_PERU.FN_008_CALC_OID_PER_ANT(1,1,1,65,2)   -- PARAMETRO DE PAIS, MARCA, CANAL, PERIODO HASTA --
				   FROM DUAL
				   )
	   	   		 AND SEG.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   ) VTA_PUB_P3,	   
	   (
	   SELECT SUM(SEG.VAL_VENT)
	   FROM DTR_SEGME_CLIEN SEG
	   WHERE SEG.PERD_OID_PERI = 65			-- PARAMETRO DE PERIODO HASTA--
	   		 AND SEG.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   ) VTA_PUB_P4,
	   (
	   SELECT NVL(SUM(SEG.IMP_DES1), 0) + NVL(SUM(SEG.IMP_DES3), 0)
	   FROM DTR_SEGME_CLIEN SEG,
	   		 CRA_PERIO PERI,
		   (
		   SELECT FEC_INIC
		   FROM CRA_PERIO
		   WHERE OID_PERI = 61		   	 		-- PARAMETRO DE PERIODO DESDE--
		   ) FI,
		   (
		   SELECT FEC_FINA
		   FROM CRA_PERIO
		   WHERE OID_PERI = 65		   	 		-- PARAMETRO DE PERIODO HASTA--
		   ) FF
	   WHERE FI.FEC_INIC <= PERI.FEC_INIC
			 AND FF.FEC_FINA >= PERI.FEC_FINA
			 AND PERI.OID_PERI = SEG.PERD_OID_PERI
			 AND SEG.CLIE_OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	   GROUP BY SEG.CLIE_OID_CLIE							   
	   ) GANANCIA_ACUM
FROM DTR_SEGME_CLIEN SEG_CLI,
	 CRA_PERIO PERI,
	 ZON_REGIO REG,
	 ZON_ZONA ZONA,
	 MAE_CLIEN CLI
WHERE SEG_CLI.PERD_OID_PERI = PERI.OID_PERI
	  AND NVSG_OID_NIVE_SEGM = 1
	  AND CLI.OID_CLIE = SEG_CLI.CLIE_OID_CLIE
	  AND REG.OID_REGI = SEG_CLI.ZORG_OID_REGI
	  AND ZONA.OID_ZONA = SEG_CLI.ZZON_OID_ZONA
	  AND REG.OID_REGI = ZONA.ZORG_OID_REGI
	  AND PERI.PAIS_OID_PAIS = 1		   	-- PARAMETRO DE PAIS --
	  AND PERI.MARC_OID_MARC = 1			-- PARAMETRO DE MARCA --
	  AND PERI.CANA_OID_CANA = 1			-- PARAMETRO DE CANAL -- 
	  AND SEG_CLI.ZORG_OID_REGI = 7			-- PARAMETRO DE REGION --
	  AND SEG_CLI.ZZON_OID_ZONA = 1			-- PARAMETRO DE ZONA --	   
	  AND PERI.OID_PERI = 61 			    -- PARAMETRO DE PERIODO HASTA --
ORDER BY REGION,
	  ZONA,
	  SECCION,
	  CAMP_INGRESO,
	  COD_CLIENTE
)

	  
