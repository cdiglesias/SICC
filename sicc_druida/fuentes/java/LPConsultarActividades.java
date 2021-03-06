/**
 * Copyright 2003 � por Indra Sistemas,S.A.. Todos los derechos reservados.
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
 /*
    INDRA/CAR/PROY
    $Id: LPConsultarActividades.java,v 1.1 2009/12/03 18:40:23 pecbazalar Exp $
    DESC
 */
import LPSICCBase;


// Definicion de la clase
public class LPConsultarActividades extends LPSICCBase {
  
  
  // Definicion del constructor
  public LPConsultarActividades() { super(); }

  // Definicion del metodo abstracto inicio
  public void inicio() throws Exception {
    
  }
    
  // Definicion del metodo abstracto ejecucion

public void ejecucion() throws Exception {
   setTrazaFichero();
    try  {
      rastreo();
      traza("Caso de Uso = Consulta");
      conectorAction("LPMantieneActividades");
      conectorActionParametro("accion","muestraConsulta");
    }
    catch ( Exception e )  {
      e.printStackTrace();
      lanzarPaginaError(e);
    }

  }
}
