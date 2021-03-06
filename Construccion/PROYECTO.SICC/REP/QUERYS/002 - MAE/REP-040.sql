
Select produ.COD_SAP, I18PROD.VAL_I18N DES_PRODU, um.des_abre,  alm.COD_ALMA, decode(stkC.Disp,NULL,0,stkC.Disp) Disponible, decode(stkC.Comp,NULL,0,stkC.Comp) Comprometido, decode(stkC.Asig,NULL,0,stkC.Asig) Asignado, decode(stkC.Reserv,NULL,0,stkC.Reserv) Reservado,
	   (decode(stkC.Disp,NULL,0,stkC.Disp) - decode(stkC.Comp,NULL,0,stkC.Comp) - decode(stkC.Asig,NULL,0,stkC.Asig) - decode(stkC.Reserv,NULL,0,stkC.Reserv)) Saldo
From  
	(
	Select stock.PROD_OID_PROD, stock.ALMC_OID_ALMA, sum(Disponible) Disp, sum(Comprometido) Comp, sum(Asignado) Asig, sum(Reservado) Reserv 
	From
	 (
	 (Select s.PROD_OID_PROD, s.ALMC_OID_ALMA, s.esme_oid_esta_merc , s.val_sald Disponible,NULL Comprometido ,NULL Asignado, NULL Reservado from bel_stock s Where s.ESME_OID_ESTA_MERC = 1)	--Parametro  
	 UNION ALL
	 (Select s.PROD_OID_PROD, s.ALMC_OID_ALMA, s.esme_oid_esta_merc , NULL Nulo ,s.val_sald ,NULL Nulo, NULL Nulo from bel_stock s Where s.ESME_OID_ESTA_MERC = 2)						   		--Parametro 
	 UNION ALL
	 (Select s.PROD_OID_PROD, s.ALMC_OID_ALMA, s.esme_oid_esta_merc , NULL Nulo ,NULL Nulo, s.val_sald ,NULL Nulo from bel_stock s Where s.ESME_OID_ESTA_MERC = 8)								--Parametro 
	 UNION ALL
	 (Select s.PROD_OID_PROD, s.ALMC_OID_ALMA, s.esme_oid_esta_merc , NULL Nulo ,NULL Nulo ,NULL, s.val_sald Nulo from bel_stock s Where s.ESME_OID_ESTA_MERC = 10)								--Parametro 
	 ) Stock
	Group By stock.PROD_OID_PROD, stock.ALMC_OID_ALMA
	Order By stock.PROD_OID_PROD, stock.ALMC_OID_ALMA
	) stkC,
	(
	 SELECT V.VAL_OID, V.VAL_I18N 
	 FROM V_GEN_I18N_SICC V 
	 WHERE V.ATTR_ENTI = 'MAE_PRODU'
	 AND V.IDIO_OID_IDIO = 1		 	 		 -- PARAMETRO --
	) I18PROD,
	mae_produ produ,
	bel_almac alm,
	mae_unida_medid um
Where 
	  produ.OID_PROD = stkC.PROD_OID_PROD
	  AND alm.OID_ALMA = stkC.ALMC_OID_ALMA
	  AND produ.OID_PROD = I18PROD.VAL_OID
	  AND um.oid_unid_medi(+) = produ.UNMD_OID_UNID_MEDI_DIME
	  AND produ.PAIS_OID_PAIS IN (1)								--Parametro  
--	  AND produ.UNEG_OID_UNID_NEGO IN (1)							--Parametro  
--	  AND produ.NEGO_OID_NEGO IN (1)								--Parametro  
--	  AND produ.SGEN_OID_SUPE_GENE  IN (1)							--Parametro  
--	  AND produ.GENE_OID_GENE  IN (1)								--Parametro  
--	  AND stkC.ALMC_OID_ALMA  IN (1)								--Parametro  
order by
  produ.COD_SAP, DES_PRODU, um.des_abre,  alm.COD_ALMA

	  