select oid_curs,
	   periodo, DES_CURS, DES_REGI, DES_ZONA, DES_SECCI, COD_TERR,
	   FEC_DISP_CURS, FEC_LANZ, FEC_FIN_CURS,
	   own_peru.rep_010_concat_productos(1,oid_curs)desc_regalo,
	   modalidad,
	   COD_CLIE,nombre_completo,
	   periodo_ingreso,
	   telefono, celular, mail	   
	   --LOS CAMPOS ASISTIO, FIRMA Y PROD, SE PONE UNA RAYA PARA COMPLETAR--
	   --COMO LOS QUE APARECEN AL PIE DEL REPORTE--
from 
(
	select cur.DES_CURS, reg.DES_REGI, zon.DES_ZONA, sec.DES_SECCI, ter.COD_TERR, cur.oid_curs,
		   (
		   select 
		   		  pe.VAL_NOMB_PERI 
		   from 
			   (
			   select per2.VAL_NOMB_PERI, per2.FEC_INIC, per2.FEC_FINA
			   from cra_perio per2
			   where per2.PAIS_OID_PAIS = 1 --PARAMETRO--
			      and per2.cana_oid_cana = 1 --PARAMETRO--
				  and per2.MARC_OID_MARC = 1 --PARAMETRO--
			   order by per2.FEC_INIC
			   )pe  
		   where cur.FEC_DISP_CURS between pe.FEC_INIC and pe.FEC_FINA 
				 and rownum = 1		
		   )periodo, 
		   cur.FEC_DISP_CURS,  cur.FEC_LANZ, cur.FEC_FIN_CURS, rega.COD_REGA, 
		   decode(apt_his.IND_APTA_CURS,1,'APTA','INVITADA') as modalidad,
		   cli.COD_CLIE, cli.VAL_APE1||' '|| cli.VAL_APE2||' '|| cli.VAL_NOM1||' '||cli.VAL_NOM2 as nombre_completo,
		   datos_adic.telefono, datos_adic.celular, datos_adic.mail,
		   (
		   select 
		   		  pe.VAL_NOMB_PERI
		   from 
			   (
			   select per2.VAL_NOMB_PERI, per2.FEC_INIC, per2.FEC_FINA
			   from cra_perio per2
			   where per2.PAIS_OID_PAIS = 1 --PARAMETRO--
			      and per2.cana_oid_cana = 1 --PARAMETRO--
				  and per2.MARC_OID_MARC = 1 --PARAMETRO--
			   order by per2.FEC_INIC
			   )pe  
		   where cli.FEC_INGR between pe.FEC_INIC and pe.FEC_FINA 
				 and rownum = 1		
		   )periodo_ingreso
	from edu_matri_curso cur,
		 edu_regal rega,
		 edu_regal_detal det_regal,
		 zon_zona zon,
		 zon_regio reg,
		 zon_secci sec,
		 zon_terri ter,
		 mae_produ pro,
		 mae_clien cli,
		 ( 
		 select apt.MCUR_OID_CURS, apt.FEC_ASIS, apt.CLIE_OID_CLIE, apt.SBTI_OID_SUBT_CLIE, apt.IND_APTA_CURS,
		 		apt.IND_INVI, apt.IND_ASIS
		 from edu_aptas_curso apt
		 union all
		 select his.MCUR_OID_CURS, his.FEC_ASIS, his.CLIE_OID_CLIE, his.SBTI_OID_SUBT_CLIE, his.IND_APTA ind_apta_curs,
		 		his.IND_INVIT ind_invi, his.IND_ASIS ind_asis
		 from edu_histo_curso his
		 )apt_his,
		 (
		select decode(decode(tel.CLIE_OID_CLIE,null,cel.CLIE_OID_CLIE,tel.CLIE_OID_CLIE),null,mail.clie_oid_clie,decode(tel.CLIE_OID_CLIE,null,cel.CLIE_OID_CLIE,tel.CLIE_OID_CLIE))clie_oid_clie, 
			   tel.val_text_comu telefono,
			   cel.val_text_comu celular,
			   mail.val_text_comu mail
		from
			(
			select com.CLIE_OID_CLIE, com.VAL_TEXT_COMU, tcom.COD_TIPO_COMU
			from mae_tipo_comun tcom,
				 mae_clien_comun com
			where com.TICM_OID_TIPO_COMU = tcom.OID_TIPO_COMU
				  and tcom.COD_TIPO_COMU = 'TF'
			)tel full outer join
			(
			select com.CLIE_OID_CLIE, com.VAL_TEXT_COMU, tcom.COD_TIPO_COMU
			from mae_tipo_comun tcom,
				 mae_clien_comun com
			where com.TICM_OID_TIPO_COMU = tcom.OID_TIPO_COMU
				  and tcom.COD_TIPO_COMU = 'TM' 
			)cel on tel.clie_oid_clie = cel.clie_oid_clie
			full outer join
			(
			select com.CLIE_OID_CLIE, com.VAL_TEXT_COMU, tcom.COD_TIPO_COMU
			from mae_tipo_comun tcom,
				 mae_clien_comun com
			where com.TICM_OID_TIPO_COMU = tcom.OID_TIPO_COMU
				  and tcom.COD_TIPO_COMU = 'ML' 
			)mail on tel.clie_oid_clie = mail.clie_oid_clie or cel.clie_oid_clie = mail.clie_oid_clie
		 )datos_adic
	where cur.ZORG_OID_REGI = reg.OID_REGI(+)
		  and cur.ZZON_OID_ZONA = zon.OID_ZONA(+)
		  and cur.ZSCC_OID_SECC = sec.OID_SECC(+)
		  and cur.TERR_OID_TERR = ter.OID_TERR(+)
		  and cur.REGA_OID_REGA = rega.OID_REGA(+)
		  and rega.OID_REGA = det_regal.REGA_OID_REGA
		  and det_regal.PROD_OID_PROD = pro.OID_PROD
		  and apt_his.MCUR_OID_CURS(+) = cur.OID_CURS
		  and apt_his.clie_oid_clie = cli.oid_clie(+)
		  and cli.OID_CLIE = datos_adic.CLIE_OID_CLIE(+)
	--	  and cur.OID_CURS = 1 --PARAMETRO--
/*		  and cur.PAIS_OID_PAIS = 1 --PARAMETRO--
		  and cur.cana_oid_cana = 1 --PARAMETRO--
		  and cur.MARC_OID_MARC = 1 --PARAMETRO--
		  and reg.OID_REGI = 1 --PARAMETRO--*/
	--	  and zon.OID_ZONA = 1 --PARAMETRO--
)
order by periodo, DES_CURS, DES_REGI, DES_ZONA, DES_SECCI, COD_TERR,
	   FEC_DISP_CURS, FEC_LANZ, FEC_FIN_CURS, desc_regalo,
	   modalidad,
	   COD_CLIE,nombre_completo,
	   telefono, celular, mail,
	   periodo_ingreso
	  





	 
	  
