		  SELECT * FROM (  	     SELECT SOC.VAL_DENO SOCIEDAD_DEFECTO          FROM PRINCIPALS PRI,  		 	  		   PROPERTYVALUES PRO, 					   SEG_SOCIE SOC          WHERE PRI.NAME =  'PRUEBAS'                     AND PRO.IDPROPERTY = 48                    AND PRO.IDPRINCIPAL = PRI.IDPRINCIPAL 				   AND SOC.OID_SOCI = PRO.STRINGVALUE  ), ( 		( 		SELECT  PAIS, 						  'A' AS GRUPO, 						  DES_REGI, 						  DES_ZONA,  						  NULL AS NIVEL_NUEVAS,       					 	  NULL AS NIVEL_I,  						  NULL AS NIVEL_II,       					  	 NULL AS NIVEL_III, 						  NULL AS NIVEL_IV, 						  NULL AS NIVEL_EGRE,  						  NULL AS NIVEL_REINGRE,							   						  VENTA_NETA_ESTAD, 						  N_PEDIDO, 						  ACTIVIDAD, 						  ACTI_FINALES, 						  INGRESOS, 						  REINGRESOS, 						  EGRESOS, 						  CAPITALIZACION, 						  REZO_RECIBIDAS, 						  REZO_ENTREGADAS, 						  PMNP, 						  PPU, 						  PUP, 						  CPP, 						  NULL AS PORC_VENTA_NIVEL_III, 						  NULL AS PORC_ACTIVAS_NIVEL_IV, 						  NULL AS PORC_VENTA_NIVEL_IV, 						  NULL AS PORC_ACTIVAS_NIVEL_EGRE, 						  NULL AS PORC_VENTA_NIVEL_EGRE,                          			  NULL AS PORC_ACTIVAS_NIVEL_REINGRE,   						  NULL AS PORC_VENTA_NIVEL_REINGRE 		FROM 				(		 				SELECT PAIS, 					   DES_REGI, 					   DES_ZONA,	 					   SUM(VTA_NETA_ESTAD) VENTA_NETA_ESTAD, 					   SUM(N_PEDIDOS) N_PEDIDO, 					   DECODE(SUM(ACTI_FINALES), 0 , 0, (SUM(N_PEDIDOS)/SUM(ACTI_FINALES))*100) ACTIVIDAD,    				   	   SUM(ACTI_FINALES) ACTI_FINALES, 				   	   SUM(INGRESOS) INGRESOS, 					   SUM(REINGRESOS) REINGRESOS, 					   SUM(EGRESOS) EGRESOS,	    					   SUM(INGRESOS) + SUM(REINGRESOS) - SUM(EGRESOS) CAPITALIZACION, 					   SUM(REZO_RECIBIDAS) REZO_RECIBIDAS, 					   SUM(REZO_ENTREGADAS) REZO_ENTREGADAS,		   	    					   DECODE(SUM(N_PEDIDOS), 0, 0, SUM(VTA_NETA_ESTAD)/SUM(N_PEDIDOS)) PMNP, 					   DECODE(SUM(UNIDADES_VENDIDAS), 0, 0, SUM(VTA_NETA_ESTAD)/SUM(UNIDADES_VENDIDAS)) PPU,	    	    				   	   DECODE(SUM(N_PEDIDOS), 0, 0, SUM(UNIDADES_VENDIDAS)/SUM(N_PEDIDOS)) PUP, 				   	   DECODE(SUM(N_PEDIDOS), 0, 0, SUM(N_CLIENTES)/SUM(N_PEDIDOS)) CPP 				FROM 		 					(		 					SELECT GEN_PAIS.VAL_I18N PAIS, 						   REG.OID_REGI, 						   REG.DES_REGI, 						   ZONA.OID_ZONA, 						   ZONA.DES_ZONA, 						   ( 						   SELECT SUM(NVL(VR.NUM_ACTI_FINA, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						     GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) ACTI_FINALES, 						   ( 						   SELECT SUM(NVL(VR.NUM_INGR, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) INGRESOS, 				   		   ( 						   SELECT SUM(NVL(VR.NUM_EGRE, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) EGRESOS, 						   ( 						   SELECT SUM(NVL(VR.NUM_REIN, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) REINGRESOS, 						   ( 						   SELECT SUM(NVL(VR.NUM_REZO_RECI, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) REZO_RECIBIDAS, 						   ( 						   SELECT SUM(NVL(VR.NUM_REZO_ENTR, 0)) 						   FROM INT_FUENT_VENTAS_REAL VR 						   WHERE VR.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VR.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VR.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) REZO_ENTREGADAS, 						   ( 						   SELECT SUM(NVL(VRA.IMP_VENT_NETA_ESTA, 0)) 						   FROM INT_FUENT_VENTA_REAL_VACUM VRA 						   WHERE VRA.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VRA.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VRA.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) VTA_NETA_ESTAD, 						   ( 						   SELECT SUM(NVL(VRA.NUM_PEDI, 0)) 						   FROM INT_FUENT_VENTA_REAL_VACUM VRA 						   WHERE VRA.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VRA.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VRA.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) N_PEDIDOS, 						   ( 						   SELECT SUM(NVL(VRA.NUM_UNID_VEND, 0)) 						   FROM INT_FUENT_VENTA_REAL_VACUM VRA 						   WHERE VRA.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VRA.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VRA.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA 						   ) UNIDADES_VENDIDAS, 						   ( 						   SELECT SUM(NVL(VRA.NUM_CLIE, 0)) 						   FROM INT_FUENT_VENTA_REAL_VACUM VRA 						   WHERE VRA.PERD_OID_PERI = PERI.OID_PERI 						   		 AND VRA.ZZON_OID_ZONA = ZONA.OID_ZONA 								 AND VRA.ZORG_OID_REGI = REG.OID_REGI 						   GROUP BY REG.OID_REGI, 								 ZONA.OID_ZONA	 						   ) N_CLIENTES 					FROM CRA_PERIO PERI, 						 ZON_ZONA ZONA, 						 ZON_REGIO REG, 						 ( 						 SELECT FEC_INIC 						 FROM CRA_PERIO  						 WHERE OID_PERI =  55     			  						 ) FI, 						 ( 						 SELECT FEC_FINA 						 FROM CRA_PERIO  						 WHERE OID_PERI =  67           						 ) FF, 						 ( 						 SELECT GEN.VAL_OID, GEN.VAL_I18N 						 FROM V_GEN_I18N_SICC GEN 						 WHERE GEN.ATTR_ENTI = 'SEG_PAIS' 							   AND GEN.IDIO_OID_IDIO =  1  				     	 ) GEN_PAIS 					WHERE PERI.FEC_INIC >= FI.FEC_INIC 						  AND PERI.FEC_FINA  < = FF.FEC_FINA 						  AND ZONA.ZORG_OID_REGI = REG.OID_REGI 						  AND REG.PAIS_OID_PAIS =  1  						  AND PERI.PAIS_OID_PAIS = GEN_PAIS.VAL_OID(+) 						  AND PERI.PAIS_OID_PAIS =  1 	 						  AND PERI.MARC_OID_MARC =   1 	 						  AND PERI.CANA_OID_CANA =   1 	 				            AND reg.oid_regi =  ( 1 )    				           AND zona.oid_zona =  ( 1 )    						 ) 				GROUP BY PAIS, 					   DES_REGI, 					   DES_ZONA   				)	 		) 		UNION ALL	 		(	 		      SELECT PAIS, 		      			GRUPO, 		      			DES_REGI, 		      			DES_ZONA, 		      			NIVEL_NUEVAS, 		      			 NIVEL_I,  					NIVEL_II,       					NIVEL_III, 					NIVEL_IV, 					NIVEL_EGRE,  					NIVEL_REINGRE, 					CANTIDAD_NIVEL_NUEVAS, 					CANTIDAD_NIVEL_I, 					CANTIDAD_NIVEL_II, 					CANTIDAD_NIVEL_III, 					CANTIDAD_NIVEL_IV, 					CANTIDAD_NIVEL_EGRE, 					CANTIDAD_NIVEL_REINGRE, 					PORC_ACTIVAS_NIVEL_NUEVAS, 					POR_VENTA_NIVEL_NUEVAS,         				PORC_ACTIVAS_NIVEL_I, 					POR_VENTA_NIVEL_I, 					PORC_ACTIVAS_NIVEL_II, 					POR_VENTA_NIVEL_II, 					PORC_ACTIVAS_NIVEL_III, 					POR_VENTA_NIVEL_III, 					PORC_ACTIVAS_NIVEL_IV, 					POR_VENTA_NIVEL_IV, 					PORC_ACTIVAS_NIVEL_EGRE, 					POR_VENTA_NIVEL_EGRE, 					PORC_ACTIVAS_NIVEL_REINGRE, 					POR_VENTA_NIVEL_REINGRE								   					 			   FROM	 			  	( 			  	SELECT PAIS, 					   			  GRUPO, 								  DES_REGI, 								  DES_ZONA, 								  MAX(CANTIDAD_NIVEL_NUEVAS) CANTIDAD_NIVEL_NUEVAS, 								  MAX(PORC_ACTIVAS_NIVEL_NUEVAS) PORC_ACTIVAS_NIVEL_NUEVAS, 								  MAX(PORC_VENTA_NIVEL_NUEVAS) POR_VENTA_NIVEL_NUEVAS, 								  MAX(CANTIDAD_NIVEL_I) CANTIDAD_NIVEL_I, 								  MAX(PORC_ACTIVAS_NIVEL_I) PORC_ACTIVAS_NIVEL_I, 								  MAX(PORC_VENTA_NIVEL_I) POR_VENTA_NIVEL_I, 								  MAX(CANTIDAD_NIVEL_II) CANTIDAD_NIVEL_II, 								  MAX(PORC_ACTIVAS_NIVEL_II) PORC_ACTIVAS_NIVEL_II, 								  MAX(PORC_VENTA_NIVEL_II) POR_VENTA_NIVEL_II, 								  MAX(CANTIDAD_NIVEL_III) CANTIDAD_NIVEL_III, 								  MAX(PORC_ACTIVAS_NIVEL_III) PORC_ACTIVAS_NIVEL_III, 								  MAX(PORC_VENTA_NIVEL_III) POR_VENTA_NIVEL_III, 								  MAX(CANTIDAD_NIVEL_IV) CANTIDAD_NIVEL_IV, 								  MAX(PORC_ACTIVAS_NIVEL_IV) PORC_ACTIVAS_NIVEL_IV, 								  MAX(PORC_VENTA_NIVEL_IV) POR_VENTA_NIVEL_IV, 								  MAX(CANTIDAD_NIVEL_EGRE) CANTIDAD_NIVEL_EGRE, 								  MAX(PORC_ACTIVAS_NIVEL_EGRE) PORC_ACTIVAS_NIVEL_EGRE, 								  MAX(PORC_VENTA_NIVEL_EGRE) POR_VENTA_NIVEL_EGRE, 								  MAX(CANTIDAD_NIVEL_REINGRE) CANTIDAD_NIVEL_REINGRE, 								  MAX(PORC_ACTIVAS_NIVEL_REINGRE) PORC_ACTIVAS_NIVEL_REINGRE, 								  MAX(PORC_VENTA_NIVEL_REINGRE) POR_VENTA_NIVEL_REINGRE								   				FROM 				( 					SELECT NIV.VAL_I18N PAIS, 						   			  'B' AS GRUPO,			   		 						   			  NIV.DES_REGI, 						   			  NIV.DES_ZONA, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 1)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_NUEVAS, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 1)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_NUEVAS, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 1)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_NUEVAS, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 2)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_I, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 2)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_I, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 2)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_I, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 3)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_II, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 3)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_II, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 3)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_II, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 4)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_III, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 4)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_III, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 4)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_III, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 5)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_IV, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 5)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_IV, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 5)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_IV, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 6)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_EGRE, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 6)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_EGRE, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 6)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_EGRE, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 8)THEN 									  	   				CANTIDAD 									  END CANTIDAD_NIVEL_REINGRE, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 8)THEN 									    				  DECODE(CANTIDAD_SUMA,0,0, CANTIDAD/CANTIDAD_SUMA)  									  END PORC_ACTIVAS_NIVEL_REINGRE, 									  CASE WHEN (NIV.OID_NIVE_SEGM = 8)THEN 									  					  DECODE(VENTA_SUMA,0,0, VENTA/VENTA_SUMA)  									  END PORC_VENTA_NIVEL_REINGRE 						FROM 						( 							SELECT   REG.OID_REGI, 												ZON.OID_ZONA, 												DNS.OID_NIVE_SEGM, 								   				DNS.VAL_DESC, 												COUNT(*) CANTIDAD, 												SUM(DSC.VAL_VENT) VENTA, 												SUM(COUNT(*)) OVER (PARTITION BY ZON.OID_ZONA) CANTIDAD_SUMA, 												SUM(SUM(DSC.VAL_VENT)) OVER (PARTITION BY ZON.OID_ZONA) VENTA_SUMA					 							FROM DTR_NIVEL_SEGME DNS, 								 		  DTR_SEGME_CLIEN DSC, 										  ( 										   		SELECT FEC_INIC 												FROM CRA_PERIO 												WHERE OID_PERI =  55 					 										  ) PER_INI, 										  ( 										   		SELECT FEC_FINA 												FROM CRA_PERIO 												WHERE OID_PERI =  67     					 										  ) PER_FIN, 										  CRA_PERIO PER, 										  ZON_ZONA ZON, 										  ZON_REGIO REG	 							WHERE DSC.NVSG_OID_NIVE_SEGM = DNS.OID_NIVE_SEGM 								  			AND PER.OID_PERI = DSC.PERD_OID_PERI 								  			AND  PER_INI.FEC_INIC  < = PER.FEC_INIC 											AND PER_FIN.FEC_FINA >= PER.FEC_FINA 											AND DSC.ZORG_OID_REGI = REG.OID_REGI 											AND DSC.ZZON_OID_ZONA = ZON.OID_ZONA 											AND REG.OID_REGI = ZON.ZORG_OID_REGI 											AND ZON.OID_ZONA = DSC.ZZON_OID_ZONA 											AND REG.PAIS_OID_PAIS = PER.PAIS_OID_PAIS 											AND PER.PAIS_OID_PAIS =  1  											AND PER.MARC_OID_MARC =   1  											AND PER.CANA_OID_CANA =  1  					     AND reg.oid_regi =  ( 1 )    					           AND zon.oid_zona =  ( 1 )    							GROUP BY  REG.OID_REGI, 													 ZON.OID_ZONA, 													 DNS.OID_NIVE_SEGM, 													 DNS.VAL_DESC		 						) DAT, 						( 						  		SELECT  * 								FROM DTR_NIVEL_SEGME, 									 		  ZON_REGIO REG, 											  ZON_ZONA ZON, 		  					  				 ( 										 SELECT GEN.VAL_OID, GEN.VAL_I18N 										 FROM V_GEN_I18N_SICC GEN 										 WHERE GEN.ATTR_ENTI = 'SEG_PAIS' 											   AND GEN.IDIO_OID_IDIO =  1  								     	 ) GEN_PAIS		   								WHERE OID_NIVE_SEGM  < > 7 									  			  AND REG.OID_REGI = ZON.ZORG_OID_REGI 												  AND REG.PAIS_OID_PAIS = GEN_PAIS.VAL_OID(+) 												  AND REG.PAIS_OID_PAIS =   1  					      AND reg.oid_regi =  ( 1 )    					            AND zon.oid_zona =  ( 1 )    						) NIV 						WHERE  DAT.OID_NIVE_SEGM(+) = NIV.OID_NIVE_SEGM 							   			AND NIV.OID_ZONA = DAT.OID_ZONA(+) 										AND NIV.OID_REGI = DAT.OID_REGI(+) 				) 				GROUP BY	PAIS, 					   			  GRUPO, 								  DES_REGI, 								  DES_ZONA 			   ) ,			   			  (				   								  SELECT MAX(NIVEL_NUEVAS) NIVEL_NUEVAS, 								  		 			MAX(NIVEL_I) NIVEL_I, 													MAX(NIVEL_II) NIVEL_II, 													MAX(NIVEL_III) NIVEL_III, 													MAX(NIVEL_IV) NIVEL_IV, 													MAX(NIVEL_EGRE) NIVEL_EGRE, 													MAX(NIVEL_REINGRE) NIVEL_REINGRE	   				 								 FROM  								(   								SELECT CASE WHEN (NIV.OID_NIVE_SEGM = 1)THEN 									  	   				VAL_DESC 									 			  END NIVEL_NUEVAS, 										 CASE WHEN (NIV.OID_NIVE_SEGM = 2)THEN 									  	   				VAL_DESC 									 			  END NIVEL_I, 												   CASE WHEN (NIV.OID_NIVE_SEGM = 3)THEN 									  	   				VAL_DESC 									 			  END NIVEL_II, 												   CASE WHEN (NIV.OID_NIVE_SEGM = 4)THEN 									  	   				VAL_DESC 									 			  END NIVEL_III, 												   CASE WHEN (NIV.OID_NIVE_SEGM = 5)THEN 									  	   				VAL_DESC 									 			  END NIVEL_IV, 												   CASE WHEN (NIV.OID_NIVE_SEGM = 6)THEN 									  	   				VAL_DESC 									 			  END NIVEL_EGRE, 												   CASE WHEN (NIV.OID_NIVE_SEGM = 8)THEN 									  	   				VAL_DESC 									 			  END NIVEL_REINGRE 								FROM DTR_NIVEL_SEGME NIV 								WHERE NIV.OID_NIVE_SEGM  < > 7 								) 				) 		) )	  