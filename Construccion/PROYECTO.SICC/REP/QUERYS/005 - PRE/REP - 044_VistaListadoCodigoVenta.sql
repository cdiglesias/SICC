
SELECT 
	  PERI.VAL_NOMB_PERI, I18PAIS.VAL_I18N PAIS, MARCA.DES_MARC, I18CANAL.VAL_I18N CANAL, I18ACC.VAL_I18N ACCESO,
	  OFEDET.VAL_CODI_VENT, PROD.COD_SAP, I18PROD.VAL_I18N AS DESC_PROD,-- PROD.DES_CORT,
	  OFEDET.VAL_TEXT_BREV,  
	  CAT.DES_CATA, OFEDET.NUM_PAGI_CATA,
	  OFEDET.IMP_PREC_CATA, 
	  OFEDET.NUM_UNID_ESTI, (OFEDET.NUM_UNID_ESTI * OFEDET.IMP_PREC_CATA) AS MONTONETOESTIMADO    
FROM
	  (
	  SELECT V.VAL_OID, V.VAL_I18N 
	  FROM V_GEN_I18N_SICC V 
	  WHERE V.ATTR_ENTI = 'MAE_PRODU'
	  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
	  ) I18PROD,
	  (
	  SELECT V.VAL_OID, V.VAL_I18N 
	  FROM V_GEN_I18N_SICC V 
	  WHERE V.ATTR_ENTI = 'SEG_ACCES' 
	  AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
	  ) I18ACC,
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
	  ) I18CANAL,
	  CRA_PERIO PERI,
	  PRE_OFERT OFE,
	  PRE_OFERT_DETAL OFEDET,
	  PRE_MATRI_FACTU MF,
	  PRE_MATRI_FACTU_CABEC MFC,
	  MAE_PRODU PROD,
	  PRE_CATAL CAT,
	  SEG_MARCA MARCA
WHERE
	      PERI.OID_PERI = MFC.PERD_OID_PERI
	  AND OFE.MFCA_OID_CABE = MFC.OID_CABE
	  AND MF.MFCA_OID_CABE = MFC.OID_CABE
	  AND OFE.OID_OFER = OFEDET.OFER_OID_OFER  	
	  AND OFEDET.OID_DETA_OFER = MF.OFDE_OID_DETA_OFER
	  AND OFEDET.PROD_OID_PROD = PROD.OID_PROD
	  AND OFEDET.OCAT_OID_CATAL = CAT.OID_CATA
	  --
      AND I18PROD.VAL_OID(+) = OFEDET.PROD_OID_PROD 
      AND I18ACC.VAL_OID(+) = OFE.ACCE_OID_ACCE 
      AND I18PAIS.VAL_OID(+) = PERI.PAIS_OID_PAIS 
      AND I18CANAL.VAL_OID(+) = PERI.CANA_OID_CANA
	  -- 
	  AND PERI.MARC_OID_MARC = MARCA.OID_MARC 
/*	  AND PERI.PAIS_OID_PAIS = 1		 		   -- PARAMETRO --
	  AND PERI.MARC_OID_MARC = 1		 		   -- PARAMETRO --
	  AND PERI.CANA_OID_CANA = 1		 		   -- PARAMETRO --
	  AND PERI.OID_PERI = 16		 		   -- PARAMETRO --
	  AND OFE.ACCE_OID_ACCE = 4					   -- PARAMETRO --
	  AND OFEDET.VAL_CODI_VENT >= '036021'		   -- PARAMETRO --
	  AND OFEDET.VAL_CODI_VENT <= '036024'		   -- PARAMETRO --
	  AND OFEDET.PROD_OID_PROD >= 18			   -- PARAMETRO --
	  AND OFEDET.PROD_OID_PROD <= 22			   -- PARAMETRO --					   	  			  
	  AND PROD.DES_CORT LIKE '%A%'
	  AND CAT.OID_CATA = 69	   	  				   -- PARAMETRO --
	  AND OFEDET.NUM_PAGI_CATA >= 1				   -- PARAMETRO --
	  AND OFEDET.NUM_PAGI_CATA <= 10			   -- PARAMETRO --
	  AND OFEDET.IMP_PREC_CATA >= 0		*/		   -- PARAMETRO - OJO!! El ">=" va a venir como parametro --
ORDER BY
	  OFEDET.VAL_CODI_VENT		 -- Orden por defecto --


