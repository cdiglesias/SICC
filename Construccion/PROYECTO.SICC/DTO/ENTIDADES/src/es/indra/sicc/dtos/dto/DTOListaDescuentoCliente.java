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

package es.indra.sicc.dtos.dto;

import es.indra.sicc.cmn.negocio.auditoria.DTOAuditableSICC;
import es.indra.sicc.dtos.dto.DTODescuentoCliente;


public class DTOListaDescuentoCliente extends DTOAuditableSICC {
    
    private Long oidDescuento;
    private DTODescuentoCliente[] alcanceCliente;
    
    public DTOListaDescuentoCliente()
    {
    }
    
    
   public Long getOidDescuento()
   {
      return this.oidDescuento;
   }

   public void setOidDescuento(Long oidDescuento)
   {
      this.oidDescuento = oidDescuento;
   }      
   
   
   public DTODescuentoCliente[] getAlcanceCliente() {
       return alcanceCliente;
   }

   public void setAlcanceCliente(DTODescuentoCliente[] alcanceCliente) {
       this.alcanceCliente = alcanceCliente;
   }   
    
}