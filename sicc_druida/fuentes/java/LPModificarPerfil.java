//import LPSICCBase;

import java.io.*;

//Esta LP actua de punto de entrada en el menu, pasamos el control
//a la LPPerfiles con la accion "buscar" e indicando que casoUso es "modificar".

public class LPModificarPerfil extends LPSICCBase {  
    
    public LPModificarPerfil() { super(); }

    public void inicio() throws Exception { }

    public void ejecucion() throws Exception {
      setTrazaFichero();
	  rastreo();
      traza(" * * * Entre a LPModificarPerfil * * *");
      String accion  = conectorParametro("accion");
      
      if(accion==null) accion = "";
      traza(" * * * accion = " + accion);      
      
      try {
        if (accion.equals("")) {        
          traza(" * * * Llamando a LPPerfiles * * *");
          conectorAction("LPPerfiles");
          conectorActionParametro("casoUso", "modificar");
          conectorActionParametro("accion","buscar");                
        }
      }
      catch (Exception ex) {
        ByteArrayOutputStream stack = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(stack);
        ex.printStackTrace(out);
        traza("* * * EXCEPCION:" + stack.toString());
        
        this.lanzarPaginaError(ex);
      }   
    }  
  }
