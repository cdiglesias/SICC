select
	  comb.pais,
	  comb.val_nomb_peri,
	  comb.canal,
	  comb.acceso,
	  comb.marca,
	  comb.des_zona,
  	  solic.num_lote_fact,           
   	  comb.tipo_sol,
	  count(oid_soli_cabe)cant_soli,
	  comb.PAIS_OID_PAIS,	  	  	  
	  comb.OID_MARC,
	  comb.OID_CANA,
	  comb.OID_ZONA,
	  comb.oid_peri,
	  comb.OID_ACCE,
  	  comb.oid_tipo_soli
from 
	(--SOLICITUDES--
		select 
		   	   sol.OID_SOLI_CABE,
			   mar.OID_MARC, 
			   can.OID_CANA,
			   zon.OID_ZONA,
			   per.oid_peri,
			   acc.OID_ACCE,
			   t_sol_p.PAIS_OID_PAIS,
			   t_sol.oid_tipo_soli,
			   sol.NUM_LOTE_FACT
		from seg_marca mar,
			 seg_canal can,
			 seg_acces acc,
			 ped_tipo_solic t_sol,
			 ped_solic_cabec sol,
			 ped_tipo_solic_pais t_sol_p,
			 zon_zona zon,
			 cra_perio per
		where sol.TSPA_OID_TIPO_SOLI_PAIS = t_sol_p.OID_TIPO_SOLI_PAIS 
			  and t_sol_p.TSOL_OID_TIPO_SOLI = t_sol.OID_TIPO_SOLI
			  and t_sol.MARC_OID_MARC = mar.OID_MARC
			  and t_sol.ACCE_OID_ACCE = acc.OID_ACCE
			  and acc.CANA_OID_CANA = can.OID_CANA
			  and sol.ZZON_OID_ZONA= zon.OID_ZONA
			  and sol.PERD_OID_PERI = per.OID_PERI
			  and sol.IND_TS_NO_CONSO = 1
			  and sol.IND_PEDI_PRUE <> 1
			  and sol.FEC_FACT is not null
	)solic,
	( --COMBINACIONES NO TRATADAS--
		select distinct 
			   mar.OID_MARC, 
			   can.OID_CANA,
			   zon.OID_ZONA,
			   per.OID_PERI,
			   acc.OID_ACCE,
			   t_sol_p.PAIS_OID_PAIS,
			   t_sol.OID_TIPO_SOLI,
			   gen_acc.acceso,
			   mar.DES_MARC marca,
			   gen_can.canal,
			   gen_pai.pais,
			   zon.DES_ZONA,
			   per.VAL_NOMB_PERI,
			   secue.cod_secu,
			   secue.oid_secu_proc,
   			   gen_t_sol.tipo_sol
		from seg_acces acc,
			 seg_canal can,
			 seg_marca mar,
			 ped_tipo_solic t_sol,
			 ped_tipo_solic_pais t_sol_p,
			 ped_secue_proce secue,
			 cra_perio per,
			 zon_zona zon,
			 (
			 select gen.val_oid, gen.val_i18n acceso
			 from v_gen_i18n_sicc gen
			 where gen.ATTR_ENTI = 'SEG_ACCES'
			 	   and gen.IDIO_OID_IDIO = 1 --PARAMETRO--
			 )gen_acc,
			 (
			 select gen.val_oid, gen.val_i18n canal
			 from v_gen_i18n_sicc gen
			 where gen.ATTR_ENTI = 'SEG_CANAL'
			 	   and gen.IDIO_OID_IDIO = 1 --PARAMETRO--
			 )gen_can,
 			 (
			 select gen.val_oid, gen.val_i18n pais
			 from v_gen_i18n_sicc gen
			 where gen.ATTR_ENTI = 'SEG_PAIS'
			 	   and gen.IDIO_OID_IDIO = 1 --PARAMETRO--
			 )gen_pai,
			 (
			 select gen.val_oid, gen.val_i18n tipo_sol
			 from v_gen_i18n_sicc gen
			 where gen.ATTR_ENTI = 'PED_TIPO_SOLIC'
			 	   and gen.IDIO_OID_IDIO = 1 --PARAMETRO--
			 )gen_t_sol
		where acc.CANA_OID_CANA = can.OID_CANA
			  and acc.OID_ACCE = t_sol.ACCE_OID_ACCE
			  and t_sol.MARC_OID_MARC = mar.OID_MARC
			  and per.MARC_OID_MARC = mar.OID_MARC
			  and per.CANA_OID_CANA = can.OID_CANA
			  and per.pais_oid_pais = t_sol_p.pais_oid_pais
			  and zon.CANA_OID_CANA = can.OID_CANA
			  and zon.MARC_OID_MARC = mar.OID_MARC
			  and zon.pais_oid_pais = t_sol_p.pais_oid_pais
			  and t_sol.OID_TIPO_SOLI = t_sol_p.TSOL_OID_TIPO_SOLI
			  and t_sol_p.OID_TIPO_SOLI_PAIS = secue.TSPA_OID_TIPO_SOLI_PAIS
			  and acc.oid_acce = gen_acc.val_oid(+)
			  and t_sol_p.pais_oid_pais = gen_pai.val_oid(+)
			  and can.OID_CANA = gen_can.val_oid(+)
  			  and t_sol.OID_TIPO_SOLI = gen_t_sol.val_oid(+)
			  and zon.IND_ACTI = 1
			  and per.oid_peri in (52,57) --PARAMETRO--
			  and can.oid_cana = 1 --PARAMETRO--
			  and mar.oid_marc = 1 --PARAMETRO--
			  and acc.oid_acce in (1) --PARAMETRO--
			  and t_sol_p.PAIS_OID_PAIS = 1 --PARAMETRO--
			  and t_sol.OID_TIPO_SOLI in (1,2,8,10,16,13,61,64,66,67,1382,1392,1418,1423) --PARAMETRO--
	 )comb
where solic.oid_marc(+) = comb.oid_marc
	  and solic.oid_cana(+) = comb.oid_cana
	  and solic.oid_zona(+) = comb.oid_zona
	  and solic.oid_peri(+) = comb.oid_peri
	  and solic.oid_acce(+) = comb.oid_acce
	  and solic.pais_oid_pais(+) = comb.pais_oid_pais
	  and solic.OID_TIPO_SOLI(+) = comb.oid_tipo_soli
group by
	  comb.pais,
	  comb.val_nomb_peri,
	  comb.canal,
	  comb.acceso,
	  comb.marca,
	  comb.des_zona,
	  comb.oid_tipo_soli,
   	  comb.tipo_sol,
	  comb.PAIS_OID_PAIS,	  	  	  
	  comb.OID_MARC,
	  comb.OID_CANA,
	  comb.OID_ZONA,
	  comb.oid_peri,
	  comb.OID_ACCE,
   	  solic.num_lote_fact
order by 
 	  comb.pais,
	  comb.val_nomb_peri,
	  comb.canal,
	  comb.acceso,
	  comb.marca,
	  comb.des_zona,
	  comb.tipo_sol
