/**
 * Copyright 2007 � por Indra Sistemas,S.A.. Todos los derechos reservados.
 * Avda. de Bruselas, 35
 * Parque Empresarial Arroyo de la Vega
 * 28108 Alcobendas, Madrid
 * Espa�a
 *
 * Privado y Confidencial.
 * La informaci�n contenida en este documento es propiedad de Indra sistemas.
 * Para uso exclusivo de empleados autorizados no permiti�ndose
 * la distribuci�n de este c�digo sin permiso expreso.
 *
 */


package es.indra.sicc.logicanegocio.ape;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import es.indra.sicc.dtos.ape.DTOBusquedaEtiqueta;
import es.indra.sicc.util.DTOSalida;
import es.indra.mare.common.exception.MareException;
import es.indra.sicc.dtos.ape.DTOImpresionEtiquetas;
import es.indra.sicc.dtos.ape.DTOImpresionEtiquetasManual;

public interface MONImpresionEtiquetasManual extends EJBObject 
{
  DTOSalida buscarEtiquetasImprimir(DTOBusquedaEtiqueta dtoe) throws RemoteException, MareException;

  void imprimirEtiquetasSeleccionadas(DTOImpresionEtiquetas dtoe) throws MareException, RemoteException;

  void imprimirEtiquetasConsolidadoCaja(DTOImpresionEtiquetasManual dtoe) throws RemoteException, MareException;
}