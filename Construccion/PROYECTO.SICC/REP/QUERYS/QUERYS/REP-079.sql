		 SELECT SUBG, 	   REGION, 	   NUM_CONC, 	   PERI_INI, 	   PERI_FIN, 	   PERI_EVAL, 	   N_RECDA_EFECT, 	   N_RECTE_CONS, 	   FREC_ACUM, 	   TOTAL_RECDA, 	   PORC_RECOM_INGRE FROM ( 	SELECT SUBG, 		   REGION, 		   NUM_CONC, 		   PERI_INI, 		   PERI_FIN, 		   PERI_EVAL, 		   TOTAL_RECDA N_RECDA_EFECT, 		   COUNT(RECTE) N_RECTE_CONS, 		   SUM(COUNT(RECTE)) OVER (PARTITION BY SUBG, REGION, NUM_CONC, PERI_EVAL ORDER BY TOTAL_RECDA DESC) FREC_ACUM, 		   TOTAL_RECDA * COUNT(RECTE) TOTAL_RECDA, 		   (TOTAL_RECDA * COUNT(RECTE))*100/ 55  PORC_RECOM_INGRE	   	FROM 	( 		SELECT SUBG.DES_SUBG_VENT SUBG, 			   REG.DES_REGI REGION, 			   CPG.NUM_CONC, 			   PERI1.VAL_NOMB_PERI PERI_INI, 			   PERI2.VAL_NOMB_PERI PERI_FIN, 			   PERI3.VAL_NOMB_PERI PERI_EVAL, 			   RECTE.OID_CLIE_RETE RECTE, 			   COUNT(RECDO.OID_CLIE_REDO) TOTAL_RECDA	 		FROM INC_CONCU_PARAM_GENER CPG, 			 INC_PARAM_GENER_PREMI PGP, 			 INC_PARAM_NIVEL_PREMI PNP, 			 ZON_SUB_GEREN_VENTA SUBG, 			 ZON_REGIO REG, 			 ZON_ZONA ZONA, 			 ZON_SECCI SEC, 			 ZON_TERRI_ADMIN TA, 			 MAE_CLIEN_UNIDA_ADMIN CLI_UA, 			 INC_CLIEN_RECTE RECTE, 			 INC_CLIEN_RECDO RECDO, 			 CRA_PERIO PERI1, 			 CRA_PERIO PERI2, 			 CRA_PERIO PERI3 		WHERE SUBG.OID_SUBG_VENT = REG.ZSGV_OID_SUBG_VENT 			  AND REG.OID_REGI = ZONA.ZORG_OID_REGI 			  AND ZONA.OID_ZONA = SEC.ZZON_OID_ZONA 			  AND SEC.OID_SECC = TA.ZSCC_OID_SECC 			  AND CLI_UA.IND_ACTI = 1 			  AND TA.OID_TERR_ADMI = CLI_UA.ZTAD_OID_TERR_ADMI 			  AND RECTE.COPA_OID_PARA_GRAL = CPG.OID_PARA_GRAL 			  AND RECTE.CLIE_OID_CLIE = CLI_UA.CLIE_OID_CLIE 			  AND PGP.COPA_OID_PARA_GRAL = CPG.OID_PARA_GRAL 			  AND PNP.PAGP_OID_PARA_GENE_PREM = PGP.OID_PARA_GENE_PREM 			  AND RECDO.PANP_OID_PARA_NIVE_PREM = PNP.OID_PARA_NIVE_PREM 			  AND RECDO.CLR3_OID_CLIE_RETE = RECTE.OID_CLIE_RETE 			  AND CPG.PERD_OID_PERI_DESD = PERI1.OID_PERI 			  AND CPG.PERD_OID_PERI_HAST = PERI2.OID_PERI 			  AND RECDO.PERD_OID_PERI = PERI3.OID_PERI  			  AND CPG.IND_ACTI = 1 			  AND RECDO.IND_EFEC = 1	   		 	  AND CPG.OID_PARA_GRAL =  1   			  AND SUBG.PAIS_OID_PAIS =   1   			  AND SUBG.MARC_OID_MARC =  1   			  AND SUBG.CANA_OID_CANA =   1    	 AND SUBG.OID_SUBG_VENT IN  ( 1 )  	  AND REG.OID_REGI IN ( 1 )    		GROUP BY SUBG.DES_SUBG_VENT, 			   REG.DES_REGI, 			   CPG.NUM_CONC, 			   PERI1.VAL_NOMB_PERI, 			   PERI2.VAL_NOMB_PERI, 			   PERI3.VAL_NOMB_PERI, 			   RECTE.OID_CLIE_RETE 	)	   	  	GROUP BY SUBG, 		   REGION, 		   NUM_CONC, 		   PERI_INI, 		   PERI_FIN, 		   PERI_EVAL, 		   TOTAL_RECDA 	ORDER BY SUBG, 		  	 REGION, 			 NUM_CONC, 			 N_RECDA_EFECT ) 			  WHERE 1=1   AND N_RECDA_EFECT IN  ( 1 )   ORDER BY SUBG, 	  	 REGION, 		 NUM_CONC, 		 PERI_EVAL, 		 N_RECDA_EFECT