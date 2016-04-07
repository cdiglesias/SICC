SELECT GEN_PAIS.VAL_I18N PAIS,
	   CABECERA.VENTA,
	   CABECERA.INCOBRABLE,
	   CABECERA.TOTAL_IMPORTE,
	   CABECERA.VENTA_PORC,
	   CABECERA.INCOBRABLE_PORC,
	   CABECERA.CONSULTORAS_TOTAL,
	   DETALLE.MOTI_COB,
	   DETALLE.IMPORTE,
	   DECODE(CABECERA.TOTAL_IMPORTE, 0, 0, DETALLE.IMPORTE / CABECERA.TOTAL_IMPORTE)*100 PORC_MOTIVO,
	   DECODE(CABECERA.VENTA, 0, 0, DETALLE.IMPORTE / CABECERA.VENTA)*100 PORC_VENTA,
	   DECODE(CABECERA.VENTA, 0, 0, DETALLE.IMP_DEUD_PENDIENTE / CABECERA.TOTAL_IMPORTE)*100 PORC_INCOBRABLE,
	   DETALLE.NUM_CLIENTES,
	   DECODE(CABECERA.CONSULTORAS_TOTAL, 0, 0, DETALLE.NUM_CLIENTES / CABECERA.CONSULTORAS_TOTAL)*100 PORC_CONSULTORAS
