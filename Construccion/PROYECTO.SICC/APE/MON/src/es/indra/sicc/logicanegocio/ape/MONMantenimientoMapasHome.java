package es.indra.sicc.logicanegocio.ape;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;
import javax.ejb.CreateException;

public interface MONMantenimientoMapasHome extends EJBHome  {
  MONMantenimientoMapas create() throws RemoteException, CreateException;
}