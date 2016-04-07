
import org.w3c.dom.*;
import java.util.ArrayList;

public class CarIndicNivelJerarPage  implements es.indra.druida.base.ObjetoXML {
   private ArrayList v = new ArrayList();

   public Element getXML (Document doc){
      

      getXML0(doc);
         

      getXML90(doc);
         

      getXML180(doc);
         

      getXML270(doc);
         

      getXML360(doc);
         

      getXML450(doc);
         

      getXML540(doc);
         

      getXML630(doc);
         

      getXML720(doc);
         

      getXML810(doc);
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","CarIndicNivelJerarPage" );
      ((Element)v.get(0)).setAttribute("titulo","" );
      ((Element)v.get(0)).setAttribute("estilos","estilosB3.css" );
      ((Element)v.get(0)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(0)).setAttribute("msgle","" );
      ((Element)v.get(0)).setAttribute("onload","carIndicNivelJerarInitComponents()" );
      ((Element)v.get(0)).setAttribute("xml:lang","es" );
      ((Element)v.get(0)).setAttribute("cod","" );
      ((Element)v.get(0)).setAttribute("repeat","N" );

      /* Empieza nodo:1 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(1)).setAttribute("src","sicc_util.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(1));
      /* Termina nodo:1   */

      /* Empieza nodo:2 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(2)).setAttribute("src","mmg.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(2));
      /* Termina nodo:2   */

      /* Empieza nodo:3 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(3)).setAttribute("src","carindicniveljerar.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(3));
      /* Termina nodo:3   */

      /* Empieza nodo:4 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(4)).setAttribute("nombre","carIndicNivelJerarFrm" );
      ((Element)v.get(4)).setAttribute("oculto","N" );
      ((Element)v.get(0)).appendChild((Element)v.get(4));

      /* Empieza nodo:5 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(5)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(5)).setAttribute("valor","CarIndicNivelJerarLPExecution" );
      ((Element)v.get(4)).appendChild((Element)v.get(5));
      /* Termina nodo:5   */

      /* Empieza nodo:6 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(6)).setAttribute("nombre","ON" );
      ((Element)v.get(6)).setAttribute("valor","CarIndicNivelJerarLPExecution" );
      ((Element)v.get(4)).appendChild((Element)v.get(6));
      /* Termina nodo:6   */

      /* Empieza nodo:7 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(7)).setAttribute("nombre","accion" );
      ((Element)v.get(7)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */

      /* Empieza nodo:8 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(8)).setAttribute("nombre","origen" );
      ((Element)v.get(8)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(8));
      /* Termina nodo:8   */

      /* Empieza nodo:9 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(9)).setAttribute("nombre","idSelection" );
      ((Element)v.get(9)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(10)).setAttribute("nombre","idAttributeLovOpener" );
      ((Element)v.get(10)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */

      /* Empieza nodo:11 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(11)).setAttribute("nombre","idEntityLovOpener" );
      ((Element)v.get(11)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(11));
      /* Termina nodo:11   */

      /* Empieza nodo:12 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(12)).setAttribute("nombre","timestamp" );
      ((Element)v.get(12)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(12));
      /* Termina nodo:12   */

      /* Empieza nodo:13 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(13)).setAttribute("nombre","windowTitleCode" );
      ((Element)v.get(13)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(13));
      /* Termina nodo:13   */

      /* Empieza nodo:14 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(14)).setAttribute("nombre","userLanguageCode" );
      ((Element)v.get(14)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(14));
      /* Termina nodo:14   */

      /* Empieza nodo:15 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(15)).setAttribute("nombre","defaultLanguageCode" );
      ((Element)v.get(15)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(15));
      /* Termina nodo:15   */

      /* Empieza nodo:16 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(16)).setAttribute("nombre","pageLaguage" );
      ((Element)v.get(16)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(16));
      /* Termina nodo:16   */

      /* Empieza nodo:17 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(17)).setAttribute("nombre","lastQueryToSession" );
      ((Element)v.get(17)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */

      /* Empieza nodo:18 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(18)).setAttribute("nombre","previousAction" );
      ((Element)v.get(18)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(18));
      /* Termina nodo:18   */

      /* Empieza nodo:19 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(19)).setAttribute("nombre","performRequery" );
      ((Element)v.get(19)).setAttribute("valor","false" );
      ((Element)v.get(4)).appendChild((Element)v.get(19));
      /* Termina nodo:19   */

      /* Empieza nodo:20 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(20)).setAttribute("nombre","applyStructuralEntity" );
      ((Element)v.get(20)).setAttribute("valor","true" );
      ((Element)v.get(4)).appendChild((Element)v.get(20));
      /* Termina nodo:20   */

      /* Empieza nodo:21 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(21)).setAttribute("nombre","errCodigo" );
      ((Element)v.get(21)).setAttribute("valor","" );
   }

   private void getXML90(Document doc) {
      ((Element)v.get(4)).appendChild((Element)v.get(21));
      /* Termina nodo:21   */

      /* Empieza nodo:22 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(22)).setAttribute("nombre","errDescripcion" );
      ((Element)v.get(22)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(22));
      /* Termina nodo:22   */

      /* Empieza nodo:23 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(23)).setAttribute("nombre","errSeverity" );
      ((Element)v.get(23)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(23));
      /* Termina nodo:23   */

      /* Empieza nodo:24 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(24)).setAttribute("nombre","structuralDefaultPais" );
      ((Element)v.get(24)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(24));
      /* Termina nodo:24   */

      /* Empieza nodo:25 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(25)).setAttribute("nombre","structuralDefaultSociedad" );
      ((Element)v.get(25)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(25));
      /* Termina nodo:25   */

      /* Empieza nodo:26 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(26)).setAttribute("nombre","structuralDefaultMarca" );
      ((Element)v.get(26)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(26));
      /* Termina nodo:26   */

      /* Empieza nodo:27 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(27)).setAttribute("nombre","structuralDefaultCanal" );
      ((Element)v.get(27)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(27));
      /* Termina nodo:27   */

      /* Empieza nodo:28 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(28)).setAttribute("nombre","structuralDefaultAcceso" );
      ((Element)v.get(28)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(28));
      /* Termina nodo:28   */

      /* Empieza nodo:29 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(29)).setAttribute("nombre","structuralDefaultSubacceso" );
      ((Element)v.get(29)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(29));
      /* Termina nodo:29   */

      /* Empieza nodo:30 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(30)).setAttribute("nombre","structuralDefaultSubgerenciaVentas" );
      ((Element)v.get(30)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(30));
      /* Termina nodo:30   */

      /* Empieza nodo:31 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(31)).setAttribute("nombre","structuralDefaultRegion" );
      ((Element)v.get(31)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(31));
      /* Termina nodo:31   */

      /* Empieza nodo:32 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(32)).setAttribute("nombre","structuralDefaultZona" );
      ((Element)v.get(32)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(32));
      /* Termina nodo:32   */

      /* Empieza nodo:33 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(33)).setAttribute("nombre","structuralDefaultSeccion" );
      ((Element)v.get(33)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(33));
      /* Termina nodo:33   */

      /* Empieza nodo:34 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(34)).setAttribute("nombre","structuralDefaultTerritorio" );
      ((Element)v.get(34)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(34));
      /* Termina nodo:34   */

      /* Empieza nodo:35 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(35)).setAttribute("nombre","clientCodeSize" );
      ((Element)v.get(35)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(35));
      /* Termina nodo:35   */

      /* Empieza nodo:36 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(36)).setAttribute("nombre","codIndiNiveJeraCheckValue" );
      ((Element)v.get(36)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(36));
      /* Termina nodo:36   */

      /* Empieza nodo:37 / Elemento padre: 4   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(37)).setAttribute("nombre","carIndicNivelJerarFormLayer" );
      ((Element)v.get(37)).setAttribute("alto","" );
      ((Element)v.get(37)).setAttribute("ancho","100%" );
      ((Element)v.get(37)).setAttribute("colorf","" );
      ((Element)v.get(37)).setAttribute("borde","0" );
      ((Element)v.get(37)).setAttribute("imagenf","" );
      ((Element)v.get(37)).setAttribute("repeat","" );
      ((Element)v.get(37)).setAttribute("padding","" );
      ((Element)v.get(37)).setAttribute("visibilidad","visible" );
      ((Element)v.get(37)).setAttribute("contravsb","" );
      ((Element)v.get(37)).setAttribute("x","0" );
      ((Element)v.get(37)).setAttribute("y","0" );
      ((Element)v.get(37)).setAttribute("zindex","" );
      ((Element)v.get(4)).appendChild((Element)v.get(37));

      /* Empieza nodo:38 / Elemento padre: 37   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(38)).setAttribute("width","100%" );
      ((Element)v.get(38)).setAttribute("border","0" );
      ((Element)v.get(38)).setAttribute("cellspacing","0" );
      ((Element)v.get(38)).setAttribute("cellpadding","0" );
      ((Element)v.get(38)).setAttribute("align","left" );
      ((Element)v.get(37)).appendChild((Element)v.get(38));

      /* Empieza nodo:39 / Elemento padre: 38   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(38)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(40)).setAttribute("align","center" );
      ((Element)v.get(40)).setAttribute("width","12" );
      ((Element)v.get(39)).appendChild((Element)v.get(40));

      /* Empieza nodo:41 / Elemento padre: 40   */
      v.add(doc.createElement("IMG"));
   }

