 	   SELECT SUBSTR(CABECERA.VAL_NOMB_PERI, LENGTH(CABECERA.VAL_NOMB_PERI) - 1,2) VAL_NOMB_PERI, 	   		    SYSDATE - 1 FECHA_CABECERA, 	 	   		  			 PRODUCTOS.VAL_I18N PRODUCTO, 						 PRODUCTOS.COD_SAP, 						 CABECERA.REAL_FACTURADO  PED_REALES, 						 CABECERA.NUM_PEDI PEDIDOS_ESTIMADOS, 						 CABECERA.SALDO_PEDIDOS_X_FACTURAR STOCK, 						  PRODUCTOS.SALDO_PROD, 						 PRODUCTOS.CANT_SOLI_DIARIO NUM_SOL, 						 PRODUCTOS.DIARIO_TOTAL_PREC NETO_LOCAL, 						 PRODUCTOS.DIARIO_UNID_ATEN UN_ATN, 						 PRODUCTOS.DIARIO_FALTANTES FALTANTES,  						 PRODUCTOS.VALOR_VENTA_DIARIO VL_VENTA, 						 PRODUCTOS.PUA_DIARIO PUA, 						 PRODUCTOS.PUF_DIARIO PUF, 						 PRODUCTOS.CANT_SOLI NUM_SOL_P, 						 PRODUCTOS.TOTAL_PREC_NETO_TOTAL_LOCAL NETO_LOCAL_P, 						 PRODUCTOS.TOTAL_UNID_ATEN UN_ATN_P, 						 PRODUCTOS.FALTANTES FALTANTES_P 	   FROM	    	   ( 			   SELECT NUM_PEDI, 			   		  		    REAL_FACTURADO, 								NUM_PEDI - REAL_FACTURADO SALDO_PEDIDOS_X_FACTURAR, 								VAL_NOMB_PERI 			   FROM 						   ( 								    SELECT SUM(FVT.NUM_PEDI) NUM_PEDI, 										   			 PER.VAL_NOMB_PERI 									FROM INT_FUENT_VENTA_PREVI_SAP FVT, 										 		  CRA_PERIO PER 									WHERE FVT.PERD_OID_PERI =  57 										  			AND FVT.PERD_OID_PERI = PER.OID_PERI  	  		  				 									GROUP BY PER.VAL_NOMB_PERI 							) , 							( 							  		SELECT 	COUNT(*) REAL_FACTURADO	 									FROM PED_SOLIC_CABEC PSC 									WHERE  PSC.PERD_OID_PERI =  57  										   			AND PSC.FEC_FACT IS NOT NULL 													AND PSC.IND_PEDI_PRUE  < > 1 										   			AND PSC.IND_TS_NO_CONSO = 1 							)  		) CABECERA,		 		(	 				SELECT OID_PROD, 					   			  COD_SAP, 								  GEN_PRODU.VAL_I18N, 					   			  SALDO_PROD, 								  CANT_SOLI, 								  CANT_SOLI_DIARIO, 								  TOTAL_PREC_NETO_TOTAL_LOCAL, 								  TOTAL_UNID_ATEN, 								  FALTANTES, 								  DECODE( TOTAL_UNID_ATEN,0,0, TOTAL_PREC_NETO_TOTAL_LOCAL/ TOTAL_UNID_ATEN) VALOR_VENTA, 								  DECODE(CANT_SOLI,0,0, TOTAL_UNID_ATEN/CANT_SOLI) PUA, 								  DECODE(CANT_SOLI,0,0,FALTANTES/CANT_SOLI) PUF, 								  DIARIO_TOTAL_PREC, 								  DIARIO_UNID_ATEN, 								  DIARIO_FALTANTES, 								  DECODE( DIARIO_UNID_ATEN,0,0, DIARIO_TOTAL_PREC/ DIARIO_UNID_ATEN) VALOR_VENTA_DIARIO, 								  DECODE(CANT_SOLI_DIARIO,0,0, DIARIO_UNID_ATEN/CANT_SOLI_DIARIO) PUA_DIARIO, 								  DECODE(CANT_SOLI_DIARIO,0,0,DIARIO_FALTANTES/CANT_SOLI_DIARIO) PUF_DIARIO 				FROM 				(		 					SELECT OID_PROD, 						   			 COD_SAP, 						   			  SALDO_PROD, 									  CANT_SOLI, 									  CANT_SOLI_DIARIO, 									  TOTAL_PREC_NETO_TOTAL_LOCAL, 									  TOTAL_UNID_ATEN, 									  FALTANTES, 									  MAX(DIARIO_TOTAL_PREC) DIARIO_TOTAL_PREC, 									  MAX(DIARIO_UNID_ATEN) DIARIO_UNID_ATEN, 									  MAX(DIARIO_FALTANTES) DIARIO_FALTANTES 					FROM 					(		 						SELECT PRODU.OID_PROD, 							   			PRODU.COD_SAP, 							   			  PRODU.SALDO_PROD, 										  SOL_ACUM.CANT_SOLI CANT_SOLI, 										  SOL_DIARIO.CANT_SOLI CANT_SOLI_DIARIO, 										  SUM(NVL(SUM(SOLIC.VAL_PREC_TOTA_LOCA),0)) OVER ( PARTITION BY PRODU.OID_PROD) TOTAL_PREC_NETO_TOTAL_LOCAL, 										  SUM(NVL(SUM(SOLIC.NUM_UNID_ATEN),0)) OVER (PARTITION BY PRODU.OID_PROD) TOTAL_UNID_ATEN, 										  SUM(NVL(SUM(SOLIC.NUM_UNID_POR_ATEN)-SUM(SOLIC.NUM_UNID_ATEN),0)) OVER (PARTITION BY PRODU.OID_PROD) FALTANTES, 										  CASE WHEN (FEC_FACT =  TO_DATE(SYSDATE - 1)) THEN 										  	   			 NVL(SUM(SOLIC.VAL_PREC_TOTA_LOCA),0) 										  ELSE 										  	  			 0  										  END DIARIO_TOTAL_PREC, 										  CASE WHEN (FEC_FACT = TO_DATE( SYSDATE - 1)) THEN 										  	   			 NVL(SUM(SOLIC.NUM_UNID_ATEN),0) 										  ELSE 										  	  			 0  										  END DIARIO_UNID_ATEN, 						  				  CASE WHEN (FEC_FACT =  TO_DATE(SYSDATE -1)) THEN 										  				  NVL(SUM(SOLIC.NUM_UNID_POR_ATEN)-SUM(SOLIC.NUM_UNID_ATEN),0) 										  ELSE 										  	  			 0  										  END DIARIO_FALTANTES 						FROM	 										(		 												SELECT MP.OID_PROD, 													   			   MP.COD_SAP, 													   			   SUM(STC.VAL_SALD) SALDO_PROD 												FROM MAE_PRODU MP, 													 		  ( 																	  SELECT FEC_FINA, 																	  		 		  	FEC_INIC 																	  FROM  CRA_PERIO  																	  WHERE OID_PERI = 57  															  ) PER_PAR, 															  CRA_PERIO PER_INI, 															  CRA_PERIO PER_FIN, 															  BEL_STOCK STC 											WHERE STC.PROD_OID_PROD(+) = MP.OID_PROD 													  		  	 AND MP.NEGO_OID_NEGO IN ( 1 )  					   						 													  			 AND MP.UNEG_OID_UNID_NEGO IN ( 1 )	 											   				    AND PER_INI.OID_PERI = CASE WHEN (MP.PERD_OID_PERI_INIC IS NULL) THEN 																					   			 						   		   57  																													 ELSE 																													 	 		  MP.PERD_OID_PERI_INIC  																													 END 											   				    AND PER_FIN.OID_PERI = CASE WHEN (MP.PERD_OID_PERI_FIN IS NULL) THEN 																					   			 					   	  		 57  																													 ELSE 																													 	 		  MP.PERD_OID_PERI_FIN 																													 END 													 GROUP BY MP.OID_PROD,MP.COD_SAP 									 ) PRODU, 							  		 ( 												 SELECT PSP.PROD_OID_PROD, 												 				  COUNT(DISTINCT PSC.OID_SOLI_CABE) OVER ( PARTITION BY 1) CANT_SOLI, 																  PSP.VAL_PREC_TOTA_LOCA, 																  PSP.NUM_UNID_ATEN, 																  PSP.NUM_UNID_POR_ATEN, 																  PSC.FEC_FACT										   												 FROM PED_SOLIC_CABEC PSC, 												 	  		   SEG_SUBAC SBA, 															   PED_SOLIC_POSIC PSP 												 WHERE PSC.PERD_OID_PERI =  57  												 	   			   AND PSC.SBAC_OID_SBAC = SBA.OID_SBAC 																   AND SBA.ACCE_OID_ACCE =  1   																   AND PSC.IND_PEDI_PRUE  < > 1 															   	   AND PSC.IND_TS_NO_CONSO = 1 																   AND PSP.SOCA_OID_SOLI_CABE = PSC.OID_SOLI_CABE 																   AND PSP.ESPO_OID_ESTA_POSI  < > 2 											) SOLIC, 											( 												 SELECT  COUNT(PSC.OID_SOLI_CABE)  CANT_SOLI 												 FROM PED_SOLIC_CABEC PSC, 												 	  		   SEG_SUBAC SBA 												 WHERE PSC.PERD_OID_PERI =  57  												 	   			   AND PSC.SBAC_OID_SBAC = SBA.OID_SBAC 																    AND SBA.ACCE_OID_ACCE =  1   																   AND PSC.IND_PEDI_PRUE  < > 1 															   	   AND PSC.IND_TS_NO_CONSO = 1 											) SOL_ACUM, 																( 												 SELECT  COUNT(PSC.OID_SOLI_CABE)  CANT_SOLI 												 FROM PED_SOLIC_CABEC PSC, 												 	  		   SEG_SUBAC SBA									    												 WHERE PSC.PERD_OID_PERI =  57  												 	   			   AND PSC.SBAC_OID_SBAC = SBA.OID_SBAC 																    AND SBA.ACCE_OID_ACCE =  1   																   AND PSC.IND_PEDI_PRUE  < > 1 																   AND PSC.FEC_FACT = TO_DATE(SYSDATE - 1) 															   	   AND PSC.IND_TS_NO_CONSO = 1 											) SOL_DIARIO 						 WHERE SOLIC.PROD_OID_PROD(+) = PRODU.OID_PROD	  						 GROUP BY PRODU.OID_PROD, 						 	   	  				 PRODU.COD_SAP, 						 	   	  				 PRODU.SALDO_PROD, 												 SOL_ACUM.CANT_SOLI, 												 SOL_DIARIO.CANT_SOLI, 												 SOLIC.FEC_FACT 					) 					GROUP BY OID_PROD, 						  	 		  COD_SAP, 						   			  SALDO_PROD, 									  CANT_SOLI, 									  CANT_SOLI_DIARIO, 									  TOTAL_PREC_NETO_TOTAL_LOCAL, 									  TOTAL_UNID_ATEN, 									  FALTANTES					    				) DATOS, 				( 				  		SELECT GEN.VAL_OID, GEN.VAL_I18N 						FROM V_GEN_I18N_SICC GEN 						WHERE GEN.ATTR_ENTI = 'MAE_PRODU' 							  			AND GEN.IDIO_OID_IDIO =  1  				) GEN_PRODU 				WHERE GEN_PRODU.VAL_OID(+) = DATOS.OID_PROD 		) PRODUCTOS