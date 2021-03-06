/*SI NO VIENE EL PARAMETRO DE USUARIO HABRIA QUE PASAR ALGUN VALOR (EJ. -1) PARA QUE PUEDA COMPARAR EL DECODE.
EN ESTE CASO ESTA HARDCODEADO UN 8, EN TAL COSO HABRIA QUE PONER -1.*/

	
		
SELECT DESC_ETAPA,
	   PERIODO,
	   GRUPO,
           NOMBRE,	   
	   MIN(FECHA_ENTREGA) FECHA_ENTREGA,
	   SUM(CARTERA_NETA) + SUM(RETIROS) CARTERA_ENTREGADA,
	   SUM(RETIROS) RETIROS,
	   SUM(CARTERA_NETA) CARTERA_NETA,
	   SUM(COBRADO) COBRADO,
	   DECODE(SUM(CARTERA_NETA),0, 0, (SUM(COBRADO) / SUM(CARTERA_NETA))*100) PORC_COBRANZA,
	   DECODE(SUM(COBRADO),0, 0, (SUM(COMISION) / SUM(COBRADO))*100) PORC_COMISION,
	   SUM(COMISION) COMISION,
	   FEC_LIQUI	   
FROM		  		
	(	
	SELECT HTO_COB.OID_HIST_COMI_COBR ID_LIQUI,
		   ETA.VAL_DESC DESC_ETAPA,
		   PERI.VAL_NOMB_PERI PERIODO,
		   USU.COD_USUA,
		   USU.VAL_NOMB_USUA NOMBRE,
		   GRU_COB.VAL_DESC GRUPO,
		   ASI_COB.FEC_ASIG FECHA_ENTREGA,
		   NVL(ASI_COB.IMP_DEUD_ASIG, 0) CARTERA_NETA,
		   CASE WHEN (ASI_COB.ESAS_OID_ESTA_ASIG = 4) THEN
		   		NVL(ASI_COB.IMP_DEUD_ASIG, 0)
			ELSE
				0
			END RETIROS,
			NVL(HTO_COB.IMP_DEUD_RECU, 0) COBRADO,
			NVL(HTO_COB.IMP_COMI_CALC, 0) COMISION,
			HTO_COB.FEC_CALC_COMI FEC_LIQUI
	FROM COB_HISTO_COMIS_COBRA HTO_COB,
		 COB_USUAR_COBRA USU_COB,
		 COB_USUAR_GRUPO_USUAR GRU_USU,
		 COB_GRUPO_USUAR_COBRA GRU_COB,
		 COB_ETAPA_DEUDA ETA,
		 V_REP_USUAR_LARGO USU,
		 CRA_PERIO PERI,
		 (
			 SELECT COBA.*
			 FROM
			 COB_ASIGN_COBRA COBA,
			 (		
				 SELECT DISTINCT HICC_OID_HIST_COMI_COBR
				 FROM COB_ASIGN_COBRA 
				 WHERE TO_DATE(FEC_ASIG) = TO_DATE('14/03/2005', 'DD/MM/YYYY') -- PARAMETRO DE FECHA DE ASIGNACION --		
			 ) COB
			 WHERE COB.HICC_OID_HIST_COMI_COBR = COBA.HICC_OID_HIST_COMI_COBR
		 ) ASI_COB
	WHERE HTO_COB.USCO_OID_USUA_COBR = USU_COB.OID_USUA_COBR
		  AND HTO_COB.PERD_OID_PERI = PERI.OID_PERI
		  AND GRU_USU.USCO_OID_USUA_COBR = USU_COB.OID_USUA_COBR
		  AND GRU_COB.OID_GRUP_USUA_COBR = GRU_USU.GUCO_OID_GRUP_USUA_COBR
		  AND HTO_COB.ETDE_OID_ETAP_DEUD = ETA.OID_ETAP_DEUD
		  AND USU_COB.USER_OID_USUA_COBR = USU.COD_USUA
		  AND ASI_COB.HICC_OID_HIST_COMI_COBR = HTO_COB.OID_HIST_COMI_COBR
		  AND ETA.OID_ETAP_DEUD = 1		   							-- PARAMETRO DE ETAPA DE DEUDA --
		  AND USU_COB.OID_USUA_COBR = 8							-- PARAMETRO DE USUARIO DE COBRANZA -- 
		  AND GRU_COB.OID_GRUP_USUA_COBR = 1						-- PARAMETRO DE GRUPO DE USUARIO DE COBRANZA --
		  AND PERI.MARC_OID_MARC = 1	   							-- PARAMETRO DE MARCA --	   							 
		  AND PERI.CANA_OID_CANA = 1								-- PARAMETRO DE CANAL --
	      AND PERI.OID_PERI = 57	   									-- PARAMETRO DE PERIODO --
	)
GROUP BY ID_LIQUI,
	  DESC_ETAPA,
	  PERIODO,
	  GRUPO,
	  NOMBRE,
	  FEC_LIQUI