   private void getXML180(Document doc) {
      ((Element)v.get(41)).setAttribute("src","b.gif" );
      ((Element)v.get(41)).setAttribute("width","12" );
      ((Element)v.get(41)).setAttribute("height","12" );
      ((Element)v.get(40)).appendChild((Element)v.get(41));
      /* Termina nodo:41   */
      /* Termina nodo:40   */

      /* Empieza nodo:42 / Elemento padre: 39   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(42)).setAttribute("align","center" );
      ((Element)v.get(42)).setAttribute("width","750" );
      ((Element)v.get(39)).appendChild((Element)v.get(42));

      /* Empieza nodo:43 / Elemento padre: 42   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(43)).setAttribute("src","b.gif" );
      ((Element)v.get(43)).setAttribute("width","12" );
      ((Element)v.get(43)).setAttribute("height","12" );
      ((Element)v.get(42)).appendChild((Element)v.get(43));
      /* Termina nodo:43   */
      /* Termina nodo:42   */

      /* Empieza nodo:44 / Elemento padre: 39   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(44)).setAttribute("align","center" );
      ((Element)v.get(44)).setAttribute("width","12" );
      ((Element)v.get(39)).appendChild((Element)v.get(44));

      /* Empieza nodo:45 / Elemento padre: 44   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(45)).setAttribute("src","b.gif" );
      ((Element)v.get(45)).setAttribute("width","12" );
      ((Element)v.get(45)).setAttribute("height","12" );
      ((Element)v.get(44)).appendChild((Element)v.get(45));
      /* Termina nodo:45   */
      /* Termina nodo:44   */
      /* Termina nodo:39   */

      /* Empieza nodo:46 / Elemento padre: 38   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(38)).appendChild((Element)v.get(46));

      /* Empieza nodo:47 / Elemento padre: 46   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(47)).setAttribute("align","center" );
      ((Element)v.get(47)).setAttribute("width","12" );
      ((Element)v.get(46)).appendChild((Element)v.get(47));

      /* Empieza nodo:48 / Elemento padre: 47   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(48)).setAttribute("src","b.gif" );
      ((Element)v.get(48)).setAttribute("width","12" );
      ((Element)v.get(48)).setAttribute("height","8" );
      ((Element)v.get(47)).appendChild((Element)v.get(48));
      /* Termina nodo:48   */
      /* Termina nodo:47   */

      /* Empieza nodo:49 / Elemento padre: 46   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(49)).setAttribute("width","100%" );
      ((Element)v.get(46)).appendChild((Element)v.get(49));

      /* Empieza nodo:50 / Elemento padre: 49   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(49)).appendChild((Element)v.get(50));

      /* Empieza nodo:51 / Elemento padre: 50   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(51)).setAttribute("class","legend" );
      ((Element)v.get(50)).appendChild((Element)v.get(51));

      /* Empieza nodo:52 / Elemento padre: 51   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(52)).setAttribute("nombre","legendLbl" );
      ((Element)v.get(52)).setAttribute("alto","13" );
      ((Element)v.get(52)).setAttribute("filas","1" );
      ((Element)v.get(52)).setAttribute("id","legend" );
      ((Element)v.get(52)).setAttribute("valor","" );
      ((Element)v.get(52)).setAttribute("cod","CarIndicNivelJerar.legend.label" );
      ((Element)v.get(51)).appendChild((Element)v.get(52));
      /* Termina nodo:52   */
      /* Termina nodo:51   */

      /* Empieza nodo:53 / Elemento padre: 50   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(53)).setAttribute("width","100%" );
      ((Element)v.get(53)).setAttribute("border","0" );
      ((Element)v.get(53)).setAttribute("align","center" );
      ((Element)v.get(53)).setAttribute("cellspacing","0" );
      ((Element)v.get(53)).setAttribute("cellpadding","0" );
      ((Element)v.get(50)).appendChild((Element)v.get(53));

      /* Empieza nodo:54 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(53)).appendChild((Element)v.get(54));

      /* Empieza nodo:55 / Elemento padre: 54   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(55)).setAttribute("width","100%" );
      ((Element)v.get(55)).setAttribute("nowrap","true" );
      ((Element)v.get(55)).setAttribute("class","datosCampos" );
      ((Element)v.get(55)).setAttribute("colspan","3" );
      ((Element)v.get(54)).appendChild((Element)v.get(55));

      /* Empieza nodo:56 / Elemento padre: 55   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(56)).setAttribute("src","b.gif" );
      ((Element)v.get(56)).setAttribute("width","8" );
      ((Element)v.get(56)).setAttribute("height","8" );
      ((Element)v.get(55)).appendChild((Element)v.get(56));
      /* Termina nodo:56   */
      /* Termina nodo:55   */
      /* Termina nodo:54   */

      /* Empieza nodo:57 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(57)).setAttribute("nombre","formTr0" );
      ((Element)v.get(53)).appendChild((Element)v.get(57));

      /* Empieza nodo:58 / Elemento padre: 57   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(58)).setAttribute("align","center" );
      ((Element)v.get(58)).setAttribute("width","8" );
      ((Element)v.get(57)).appendChild((Element)v.get(58));

      /* Empieza nodo:59 / Elemento padre: 58   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(59)).setAttribute("src","b.gif" );
      ((Element)v.get(59)).setAttribute("width","8" );
      ((Element)v.get(59)).setAttribute("height","12" );
      ((Element)v.get(58)).appendChild((Element)v.get(59));
      /* Termina nodo:59   */
      /* Termina nodo:58   */

      /* Empieza nodo:60 / Elemento padre: 57   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(60)).setAttribute("width","100%" );
      ((Element)v.get(57)).appendChild((Element)v.get(60));

      /* Empieza nodo:61 / Elemento padre: 60   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(61)).setAttribute("width","100%" );
      ((Element)v.get(61)).setAttribute("border","0" );
      ((Element)v.get(61)).setAttribute("cellspacing","0" );
      ((Element)v.get(61)).setAttribute("cellpadding","0" );
      ((Element)v.get(61)).setAttribute("align","left" );
   }

   private void getXML270(Document doc) {
      ((Element)v.get(60)).appendChild((Element)v.get(61));

      /* Empieza nodo:62 / Elemento padre: 61   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(62)).setAttribute("align","left" );
      ((Element)v.get(61)).appendChild((Element)v.get(62));

      /* Empieza nodo:63 / Elemento padre: 62   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(63)).setAttribute("nombre","idTdId" );
      ((Element)v.get(62)).appendChild((Element)v.get(63));

      /* Empieza nodo:64 / Elemento padre: 63   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(64)).setAttribute("width","100%" );
      ((Element)v.get(64)).setAttribute("border","0" );
      ((Element)v.get(64)).setAttribute("cellspacing","0" );
      ((Element)v.get(64)).setAttribute("cellpadding","0" );
      ((Element)v.get(64)).setAttribute("align","left" );
      ((Element)v.get(63)).appendChild((Element)v.get(64));

      /* Empieza nodo:65 / Elemento padre: 64   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(64)).appendChild((Element)v.get(65));

      /* Empieza nodo:66 / Elemento padre: 65   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(66)).setAttribute("valign","top" );
      ((Element)v.get(66)).setAttribute("height","13" );
      ((Element)v.get(65)).appendChild((Element)v.get(66));

      /* Empieza nodo:67 / Elemento padre: 66   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(67)).setAttribute("nombre","lblId" );
      ((Element)v.get(67)).setAttribute("alto","13" );
      ((Element)v.get(67)).setAttribute("filas","1" );
      ((Element)v.get(67)).setAttribute("id","datosTitle" );
      ((Element)v.get(67)).setAttribute("cod","CarIndicNivelJerar.id.label" );
      ((Element)v.get(66)).appendChild((Element)v.get(67));
      /* Termina nodo:67   */
      /* Termina nodo:66   */
      /* Termina nodo:65   */

      /* Empieza nodo:68 / Elemento padre: 64   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(68)).setAttribute("nombre","idWidgetTrId" );
      ((Element)v.get(64)).appendChild((Element)v.get(68));

      /* Empieza nodo:69 / Elemento padre: 68   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(69)).setAttribute("align","left" );
      ((Element)v.get(69)).setAttribute("nowrap","true" );
      ((Element)v.get(68)).appendChild((Element)v.get(69));

      /* Empieza nodo:70 / Elemento padre: 69   */
      v.add(doc.createElement("TEXT"));
      ((Element)v.get(70)).setAttribute("nombre","id" );
      ((Element)v.get(70)).setAttribute("id","datosCampos" );
      ((Element)v.get(70)).setAttribute("trim","S" );
      ((Element)v.get(70)).setAttribute("max","12" );
      ((Element)v.get(70)).setAttribute("onchange","" );
      ((Element)v.get(70)).setAttribute("req","N" );
      ((Element)v.get(70)).setAttribute("size","12" );
      ((Element)v.get(70)).setAttribute("valor","" );
      ((Element)v.get(70)).setAttribute("validacion","" );
      ((Element)v.get(70)).setAttribute("disabled","" );
      ((Element)v.get(70)).setAttribute("onblur","" );
      ((Element)v.get(70)).setAttribute("ontab","ejecutarAccionFoco('carIndicNivelJerarFrm',1, true)" );
      ((Element)v.get(70)).setAttribute("onshtab","ejecutarAccionFoco('carIndicNivelJerarFrm', 1, false)" );
      ((Element)v.get(69)).appendChild((Element)v.get(70));
      /* Termina nodo:70   */
      /* Termina nodo:69   */
      /* Termina nodo:68   */
      /* Termina nodo:64   */
      /* Termina nodo:63   */

      /* Empieza nodo:71 / Elemento padre: 62   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(71)).setAttribute("nombre","idGapTdId" );
      ((Element)v.get(71)).setAttribute("nowrap","true" );
      ((Element)v.get(71)).setAttribute("class","datosCampos" );
      ((Element)v.get(62)).appendChild((Element)v.get(71));

      /* Empieza nodo:72 / Elemento padre: 71   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(72)).setAttribute("src","b.gif" );
      ((Element)v.get(72)).setAttribute("width","25" );
      ((Element)v.get(72)).setAttribute("height","8" );
      ((Element)v.get(71)).appendChild((Element)v.get(72));
      /* Termina nodo:72   */
      /* Termina nodo:71   */

      /* Empieza nodo:73 / Elemento padre: 62   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(73)).setAttribute("width","100%" );
      ((Element)v.get(62)).appendChild((Element)v.get(73));

      /* Empieza nodo:74 / Elemento padre: 73   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(74)).setAttribute("src","b.gif" );
      ((Element)v.get(73)).appendChild((Element)v.get(74));
      /* Termina nodo:74   */
      /* Termina nodo:73   */
      /* Termina nodo:62   */
      /* Termina nodo:61   */
      /* Termina nodo:60   */
      /* Termina nodo:57   */

      /* Empieza nodo:75 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(75)).setAttribute("nombre","formGapTr0" );
      ((Element)v.get(53)).appendChild((Element)v.get(75));

      /* Empieza nodo:76 / Elemento padre: 75   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(76)).setAttribute("align","center" );
      ((Element)v.get(76)).setAttribute("width","8" );
      ((Element)v.get(75)).appendChild((Element)v.get(76));

      /* Empieza nodo:77 / Elemento padre: 76   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(77)).setAttribute("src","b.gif" );
      ((Element)v.get(77)).setAttribute("width","12" );
      ((Element)v.get(77)).setAttribute("height","8" );
      ((Element)v.get(76)).appendChild((Element)v.get(77));
      /* Termina nodo:77   */
      /* Termina nodo:76   */

      /* Empieza nodo:78 / Elemento padre: 75   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(75)).appendChild((Element)v.get(78));

      /* Empieza nodo:79 / Elemento padre: 78   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(79)).setAttribute("src","b.gif" );
      ((Element)v.get(79)).setAttribute("width","8" );
      ((Element)v.get(79)).setAttribute("height","8" );
      ((Element)v.get(78)).appendChild((Element)v.get(79));
      /* Termina nodo:79   */
      /* Termina nodo:78   */

      /* Empieza nodo:80 / Elemento padre: 75   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(80)).setAttribute("align","center" );
      ((Element)v.get(80)).setAttribute("width","8" );
      ((Element)v.get(75)).appendChild((Element)v.get(80));

      /* Empieza nodo:81 / Elemento padre: 80   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(81)).setAttribute("src","b.gif" );
   }

   private void getXML360(Document doc) {
      ((Element)v.get(81)).setAttribute("width","12" );
      ((Element)v.get(81)).setAttribute("height","8" );
      ((Element)v.get(80)).appendChild((Element)v.get(81));
      /* Termina nodo:81   */
      /* Termina nodo:80   */
      /* Termina nodo:75   */

      /* Empieza nodo:82 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(82)).setAttribute("nombre","formTr1" );
      ((Element)v.get(53)).appendChild((Element)v.get(82));

      /* Empieza nodo:83 / Elemento padre: 82   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(83)).setAttribute("align","center" );
      ((Element)v.get(83)).setAttribute("width","8" );
      ((Element)v.get(82)).appendChild((Element)v.get(83));

      /* Empieza nodo:84 / Elemento padre: 83   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(84)).setAttribute("src","b.gif" );
      ((Element)v.get(84)).setAttribute("width","8" );
      ((Element)v.get(84)).setAttribute("height","12" );
      ((Element)v.get(83)).appendChild((Element)v.get(84));
      /* Termina nodo:84   */
      /* Termina nodo:83   */

      /* Empieza nodo:85 / Elemento padre: 82   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(85)).setAttribute("width","100%" );
      ((Element)v.get(82)).appendChild((Element)v.get(85));

      /* Empieza nodo:86 / Elemento padre: 85   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(86)).setAttribute("width","100%" );
      ((Element)v.get(86)).setAttribute("border","0" );
      ((Element)v.get(86)).setAttribute("cellspacing","0" );
      ((Element)v.get(86)).setAttribute("cellpadding","0" );
      ((Element)v.get(86)).setAttribute("align","left" );
      ((Element)v.get(85)).appendChild((Element)v.get(86));

      /* Empieza nodo:87 / Elemento padre: 86   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(87)).setAttribute("align","left" );
      ((Element)v.get(86)).appendChild((Element)v.get(87));

      /* Empieza nodo:88 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(88)).setAttribute("nombre","codIndiNiveJeraTdId" );
      ((Element)v.get(87)).appendChild((Element)v.get(88));

      /* Empieza nodo:89 / Elemento padre: 88   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(89)).setAttribute("width","100%" );
      ((Element)v.get(89)).setAttribute("border","0" );
      ((Element)v.get(89)).setAttribute("cellspacing","0" );
      ((Element)v.get(89)).setAttribute("cellpadding","0" );
      ((Element)v.get(89)).setAttribute("align","left" );
      ((Element)v.get(88)).appendChild((Element)v.get(89));

      /* Empieza nodo:90 / Elemento padre: 89   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(89)).appendChild((Element)v.get(90));

      /* Empieza nodo:91 / Elemento padre: 90   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(91)).setAttribute("valign","top" );
      ((Element)v.get(91)).setAttribute("height","13" );
      ((Element)v.get(90)).appendChild((Element)v.get(91));

      /* Empieza nodo:92 / Elemento padre: 91   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(92)).setAttribute("nombre","lblCodIndiNiveJera" );
      ((Element)v.get(92)).setAttribute("alto","13" );
      ((Element)v.get(92)).setAttribute("filas","1" );
      ((Element)v.get(92)).setAttribute("id","datosTitle" );
      ((Element)v.get(92)).setAttribute("cod","CarIndicNivelJerar.codIndiNiveJera.label" );
      ((Element)v.get(91)).appendChild((Element)v.get(92));
      /* Termina nodo:92   */
      /* Termina nodo:91   */
      /* Termina nodo:90   */

      /* Empieza nodo:93 / Elemento padre: 89   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(93)).setAttribute("nombre","codIndiNiveJeraWidgetTrId" );
      ((Element)v.get(89)).appendChild((Element)v.get(93));

      /* Empieza nodo:94 / Elemento padre: 93   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(94)).setAttribute("align","left" );
      ((Element)v.get(94)).setAttribute("nowrap","true" );
      ((Element)v.get(93)).appendChild((Element)v.get(94));

      /* Empieza nodo:95 / Elemento padre: 94   */
      v.add(doc.createElement("RADIOB"));
      ((Element)v.get(95)).setAttribute("nombre","codIndiNiveJera" );
      ((Element)v.get(95)).setAttribute("tipo","H" );
      ((Element)v.get(95)).setAttribute("req","N" );
      ((Element)v.get(95)).setAttribute("id","datosCampos" );
      ((Element)v.get(95)).setAttribute("valor","" );
      ((Element)v.get(95)).setAttribute("disabled","" );
      ((Element)v.get(95)).setAttribute("ontab","ejecutarAccionFoco('carIndicNivelJerarFrm',2, true)" );
      ((Element)v.get(95)).setAttribute("onshtab","ejecutarAccionFoco('carIndicNivelJerarFrm',2, false)" );
      ((Element)v.get(94)).appendChild((Element)v.get(95));

      /* Empieza nodo:96 / Elemento padre: 95   */
      v.add(doc.createElement("RBINPUT"));
      ((Element)v.get(96)).setAttribute("id","datosCampos" );
      ((Element)v.get(96)).setAttribute("valor","A" );
      ((Element)v.get(96)).setAttribute("cod","CarIndicNivelJerar.codIndiNiveJera.A.label" );
      ((Element)v.get(95)).appendChild((Element)v.get(96));

      /* Elemento padre:96 / Elemento actual: 97   */
      v.add(doc.createTextNode("x"));
      ((Element)v.get(96)).appendChild((Text)v.get(97));

      /* Termina nodo Texto:97   */
      /* Termina nodo:96   */

      /* Empieza nodo:98 / Elemento padre: 95   */
      v.add(doc.createElement("RBINPUT"));
      ((Element)v.get(98)).setAttribute("id","datosCampos" );
      ((Element)v.get(98)).setAttribute("valor","I" );
      ((Element)v.get(98)).setAttribute("cod","CarIndicNivelJerar.codIndiNiveJera.I.label" );
      ((Element)v.get(95)).appendChild((Element)v.get(98));

      /* Elemento padre:98 / Elemento actual: 99   */
      v.add(doc.createTextNode("x"));
      ((Element)v.get(98)).appendChild((Text)v.get(99));

      /* Termina nodo Texto:99   */
      /* Termina nodo:98   */
      /* Termina nodo:95   */
      /* Termina nodo:94   */
      /* Termina nodo:93   */
      /* Termina nodo:89   */
      /* Termina nodo:88   */

      /* Empieza nodo:100 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(100)).setAttribute("nombre","codIndiNiveJeraGapTdId" );
      ((Element)v.get(100)).setAttribute("nowrap","true" );
      ((Element)v.get(100)).setAttribute("class","datosCampos" );
      ((Element)v.get(87)).appendChild((Element)v.get(100));

      /* Empieza nodo:101 / Elemento padre: 100   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(101)).setAttribute("src","b.gif" );
      ((Element)v.get(101)).setAttribute("width","25" );
   }

   private void getXML450(Document doc) {
      ((Element)v.get(101)).setAttribute("height","8" );
      ((Element)v.get(100)).appendChild((Element)v.get(101));
      /* Termina nodo:101   */
      /* Termina nodo:100   */

      /* Empieza nodo:102 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(102)).setAttribute("width","100%" );
      ((Element)v.get(87)).appendChild((Element)v.get(102));

      /* Empieza nodo:103 / Elemento padre: 102   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(103)).setAttribute("src","b.gif" );
      ((Element)v.get(102)).appendChild((Element)v.get(103));
      /* Termina nodo:103   */
      /* Termina nodo:102   */
      /* Termina nodo:87   */
      /* Termina nodo:86   */
      /* Termina nodo:85   */

      /* Empieza nodo:104 / Elemento padre: 82   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(104)).setAttribute("width","100%" );
      ((Element)v.get(82)).appendChild((Element)v.get(104));
      /* Termina nodo:104   */
      /* Termina nodo:82   */

      /* Empieza nodo:105 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(105)).setAttribute("nombre","formGapTr1" );
      ((Element)v.get(53)).appendChild((Element)v.get(105));

      /* Empieza nodo:106 / Elemento padre: 105   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(106)).setAttribute("align","center" );
      ((Element)v.get(106)).setAttribute("width","8" );
      ((Element)v.get(105)).appendChild((Element)v.get(106));

      /* Empieza nodo:107 / Elemento padre: 106   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(107)).setAttribute("src","b.gif" );
      ((Element)v.get(107)).setAttribute("width","8" );
      ((Element)v.get(107)).setAttribute("height","8" );
      ((Element)v.get(106)).appendChild((Element)v.get(107));
      /* Termina nodo:107   */
      /* Termina nodo:106   */

      /* Empieza nodo:108 / Elemento padre: 105   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(105)).appendChild((Element)v.get(108));

      /* Empieza nodo:109 / Elemento padre: 108   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(109)).setAttribute("src","b.gif" );
      ((Element)v.get(109)).setAttribute("width","8" );
      ((Element)v.get(109)).setAttribute("height","8" );
      ((Element)v.get(108)).appendChild((Element)v.get(109));
      /* Termina nodo:109   */
      /* Termina nodo:108   */

      /* Empieza nodo:110 / Elemento padre: 105   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(110)).setAttribute("align","center" );
      ((Element)v.get(110)).setAttribute("width","8" );
      ((Element)v.get(105)).appendChild((Element)v.get(110));

      /* Empieza nodo:111 / Elemento padre: 110   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(111)).setAttribute("src","b.gif" );
      ((Element)v.get(111)).setAttribute("width","8" );
      ((Element)v.get(111)).setAttribute("height","8" );
      ((Element)v.get(110)).appendChild((Element)v.get(111));
      /* Termina nodo:111   */
      /* Termina nodo:110   */
      /* Termina nodo:105   */
      /* Termina nodo:53   */
      /* Termina nodo:50   */
      /* Termina nodo:49   */

      /* Empieza nodo:112 / Elemento padre: 46   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(112)).setAttribute("align","center" );
      ((Element)v.get(112)).setAttribute("width","12" );
      ((Element)v.get(46)).appendChild((Element)v.get(112));

      /* Empieza nodo:113 / Elemento padre: 112   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(113)).setAttribute("src","b.gif" );
      ((Element)v.get(113)).setAttribute("width","12" );
      ((Element)v.get(113)).setAttribute("height","12" );
      ((Element)v.get(112)).appendChild((Element)v.get(113));
      /* Termina nodo:113   */
      /* Termina nodo:112   */
      /* Termina nodo:46   */

      /* Empieza nodo:114 / Elemento padre: 38   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(114)).setAttribute("nombre","carIndicNivelJerarTrButtons" );
      ((Element)v.get(38)).appendChild((Element)v.get(114));

      /* Empieza nodo:115 / Elemento padre: 114   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(115)).setAttribute("align","center" );
      ((Element)v.get(115)).setAttribute("width","12" );
      ((Element)v.get(114)).appendChild((Element)v.get(115));

      /* Empieza nodo:116 / Elemento padre: 115   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(116)).setAttribute("src","b.gif" );
      ((Element)v.get(116)).setAttribute("width","12" );
      ((Element)v.get(116)).setAttribute("height","12" );
      ((Element)v.get(115)).appendChild((Element)v.get(116));
      /* Termina nodo:116   */
      /* Termina nodo:115   */

      /* Empieza nodo:117 / Elemento padre: 114   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(114)).appendChild((Element)v.get(117));

      /* Empieza nodo:118 / Elemento padre: 117   */
      v.add(doc.createElement("FIELDSET"));
      ((Element)v.get(117)).appendChild((Element)v.get(118));

      /* Empieza nodo:119 / Elemento padre: 118   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(119)).setAttribute("width","100%" );
      ((Element)v.get(119)).setAttribute("border","0" );
      ((Element)v.get(119)).setAttribute("align","center" );
      ((Element)v.get(119)).setAttribute("cellspacing","0" );
      ((Element)v.get(119)).setAttribute("cellpadding","0" );
      ((Element)v.get(118)).appendChild((Element)v.get(119));

      /* Empieza nodo:120 / Elemento padre: 119   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(119)).appendChild((Element)v.get(120));

      /* Empieza nodo:121 / Elemento padre: 120   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(121)).setAttribute("class","tablaTitle" );
      ((Element)v.get(121)).setAttribute("nombre","carIndicNivelJerarTdQueryButton" );
      ((Element)v.get(120)).appendChild((Element)v.get(121));

      /* Empieza nodo:122 / Elemento padre: 121   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(122)).setAttribute("nombre","carIndicNivelJerarQueryButton" );
      ((Element)v.get(122)).setAttribute("cod","MMGGlobal.queryButton.label" );
      ((Element)v.get(122)).setAttribute("estado","false" );
      ((Element)v.get(122)).setAttribute("accion","carIndicNivelJerarFirstPage();" );
      ((Element)v.get(122)).setAttribute("tipo","html" );
      ((Element)v.get(122)).setAttribute("ID","botonContenido" );
      ((Element)v.get(121)).appendChild((Element)v.get(122));
      /* Termina nodo:122   */
      /* Termina nodo:121   */

      /* Empieza nodo:123 / Elemento padre: 120   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(123)).setAttribute("class","tablaTitle" );
      ((Element)v.get(123)).setAttribute("nombre","carIndicNivelJerarTdLovNullSelectionButton" );
      ((Element)v.get(123)).setAttribute("align","left" );
      ((Element)v.get(123)).setAttribute("width","100%" );
   }

   private void getXML540(Document doc) {
      ((Element)v.get(120)).appendChild((Element)v.get(123));

      /* Empieza nodo:124 / Elemento padre: 123   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(124)).setAttribute("src","b.gif" );
      ((Element)v.get(124)).setAttribute("height","8" );
      ((Element)v.get(124)).setAttribute("width","8" );
      ((Element)v.get(123)).appendChild((Element)v.get(124));
      /* Termina nodo:124   */

      /* Empieza nodo:125 / Elemento padre: 123   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(125)).setAttribute("nombre","carIndicNivelJerarLovNullButton" );
      ((Element)v.get(125)).setAttribute("ID","botonContenido" );
      ((Element)v.get(125)).setAttribute("tipo","html" );
      ((Element)v.get(125)).setAttribute("accion","carIndicNivelJerarLovNullSelectionAction();" );
      ((Element)v.get(125)).setAttribute("estado","true" );
      ((Element)v.get(125)).setAttribute("cod","MMGGlobal.lovNullButton.label" );
      ((Element)v.get(123)).appendChild((Element)v.get(125));
      /* Termina nodo:125   */
      /* Termina nodo:123   */
      /* Termina nodo:120   */
      /* Termina nodo:119   */
      /* Termina nodo:118   */
      /* Termina nodo:117   */

      /* Empieza nodo:126 / Elemento padre: 114   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(126)).setAttribute("align","center" );
      ((Element)v.get(126)).setAttribute("width","12" );
      ((Element)v.get(114)).appendChild((Element)v.get(126));

      /* Empieza nodo:127 / Elemento padre: 126   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(127)).setAttribute("src","b.gif" );
      ((Element)v.get(127)).setAttribute("width","12" );
      ((Element)v.get(127)).setAttribute("height","12" );
      ((Element)v.get(126)).appendChild((Element)v.get(127));
      /* Termina nodo:127   */
      /* Termina nodo:126   */
      /* Termina nodo:114   */
      /* Termina nodo:38   */
      /* Termina nodo:37   */

      /* Empieza nodo:128 / Elemento padre: 4   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(128)).setAttribute("nombre","carIndicNivelJerarListLayer" );
      ((Element)v.get(128)).setAttribute("alto","310" );
      ((Element)v.get(128)).setAttribute("ancho","99%" );
      ((Element)v.get(128)).setAttribute("colorf","" );
      ((Element)v.get(128)).setAttribute("borde","0" );
      ((Element)v.get(128)).setAttribute("imagenf","" );
      ((Element)v.get(128)).setAttribute("repeat","" );
      ((Element)v.get(128)).setAttribute("padding","" );
      ((Element)v.get(128)).setAttribute("visibilidad","hidden" );
      ((Element)v.get(128)).setAttribute("contravsb","" );
      ((Element)v.get(128)).setAttribute("x","3" );
      ((Element)v.get(128)).setAttribute("y","" );
      ((Element)v.get(128)).setAttribute("zindex","" );
      ((Element)v.get(4)).appendChild((Element)v.get(128));

      /* Empieza nodo:129 / Elemento padre: 128   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(129)).setAttribute("nombre","carIndicNivelJerarList" );
      ((Element)v.get(129)).setAttribute("ancho","680" );
      ((Element)v.get(129)).setAttribute("alto","275" );
      ((Element)v.get(129)).setAttribute("x","12" );
      ((Element)v.get(129)).setAttribute("y","0" );
      ((Element)v.get(129)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(129)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(128)).appendChild((Element)v.get(129));

      /* Empieza nodo:130 / Elemento padre: 129   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(130)).setAttribute("precarga","S" );
      ((Element)v.get(130)).setAttribute("conROver","S" );
      ((Element)v.get(129)).appendChild((Element)v.get(130));

      /* Empieza nodo:131 / Elemento padre: 130   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(131)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(131)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(131)).setAttribute("seleccionado","btnLista2M.gif" );
      ((Element)v.get(131)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(130)).appendChild((Element)v.get(131));
      /* Termina nodo:131   */

      /* Empieza nodo:132 / Elemento padre: 130   */
      v.add(doc.createElement("BTNMINIMIZAR"));
      ((Element)v.get(132)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(132)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(132)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(132)).setAttribute("maximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(130)).appendChild((Element)v.get(132));
      /* Termina nodo:132   */
      /* Termina nodo:130   */

      /* Empieza nodo:133 / Elemento padre: 129   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(129)).appendChild((Element)v.get(133));

      /* Empieza nodo:134 / Elemento padre: 133   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(134)).setAttribute("borde","1" );
      ((Element)v.get(134)).setAttribute("horizDatos","1" );
      ((Element)v.get(134)).setAttribute("horizCabecera","1" );
      ((Element)v.get(134)).setAttribute("vertical","1" );
      ((Element)v.get(134)).setAttribute("horizTitulo","1" );
      ((Element)v.get(134)).setAttribute("horizBase","1" );
      ((Element)v.get(133)).appendChild((Element)v.get(134));
      /* Termina nodo:134   */

      /* Empieza nodo:135 / Elemento padre: 133   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(135)).setAttribute("borde","#999999" );
      ((Element)v.get(135)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(135)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(135)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(135)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(135)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(135)).setAttribute("horizBase","#999999" );
      ((Element)v.get(133)).appendChild((Element)v.get(135));
      /* Termina nodo:135   */
      /* Termina nodo:133   */

      /* Empieza nodo:136 / Elemento padre: 129   */
      v.add(doc.createElement("TITULO"));
      ((Element)v.get(136)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(136)).setAttribute("alto","22" );
      ((Element)v.get(136)).setAttribute("imgFondo","" );
      ((Element)v.get(136)).setAttribute("cod","00135" );
      ((Element)v.get(136)).setAttribute("ID","datosTitle" );
      ((Element)v.get(129)).appendChild((Element)v.get(136));
      /* Termina nodo:136   */

      /* Empieza nodo:137 / Elemento padre: 129   */
      v.add(doc.createElement("BASE"));
   }

   private void getXML630(Document doc) {
      ((Element)v.get(137)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(137)).setAttribute("alto","22" );
      ((Element)v.get(137)).setAttribute("imgFondo","" );
      ((Element)v.get(129)).appendChild((Element)v.get(137));
      /* Termina nodo:137   */

      /* Empieza nodo:138 / Elemento padre: 129   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(138)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(138)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(138)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(138)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(138)).setAttribute("AnchoMinimizadas","20" );
      ((Element)v.get(129)).appendChild((Element)v.get(138));

      /* Empieza nodo:139 / Elemento padre: 138   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(139)).setAttribute("ancho","100" );
      ((Element)v.get(139)).setAttribute("minimizable","S" );
      ((Element)v.get(139)).setAttribute("minimizada","N" );
      ((Element)v.get(138)).appendChild((Element)v.get(139));
      /* Termina nodo:139   */
      /* Termina nodo:138   */

      /* Empieza nodo:140 / Elemento padre: 129   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(140)).setAttribute("height","20" );
      ((Element)v.get(140)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(140)).setAttribute("imgFondo","" );
      ((Element)v.get(140)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(129)).appendChild((Element)v.get(140));

      /* Empieza nodo:141 / Elemento padre: 140   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(141)).setAttribute("colFondo","" );
      ((Element)v.get(141)).setAttribute("ID","EstCab" );
      ((Element)v.get(141)).setAttribute("cod","CarIndicNivelJerar.codIndiNiveJera.label" );
      ((Element)v.get(140)).appendChild((Element)v.get(141));
      /* Termina nodo:141   */
      /* Termina nodo:140   */

      /* Empieza nodo:142 / Elemento padre: 129   */
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(142)).setAttribute("alto","22" );
      ((Element)v.get(142)).setAttribute("accion","" );
      ((Element)v.get(142)).setAttribute("tipoEnvio","seleccion" );
      ((Element)v.get(142)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(142)).setAttribute("maxSel","1" );
      ((Element)v.get(142)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(142)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(142)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(142)).setAttribute("onLoad","" );
      ((Element)v.get(142)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(129)).appendChild((Element)v.get(142));

      /* Empieza nodo:143 / Elemento padre: 142   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(143)).setAttribute("tipo","texto" );
      ((Element)v.get(143)).setAttribute("ID","EstDat" );
      ((Element)v.get(142)).appendChild((Element)v.get(143));
      /* Termina nodo:143   */
      /* Termina nodo:142   */

      /* Empieza nodo:144 / Elemento padre: 129   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(129)).appendChild((Element)v.get(144));
      /* Termina nodo:144   */
      /* Termina nodo:129   */
      /* Termina nodo:128   */

      /* Empieza nodo:145 / Elemento padre: 4   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(145)).setAttribute("nombre","carIndicNivelJerarListButtonsLayer" );
      ((Element)v.get(145)).setAttribute("visibilidad","hidden" );
      ((Element)v.get(145)).setAttribute("alto","30" );
      ((Element)v.get(145)).setAttribute("ancho","98%" );
      ((Element)v.get(145)).setAttribute("borde","n" );
      ((Element)v.get(145)).setAttribute("imagenf","" );
      ((Element)v.get(145)).setAttribute("repeat","" );
      ((Element)v.get(145)).setAttribute("padding","0" );
      ((Element)v.get(145)).setAttribute("contravsb","" );
      ((Element)v.get(145)).setAttribute("x","16" );
      ((Element)v.get(145)).setAttribute("y","" );
      ((Element)v.get(145)).setAttribute("zindex","" );
      ((Element)v.get(4)).appendChild((Element)v.get(145));

      /* Empieza nodo:146 / Elemento padre: 145   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(146)).setAttribute("nombre","toolbarSeparatorLayer" );
      ((Element)v.get(146)).setAttribute("visibilidad","inherit" );
      ((Element)v.get(146)).setAttribute("alto","23" );
      ((Element)v.get(146)).setAttribute("ancho","1" );
      ((Element)v.get(146)).setAttribute("borde","1" );
      ((Element)v.get(146)).setAttribute("imagenf","" );
      ((Element)v.get(146)).setAttribute("repeat","" );
      ((Element)v.get(146)).setAttribute("padding","0" );
      ((Element)v.get(146)).setAttribute("contravsb","" );
      ((Element)v.get(146)).setAttribute("x","56" );
      ((Element)v.get(146)).setAttribute("y","0" );
      ((Element)v.get(146)).setAttribute("zindex","" );
      ((Element)v.get(146)).setAttribute("colborde","#999999" );
      ((Element)v.get(145)).appendChild((Element)v.get(146));
      /* Termina nodo:146   */

      /* Empieza nodo:147 / Elemento padre: 145   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(147)).setAttribute("width","100%" );
      ((Element)v.get(147)).setAttribute("border","0" );
      ((Element)v.get(147)).setAttribute("cellspacing","1" );
      ((Element)v.get(147)).setAttribute("cellpadding","0" );
      ((Element)v.get(145)).appendChild((Element)v.get(147));

      /* Empieza nodo:148 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(147)).appendChild((Element)v.get(148));

      /* Empieza nodo:149 / Elemento padre: 148   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(149)).setAttribute("src","b.gif" );
      ((Element)v.get(149)).setAttribute("height","22" );
      ((Element)v.get(149)).setAttribute("width","5" );
      ((Element)v.get(148)).appendChild((Element)v.get(149));
      /* Termina nodo:149   */
      /* Termina nodo:148   */

      /* Empieza nodo:150 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(147)).appendChild((Element)v.get(150));

      /* Empieza nodo:151 / Elemento padre: 150   */
      v.add(doc.createElement("BOTONERA"));
   }

