/*
Enrique larga las drogas!!
*/

select per.VAL_NOMB_PERI,
	  zon.COD_ZONA,
	  fac.VAL_SERI_DOCU_LEGA,
	  fac.NUM_DOCU_LEGA,
	  cli.COD_CLIE,
	  cli.VAL_APE1 apellido1, cli.VAL_APE2 apellido2, cli.VAL_NOM1 nombre1, cli.VAL_NOM2 nombre2,
	  fac.FEC_EMIS,
	  fac.VAL_TOTA_PAGA_LOCA monto
from fac_docum_conta_cabec fac,
	 fac_tipo_docum t_doc,
	 cra_perio per,
	 zon_zona zon,
	 mae_clien cli,
	 ped_solic_cabec sol
where fac.PERD_OID_PERI = per.oid_peri
	  and fac.ZZON_OID_ZONA = zon.oid_zona
	  and fac.SOCA_OID_SOLI_CABE = sol.oid_soli_cabe
	  and sol.clie_oid_clie = cli.oid_clie
  	  and fac.TIDO_OID_TIPO_DOCU = t_doc.OID_TIPO_DOCU
--	  and t_doc.COD_TIPO_DOCU like 'NC%' --NOTA DE CREDITO--
--	  and TO_DATE(fac.FEC_FACT) = to_date(TO_DATE(sysdate) -1)  
	  and fac.ZORG_OID_REGI in (1) --PARAMETRO--
	  and fac.ZZON_OID_ZONA in (13) --PARAMETRO--
	  and fac.PERD_OID_PERI = 57 --PARAMETRO--
	  and fac.PAIS_OID_PAIS = 1 --PARAMETRO--
	  and per.CANA_OID_CANA = 1 --PARAMETRO--
	  and per.MARC_OID_MARC = 1 --PARAMETRO--
order by zon.cod_zona	  