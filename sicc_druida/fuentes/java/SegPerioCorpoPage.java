
import org.w3c.dom.*;
import java.util.ArrayList;

public class SegPerioCorpoPage  implements es.indra.druida.base.ObjetoXML {
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
         

      getXML900(doc);
         

      getXML990(doc);
         

      getXML1080(doc);
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","SegPerioCorpoPage" );
      ((Element)v.get(0)).setAttribute("titulo","" );
      ((Element)v.get(0)).setAttribute("estilos","estilosB3.css" );
      ((Element)v.get(0)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(0)).setAttribute("msgle","" );
      ((Element)v.get(0)).setAttribute("onload","segPerioCorpoInitComponents()" );
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
      ((Element)v.get(2)).setAttribute("src","i18NJS.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(2));
      /* Termina nodo:2   */

      /* Empieza nodo:3 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(3)).setAttribute("src","mmg.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(3));
      /* Termina nodo:3   */

      /* Empieza nodo:4 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(4)).setAttribute("src","segperiocorpo.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(4));
      /* Termina nodo:4   */

      /* Empieza nodo:5 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(5)).setAttribute("nombre","segPerioCorpoFrm" );
      ((Element)v.get(5)).setAttribute("oculto","N" );
      ((Element)v.get(0)).appendChild((Element)v.get(5));

      /* Empieza nodo:6 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(6)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(6)).setAttribute("valor","SegPerioCorpoLPExecution" );
      ((Element)v.get(5)).appendChild((Element)v.get(6));
      /* Termina nodo:6   */

      /* Empieza nodo:7 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(7)).setAttribute("nombre","ON" );
      ((Element)v.get(7)).setAttribute("valor","SegPerioCorpoLPExecution" );
      ((Element)v.get(5)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */

      /* Empieza nodo:8 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(8)).setAttribute("nombre","accion" );
      ((Element)v.get(8)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(8));
      /* Termina nodo:8   */

      /* Empieza nodo:9 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(9)).setAttribute("nombre","origen" );
      ((Element)v.get(9)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(10)).setAttribute("nombre","idSelection" );
      ((Element)v.get(10)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */

      /* Empieza nodo:11 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(11)).setAttribute("nombre","idAttributeLovOpener" );
      ((Element)v.get(11)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(11));
      /* Termina nodo:11   */

      /* Empieza nodo:12 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(12)).setAttribute("nombre","idEntityLovOpener" );
      ((Element)v.get(12)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(12));
      /* Termina nodo:12   */

      /* Empieza nodo:13 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(13)).setAttribute("nombre","timestamp" );
      ((Element)v.get(13)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(13));
      /* Termina nodo:13   */

      /* Empieza nodo:14 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(14)).setAttribute("nombre","windowTitleCode" );
      ((Element)v.get(14)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(14));
      /* Termina nodo:14   */

      /* Empieza nodo:15 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(15)).setAttribute("nombre","userLanguageCode" );
      ((Element)v.get(15)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(15));
      /* Termina nodo:15   */

      /* Empieza nodo:16 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(16)).setAttribute("nombre","defaultLanguageCode" );
      ((Element)v.get(16)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(16));
      /* Termina nodo:16   */

      /* Empieza nodo:17 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(17)).setAttribute("nombre","pageLaguage" );
      ((Element)v.get(17)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */

      /* Empieza nodo:18 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(18)).setAttribute("nombre","lastQueryToSession" );
      ((Element)v.get(18)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(18));
      /* Termina nodo:18   */

      /* Empieza nodo:19 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(19)).setAttribute("nombre","previousAction" );
      ((Element)v.get(19)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(19));
      /* Termina nodo:19   */

      /* Empieza nodo:20 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(20)).setAttribute("nombre","performRequery" );
      ((Element)v.get(20)).setAttribute("valor","false" );
      ((Element)v.get(5)).appendChild((Element)v.get(20));
      /* Termina nodo:20   */

      /* Empieza nodo:21 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(21)).setAttribute("nombre","applyStructuralEntity" );
      ((Element)v.get(21)).setAttribute("valor","true" );
      ((Element)v.get(5)).appendChild((Element)v.get(21));
      /* Termina nodo:21   */

      /* Empieza nodo:22 / Elemento padre: 5   */
   }

   private void getXML90(Document doc) {
      v.add(doc.createElement("VAR"));
      ((Element)v.get(22)).setAttribute("nombre","errCodigo" );
      ((Element)v.get(22)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(22));
      /* Termina nodo:22   */

      /* Empieza nodo:23 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(23)).setAttribute("nombre","errDescripcion" );
      ((Element)v.get(23)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(23));
      /* Termina nodo:23   */

      /* Empieza nodo:24 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(24)).setAttribute("nombre","errSeverity" );
      ((Element)v.get(24)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(24));
      /* Termina nodo:24   */

      /* Empieza nodo:25 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(25)).setAttribute("nombre","structuralDefaultPais" );
      ((Element)v.get(25)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(25));
      /* Termina nodo:25   */

      /* Empieza nodo:26 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(26)).setAttribute("nombre","structuralDefaultSociedad" );
      ((Element)v.get(26)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(26));
      /* Termina nodo:26   */

      /* Empieza nodo:27 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(27)).setAttribute("nombre","structuralDefaultMarca" );
      ((Element)v.get(27)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(27));
      /* Termina nodo:27   */

      /* Empieza nodo:28 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(28)).setAttribute("nombre","structuralDefaultCanal" );
      ((Element)v.get(28)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(28));
      /* Termina nodo:28   */

      /* Empieza nodo:29 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(29)).setAttribute("nombre","structuralDefaultAcceso" );
      ((Element)v.get(29)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(29));
      /* Termina nodo:29   */

      /* Empieza nodo:30 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(30)).setAttribute("nombre","structuralDefaultSubacceso" );
      ((Element)v.get(30)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(30));
      /* Termina nodo:30   */

      /* Empieza nodo:31 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(31)).setAttribute("nombre","structuralDefaultSubgerenciaVentas" );
      ((Element)v.get(31)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(31));
      /* Termina nodo:31   */

      /* Empieza nodo:32 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(32)).setAttribute("nombre","structuralDefaultRegion" );
      ((Element)v.get(32)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(32));
      /* Termina nodo:32   */

      /* Empieza nodo:33 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(33)).setAttribute("nombre","structuralDefaultZona" );
      ((Element)v.get(33)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(33));
      /* Termina nodo:33   */

      /* Empieza nodo:34 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(34)).setAttribute("nombre","structuralDefaultSeccion" );
      ((Element)v.get(34)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(34));
      /* Termina nodo:34   */

      /* Empieza nodo:35 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(35)).setAttribute("nombre","structuralDefaultTerritorio" );
      ((Element)v.get(35)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(35));
      /* Termina nodo:35   */

      /* Empieza nodo:36 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(36)).setAttribute("nombre","clientCodeSize" );
      ((Element)v.get(36)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(36));
      /* Termina nodo:36   */

      /* Empieza nodo:37 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(37)).setAttribute("nombre","segPerioCorpoFormLayer" );
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
      ((Element)v.get(5)).appendChild((Element)v.get(37));

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
      ((Element)v.get(41)).setAttribute("src","b.gif" );
   }

   private void getXML180(Document doc) {
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
      ((Element)v.get(52)).setAttribute("cod","SegPerioCorpo.legend.label" );
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
      ((Element)v.get(60)).appendChild((Element)v.get(61));

      /* Empieza nodo:62 / Elemento padre: 61   */
   }