   private void getXML720(Document doc) {
      ((Element)v.get(151)).setAttribute("nombre","carIndicNivelJerarPaginationButtonBar" );
      ((Element)v.get(151)).setAttribute("tipo","H" );
      ((Element)v.get(151)).setAttribute("x","0" );
      ((Element)v.get(151)).setAttribute("y","0" );
      ((Element)v.get(150)).appendChild((Element)v.get(151));

      /* Empieza nodo:152 / Elemento padre: 151   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(152)).setAttribute("nombre","carIndicNivelJerarFirstPageButton" );
      ((Element)v.get(152)).setAttribute("funcion","carIndicNivelJerarFirstPage();" );
      ((Element)v.get(152)).setAttribute("off","primera_over0.gif" );
      ((Element)v.get(152)).setAttribute("on","primera_over0.gif" );
      ((Element)v.get(152)).setAttribute("disable","primera_on0.gif" );
      ((Element)v.get(152)).setAttribute("estado","inactivo" );
      ((Element)v.get(151)).appendChild((Element)v.get(152));
      /* Termina nodo:152   */

      /* Empieza nodo:153 / Elemento padre: 151   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(153)).setAttribute("nombre","carIndicNivelJerarFirstPageButtonGapTd" );
      ((Element)v.get(151)).appendChild((Element)v.get(153));

      /* Empieza nodo:154 / Elemento padre: 153   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(154)).setAttribute("src","b.gif" );
      ((Element)v.get(154)).setAttribute("height","8" );
      ((Element)v.get(154)).setAttribute("width","5" );
      ((Element)v.get(153)).appendChild((Element)v.get(154));
      /* Termina nodo:154   */
      /* Termina nodo:153   */

      /* Empieza nodo:155 / Elemento padre: 151   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(155)).setAttribute("nombre","carIndicNivelJerarPreviousPageButton" );
      ((Element)v.get(155)).setAttribute("funcion","carIndicNivelJerarPreviousPage();" );
      ((Element)v.get(155)).setAttribute("off","retroceder_over0.gif" );
      ((Element)v.get(155)).setAttribute("on","retroceder_over0.gif" );
      ((Element)v.get(155)).setAttribute("disable","retroceder_on0.gif" );
      ((Element)v.get(155)).setAttribute("estado","inactivo" );
      ((Element)v.get(151)).appendChild((Element)v.get(155));
      /* Termina nodo:155   */

      /* Empieza nodo:156 / Elemento padre: 151   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(156)).setAttribute("nombre","carIndicNivelJerarPreviousPageButtonGapTd" );
      ((Element)v.get(151)).appendChild((Element)v.get(156));

      /* Empieza nodo:157 / Elemento padre: 156   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(157)).setAttribute("src","b.gif" );
      ((Element)v.get(157)).setAttribute("height","8" );
      ((Element)v.get(157)).setAttribute("width","8" );
      ((Element)v.get(156)).appendChild((Element)v.get(157));
      /* Termina nodo:157   */
      /* Termina nodo:156   */

      /* Empieza nodo:158 / Elemento padre: 151   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(158)).setAttribute("nombre","carIndicNivelJerarNextPageButton" );
      ((Element)v.get(158)).setAttribute("funcion","carIndicNivelJerarNextPage();" );
      ((Element)v.get(158)).setAttribute("off","avanzar_over0.gif" );
      ((Element)v.get(158)).setAttribute("on","avanzar_over0.gif" );
      ((Element)v.get(158)).setAttribute("disable","avanzar_on0.gif" );
      ((Element)v.get(158)).setAttribute("estado","inactivo" );
      ((Element)v.get(151)).appendChild((Element)v.get(158));
      /* Termina nodo:158   */
      /* Termina nodo:151   */
      /* Termina nodo:150   */

      /* Empieza nodo:159 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(147)).appendChild((Element)v.get(159));

      /* Empieza nodo:160 / Elemento padre: 159   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(160)).setAttribute("src","b.gif" );
      ((Element)v.get(160)).setAttribute("height","22" );
      ((Element)v.get(160)).setAttribute("width","19" );
      ((Element)v.get(159)).appendChild((Element)v.get(160));
      /* Termina nodo:160   */
      /* Termina nodo:159   */

      /* Empieza nodo:161 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(161)).setAttribute("class","tablaTitle" );
      ((Element)v.get(161)).setAttribute("nombre","carIndicNivelJerarUpdateButtonTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(161));

      /* Empieza nodo:162 / Elemento padre: 161   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(162)).setAttribute("nombre","carIndicNivelJerarUpdateButton" );
      ((Element)v.get(162)).setAttribute("ID","botonContenido" );
      ((Element)v.get(162)).setAttribute("tipo","html" );
      ((Element)v.get(162)).setAttribute("accion","carIndicNivelJerarUpdateSelection();" );
      ((Element)v.get(162)).setAttribute("estado","false" );
      ((Element)v.get(162)).setAttribute("cod","MMGGlobal.updateButton.label" );
      ((Element)v.get(161)).appendChild((Element)v.get(162));
      /* Termina nodo:162   */
      /* Termina nodo:161   */

      /* Empieza nodo:163 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(163)).setAttribute("nombre","carIndicNivelJerarUpdateButtonGapTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(163));

      /* Empieza nodo:164 / Elemento padre: 163   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(164)).setAttribute("src","b.gif" );
      ((Element)v.get(164)).setAttribute("height","8" );
      ((Element)v.get(164)).setAttribute("width","10" );
      ((Element)v.get(163)).appendChild((Element)v.get(164));
      /* Termina nodo:164   */
      /* Termina nodo:163   */

      /* Empieza nodo:165 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(165)).setAttribute("class","tablaTitle" );
      ((Element)v.get(165)).setAttribute("nombre","carIndicNivelJerarViewForRemoveButtonTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(165));

      /* Empieza nodo:166 / Elemento padre: 165   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(166)).setAttribute("nombre","carIndicNivelJerarViewForRemoveButton" );
      ((Element)v.get(166)).setAttribute("ID","botonContenido" );
      ((Element)v.get(166)).setAttribute("tipo","html" );
      ((Element)v.get(166)).setAttribute("accion","carIndicNivelJerarViewSelection();" );
      ((Element)v.get(166)).setAttribute("estado","false" );
      ((Element)v.get(166)).setAttribute("cod","MMGGlobal.viewButton.label" );
      ((Element)v.get(165)).appendChild((Element)v.get(166));
      /* Termina nodo:166   */
      /* Termina nodo:165   */

      /* Empieza nodo:167 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(167)).setAttribute("nombre","carIndicNivelJerarViewForRemoveButtonGapTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(167));

      /* Empieza nodo:168 / Elemento padre: 167   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(168)).setAttribute("src","b.gif" );
      ((Element)v.get(168)).setAttribute("height","8" );
   }

   private void getXML810(Document doc) {
      ((Element)v.get(168)).setAttribute("width","10" );
      ((Element)v.get(167)).appendChild((Element)v.get(168));
      /* Termina nodo:168   */
      /* Termina nodo:167   */

      /* Empieza nodo:169 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(169)).setAttribute("class","tablaTitle" );
      ((Element)v.get(169)).setAttribute("nombre","carIndicNivelJerarLovSelectButtonTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(169));

      /* Empieza nodo:170 / Elemento padre: 169   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(170)).setAttribute("nombre","carIndicNivelJerarLovSelectButton" );
      ((Element)v.get(170)).setAttribute("ID","botonContenido" );
      ((Element)v.get(170)).setAttribute("tipo","html" );
      ((Element)v.get(170)).setAttribute("accion","carIndicNivelJerarLovSelectionAction();" );
      ((Element)v.get(170)).setAttribute("estado","true" );
      ((Element)v.get(170)).setAttribute("cod","MMGGlobal.lovSelectButton.label" );
      ((Element)v.get(169)).appendChild((Element)v.get(170));
      /* Termina nodo:170   */
      /* Termina nodo:169   */

      /* Empieza nodo:171 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(171)).setAttribute("nombre","carIndicNivelJerarLovSelectButtonGapTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(171));

      /* Empieza nodo:172 / Elemento padre: 171   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(172)).setAttribute("src","b.gif" );
      ((Element)v.get(172)).setAttribute("height","8" );
      ((Element)v.get(172)).setAttribute("width","10" );
      ((Element)v.get(171)).appendChild((Element)v.get(172));
      /* Termina nodo:172   */
      /* Termina nodo:171   */

      /* Empieza nodo:173 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(173)).setAttribute("class","tablaTitle" );
      ((Element)v.get(173)).setAttribute("nombre","carIndicNivelJerarViewButtonTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(173));

      /* Empieza nodo:174 / Elemento padre: 173   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(174)).setAttribute("nombre","carIndicNivelJerarViewButton" );
      ((Element)v.get(174)).setAttribute("ID","botonContenido" );
      ((Element)v.get(174)).setAttribute("tipo","html" );
      ((Element)v.get(174)).setAttribute("accion","carIndicNivelJerarViewSelection();" );
      ((Element)v.get(174)).setAttribute("estado","false" );
      ((Element)v.get(174)).setAttribute("cod","MMGGlobal.viewButton.label" );
      ((Element)v.get(173)).appendChild((Element)v.get(174));
      /* Termina nodo:174   */
      /* Termina nodo:173   */

      /* Empieza nodo:175 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(175)).setAttribute("nombre","carIndicNivelJerarViewButtonGapTd" );
      ((Element)v.get(147)).appendChild((Element)v.get(175));

      /* Empieza nodo:176 / Elemento padre: 175   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(176)).setAttribute("src","b.gif" );
      ((Element)v.get(176)).setAttribute("height","8" );
      ((Element)v.get(176)).setAttribute("width","10" );
      ((Element)v.get(175)).appendChild((Element)v.get(176));
      /* Termina nodo:176   */
      /* Termina nodo:175   */

      /* Empieza nodo:177 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(177)).setAttribute("width","100%" );
      ((Element)v.get(147)).appendChild((Element)v.get(177));
      /* Termina nodo:177   */
      /* Termina nodo:147   */
      /* Termina nodo:145   */
      /* Termina nodo:4   */


   }

}