SELECT 
	ALTERN.PAIS, ALTERN.DES_MARC, ALTERN.CANAL,
	'000000000000' as ALT_REEMP, 
	ALTERN.VAL_CODI_VENT,
	ALTERN.COD_SAP,
	ALTERN.DESC_PROD,
	ALTERN.ESTRAT,
	ALTERN.VAL_FACT_REPE,
	ALTERN.VAL_NOMB_PERI,
	ORIG.VAL_CODI_VENT AS VAL_CODI_VENT_ORIG,
	ORIG.COD_SAP AS COD_SAP_ORIG,
	ORIG.DESC_PROD AS DESC_PROD_ORIG,
	ORIG.ESTRAT AS ESTRAT_ORIG,
	ORIG.VAL_FACT_REPE AS VAL_FACT_REPE_ORIG,
	ORIG.VAL_NOMB_PERI AS VAL_NOMB_PERI_ORIG,
	UN_RECUP.DES_REGI,
	ALTERN.IMP_PREC_CATA,
	ORIG.IMP_PREC_CATA AS IMP_PREC_CATA_ORIG,	
	NVL(UN_RECUP.U_ATEN, 0) AS UN_RECUP,
	NVL(UN_DEVU.U_DEVU, 0) AS UN_DEVU,
	(NVL(UN_RECUP.U_ATEN, 0) - NVL(UN_DEVU.U_DEVU, 0)) AS UN_RECUP_NETAS 
