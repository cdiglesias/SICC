select pais, motivo, sum(tipo_cli_1) tipo_cli_1, sum(tipo_cli_2) tipo_cli_2, sum(tipo_cli_3) tipo_cli_3,  	   sum(tipo_cli_4) tipo_cli_4, sum(tipo_cli_5) tipo_cli_5, sum(tipo_cli_6) tipo_cli_6, sum(pendiente) pendientes, 	   sum(atendida) atendidas, sum(menos_24) menos_24, sum(mas_24_menos_48) mas_24_menos_48, sum(mas_48) mas_48, 	   round(decode(sum(pendiente + atendida),0,0, sum(fin_inicio) / sum(pendiente + atendida)), 2) promedio from (  	select  		   con.oid_cont, 		   gen_pais.pais, 		   gen_motivo.motivo, 		   case when (con.ticl_oid_tipo_clie =  1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_1, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_2,    		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else 		        0 		   end tipo_cli_3, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then		  		   		1 		   else  		   		0 		   end tipo_cli_4, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then 		   		1 		   else 		   	    0 		   end tipo_cli_5, 		   case when (con.ticl_oid_tipo_clie =  -1 ) then	 		   		1 		   else 		        0 		   end tipo_cli_6, 		   decode(est.cod_esta,'03',1,0) atendida, 		   decode(est.cod_esta,'03',0,1)pendiente, 		   case when (est.cod_esta = '03') then 		   		case when (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0)  <  1) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end menos_24,	 		   case when (est.cod_esta = '03') then 		   		case when ((nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0) >= 1) and (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0)  <  2)) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end mas_24_menos_48,	 		   case when (est.cod_esta = '03') then 		   		case when (nvl(trunc((((86400*(decode(con.fec_hora_cier, null, sysdate, con.fec_hora_cier)-con.val_hora_inic))/60)/60)/24),0) >= 2) then 					 1 				else 					 0 			    end  		   else 		   	   0		   	    		   end mas_48,	    		   con.val_hora_fin-con.val_hora_inic fin_inicio 	from cal_conta con, 		 cal_motiv_conta mot, 		 cal_atrib_estad_conta atr, 		 cal_tipo_estad_conta est, 		 ( 		 select gen.val_oid, gen.val_i18n motivo 		 from v_gen_i18n_sicc gen 		 where gen.attr_enti = 'CAL_MOTIV_CONTA' 		 	   and gen.idio_oid_idio =   1  		 )gen_motivo, 		 ( 		 select gen.val_oid, gen.val_i18n pais 		 from v_gen_i18n_sicc gen 		 where gen.attr_enti = 'SEG_PAIS' 		 	   and gen.idio_oid_idio =   1  		 )gen_pais 	where con.moco_oid_moti_cont = mot.oid_moti_cont 		  and gen_motivo.val_oid(+) = mot.oid_moti_cont 		  and con.atec_oid_atri_esta_cont = atr.oid_atri_esta_cont 		  and atr.teco_oid_tipo_esta_cont = est.oid_tipo_esta_cont 		  and con.pais_oid_pais = gen_pais.val_oid(+) 		  and con.pais_oid_pais =   1  		   and con.moco_oid_moti_cont in ( 1 )  		  and con.val_hora_inic >= to_date( '01/01/2000' ,  'dd/MM/yyyy' ) 		  and con.val_hora_fin  < = to_date( '01/01/2099' ,  'dd/MM/yyyy' ) 		  and con.ticl_oid_tipo_clie in ( 1 ,  -1 ,  -1 , -1 , -1 ,  -1 ) ) group by pais, motivo order by motivo