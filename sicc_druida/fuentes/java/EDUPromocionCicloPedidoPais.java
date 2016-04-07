import es.indra.druida.DruidaConector;
import es.indra.mare.common.mii.services.jdbcservice.RecordSet;
import es.indra.mare.common.mln.MareBusinessID;
import es.indra.sicc.cmn.cargaInicial.ComposerViewElement;
import es.indra.sicc.cmn.cargaInicial.ComposerViewElementList;
import es.indra.sicc.cmn.cargaInicial.presentacion.ConectorComposerView;
import es.indra.sicc.rep.logicanegocio.ConstantesREP;
import es.indra.sicc.util.DTOBelcorp;
import es.indra.sicc.util.DTOOID;
import es.indra.sicc.util.DTOSalida;
import es.indra.sicc.util.UtilidadesSession;
import es.indra.sicc.util.xml.XMLDocument;
import es.indra.sicc.dtos.mae.DTOTipoSubtipo;
import es.indra.sicc.util.DTOOIDs;
import es.indra.sicc.util.DTOBoolean;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.HashMap;
import java.util.Vector;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class EDUPromocionCicloPedidoPais extends LPSICCBase {           
   public EDUPromocionCicloPedidoPais() {	 
     super();
  }

  public void inicio() throws Exception { 
     
  }

  public void ejecucion() throws Exception {		
     String accion = conectorParametroLimpia("accion","", true);
     setTrazaFichero();
     try {
        this.rastreo();
        
        if (accion.equals("generar")){
           generarReporte(); 
           traza("termino de generar el reporte");
          //cargarPagina();
        }else if(accion.equals("validarPeriodos")){
                 pagina("salidaGenerica");
                 validarPeriodos();	
              }else{
                 cargarPagina();
                 getConfiguracionMenu("EDUPromocionCicloPedidoPais");
              }

     
     } catch (Exception ex) {
     			
        cargarPagina();
        getConfiguracionMenu("EDUPromocionCicloPedidoPais");
               
        ByteArrayOutputStream stack = new ByteArrayOutputStream();
		    PrintStream out = new PrintStream(stack);
			  ex.printStackTrace(out);
	      traza("EXCEPCION:" + stack.toString());
		    lanzarPaginaError(ex);
      /*  try{
            cargarPagina();
        }catch(Exception e){
            e.printStackTrace();
        }*/

     }

    
  }
  
  private void cargarPagina() throws Exception{
     pagina("contenido_informe_promocion_ciclo_generar");   
    
     DTOBelcorp dto = new DTOBelcorp();
     dto.setOidPais(UtilidadesSession.getPais(this));
     dto.setOidIdioma(UtilidadesSession.getIdioma(this));
     Vector vec = new Vector();
     MareBusinessID idPais = new MareBusinessID("REPRecuperarPaises");
     dto.setOidIdioma(UtilidadesSession.getIdioma(this));
     vec.add(dto);
     vec.add(idPais);
     DTOSalida dtoSalPais = (DTOSalida)conectar("ConectorPaises",vec).objeto("dtoSalida"); 
     RecordSet pais = (RecordSet)dtoSalPais.getResultado();
     Vector colPAIS = pais.getColumnIdentifiers();
     DruidaConector paises = generarConector("DTOSalida.paises_ROWSET",pais, colPAIS);
     asignar("COMBO", "cbPais", paises, "DTOSalida.paises_ROWSET");  
     
     ComposerViewElementList cv = crearParametrosEntrada();
     ConectorComposerView conector = new ConectorComposerView(cv, this.getRequest());
     conector.ejecucion();
     DruidaConector resultados = conector.getConector();
     traza(" 4 " + resultados.getXML());
          
     asignar("COMBO","cbMarca",resultados,"SEGConsultaMarcas");             
     asignar("COMBO","cbCanal",resultados,"SEGConsultaCanales");
     
     this.generarHiddenFormatoFecha();
     
     asignarAtributo("VAR", "idioma", "valor", UtilidadesSession.getIdioma(this).toString());
     asignarAtributo("VAR", "pais", "valor", UtilidadesSession.getPais(this).toString());
         
   
  }

  private void validarPeriodos() throws Exception{
     traza("****entro");
          

     String pais = conectorParametroLimpia("hidPaisSelec", "", true);
	 String marca = conectorParametroLimpia("hidMarca", "", true);
     String canal = conectorParametroLimpia("hidCanal", "", true);
     String periodoDesde = conectorParametroLimpia("hidPeriodoDesde", "", true);
     String periodoHasta = conectorParametroLimpia("hidPeriodoHasta", "", true);
     String codigoCurso = conectorParametroLimpia("hidCodigoCurso", "", true);
   
     DTOOIDs dto = new DTOOIDs();
     Long[] oids = new Long[2];
     oids[0] = new Long(periodoDesde);
     oids[1] = new Long(periodoHasta);

     dto.setOids(oids);

     String params = pais + "|" + marca + "|" + canal + "|" + periodoDesde + "|" + periodoHasta + "|" + codigoCurso;



     MareBusinessID id = new MareBusinessID("REPValidaPeriodos");
     Vector vec = new Vector();
     
     vec.add(dto);
     vec.add(id); 

     DTOBoolean dtoB = (DTOBoolean)conectar("ConectorPrimerPeriodo",vec).objeto("dtoSalida");
    
          if(dtoB.getValor()){
         asignarAtributo("VAR", "ejecutar", "valor", "cadenaParam('" + params + "')");    
          }else{
             asignarAtributo("VAR", "ejecutar", "valor", "alertaErrorPeriodos()");    	 
     }
 
  }

          
  
 private void generarReporte() throws Exception{
     
  
     HashMap datos = new HashMap();
     datos.put("MODULO", "EDU");
     
     //comienzo de los parametrso de filtrado
       
     String pais        = conectorParametroLimpia("paisSelec", "", true);
     datos.put(ConstantesREP.PAIS, pais);     
          
     String marca        = conectorParametroLimpia("marca", "", true);
     datos.put(ConstantesREP.MARCA, marca);     
               
     String canal        = conectorParametroLimpia("canal", "", true);
     datos.put(ConstantesREP.CANAL, canal); 
     
     String periodoDesde        = conectorParametroLimpia("periodoDesde", "", true);
     traza("el periodo desde " + periodoDesde);
     datos.put(ConstantesREP.PERIODODESDE, periodoDesde); 
     
     String periodoHasta        = conectorParametroLimpia("periodoHasta", "", true);
     traza("el periodo desde " + periodoHasta);
     datos.put(ConstantesREP.PERIODOHASTA, periodoHasta); 
         
     String codigoCurso        = conectorParametroLimpia("codigoCurso", "", true);
   
     if(!codigoCurso.equals("")){
        datos.put(ConstantesREP.CODIGOCURSO, codigoCurso); 
     }
            
       
     datos.put(ConstantesREP.TITULO, "Promocion Ciclo Pedidos - Pais");     
     traza("++++++Antes de enviar a reportes " + datos); 
     //ejecutarReporte(datos, "REPGenerarReporte", "RD_REP-012", null);
     ejecutarReporte2(datos, "REPGenerarReporteBatch", "RD_REP-012", "pdf");
          
  } 
  
   private DruidaConector generarConector(String rowsetID, RecordSet datos,
          Vector columns) throws DOMException, Exception {
          StringBuffer salida = new StringBuffer();

          int sizeColums = datos.getColumnCount();
          int sizeRows = datos.getRowCount();

          if (columns == null) {
              columns = new Vector();
          }

          Vector columsDesc = datos.getColumnIdentifiers();

          DruidaConector conectorValoresPosibles = new DruidaConector();
          XMLDocument xmlDoc = new XMLDocument();
          Document docDestino = xmlDoc.makeDocument("<ROWSET2/>");
          Element e_rows = docDestino.createElement("ROWSET");
          e_rows.setAttribute("ID", rowsetID);
          docDestino.getDocumentElement().appendChild(e_rows);

          for (int i = 0; i < sizeRows; i++) {
              Element e_row = docDestino.createElement("ROW");
              e_rows.appendChild(e_row);

              for (int j = 0; j < sizeColums; j++) {
                    if (columns.contains(columsDesc.elementAt(j))) {
                         Element e_campo2 = docDestino.createElement("CAMPO");
                         e_campo2.setAttribute("NOMBRE",
                              columsDesc.elementAt(j).toString());
                         e_campo2.setAttribute("TIPO", "OBJECTO");
                         e_campo2.setAttribute("LONGITUD", "50");

                         Text txt = docDestino.createTextNode(((datos.getValueAt(i, j) == null)
                                    ? "" : datos.getValueAt(i, j).toString()));
                         e_campo2.appendChild(txt);
                         e_row.appendChild(e_campo2);
                    }
              }
          }

          conectorValoresPosibles.setXML(docDestino.getDocumentElement());

          return conectorValoresPosibles;
    }
    
    private ComposerViewElementList crearParametrosEntrada() throws Exception{
     traza("metodo crearParametrosEntrada() ");
     DTOBelcorp dtoBel = new DTOBelcorp();
     
     dtoBel.setOidPais(UtilidadesSession.getPais(this));
     dtoBel.setOidIdioma(UtilidadesSession.getIdioma(this));
       
     ComposerViewElementList lista = new ComposerViewElementList();
     
     //Carga de combo marca
     ComposerViewElement cbMarca = new ComposerViewElement();
     cbMarca.setIDBusiness("SEGConsultaMarcas");
     cbMarca.setDTOE(dtoBel);
     
     //Carga de combo canales
     ComposerViewElement cbCanales = new ComposerViewElement();
     cbCanales.setIDBusiness("SEGConsultaCanales");
     cbCanales.setDTOE(dtoBel);
                          
     lista.addViewElement(cbMarca);
     lista.addViewElement(cbCanales);   
        
     
     return lista;
  }
  
  
    
  
 
 


}