   private void getXML270(Document doc) {
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
      ((Element)v.get(67)).setAttribute("cod","SegPerioCorpo.id.label" );
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
      ((Element)v.get(70)).setAttribute("ontab","ejecutarAccionFoco('segPerioCorpoFrm',1, true)" );
      ((Element)v.get(70)).setAttribute("onshtab","ejecutarAccionFoco('segPerioCorpoFrm', 1, false)" );
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
      ((Element)v.get(81)).setAttribute("width","12" );
   }

   private void getXML360(Document doc) {
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
      ((Element)v.get(88)).setAttribute("nombre","tipeOidTipoPeriTdId" );
      ((Element)v.get(87)).appendChild((Element)v.get(88));

      /* Empieza nodo:89 / Elemento padre: 88   */
      v.add(doc.createElement("TABLE"));
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
      ((Element)v.get(92)).setAttribute("nombre","lbltipeOidTipoPeri" );
      ((Element)v.get(92)).setAttribute("id","datosTitle" );
      ((Element)v.get(92)).setAttribute("ancho","150" );
      ((Element)v.get(92)).setAttribute("alto","13" );
      ((Element)v.get(92)).setAttribute("cod","SegPerioCorpo.tipeOidTipoPeri.label" );
      ((Element)v.get(91)).appendChild((Element)v.get(92));
      /* Termina nodo:92   */
      /* Termina nodo:91   */
      /* Termina nodo:90   */

      /* Empieza nodo:93 / Elemento padre: 89   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(93)).setAttribute("nombre","tipeOidTipoPeriWidgetTrId" );
      ((Element)v.get(89)).appendChild((Element)v.get(93));

      /* Empieza nodo:94 / Elemento padre: 93   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(94)).setAttribute("align","left" );
      ((Element)v.get(94)).setAttribute("nowrap","true" );
      ((Element)v.get(93)).appendChild((Element)v.get(94));

      /* Empieza nodo:95 / Elemento padre: 94   */
      v.add(doc.createElement("COMBO"));
      ((Element)v.get(95)).setAttribute("nombre","tipeOidTipoPeri" );
      ((Element)v.get(95)).setAttribute("id","datosCampos" );
      ((Element)v.get(95)).setAttribute("multiple","N" );
      ((Element)v.get(95)).setAttribute("req","N" );
      ((Element)v.get(95)).setAttribute("size","1" );
      ((Element)v.get(95)).setAttribute("disabled","" );
      ((Element)v.get(95)).setAttribute("validacion","" );
      ((Element)v.get(95)).setAttribute("onchange","" );
      ((Element)v.get(95)).setAttribute("onfocus","" );
      ((Element)v.get(95)).setAttribute("valorinicial","" );
      ((Element)v.get(95)).setAttribute("textoinicial","" );
      ((Element)v.get(95)).setAttribute("ontab","ejecutarAccionFoco('segPerioCorpoFrm',2, true);" );
      ((Element)v.get(95)).setAttribute("onshtab","ejecutarAccionFoco('segPerioCorpoFrm',2, false);" );
      ((Element)v.get(94)).appendChild((Element)v.get(95));

      /* Empieza nodo:96 / Elemento padre: 95   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(95)).appendChild((Element)v.get(96));
      /* Termina nodo:96   */
      /* Termina nodo:95   */
      /* Termina nodo:94   */
      /* Termina nodo:93   */
      /* Termina nodo:89   */
      /* Termina nodo:88   */

      /* Empieza nodo:97 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(97)).setAttribute("nombre","tipeOidTipoPeriGapTdId" );
      ((Element)v.get(97)).setAttribute("nowrap","true" );
      ((Element)v.get(97)).setAttribute("class","datosCampos" );
      ((Element)v.get(87)).appendChild((Element)v.get(97));

      /* Empieza nodo:98 / Elemento padre: 97   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(98)).setAttribute("src","b.gif" );
      ((Element)v.get(98)).setAttribute("width","25" );
      ((Element)v.get(98)).setAttribute("height","8" );
      ((Element)v.get(97)).appendChild((Element)v.get(98));
      /* Termina nodo:98   */
      /* Termina nodo:97   */

      /* Empieza nodo:99 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(99)).setAttribute("nombre","codPeriTdId" );
      ((Element)v.get(87)).appendChild((Element)v.get(99));

      /* Empieza nodo:100 / Elemento padre: 99   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(100)).setAttribute("width","100%" );
      ((Element)v.get(100)).setAttribute("border","0" );
      ((Element)v.get(100)).setAttribute("cellspacing","0" );
   }

   private void getXML450(Document doc) {
      ((Element)v.get(100)).setAttribute("cellpadding","0" );
      ((Element)v.get(100)).setAttribute("align","left" );
      ((Element)v.get(99)).appendChild((Element)v.get(100));

      /* Empieza nodo:101 / Elemento padre: 100   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(100)).appendChild((Element)v.get(101));

      /* Empieza nodo:102 / Elemento padre: 101   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(102)).setAttribute("valign","top" );
      ((Element)v.get(102)).setAttribute("height","13" );
      ((Element)v.get(101)).appendChild((Element)v.get(102));

      /* Empieza nodo:103 / Elemento padre: 102   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(103)).setAttribute("nombre","lblCodPeri" );
      ((Element)v.get(103)).setAttribute("alto","13" );
      ((Element)v.get(103)).setAttribute("filas","1" );
      ((Element)v.get(103)).setAttribute("id","datosTitle" );
      ((Element)v.get(103)).setAttribute("cod","SegPerioCorpo.codPeri.label" );
      ((Element)v.get(102)).appendChild((Element)v.get(103));
      /* Termina nodo:103   */
      /* Termina nodo:102   */
      /* Termina nodo:101   */

      /* Empieza nodo:104 / Elemento padre: 100   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(104)).setAttribute("nombre","codPeriWidgetTrId" );
      ((Element)v.get(100)).appendChild((Element)v.get(104));

      /* Empieza nodo:105 / Elemento padre: 104   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(105)).setAttribute("align","left" );
      ((Element)v.get(105)).setAttribute("nowrap","true" );
      ((Element)v.get(104)).appendChild((Element)v.get(105));

      /* Empieza nodo:106 / Elemento padre: 105   */
      v.add(doc.createElement("TEXT"));
      ((Element)v.get(106)).setAttribute("nombre","codPeri" );
      ((Element)v.get(106)).setAttribute("id","datosCampos" );
      ((Element)v.get(106)).setAttribute("trim","S" );
      ((Element)v.get(106)).setAttribute("max","6" );
      ((Element)v.get(106)).setAttribute("onchange","" );
      ((Element)v.get(106)).setAttribute("req","N" );
      ((Element)v.get(106)).setAttribute("size","6" );
      ((Element)v.get(106)).setAttribute("valor","" );
      ((Element)v.get(106)).setAttribute("validacion","" );
      ((Element)v.get(106)).setAttribute("disabled","" );
      ((Element)v.get(106)).setAttribute("onblur","" );
      ((Element)v.get(106)).setAttribute("ontab","ejecutarAccionFoco('segPerioCorpoFrm',3, true)" );
      ((Element)v.get(106)).setAttribute("onshtab","ejecutarAccionFoco('segPerioCorpoFrm', 3, false)" );
      ((Element)v.get(105)).appendChild((Element)v.get(106));
      /* Termina nodo:106   */
      /* Termina nodo:105   */
      /* Termina nodo:104   */
      /* Termina nodo:100   */
      /* Termina nodo:99   */

      /* Empieza nodo:107 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(107)).setAttribute("nombre","codPeriGapTdId" );
      ((Element)v.get(107)).setAttribute("nowrap","true" );
      ((Element)v.get(107)).setAttribute("class","datosCampos" );
      ((Element)v.get(87)).appendChild((Element)v.get(107));

      /* Empieza nodo:108 / Elemento padre: 107   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(108)).setAttribute("src","b.gif" );
      ((Element)v.get(108)).setAttribute("width","25" );
      ((Element)v.get(108)).setAttribute("height","8" );
      ((Element)v.get(107)).appendChild((Element)v.get(108));
      /* Termina nodo:108   */
      /* Termina nodo:107   */

      /* Empieza nodo:109 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(109)).setAttribute("nombre","DescripcionTdId" );
      ((Element)v.get(87)).appendChild((Element)v.get(109));

      /* Empieza nodo:110 / Elemento padre: 109   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(110)).setAttribute("width","100%" );
      ((Element)v.get(110)).setAttribute("border","0" );
      ((Element)v.get(110)).setAttribute("cellspacing","0" );
      ((Element)v.get(110)).setAttribute("cellpadding","0" );
      ((Element)v.get(110)).setAttribute("align","left" );
      ((Element)v.get(109)).appendChild((Element)v.get(110));

      /* Empieza nodo:111 / Elemento padre: 110   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(110)).appendChild((Element)v.get(111));

      /* Empieza nodo:112 / Elemento padre: 111   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(112)).setAttribute("valign","top" );
      ((Element)v.get(112)).setAttribute("height","13" );
      ((Element)v.get(111)).appendChild((Element)v.get(112));

      /* Empieza nodo:113 / Elemento padre: 112   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(113)).setAttribute("nombre","lblDescripcion" );
      ((Element)v.get(113)).setAttribute("alto","13" );
      ((Element)v.get(113)).setAttribute("filas","1" );
      ((Element)v.get(113)).setAttribute("id","datosTitle" );
      ((Element)v.get(113)).setAttribute("cod","SegPerioCorpo.Descripcion.label" );
      ((Element)v.get(112)).appendChild((Element)v.get(113));
      /* Termina nodo:113   */
      /* Termina nodo:112   */

      /* Empieza nodo:114 / Elemento padre: 111   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(114)).setAttribute("nombre","DescripcionTdLocalizationButtonGapHeader" );
      ((Element)v.get(114)).setAttribute("colspan","2" );
      ((Element)v.get(111)).appendChild((Element)v.get(114));
      /* Termina nodo:114   */
      /* Termina nodo:111   */

      /* Empieza nodo:115 / Elemento padre: 110   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(115)).setAttribute("nombre","DescripcionWidgetTrId" );
      ((Element)v.get(110)).appendChild((Element)v.get(115));

      /* Empieza nodo:116 / Elemento padre: 115   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(116)).setAttribute("align","left" );
      ((Element)v.get(116)).setAttribute("nowrap","true" );
      ((Element)v.get(115)).appendChild((Element)v.get(116));

      /* Empieza nodo:117 / Elemento padre: 116   */
      v.add(doc.createElement("TEXT"));
      ((Element)v.get(117)).setAttribute("nombre","Descripcion" );
      ((Element)v.get(117)).setAttribute("id","datosCampos" );
      ((Element)v.get(117)).setAttribute("trim","S" );
      ((Element)v.get(117)).setAttribute("max","40" );
      ((Element)v.get(117)).setAttribute("onchange","" );
      ((Element)v.get(117)).setAttribute("req","N" );
      ((Element)v.get(117)).setAttribute("size","40" );
   }

