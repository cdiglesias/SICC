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
 *
 * Autor : Dante Castiglione
 */
package es.indra.sicc.logicanegocio.inc;
import java.io.Serializable;

public class EstatusFuturoClientes implements Serializable {
    private Long oidEstatusCliente;
    private Long oidEstatusFuturo;

    public EstatusFuturoClientes() {
    }

    public Long getOidEstatusCliente() {
        return oidEstatusCliente;
    }

    public void setOidEstatusCliente(Long oidEstatusCliente) {
        this.oidEstatusCliente = oidEstatusCliente;
    }

    public Long getOidEstatusFuturo() {
        return oidEstatusFuturo;
    }

    public void setOidEstatusFuturo(Long oidEstatusFuturo) {
        this.oidEstatusFuturo = oidEstatusFuturo;
    }
}