FROM
	(
	SELECT 
		  I18PAIS.VAL_I18N PAIS, MARCA.DES_MARC, I18CANAL.VAL_I18N CANAL,
		  OFEDET.VAL_CODI_VENT, PROD.COD_SAP, I18PROD.VAL_I18N AS DESC_PROD, 
		  OFEDET.IMP_PREC_CATA, ES.COD_ESTR ESTRAT, OFEDET.VAL_FACT_REPE, PERI.VAL_NOMB_PERI, 
		  MF.OID_MATR_FACT, PERI.OID_PERI, PROD.OID_PROD  
	FROM
		  CRA_PERIO PERI,
		  PRE_OFERT OFE,
		  PRE_OFERT_DETAL OFEDET,
		  PRE_MATRI_FACTU MF,
		  PRE_MATRI_FACTU_CABEC MFC,
		  MAE_PRODU PROD,
		  PRE_ESTRA ES,
		  SEG_MARCA MARCA,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'MAE_PRODU'
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18PROD,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'SEG_PAIS' 
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18PAIS,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'SEG_CANAL' 
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18CANAL
	WHERE
		      PERI.OID_PERI = MFC.PERD_OID_PERI
		  AND OFE.MFCA_OID_CABE = MFC.OID_CABE
		  AND MF.MFCA_OID_CABE = MFC.OID_CABE
		  AND OFE.OID_OFER = OFEDET.OFER_OID_OFER  	
		  AND OFEDET.OID_DETA_OFER = MF.OFDE_OID_DETA_OFER
		  AND OFEDET.PROD_OID_PROD = PROD.OID_PROD
		  AND OFE.COES_OID_ESTR = ES.OID_ESTR
	      AND I18PAIS.VAL_OID(+) = PERI.PAIS_OID_PAIS 
	      AND I18CANAL.VAL_OID(+) = PERI.CANA_OID_CANA 
	      AND I18PROD.VAL_OID(+) = OFEDET.PROD_OID_PROD 
		  AND PERI.MARC_OID_MARC = MARCA.OID_MARC(+)
		  AND PERI.OID_PERI = 57		 		   -- PARAMETRO --
	) ALTERN,
	(
	SELECT 
		  I18PAIS.VAL_I18N PAIS, MARCA.DES_MARC, I18CANAL.VAL_I18N CANAL,
		  OFEDET.VAL_CODI_VENT, PROD.COD_SAP, I18PROD.VAL_I18N AS DESC_PROD, 
		  OFEDET.IMP_PREC_CATA, ES.COD_ESTR ESTRAT, OFEDET.VAL_FACT_REPE, PERI.VAL_NOMB_PERI,
		  MF.OID_MATR_FACT, PERI.OID_PERI, PROD.OID_PROD  
	FROM
		  CRA_PERIO PERI,
		  PRE_OFERT OFE,
		  PRE_OFERT_DETAL OFEDET,
		  PRE_MATRI_FACTU MF,
		  PRE_MATRI_FACTU_CABEC MFC,
		  MAE_PRODU PROD,
		  PRE_ESTRA ES,
		  SEG_MARCA MARCA,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'MAE_PRODU'
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18PROD,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'SEG_PAIS' 
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18PAIS,
		  (
		  SELECT V.VAL_OID, V.VAL_I18N 
		  FROM V_GEN_I18N_SICC V 
		  WHERE V.ATTR_ENTI = 'SEG_CANAL' 
		  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
		  ) I18CANAL
	WHERE
		      PERI.OID_PERI = MFC.PERD_OID_PERI
		  AND OFE.MFCA_OID_CABE = MFC.OID_CABE
		  AND MF.MFCA_OID_CABE = MFC.OID_CABE
		  AND OFE.OID_OFER = OFEDET.OFER_OID_OFER  	
		  AND OFEDET.OID_DETA_OFER = MF.OFDE_OID_DETA_OFER
		  AND OFEDET.PROD_OID_PROD = PROD.OID_PROD
		  AND OFE.COES_OID_ESTR = ES.OID_ESTR
	      AND I18PAIS.VAL_OID(+) = PERI.PAIS_OID_PAIS 
	      AND I18CANAL.VAL_OID(+) = PERI.CANA_OID_CANA 
	      AND I18PROD.VAL_OID(+) = OFEDET.PROD_OID_PROD 
		  AND PERI.MARC_OID_MARC = MARCA.OID_MARC(+)
		  AND PERI.PAIS_OID_PAIS = 1		 		   -- PARAMETRO --
		  AND PERI.MARC_OID_MARC = 1		 		   -- PARAMETRO --
		  AND PERI.CANA_OID_CANA = 1		 		   -- PARAMETRO --
	) ORIG,
	(
	 SELECT
		 REG.DES_REGI,  
	 	 SOLPOSIC.VAL_CODI_VENT,
		 SUM(SOLPOSIC.NUM_UNID_ATEN) AS U_ATEN 
	 FROM
	 	 PED_SOLIC_CABEC SOLCABEC,
	 	 PED_SOLIC_POSIC SOLPOSIC,
		 ZON_ZONA ZON,
		 ZON_REGIO REG
	 WHERE
	 	  	 SOLCABEC.OID_SOLI_CABE = SOLPOSIC.SOCA_OID_SOLI_CABE
		 AND SOLCABEC.ZZON_OID_ZONA = ZON.OID_ZONA
		 AND ZON.ZORG_OID_REGI = REG.OID_REGI
--		 AND SOLPOSIC.TPOS_OID_TIPO_POSI = 5 -- (DA - Demanda Alternativa ->> PED_TIPO_POSIC) 
		 AND REG.OID_REGI = 1  	 		 		   				 	 		 -- PARAMETRO --
		 AND SOLCABEC.PERD_OID_PERI = 57		 		   		 			 -- PARAMETRO -- 
	 GROUP BY
		 REG.DES_REGI,  
	 	 SOLPOSIC.VAL_CODI_VENT
	) UN_RECUP,
	(
	 SELECT
		 OFDET.VAL_CODI_VENT, 
		 SUM(LOPREC.NUM_UNID_DEVU) AS U_DEVU
	 FROM
	 	 REC_CABEC_RECLA RECCABEC,
		 REC_LINEA_OPERA_RECLA LOPREC,
		 REC_OPERA_RECLA OPREC,
		 PRE_OFERT_DETAL OFDET,
		 PRE_MATRI_FACTU MF,
		 PRE_MATRI_FACTU_CABEC MFCABEC,
		 ZON_TERRI_ADMIN TER,
		 ZON_SECCI SEC,
		 ZON_ZONA ZON,
		 ZON_REGIO REG
	 WHERE
	 	  	 RECCABEC.OID_CABE_RECL = OPREC.CARE_OID_CABE_RECL
		 AND OPREC.OID_OPER_RECL = LOPREC.OPRE_OID_OPER_RECL
		 AND LOPREC.MAFA_OID_MATR_FACT = MF.OID_MATR_FACT
		 AND MF.OFDE_OID_DETA_OFER = OFDET.OID_DETA_OFER
		 AND RECCABEC.ZTAD_OID_TERR_ADMI = TER.OID_TERR_ADMI		 
		 AND TER.ZSCC_OID_SECC = SEC.OID_SECC
		 AND SEC.ZZON_OID_ZONA = ZON.OID_ZONA
		 AND ZON.ZORG_OID_REGI = REG.OID_REGI
--		 AND LOPREC.TIMO_OID_TIPO_MOVI = 1000 -- (EL UNICO EN CODIGO EN -->> REC_TIMO_MOVIM ) 
		 AND REG.OID_REGI = 1  	 			 						 		 -- PARAMETRO -- 
		 AND MFCABEC.PERD_OID_PERI = 57 	 						 		 -- PARAMETRO --
	 GROUP BY
		 OFDET.VAL_CODI_VENT
	) UN_DEVU,
	PRE_MATRI_CODIG_ALTER MALTER
WHERE
	 	ORIG.PAIS = ALTERN.PAIS
	AND ORIG.DES_MARC = ALTERN.DES_MARC
	AND ORIG.CANAL = ALTERN.CANAL
	AND MALTER.MAFA_OID_COD_PPAL = ORIG.OID_MATR_FACT  
	AND MALTER.MAFA_OID_COD_ALTE = ALTERN.OID_MATR_FACT  
	AND UN_RECUP.VAL_CODI_VENT(+) = ALTERN.VAL_CODI_VENT
	AND UN_DEVU.VAL_CODI_VENT(+) = ALTERN.VAL_CODI_VENT
	AND ALTERN.VAL_CODI_VENT >= 1	   			--//  Estos son, en teoria los codigos por los que hay que filtrar pero 
	AND ALTERN.VAL_CODI_VENT <= 9999999		--// Matias no los tiene y levanto una incidencia 
ORDER BY
	ALTERN.PAIS, ALTERN.DES_MARC, ALTERN.CANAL,
	VAL_CODI_VENT	