   private void getXML540(Document doc) {
      ((Element)v.get(117)).setAttribute("valor","" );
      ((Element)v.get(117)).setAttribute("validacion","" );
      ((Element)v.get(117)).setAttribute("disabled","" );
      ((Element)v.get(117)).setAttribute("onblur","" );
      ((Element)v.get(117)).setAttribute("ontab","ejecutarAccionFoco('segPerioCorpoFrm',4, true)" );
      ((Element)v.get(117)).setAttribute("onshtab","ejecutarAccionFoco('segPerioCorpoFrm', 4, false)" );
      ((Element)v.get(116)).appendChild((Element)v.get(117));
      /* Termina nodo:117   */
      /* Termina nodo:116   */

      /* Empieza nodo:118 / Elemento padre: 115   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(115)).appendChild((Element)v.get(118));

      /* Empieza nodo:119 / Elemento padre: 118   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(119)).setAttribute("src","b.gif" );
      ((Element)v.get(119)).setAttribute("width","8" );
      ((Element)v.get(119)).setAttribute("height","8" );
      ((Element)v.get(118)).appendChild((Element)v.get(119));
      /* Termina nodo:119   */
      /* Termina nodo:118   */

      /* Empieza nodo:120 / Elemento padre: 115   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(120)).setAttribute("nombre","DescripcionTdLocalizationButton" );
      ((Element)v.get(120)).setAttribute("align","left" );
      ((Element)v.get(120)).setAttribute("nowrap","true" );
      ((Element)v.get(120)).setAttribute("valign","bottom" );
      ((Element)v.get(115)).appendChild((Element)v.get(120));

      /* Empieza nodo:121 / Elemento padre: 120   */
      v.add(doc.createElement("A"));
      ((Element)v.get(121)).setAttribute("id","DescripcionLocalizationButton" );
      ((Element)v.get(121)).setAttribute("href","javascript:openLocalizationDialog('segPerioCorpoFrm', 'Descripcion', 1);" );
      ((Element)v.get(121)).setAttribute("onKeyDown","javascript:mmgImgEventDispatcherForFocus(event, 'ejecutarAccionFoco(\"segPerioCorpoFrm\",4, true)', 'ejecutarAccionFoco(\"segPerioCorpoFrm\",4, false)')" );
      ((Element)v.get(120)).appendChild((Element)v.get(121));

      /* Empieza nodo:122 / Elemento padre: 121   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(122)).setAttribute("nombre","DescripcionLocalizationButton" );
      ((Element)v.get(122)).setAttribute("src","iconmultidioma.gif" );
      ((Element)v.get(122)).setAttribute("border","0" );
      ((Element)v.get(122)).setAttribute("width","21" );
      ((Element)v.get(122)).setAttribute("height","15" );
      ((Element)v.get(122)).setAttribute("class","main" );
      ((Element)v.get(121)).appendChild((Element)v.get(122));
      /* Termina nodo:122   */
      /* Termina nodo:121   */
      /* Termina nodo:120   */
      /* Termina nodo:115   */
      /* Termina nodo:110   */
      /* Termina nodo:109   */

      /* Empieza nodo:123 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(123)).setAttribute("nombre","DescripcionGapTdId" );
      ((Element)v.get(123)).setAttribute("nowrap","true" );
      ((Element)v.get(123)).setAttribute("class","datosCampos" );
      ((Element)v.get(87)).appendChild((Element)v.get(123));

      /* Empieza nodo:124 / Elemento padre: 123   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(124)).setAttribute("src","b.gif" );
      ((Element)v.get(124)).setAttribute("width","25" );
      ((Element)v.get(124)).setAttribute("height","8" );
      ((Element)v.get(123)).appendChild((Element)v.get(124));
      /* Termina nodo:124   */
      /* Termina nodo:123   */

      /* Empieza nodo:125 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(125)).setAttribute("nombre","valAnioTdId" );
      ((Element)v.get(87)).appendChild((Element)v.get(125));

      /* Empieza nodo:126 / Elemento padre: 125   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(126)).setAttribute("width","100%" );
      ((Element)v.get(126)).setAttribute("border","0" );
      ((Element)v.get(126)).setAttribute("cellspacing","0" );
      ((Element)v.get(126)).setAttribute("cellpadding","0" );
      ((Element)v.get(126)).setAttribute("align","left" );
      ((Element)v.get(125)).appendChild((Element)v.get(126));

      /* Empieza nodo:127 / Elemento padre: 126   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(126)).appendChild((Element)v.get(127));

      /* Empieza nodo:128 / Elemento padre: 127   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(128)).setAttribute("valign","top" );
      ((Element)v.get(128)).setAttribute("height","13" );
      ((Element)v.get(127)).appendChild((Element)v.get(128));

      /* Empieza nodo:129 / Elemento padre: 128   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(129)).setAttribute("nombre","lblValAnio" );
      ((Element)v.get(129)).setAttribute("alto","13" );
      ((Element)v.get(129)).setAttribute("filas","1" );
      ((Element)v.get(129)).setAttribute("id","datosTitle" );
      ((Element)v.get(129)).setAttribute("cod","SegPerioCorpo.valAnio.label" );
      ((Element)v.get(128)).appendChild((Element)v.get(129));
      /* Termina nodo:129   */
      /* Termina nodo:128   */
      /* Termina nodo:127   */

      /* Empieza nodo:130 / Elemento padre: 126   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(130)).setAttribute("nombre","valAnioWidgetTrId" );
      ((Element)v.get(126)).appendChild((Element)v.get(130));

      /* Empieza nodo:131 / Elemento padre: 130   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(131)).setAttribute("align","left" );
      ((Element)v.get(131)).setAttribute("nowrap","true" );
      ((Element)v.get(130)).appendChild((Element)v.get(131));

      /* Empieza nodo:132 / Elemento padre: 131   */
      v.add(doc.createElement("TEXT"));
      ((Element)v.get(132)).setAttribute("nombre","valAnio" );
      ((Element)v.get(132)).setAttribute("id","datosCampos" );
      ((Element)v.get(132)).setAttribute("trim","S" );
      ((Element)v.get(132)).setAttribute("max","4" );
      ((Element)v.get(132)).setAttribute("onchange","" );
      ((Element)v.get(132)).setAttribute("req","N" );
      ((Element)v.get(132)).setAttribute("size","4" );
      ((Element)v.get(132)).setAttribute("valor","" );
      ((Element)v.get(132)).setAttribute("validacion","" );
      ((Element)v.get(132)).setAttribute("disabled","" );
      ((Element)v.get(132)).setAttribute("onblur","" );
      ((Element)v.get(132)).setAttribute("ontab","ejecutarAccionFoco('segPerioCorpoFrm',5, true)" );
      ((Element)v.get(132)).setAttribute("onshtab","ejecutarAccionFoco('segPerioCorpoFrm', 5, false)" );
      ((Element)v.get(131)).appendChild((Element)v.get(132));
      /* Termina nodo:132   */
      /* Termina nodo:131   */
      /* Termina nodo:130   */
      /* Termina nodo:126   */
      /* Termina nodo:125   */

      /* Empieza nodo:133 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(133)).setAttribute("nombre","valAnioGapTdId" );
   }

   private void getXML630(Document doc) {
      ((Element)v.get(133)).setAttribute("nowrap","true" );
      ((Element)v.get(133)).setAttribute("class","datosCampos" );
      ((Element)v.get(87)).appendChild((Element)v.get(133));

      /* Empieza nodo:134 / Elemento padre: 133   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(134)).setAttribute("src","b.gif" );
      ((Element)v.get(134)).setAttribute("width","25" );
      ((Element)v.get(134)).setAttribute("height","8" );
      ((Element)v.get(133)).appendChild((Element)v.get(134));
      /* Termina nodo:134   */
      /* Termina nodo:133   */

      /* Empieza nodo:135 / Elemento padre: 87   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(135)).setAttribute("width","100%" );
      ((Element)v.get(87)).appendChild((Element)v.get(135));

      /* Empieza nodo:136 / Elemento padre: 135   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(136)).setAttribute("src","b.gif" );
      ((Element)v.get(135)).appendChild((Element)v.get(136));
      /* Termina nodo:136   */
      /* Termina nodo:135   */
      /* Termina nodo:87   */
      /* Termina nodo:86   */
      /* Termina nodo:85   */

      /* Empieza nodo:137 / Elemento padre: 82   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(137)).setAttribute("width","100%" );
      ((Element)v.get(82)).appendChild((Element)v.get(137));
      /* Termina nodo:137   */
      /* Termina nodo:82   */

      /* Empieza nodo:138 / Elemento padre: 53   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(138)).setAttribute("nombre","formGapTr1" );
      ((Element)v.get(53)).appendChild((Element)v.get(138));

      /* Empieza nodo:139 / Elemento padre: 138   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(139)).setAttribute("align","center" );
      ((Element)v.get(139)).setAttribute("width","8" );
      ((Element)v.get(138)).appendChild((Element)v.get(139));

      /* Empieza nodo:140 / Elemento padre: 139   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(140)).setAttribute("src","b.gif" );
      ((Element)v.get(140)).setAttribute("width","8" );
      ((Element)v.get(140)).setAttribute("height","8" );
      ((Element)v.get(139)).appendChild((Element)v.get(140));
      /* Termina nodo:140   */
      /* Termina nodo:139   */

      /* Empieza nodo:141 / Elemento padre: 138   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(138)).appendChild((Element)v.get(141));

      /* Empieza nodo:142 / Elemento padre: 141   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(142)).setAttribute("src","b.gif" );
      ((Element)v.get(142)).setAttribute("width","8" );
      ((Element)v.get(142)).setAttribute("height","8" );
      ((Element)v.get(141)).appendChild((Element)v.get(142));
      /* Termina nodo:142   */
      /* Termina nodo:141   */

      /* Empieza nodo:143 / Elemento padre: 138   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(143)).setAttribute("align","center" );
      ((Element)v.get(143)).setAttribute("width","8" );
      ((Element)v.get(138)).appendChild((Element)v.get(143));

      /* Empieza nodo:144 / Elemento padre: 143   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(144)).setAttribute("src","b.gif" );
      ((Element)v.get(144)).setAttribute("width","8" );
      ((Element)v.get(144)).setAttribute("height","8" );
      ((Element)v.get(143)).appendChild((Element)v.get(144));
      /* Termina nodo:144   */
      /* Termina nodo:143   */
      /* Termina nodo:138   */
      /* Termina nodo:53   */
      /* Termina nodo:50   */
      /* Termina nodo:49   */

      /* Empieza nodo:145 / Elemento padre: 46   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(145)).setAttribute("align","center" );
      ((Element)v.get(145)).setAttribute("width","12" );
      ((Element)v.get(46)).appendChild((Element)v.get(145));

      /* Empieza nodo:146 / Elemento padre: 145   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(146)).setAttribute("src","b.gif" );
      ((Element)v.get(146)).setAttribute("width","12" );
      ((Element)v.get(146)).setAttribute("height","12" );
      ((Element)v.get(145)).appendChild((Element)v.get(146));
      /* Termina nodo:146   */
      /* Termina nodo:145   */
      /* Termina nodo:46   */

      /* Empieza nodo:147 / Elemento padre: 38   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(147)).setAttribute("nombre","segPerioCorpoTrButtons" );
      ((Element)v.get(38)).appendChild((Element)v.get(147));

      /* Empieza nodo:148 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(148)).setAttribute("align","center" );
      ((Element)v.get(148)).setAttribute("width","12" );
      ((Element)v.get(147)).appendChild((Element)v.get(148));

      /* Empieza nodo:149 / Elemento padre: 148   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(149)).setAttribute("src","b.gif" );
      ((Element)v.get(149)).setAttribute("width","12" );
      ((Element)v.get(149)).setAttribute("height","12" );
      ((Element)v.get(148)).appendChild((Element)v.get(149));
      /* Termina nodo:149   */
      /* Termina nodo:148   */

      /* Empieza nodo:150 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(147)).appendChild((Element)v.get(150));

      /* Empieza nodo:151 / Elemento padre: 150   */
      v.add(doc.createElement("FIELDSET"));
      ((Element)v.get(150)).appendChild((Element)v.get(151));

      /* Empieza nodo:152 / Elemento padre: 151   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(152)).setAttribute("width","100%" );
      ((Element)v.get(152)).setAttribute("border","0" );
      ((Element)v.get(152)).setAttribute("align","center" );
      ((Element)v.get(152)).setAttribute("cellspacing","0" );
      ((Element)v.get(152)).setAttribute("cellpadding","0" );
      ((Element)v.get(151)).appendChild((Element)v.get(152));

      /* Empieza nodo:153 / Elemento padre: 152   */
      v.add(doc.createElement("TR"));
      ((Element)v.get(152)).appendChild((Element)v.get(153));

      /* Empieza nodo:154 / Elemento padre: 153   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(154)).setAttribute("class","tablaTitle" );
      ((Element)v.get(154)).setAttribute("nombre","segPerioCorpoTdQueryButton" );
      ((Element)v.get(153)).appendChild((Element)v.get(154));

      /* Empieza nodo:155 / Elemento padre: 154   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(155)).setAttribute("nombre","segPerioCorpoQueryButton" );
      ((Element)v.get(155)).setAttribute("cod","MMGGlobal.queryButton.label" );
      ((Element)v.get(155)).setAttribute("estado","false" );
      ((Element)v.get(155)).setAttribute("accion","segPerioCorpoFirstPage();" );
      ((Element)v.get(155)).setAttribute("tipo","html" );
      ((Element)v.get(155)).setAttribute("ID","botonContenido" );
   }

   private void getXML720(Document doc) {
      ((Element)v.get(154)).appendChild((Element)v.get(155));
      /* Termina nodo:155   */
      /* Termina nodo:154   */

      /* Empieza nodo:156 / Elemento padre: 153   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(156)).setAttribute("class","tablaTitle" );
      ((Element)v.get(156)).setAttribute("nombre","segPerioCorpoTdLovNullSelectionButton" );
      ((Element)v.get(156)).setAttribute("align","left" );
      ((Element)v.get(156)).setAttribute("width","100%" );
      ((Element)v.get(153)).appendChild((Element)v.get(156));

      /* Empieza nodo:157 / Elemento padre: 156   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(157)).setAttribute("src","b.gif" );
      ((Element)v.get(157)).setAttribute("height","8" );
      ((Element)v.get(157)).setAttribute("width","8" );
      ((Element)v.get(156)).appendChild((Element)v.get(157));
      /* Termina nodo:157   */

      /* Empieza nodo:158 / Elemento padre: 156   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(158)).setAttribute("nombre","segPerioCorpoLovNullButton" );
      ((Element)v.get(158)).setAttribute("ID","botonContenido" );
      ((Element)v.get(158)).setAttribute("tipo","html" );
      ((Element)v.get(158)).setAttribute("accion","segPerioCorpoLovNullSelectionAction();" );
      ((Element)v.get(158)).setAttribute("estado","true" );
      ((Element)v.get(158)).setAttribute("cod","MMGGlobal.lovNullButton.label" );
      ((Element)v.get(156)).appendChild((Element)v.get(158));
      /* Termina nodo:158   */
      /* Termina nodo:156   */
      /* Termina nodo:153   */
      /* Termina nodo:152   */
      /* Termina nodo:151   */
      /* Termina nodo:150   */

      /* Empieza nodo:159 / Elemento padre: 147   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(159)).setAttribute("align","center" );
      ((Element)v.get(159)).setAttribute("width","12" );
      ((Element)v.get(147)).appendChild((Element)v.get(159));

      /* Empieza nodo:160 / Elemento padre: 159   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(160)).setAttribute("src","b.gif" );
      ((Element)v.get(160)).setAttribute("width","12" );
      ((Element)v.get(160)).setAttribute("height","12" );
      ((Element)v.get(159)).appendChild((Element)v.get(160));
      /* Termina nodo:160   */
      /* Termina nodo:159   */
      /* Termina nodo:147   */
      /* Termina nodo:38   */
      /* Termina nodo:37   */

      /* Empieza nodo:161 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(161)).setAttribute("nombre","segPerioCorpoListLayer" );
      ((Element)v.get(161)).setAttribute("alto","310" );
      ((Element)v.get(161)).setAttribute("ancho","99%" );
      ((Element)v.get(161)).setAttribute("colorf","" );
      ((Element)v.get(161)).setAttribute("borde","0" );
      ((Element)v.get(161)).setAttribute("imagenf","" );
      ((Element)v.get(161)).setAttribute("repeat","" );
      ((Element)v.get(161)).setAttribute("padding","" );
      ((Element)v.get(161)).setAttribute("visibilidad","hidden" );
      ((Element)v.get(161)).setAttribute("contravsb","" );
      ((Element)v.get(161)).setAttribute("x","3" );
      ((Element)v.get(161)).setAttribute("y","" );
      ((Element)v.get(161)).setAttribute("zindex","" );
      ((Element)v.get(5)).appendChild((Element)v.get(161));

      /* Empieza nodo:162 / Elemento padre: 161   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(162)).setAttribute("nombre","segPerioCorpoList" );
      ((Element)v.get(162)).setAttribute("ancho","680" );
      ((Element)v.get(162)).setAttribute("alto","275" );
      ((Element)v.get(162)).setAttribute("x","12" );
      ((Element)v.get(162)).setAttribute("y","0" );
      ((Element)v.get(162)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(162)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(161)).appendChild((Element)v.get(162));

      /* Empieza nodo:163 / Elemento padre: 162   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(163)).setAttribute("precarga","S" );
      ((Element)v.get(163)).setAttribute("conROver","S" );
      ((Element)v.get(162)).appendChild((Element)v.get(163));

      /* Empieza nodo:164 / Elemento padre: 163   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(164)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(164)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(164)).setAttribute("seleccionado","btnLista2M.gif" );
      ((Element)v.get(164)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(163)).appendChild((Element)v.get(164));
      /* Termina nodo:164   */

      /* Empieza nodo:165 / Elemento padre: 163   */
      v.add(doc.createElement("BTNMINIMIZAR"));
      ((Element)v.get(165)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(165)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(165)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(165)).setAttribute("maximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(163)).appendChild((Element)v.get(165));
      /* Termina nodo:165   */
      /* Termina nodo:163   */

      /* Empieza nodo:166 / Elemento padre: 162   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(162)).appendChild((Element)v.get(166));

      /* Empieza nodo:167 / Elemento padre: 166   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(167)).setAttribute("borde","1" );
      ((Element)v.get(167)).setAttribute("horizDatos","1" );
      ((Element)v.get(167)).setAttribute("horizCabecera","1" );
      ((Element)v.get(167)).setAttribute("vertical","1" );
      ((Element)v.get(167)).setAttribute("horizTitulo","1" );
      ((Element)v.get(167)).setAttribute("horizBase","1" );
      ((Element)v.get(166)).appendChild((Element)v.get(167));
      /* Termina nodo:167   */

      /* Empieza nodo:168 / Elemento padre: 166   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(168)).setAttribute("borde","#999999" );
      ((Element)v.get(168)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(168)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(168)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(168)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(168)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(168)).setAttribute("horizBase","#999999" );
      ((Element)v.get(166)).appendChild((Element)v.get(168));
      /* Termina nodo:168   */
      /* Termina nodo:166   */

      /* Empieza nodo:169 / Elemento padre: 162   */
      v.add(doc.createElement("TITULO"));
      ((Element)v.get(169)).setAttribute("colFondo","#CECFCE" );
   }

   private void getXML810(Document doc) {
      ((Element)v.get(169)).setAttribute("alto","22" );
      ((Element)v.get(169)).setAttribute("imgFondo","" );
      ((Element)v.get(169)).setAttribute("cod","00135" );
      ((Element)v.get(169)).setAttribute("ID","datosTitle" );
      ((Element)v.get(162)).appendChild((Element)v.get(169));
      /* Termina nodo:169   */

      /* Empieza nodo:170 / Elemento padre: 162   */
      v.add(doc.createElement("BASE"));
      ((Element)v.get(170)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(170)).setAttribute("alto","22" );
      ((Element)v.get(170)).setAttribute("imgFondo","" );
      ((Element)v.get(162)).appendChild((Element)v.get(170));
      /* Termina nodo:170   */

      /* Empieza nodo:171 / Elemento padre: 162   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(171)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(171)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(171)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(171)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(171)).setAttribute("AnchoMinimizadas","20" );
      ((Element)v.get(162)).appendChild((Element)v.get(171));

      /* Empieza nodo:172 / Elemento padre: 171   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(172)).setAttribute("ancho","100" );
      ((Element)v.get(172)).setAttribute("minimizable","S" );
      ((Element)v.get(172)).setAttribute("minimizada","N" );
      ((Element)v.get(171)).appendChild((Element)v.get(172));
      /* Termina nodo:172   */

      /* Empieza nodo:173 / Elemento padre: 171   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(173)).setAttribute("ancho","100" );
      ((Element)v.get(173)).setAttribute("minimizable","S" );
      ((Element)v.get(173)).setAttribute("minimizada","N" );
      ((Element)v.get(171)).appendChild((Element)v.get(173));
      /* Termina nodo:173   */

      /* Empieza nodo:174 / Elemento padre: 171   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(174)).setAttribute("ancho","100" );
      ((Element)v.get(174)).setAttribute("minimizable","S" );
      ((Element)v.get(174)).setAttribute("minimizada","N" );
      ((Element)v.get(171)).appendChild((Element)v.get(174));
      /* Termina nodo:174   */

      /* Empieza nodo:175 / Elemento padre: 171   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(175)).setAttribute("ancho","100" );
      ((Element)v.get(175)).setAttribute("minimizable","S" );
      ((Element)v.get(175)).setAttribute("minimizada","N" );
      ((Element)v.get(171)).appendChild((Element)v.get(175));
      /* Termina nodo:175   */
      /* Termina nodo:171   */

      /* Empieza nodo:176 / Elemento padre: 162   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(176)).setAttribute("height","20" );
      ((Element)v.get(176)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(176)).setAttribute("imgFondo","" );
      ((Element)v.get(176)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(162)).appendChild((Element)v.get(176));

      /* Empieza nodo:177 / Elemento padre: 176   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(177)).setAttribute("colFondo","" );
      ((Element)v.get(177)).setAttribute("ID","EstCab" );
      ((Element)v.get(177)).setAttribute("cod","SegPerioCorpo.tipeOidTipoPeri.label" );
      ((Element)v.get(176)).appendChild((Element)v.get(177));
      /* Termina nodo:177   */

      /* Empieza nodo:178 / Elemento padre: 176   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(178)).setAttribute("colFondo","" );
      ((Element)v.get(178)).setAttribute("ID","EstCab" );
      ((Element)v.get(178)).setAttribute("cod","SegPerioCorpo.codPeri.label" );
      ((Element)v.get(176)).appendChild((Element)v.get(178));
      /* Termina nodo:178   */

      /* Empieza nodo:179 / Elemento padre: 176   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(179)).setAttribute("colFondo","" );
      ((Element)v.get(179)).setAttribute("ID","EstCab" );
      ((Element)v.get(179)).setAttribute("cod","SegPerioCorpo.Descripcion.label" );
      ((Element)v.get(176)).appendChild((Element)v.get(179));
      /* Termina nodo:179   */

      /* Empieza nodo:180 / Elemento padre: 176   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(180)).setAttribute("colFondo","" );
      ((Element)v.get(180)).setAttribute("ID","EstCab" );
      ((Element)v.get(180)).setAttribute("cod","SegPerioCorpo.valAnio.label" );
      ((Element)v.get(176)).appendChild((Element)v.get(180));
      /* Termina nodo:180   */
      /* Termina nodo:176   */

      /* Empieza nodo:181 / Elemento padre: 162   */
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(181)).setAttribute("alto","22" );
      ((Element)v.get(181)).setAttribute("accion","" );
      ((Element)v.get(181)).setAttribute("tipoEnvio","seleccion" );
      ((Element)v.get(181)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(181)).setAttribute("maxSel","1" );
      ((Element)v.get(181)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(181)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(181)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(181)).setAttribute("onLoad","" );
      ((Element)v.get(181)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(162)).appendChild((Element)v.get(181));

      /* Empieza nodo:182 / Elemento padre: 181   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(182)).setAttribute("tipo","texto" );
      ((Element)v.get(182)).setAttribute("ID","EstDat" );
      ((Element)v.get(181)).appendChild((Element)v.get(182));
      /* Termina nodo:182   */

      /* Empieza nodo:183 / Elemento padre: 181   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(183)).setAttribute("tipo","texto" );
      ((Element)v.get(183)).setAttribute("ID","EstDat2" );
      ((Element)v.get(181)).appendChild((Element)v.get(183));
      /* Termina nodo:183   */

      /* Empieza nodo:184 / Elemento padre: 181   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(184)).setAttribute("tipo","texto" );
      ((Element)v.get(184)).setAttribute("ID","EstDat" );
      ((Element)v.get(181)).appendChild((Element)v.get(184));
      /* Termina nodo:184   */

      /* Empieza nodo:185 / Elemento padre: 181   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(185)).setAttribute("tipo","texto" );
      ((Element)v.get(185)).setAttribute("ID","EstDat2" );
   }

   private void getXML900(Document doc) {
      ((Element)v.get(181)).appendChild((Element)v.get(185));
      /* Termina nodo:185   */
      /* Termina nodo:181   */

      /* Empieza nodo:186 / Elemento padre: 162   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(162)).appendChild((Element)v.get(186));
      /* Termina nodo:186   */
      /* Termina nodo:162   */
      /* Termina nodo:161   */

      /* Empieza nodo:187 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(187)).setAttribute("nombre","segPerioCorpoListButtonsLayer" );
      ((Element)v.get(187)).setAttribute("visibilidad","hidden" );
      ((Element)v.get(187)).setAttribute("alto","30" );
      ((Element)v.get(187)).setAttribute("ancho","98%" );
      ((Element)v.get(187)).setAttribute("borde","n" );
      ((Element)v.get(187)).setAttribute("imagenf","" );
      ((Element)v.get(187)).setAttribute("repeat","" );
      ((Element)v.get(187)).setAttribute("padding","0" );
      ((Element)v.get(187)).setAttribute("contravsb","" );
      ((Element)v.get(187)).setAttribute("x","16" );
      ((Element)v.get(187)).setAttribute("y","" );
      ((Element)v.get(187)).setAttribute("zindex","" );
      ((Element)v.get(5)).appendChild((Element)v.get(187));

      /* Empieza nodo:188 / Elemento padre: 187   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(188)).setAttribute("nombre","toolbarSeparatorLayer" );
      ((Element)v.get(188)).setAttribute("visibilidad","inherit" );
      ((Element)v.get(188)).setAttribute("alto","23" );
      ((Element)v.get(188)).setAttribute("ancho","1" );
      ((Element)v.get(188)).setAttribute("borde","1" );
      ((Element)v.get(188)).setAttribute("imagenf","" );
      ((Element)v.get(188)).setAttribute("repeat","" );
      ((Element)v.get(188)).setAttribute("padding","0" );
      ((Element)v.get(188)).setAttribute("contravsb","" );
      ((Element)v.get(188)).setAttribute("x","56" );
      ((Element)v.get(188)).setAttribute("y","0" );
      ((Element)v.get(188)).setAttribute("zindex","" );
      ((Element)v.get(188)).setAttribute("colborde","#999999" );
      ((Element)v.get(187)).appendChild((Element)v.get(188));
      /* Termina nodo:188   */

      /* Empieza nodo:189 / Elemento padre: 187   */
      v.add(doc.createElement("TABLE"));
      ((Element)v.get(189)).setAttribute("width","100%" );
      ((Element)v.get(189)).setAttribute("border","0" );
      ((Element)v.get(189)).setAttribute("cellspacing","1" );
      ((Element)v.get(189)).setAttribute("cellpadding","0" );
      ((Element)v.get(187)).appendChild((Element)v.get(189));

      /* Empieza nodo:190 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(189)).appendChild((Element)v.get(190));

      /* Empieza nodo:191 / Elemento padre: 190   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(191)).setAttribute("src","b.gif" );
      ((Element)v.get(191)).setAttribute("height","22" );
      ((Element)v.get(191)).setAttribute("width","5" );
      ((Element)v.get(190)).appendChild((Element)v.get(191));
      /* Termina nodo:191   */
      /* Termina nodo:190   */

      /* Empieza nodo:192 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(189)).appendChild((Element)v.get(192));

      /* Empieza nodo:193 / Elemento padre: 192   */
      v.add(doc.createElement("BOTONERA"));
      ((Element)v.get(193)).setAttribute("nombre","segPerioCorpoPaginationButtonBar" );
      ((Element)v.get(193)).setAttribute("tipo","H" );
      ((Element)v.get(193)).setAttribute("x","0" );
      ((Element)v.get(193)).setAttribute("y","0" );
      ((Element)v.get(192)).appendChild((Element)v.get(193));

      /* Empieza nodo:194 / Elemento padre: 193   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(194)).setAttribute("nombre","segPerioCorpoFirstPageButton" );
      ((Element)v.get(194)).setAttribute("funcion","segPerioCorpoFirstPage();" );
      ((Element)v.get(194)).setAttribute("off","primera_over0.gif" );
      ((Element)v.get(194)).setAttribute("on","primera_over0.gif" );
      ((Element)v.get(194)).setAttribute("disable","primera_on0.gif" );
      ((Element)v.get(194)).setAttribute("estado","inactivo" );
      ((Element)v.get(193)).appendChild((Element)v.get(194));
      /* Termina nodo:194   */

      /* Empieza nodo:195 / Elemento padre: 193   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(195)).setAttribute("nombre","segPerioCorpoFirstPageButtonGapTd" );
      ((Element)v.get(193)).appendChild((Element)v.get(195));

      /* Empieza nodo:196 / Elemento padre: 195   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(196)).setAttribute("src","b.gif" );
      ((Element)v.get(196)).setAttribute("height","8" );
      ((Element)v.get(196)).setAttribute("width","5" );
      ((Element)v.get(195)).appendChild((Element)v.get(196));
      /* Termina nodo:196   */
      /* Termina nodo:195   */

      /* Empieza nodo:197 / Elemento padre: 193   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(197)).setAttribute("nombre","segPerioCorpoPreviousPageButton" );
      ((Element)v.get(197)).setAttribute("funcion","segPerioCorpoPreviousPage();" );
      ((Element)v.get(197)).setAttribute("off","retroceder_over0.gif" );
      ((Element)v.get(197)).setAttribute("on","retroceder_over0.gif" );
      ((Element)v.get(197)).setAttribute("disable","retroceder_on0.gif" );
      ((Element)v.get(197)).setAttribute("estado","inactivo" );
      ((Element)v.get(193)).appendChild((Element)v.get(197));
      /* Termina nodo:197   */

      /* Empieza nodo:198 / Elemento padre: 193   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(198)).setAttribute("nombre","segPerioCorpoPreviousPageButtonGapTd" );
      ((Element)v.get(193)).appendChild((Element)v.get(198));

      /* Empieza nodo:199 / Elemento padre: 198   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(199)).setAttribute("src","b.gif" );
      ((Element)v.get(199)).setAttribute("height","8" );
      ((Element)v.get(199)).setAttribute("width","8" );
      ((Element)v.get(198)).appendChild((Element)v.get(199));
      /* Termina nodo:199   */
      /* Termina nodo:198   */

      /* Empieza nodo:200 / Elemento padre: 193   */
      v.add(doc.createElement("BTN"));
      ((Element)v.get(200)).setAttribute("nombre","segPerioCorpoNextPageButton" );
      ((Element)v.get(200)).setAttribute("funcion","segPerioCorpoNextPage();" );
      ((Element)v.get(200)).setAttribute("off","avanzar_over0.gif" );
      ((Element)v.get(200)).setAttribute("on","avanzar_over0.gif" );
   }

