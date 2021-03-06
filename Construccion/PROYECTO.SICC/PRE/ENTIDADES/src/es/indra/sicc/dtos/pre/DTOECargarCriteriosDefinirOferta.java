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
package es.indra.sicc.dtos.pre;
import es.indra.sicc.cmn.negocio.auditoria.DTOAuditableSICC;

public class DTOECargarCriteriosDefinirOferta extends DTOAuditableSICC 
{
  private Long oidCabeceraMF;
  private Long oidEstrategia;

  public DTOECargarCriteriosDefinirOferta()
  {
  }

  public Long getOidCabeceraMF()
  {
    return oidCabeceraMF;
  }

  public void setOidCabeceraMF(Long newOidCabeceraMF)
  {
    oidCabeceraMF = newOidCabeceraMF;
  }

  public Long getOidEstrategia()
  {
    return oidEstrategia;
  }

  public void setOidEstrategia(Long newOidEstrategia)
  {
    oidEstrategia = newOidEstrategia;
  }
}