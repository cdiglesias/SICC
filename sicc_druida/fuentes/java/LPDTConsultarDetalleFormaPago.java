/**
 * Copyright 2004 � por Indra Sistemas,S.A.. Todos los derechos reservados.
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
    INDRA/BEL/PROY
    $Id: LPDTConsultarDetalleFormaPago.java,v 1.1 2009/12/03 18:37:50 pecbazalar Exp $
    DESC
*/
import java.util.Vector;

import es.indra.mare.common.mln.MareBusinessID;
import es.indra.druida.DruidaConector;

import es.indra.sicc.util.DTOOID;

import es.indra.sicc.util.UtilidadesSession;
//import es.indra.sicc.util.CodigosModulos;
import es.indra.sicc.util.UtilidadesError;
import es.indra.sicc.util.BelcorpError;
import es.indra.sicc.util.DTOError;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LPDTConsultarDetalleFormaPago extends DruidaTransactionComun {
    
  	// Definicion del constructor
 	public LPDTConsultarDetalleFormaPago(){
   		super();
 	}

 	 // Definicion del metodo ejecucion
  	public void ejecucion() throws Exception {

  		DruidaConector conectorTerminal = null;		
    	try{
    		traza("***Entrada - LPDTConsultarDetalleFormaPago - ejecucion");

 			//Creamos un DTOOID con el parametro oid (adem�s metemos el idioma y el pais). 
			//Llamamos al conector "ConectorConsultarDetalleFormaPago" pas�ndole el dto y el idBusiness: "BELConsultarDetalleFormaPago"
			
			String oid = (String)getEntrada("oid");
			
			DTOOID dtoEntrada = new DTOOID();
			//Obtenemos el pais y el idioma de la sesion
        	Long pais = UtilidadesSession.getPais(this); 
        	Long idioma = UtilidadesSession.getIdioma(this);
			if (oid != null && !oid.equals(""))
				dtoEntrada.setOid(new Long(oid));
			dtoEntrada.setOidPais(pais);
       		dtoEntrada.setOidIdioma(idioma);
		            
        	//- Se crea idNegocio "CCCBloqueoFinanciero" 
        	MareBusinessID idBussiness = new MareBusinessID("BELConsultarDetalleFormaPago");
          
        	//Almacenamos los parametros de entrada
        	Vector paramEntrada = new Vector();
        	paramEntrada.addElement(dtoEntrada);
        	paramEntrada.addElement(idBussiness);
         
        	traza("Antes de conectar");
          
        	//- Se invoca al ConectorConsulta 
        	conectorTerminal = conectar("ConectorConsultarDetalleFormaPago", paramEntrada);
          
          	traza("despues de conectar");
 			
		}catch(Exception th){
			BelcorpError belcorpError = new BelcorpError();
            DTOError dtoError = belcorpError.obtenerError(th,  UtilidadesSession.getIdioma_ISO( this ) ,  "");			
            traza (  dtoError.getCodigoError() + " - " + dtoError.getDescripcionError() );
            conectorTerminal=this.crearConectorResultado(dtoError.getDescripcionError());
      	}
      	traza("***Salida - LPDTConsultarDetalleFormaPago - ejecucion");
      	this.setConector(conectorTerminal);
   	}
   	protected void logStackTrace(Throwable e) throws Exception {
        traza("Se produjo la excepcion: " + e.getMessage());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        e.printStackTrace(ps);
                    
        traza("Stack Trace: " + baos.toString());
    }
}