   private void getXML990(Document doc) {
      ((Element)v.get(200)).setAttribute("disable","avanzar_on0.gif" );
      ((Element)v.get(200)).setAttribute("estado","inactivo" );
      ((Element)v.get(193)).appendChild((Element)v.get(200));
      /* Termina nodo:200   */
      /* Termina nodo:193   */
      /* Termina nodo:192   */

      /* Empieza nodo:201 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(189)).appendChild((Element)v.get(201));

      /* Empieza nodo:202 / Elemento padre: 201   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(202)).setAttribute("src","b.gif" );
      ((Element)v.get(202)).setAttribute("height","22" );
      ((Element)v.get(202)).setAttribute("width","19" );
      ((Element)v.get(201)).appendChild((Element)v.get(202));
      /* Termina nodo:202   */
      /* Termina nodo:201   */

      /* Empieza nodo:203 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(203)).setAttribute("class","tablaTitle" );
      ((Element)v.get(203)).setAttribute("nombre","segPerioCorpoUpdateButtonTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(203));

      /* Empieza nodo:204 / Elemento padre: 203   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(204)).setAttribute("nombre","segPerioCorpoUpdateButton" );
      ((Element)v.get(204)).setAttribute("ID","botonContenido" );
      ((Element)v.get(204)).setAttribute("tipo","html" );
      ((Element)v.get(204)).setAttribute("accion","segPerioCorpoUpdateSelection();" );
      ((Element)v.get(204)).setAttribute("estado","false" );
      ((Element)v.get(204)).setAttribute("cod","MMGGlobal.updateButton.label" );
      ((Element)v.get(203)).appendChild((Element)v.get(204));
      /* Termina nodo:204   */
      /* Termina nodo:203   */

      /* Empieza nodo:205 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(205)).setAttribute("nombre","segPerioCorpoUpdateButtonGapTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(205));

      /* Empieza nodo:206 / Elemento padre: 205   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(206)).setAttribute("src","b.gif" );
      ((Element)v.get(206)).setAttribute("height","8" );
      ((Element)v.get(206)).setAttribute("width","10" );
      ((Element)v.get(205)).appendChild((Element)v.get(206));
      /* Termina nodo:206   */
      /* Termina nodo:205   */

      /* Empieza nodo:207 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(207)).setAttribute("class","tablaTitle" );
      ((Element)v.get(207)).setAttribute("nombre","segPerioCorpoViewForRemoveButtonTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(207));

      /* Empieza nodo:208 / Elemento padre: 207   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(208)).setAttribute("nombre","segPerioCorpoViewForRemoveButton" );
      ((Element)v.get(208)).setAttribute("ID","botonContenido" );
      ((Element)v.get(208)).setAttribute("tipo","html" );
      ((Element)v.get(208)).setAttribute("accion","segPerioCorpoViewSelection();" );
      ((Element)v.get(208)).setAttribute("estado","false" );
      ((Element)v.get(208)).setAttribute("cod","MMGGlobal.viewButton.label" );
      ((Element)v.get(207)).appendChild((Element)v.get(208));
      /* Termina nodo:208   */
      /* Termina nodo:207   */

      /* Empieza nodo:209 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(209)).setAttribute("nombre","segPerioCorpoViewForRemoveButtonGapTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(209));

      /* Empieza nodo:210 / Elemento padre: 209   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(210)).setAttribute("src","b.gif" );
      ((Element)v.get(210)).setAttribute("height","8" );
      ((Element)v.get(210)).setAttribute("width","10" );
      ((Element)v.get(209)).appendChild((Element)v.get(210));
      /* Termina nodo:210   */
      /* Termina nodo:209   */

      /* Empieza nodo:211 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(211)).setAttribute("class","tablaTitle" );
      ((Element)v.get(211)).setAttribute("nombre","segPerioCorpoLovSelectButtonTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(211));

      /* Empieza nodo:212 / Elemento padre: 211   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(212)).setAttribute("nombre","segPerioCorpoLovSelectButton" );
      ((Element)v.get(212)).setAttribute("ID","botonContenido" );
      ((Element)v.get(212)).setAttribute("tipo","html" );
      ((Element)v.get(212)).setAttribute("accion","segPerioCorpoLovSelectionAction();" );
      ((Element)v.get(212)).setAttribute("estado","true" );
      ((Element)v.get(212)).setAttribute("cod","MMGGlobal.lovSelectButton.label" );
      ((Element)v.get(211)).appendChild((Element)v.get(212));
      /* Termina nodo:212   */
      /* Termina nodo:211   */

      /* Empieza nodo:213 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(213)).setAttribute("nombre","segPerioCorpoLovSelectButtonGapTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(213));

      /* Empieza nodo:214 / Elemento padre: 213   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(214)).setAttribute("src","b.gif" );
      ((Element)v.get(214)).setAttribute("height","8" );
      ((Element)v.get(214)).setAttribute("width","10" );
      ((Element)v.get(213)).appendChild((Element)v.get(214));
      /* Termina nodo:214   */
      /* Termina nodo:213   */

      /* Empieza nodo:215 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(215)).setAttribute("class","tablaTitle" );
      ((Element)v.get(215)).setAttribute("nombre","segPerioCorpoViewButtonTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(215));

      /* Empieza nodo:216 / Elemento padre: 215   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(216)).setAttribute("nombre","segPerioCorpoViewButton" );
      ((Element)v.get(216)).setAttribute("ID","botonContenido" );
      ((Element)v.get(216)).setAttribute("tipo","html" );
      ((Element)v.get(216)).setAttribute("accion","segPerioCorpoViewSelection();" );
      ((Element)v.get(216)).setAttribute("estado","false" );
      ((Element)v.get(216)).setAttribute("cod","MMGGlobal.viewButton.label" );
      ((Element)v.get(215)).appendChild((Element)v.get(216));
      /* Termina nodo:216   */
      /* Termina nodo:215   */

      /* Empieza nodo:217 / Elemento padre: 189   */
      v.add(doc.createElement("TD"));
      ((Element)v.get(217)).setAttribute("nombre","segPerioCorpoViewButtonGapTd" );
      ((Element)v.get(189)).appendChild((Element)v.get(217));

      /* Empieza nodo:218 / Elemento padre: 217   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(218)).setAttribute("src","b.gif" );
      ((Element)v.get(218)).setAttribute("height","8" );
      ((Element)v.get(218)).setAttribute("width","10" );
      ((Element)v.get(217)).appendChild((Element)v.get(218));
      /* Termina nodo:218   */
      /* Termina nodo:217   */

      /* Empieza nodo:219 / Elemento padre: 189   */
   }

   private void getXML1080(Document doc) {
      v.add(doc.createElement("TD"));
      ((Element)v.get(219)).setAttribute("width","100%" );
      ((Element)v.get(189)).appendChild((Element)v.get(219));
      /* Termina nodo:219   */
      /* Termina nodo:189   */
      /* Termina nodo:187   */
      /* Termina nodo:5   */


   }

}
