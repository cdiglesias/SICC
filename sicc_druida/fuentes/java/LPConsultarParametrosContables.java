
/**
 * Copyright 2006 � por Indra Sistemas,S.A.. Todos los derechos reservados.
 * Avda. de Bruselas, 35
 * Parque Empresarial Arroyo de la Vega
 * 28108 Alcobendas, Madrid
 * Espa�a
 *
 * Privado y Confidencial.
 * La informaci�n contenida en este documento es propiedad de Indra sistemas.
 * Para uso exclusivo de empleados autorizados no permiti�ndose
 * la distribuci�n de este c�digo sin permiso expreso.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 
 
public class LPConsultarParametrosContables extends LPSICCBase {

          public LPConsultarParametrosContables() {
                    super();
          }
          
          public void inicio() throws Exception {
          
          }

          public void ejecucion() throws Exception {
          
			 /*Llamar a la LPMantenimientoParametrosContables con: 
			 accion ="" 
			 opcionMenu= "ConsultarParametrosContables" */

			 rastreo();
          setTrazaFichero();
          traza("*** Entrada - LPConsultarParametrosContables - ejecucion ***");
                    try  {
                              conectorAction("LPMantenimientoParametrosContables");
                              conectorActionParametro("accion", "");  
										conectorActionParametro("opcionMenu", "ConsultarParametrosContables");  
                    }
                    catch ( Exception e )  {
                              logStackTrace(e);
                              lanzarPaginaError(e);
                    }
           traza("*** Salida - LPConsultarParametrosContables - ejecucion ***");
          }

    private void logStackTrace(Throwable e) throws Exception {
                    traza("Se produjo la excepcion: " + e.getMessage());
                    
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    PrintStream ps = new PrintStream(baos);
                    e.printStackTrace(ps);
                    
                    traza("Stack Trace: " + baos.toString());
     }

}