FROM
(
----------------------------------- CALCULOS PARA LA CABECERA ------------------------------------------------
	SELECT SUM(MCC.IMP_MOVI) VENTA,
		   SUM(MCC.IMP_PEND) INCOBRABLE,	   	   
		   NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0) TOTAL_IMPORTE,
		   DECODE(NVL(SUM(MCC.IMP_MOVI), 0), 0, 0,NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0) / NVL(SUM(MCC.IMP_MOVI), 0))* 100 VENTA_PORC, 
		   NVL((SUM(ASI_COB.IMP_DEUD_ASIG) - SUM(ASI_COB.IMP_DEUD_CANC)), 0) TOTAL_IMPORTE_PEND,
		   DECODE(NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0), 0, 0, NVL((SUM(ASI_COB.IMP_DEUD_ASIG) - SUM(ASI_COB.IMP_DEUD_CANC)), 0) / NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0))* 100 INCOBRABLE_PORC,
	   	   COUNT(DISTINCT MCC.CLIE_OID_CLIE) CONSULTORAS_TOTAL
	FROM COB_ASIGN_COBRA ASI_COB,
		 COB_CRONO_COBRA CRO_COB,
		 CRA_PERIO PERI,
		 CCC_MOVIM_CUENT_CORRI MCC,
		 ZON_TERRI_ADMIN TER_ADM,
		 ZON_TERRI TER,
		 ZON_SECCI SEC,
		 COB_GESTI_COBRA GESTION,
		 COB_ESTAD_ASIGN EST_ASI,
		 (
			 SELECT GES.OID_GEST_COBR
			 FROM COB_GESTI_COBRA GES,
				 (
				 SELECT ETDE_OID_ETAPA_DEUDA,
				 	    CLIE_OID_CLIE,
				  	    MAX(FEC_GEST) FECHA
				 FROM COB_GESTI_COBRA 
				 GROUP BY ETDE_OID_ETAPA_DEUDA,
				 	      CLIE_OID_CLIE
				 ) GES2		 
			 WHERE GES2.ETDE_OID_ETAPA_DEUDA = GES.ETDE_OID_ETAPA_DEUDA
			 	   AND GES2.CLIE_OID_CLIE = GES.CLIE_OID_CLIE
				   AND GES2.FECHA = GES.FEC_GEST
		 ) GES_COB,
		 (
			 SELECT PER.FEC_INIC
			 FROM CRA_PERIO PER
			 WHERE PER.OID_PERI = 57 						-- PARAMETRO DE PERIODO DESDE --
		 ) PERI_INI,
		 (
			 SELECT PER.FEC_FINA
			 FROM CRA_PERIO PER
			 WHERE PER.OID_PERI = 57						-- PARAMETRO DE PERIODO HASTA --
		 ) PERI_FIN	 	 	 
	WHERE ASI_COB.CRCO_OID_CRON_COBR = CRO_COB.OID_CRON_COBR
		  AND CRO_COB.PERD_OID_PERI = PERI.OID_PERI
		  AND MCC.OID_MOVI_CC = ASI_COB.MVCC_OID_MOVI_CC
		  -----------------------------------------------------------------------------------------------------
		  --ESTO DEBERIA REMOVERSE EN CASO DE QUE NO VENGAN LOS PERIODOS, JUNTO CON LAS TABLAS VIRTUALES
		  --PERI_INI Y PERI_FIN--
		  AND PERI.FEC_INIC > = PERI_INI.FEC_INIC
		  AND PERI.FEC_FINA <= PERI_FIN.FEC_FINA
		  -----------------------------------------------------------------------------------------------------		  
		  AND MCC.ZTAD_OID_TERR_ADMI = TER_ADM.OID_TERR_ADMI
		  AND TER.OID_TERR = TER_ADM.TERR_OID_TERR
		  AND MCC.ZSCC_OID_SECC = SEC.OID_SECC
		  AND ASI_COB.ESAS_OID_ESTA_ASIG = EST_ASI.OID_ESTA_ASIG
		  AND EST_ASI.COD_ESTA_ASIG = 'A'
		  AND CRO_COB.ETDE_OID_ETAP_DEUD = GESTION.ETDE_OID_ETAPA_DEUDA
		  AND MCC.CLIE_OID_CLIE = GESTION.CLIE_OID_CLIE
		  AND GES_COB.OID_GEST_COBR = GESTION.OID_GEST_COBR
		  AND PERI.MARC_OID_MARC = 1			   			-- PARAMETRO DE MARCA --
		  AND PERI.CANA_OID_CANA = 1						-- PARAMETRO DE CANAL --
		  AND MCC.ZORG_OID_REGI IN (1)							-- PARAMETRO DE REGION --
		  AND SEC.OID_SECC IN (1)							-- PARAMETRO DE SECCION --
	 	  AND TER.COD_TERR >= 1	   								-- PARAMETRO DE TERRRITORIO DESDE --
		  AND TER.COD_TERR <= 50000								-- PARAMETRO DE TERRITORIO HASTA --
		  AND SEC.ZZON_OID_ZONA IN (1)							-- PARAMETRO DE ZONA --
		  AND ASI_COB.PAIS_OID_PAIS = 1							 -- PARAMETRO DE PAIS --	   
	GROUP BY ASI_COB.PAIS_OID_PAIS
) CABECERA,
(
--------------------------------- CALCULOS PARA EL DETALLE -------------------------------------------
	SELECT ASI_COB.PAIS_OID_PAIS,
		   DECODE(MOT_COB.VAL_DESC_MOTI_COBR, NULL, 'SIN_MOTIVO',MOT_COB.VAL_DESC_MOTI_COBR) MOTI_COB,
		   NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0) IMPORTE,
		   NVL(SUM(ASI_COB.IMP_DEUD_ASIG), 0) - NVL(SUM(ASI_COB.IMP_DEUD_CANC), 0) IMP_DEUD_PENDIENTE,
		   COUNT(DISTINCT MCC.CLIE_OID_CLIE) NUM_CLIENTES 
	FROM COB_ASIGN_COBRA ASI_COB,
		 COB_CRONO_COBRA CRO_COB,
		 CRA_PERIO PERI,
		 CCC_MOVIM_CUENT_CORRI MCC,
		 ZON_TERRI_ADMIN TER_ADM,
		 ZON_TERRI TER,
		 ZON_SECCI SEC,
		 COB_GESTI_COBRA GESTION,
		 COB_MOTIV_INCOB MOT_COB,
		 COB_ESTAD_ASIGN EST_ASI,
		 (
			 SELECT GES.OID_GEST_COBR
			 FROM COB_GESTI_COBRA GES,
				 (
				 SELECT ETDE_OID_ETAPA_DEUDA,
				 	    CLIE_OID_CLIE,
				  	    MAX(FEC_GEST) FECHA
				 FROM COB_GESTI_COBRA 
				 GROUP BY ETDE_OID_ETAPA_DEUDA,
				 	      CLIE_OID_CLIE
				 ) GES2		 
			 WHERE GES2.ETDE_OID_ETAPA_DEUDA = GES.ETDE_OID_ETAPA_DEUDA
			 	   AND GES2.CLIE_OID_CLIE = GES.CLIE_OID_CLIE
				   AND GES2.FECHA = GES.FEC_GEST
		 ) GES_COB,
		 (
			 SELECT PER.FEC_INIC
			 FROM CRA_PERIO PER
			 WHERE PER.OID_PERI = 57 						-- PARAMETRO DE PERIODO DESDE --
		 ) PERI_INI,
		 (
			 SELECT PER.FEC_FINA
			 FROM CRA_PERIO PER
			 WHERE PER.OID_PERI = 57						-- PARAMETRO DE PERIODO HASTA --
		 ) PERI_FIN	 	 	 
	WHERE ASI_COB.CRCO_OID_CRON_COBR = CRO_COB.OID_CRON_COBR
		  AND CRO_COB.PERD_OID_PERI = PERI.OID_PERI
		  AND MCC.OID_MOVI_CC = ASI_COB.MVCC_OID_MOVI_CC
		  -----------------------------------------------------------------------------------------------------
		  --ESTO DEBERIA REMOVERSE EN CASO DE QUE NO VENGAN LOS PERIODOS, JUNTO CON LAS TABLAS VIRTUALES
		  --PERI_INI Y PERI_FIN--
		  AND PERI.FEC_INIC > = PERI_INI.FEC_INIC
		  AND PERI.FEC_FINA <= PERI_FIN.FEC_FINA
		  -----------------------------------------------------------------------------------------------------
		  AND MCC.ZTAD_OID_TERR_ADMI = TER_ADM.OID_TERR_ADMI
		  AND TER.OID_TERR = TER_ADM.TERR_OID_TERR
		  AND MCC.ZSCC_OID_SECC = SEC.OID_SECC
		  AND ASI_COB.ESAS_OID_ESTA_ASIG = EST_ASI.OID_ESTA_ASIG
		  AND EST_ASI.COD_ESTA_ASIG = 'A'
		  AND CRO_COB.ETDE_OID_ETAP_DEUD = GESTION.ETDE_OID_ETAPA_DEUDA
		  AND MCC.CLIE_OID_CLIE = GESTION.CLIE_OID_CLIE
		  AND GES_COB.OID_GEST_COBR = GESTION.OID_GEST_COBR
		  AND MOT_COB.OID_MOTI_COBR(+) = GESTION.MONO_OID_MOTI_COBR	  
		  AND PERI.MARC_OID_MARC = 1			   			-- PARAMETRO DE MARCA --
		  AND PERI.CANA_OID_CANA = 1						-- PARAMETRO DE CANAL --
		  AND MCC.ZORG_OID_REGI IN (1)							-- PARAMETRO DE REGION --
		  AND SEC.OID_SECC IN (1)							-- PARAMETRO DE SECCION --
		  AND TER.COD_TERR >= 1	   								-- PARAMETRO DE TERRRITORIO DESDE --
		  AND TER.COD_TERR <= 50000								-- PARAMETRO DE TERRITORIO HASTA --
		  AND SEC.ZZON_OID_ZONA IN (1)							-- PARAMETRO DE ZONA --
		  AND ASI_COB.PAIS_OID_PAIS = 1							 -- PARAMETRO DE PAIS --	   
	GROUP BY ASI_COB.PAIS_OID_PAIS,
		  MOT_COB.VAL_DESC_MOTI_COBR
) DETALLE,
(
	SELECT GEN.VAL_OID, GEN.VAL_I18N
	FROM V_GEN_I18N_SICC GEN
	WHERE GEN.ATTR_ENTI = 'SEG_PAIS'
		  AND GEN.IDIO_OID_IDIO = 1	  							 	-- PARAMETRO DE IDIOMA --
) GEN_PAIS
WHERE DETALLE.PAIS_OID_PAIS = GEN_PAIS.VAL_OID(+)