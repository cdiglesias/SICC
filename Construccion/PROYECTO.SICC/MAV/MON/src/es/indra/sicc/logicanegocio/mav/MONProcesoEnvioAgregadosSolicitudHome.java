package es.indra.sicc.logicanegocio.mav;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;


public interface MONProcesoEnvioAgregadosSolicitudHome extends EJBHome {
    MONProcesoEnvioAgregadosSolicitud create() throws RemoteException, CreateException;
}