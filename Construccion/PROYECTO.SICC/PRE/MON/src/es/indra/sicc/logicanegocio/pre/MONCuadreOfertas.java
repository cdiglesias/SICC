/**
 * Copyright 2005 � por Indra Sistemas,S.A.. Todos los derechos reservados.
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
package es.indra.sicc.logicanegocio.pre;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import es.indra.sicc.dtos.ped.DTOCabeceraSolicitud;
import es.indra.mare.common.exception.MareException;
import es.indra.sicc.dtos.ped.DTOSolicitudValidacion;

public interface MONCuadreOfertas extends EJBObject  {
  DTOCabeceraSolicitud cuadrarOfertas(DTOCabeceraSolicitud dtoe, Long tipoPosicion, Long subtipoPosicion) throws RemoteException, MareException;

  void revertirCuadre(DTOSolicitudValidacion dtoe) throws RemoteException, MareException;
}