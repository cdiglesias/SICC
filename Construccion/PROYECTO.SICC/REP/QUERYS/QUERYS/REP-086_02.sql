select pais, 	   DECODE(desc_area,NULL,'Z - SIN AREA DE SEGUIMIENTO',desc_area) desc_area,  sum(tipo_cli_1)tipo_cli_1, sum(tipo_cli_2)tipo_cli_2, sum(tipo_cli_3)tipo_cli_3,  	   sum(tipo_cli_4)tipo_cli_4, sum(tipo_cli_5)tipo_cli_5, sum(tipo_cli_6)tipo_cli_6, sum(pendiente)pendientes, 	   sum(atendida) atendidas, sum(menos_24) menos_24, sum(mas_24_menos_48) mas_24_menos_48, sum(mas_48) mas_48,  	   round((sum(fin_inicio) / (sum(atendida)+sum(pendiente))), 2)promedio, 	   sum(atendida)+sum(pendiente) total from (  	select gen_pai.pais, 		   oid_cont, cal_cab_buz.oid_cabe_buzo, cal_det_buz.OID_DETA_BUZO,  		   cal_cab_buz.val_desc_cabe_buzo desc_area, 		   case when (con.ticl_oid_tipo_clie =  1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_1, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_2,    		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else 		        0 		   end tipo_cli_3, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_4, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then 		   		1 		   else 		   	    0 		   end tipo_cli_5, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then	 		   		1 		   else 		        0 		   end tipo_cli_6, 		   decode(est.cod_esta,'03',1,0) atendida, 		   decode(est.cod_esta,'03',0,1)pendiente, 		   case when (est.cod_esta = '03') then 		   		case when (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0)  <  1) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end menos_24,	 		   case when (est.cod_esta = '03') then 		   		case when ((nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0) >= 1) and (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0)  <  2)) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end mas_24_menos_48,	 		   case when (est.cod_esta = '03') then 		   		case when (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0) >= 2) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end mas_48, 		   con.val_hora_fin-con.val_hora_inic fin_inicio 		from cal_conta con, 		 cal_motiv_conta mot, 		 cal_atrib_estad_conta atr, 		 cal_tipo_estad_conta est, 		 cal_cabec_buzon cal_cab_buz, 		 cal_detal_buzon cal_det_buz, 		  ( 		 select gen.val_oid, gen.val_i18n pais 		 from v_gen_i18n_sicc gen 		 where gen.ATTR_ENTI = 'SEG_PAIS' 		 	   and gen.idio_oid_idio =  1  		 )gen_pai 	where con.MOCO_OID_MOTI_CONT = mot.OID_MOTI_CONT 		and mot.COD_MOTI = '00' 		   and con.COD_OPER =  '1'   		  and con.ATEC_OID_ATRI_ESTA_CONT = atr.oid_atri_esta_cont 		  and atr.teco_oid_tipo_esta_cont = est.oid_tipo_esta_cont 		  and con.PAIS_OID_PAIS =  1  		  and to_date(con.VAL_HORA_INIC) >= to_date( '01/01/2000' ,  'dd/MM/yyyy'  ) 		  and to_date(con.VAL_HORA_FIN)  < = to_date( '01/01/2099' ,  'dd/MM/yyyy'  ) 		  and cal_det_buz.CABU_OID_CABE_BUZO = cal_cab_buz.oid_cabe_buzo(+) 	       and cal_cab_buz.cod_buzo =  1   		  and cal_det_buz.CONT_OID_CONT(+) = con.OID_CONT 		  and con.pais_oid_pais = gen_pai.val_oid(+)  	    AND CON.TICL_OID_TIPO_CLIE IN ( 1 , -1 , -1 , -1 , -1 , -1 ) ) group by pais, 	  desc_area order by desc_area