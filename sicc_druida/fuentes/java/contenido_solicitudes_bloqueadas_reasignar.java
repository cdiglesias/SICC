
import org.w3c.dom.*;
import java.util.ArrayList;

public class contenido_solicitudes_bloqueadas_reasignar  implements es.indra.druida.base.ObjetoXML {
   private ArrayList v = new ArrayList();

   public Element getXML (Document doc){
      

      getXML0(doc);
         

      getXML90(doc);
         

      getXML180(doc);
         

      getXML270(doc);
         

      getXML360(doc);
         

      getXML450(doc);
         

      getXML540(doc);
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","contenido_solicitudes_bloqueadas_reasignar" );
      ((Element)v.get(0)).setAttribute("titulo","" );
      ((Element)v.get(0)).setAttribute("cod","0287" );
      ((Element)v.get(0)).setAttribute("estilos","estilosB3.css" );
      ((Element)v.get(0)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(0)).setAttribute("msgle","" );
      ((Element)v.get(0)).setAttribute("onload","onLoadPag();" );
      ((Element)v.get(0)).setAttribute("xml:lang","es" );
      ((Element)v.get(0)).setAttribute("repeat","N" );

      /* Empieza nodo:1 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(1)).setAttribute("src","sicc_util.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(1));
      /* Termina nodo:1   */

      /* Empieza nodo:2 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(2)).setAttribute("src","PaginacionSicc.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(2));
      /* Termina nodo:2   */

      /* Empieza nodo:3 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(3)).setAttribute("src","DruidaTransactionMare.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(3));
      /* Termina nodo:3   */

      /* Empieza nodo:4 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(4)).setAttribute("src","contenido_solicitudes_bloqueadas_reasignar.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(4));
      /* Termina nodo:4   */

      /* Empieza nodo:5 / Elemento padre: 0   */
      v.add(doc.createElement("JAVASCRIPT"));
      ((Element)v.get(0)).appendChild((Element)v.get(5));
      /* Termina nodo:5   */

      /* Empieza nodo:6 / Elemento padre: 0   */
      v.add(doc.createElement("VALIDACION"));
      ((Element)v.get(0)).appendChild((Element)v.get(6));

      /* Empieza nodo:7 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(7)).setAttribute("name","areaObservacionesAprob" );
      ((Element)v.get(7)).setAttribute("required","false" );
      ((Element)v.get(7)).setAttribute("cod","950" );
      ((Element)v.get(7)).setAttribute("format","t" );
      ((Element)v.get(7)).setAttribute("min","0" );
      ((Element)v.get(7)).setAttribute("max","100" );
      ((Element)v.get(6)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */
      /* Termina nodo:6   */

      /* Empieza nodo:8 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(8)).setAttribute("nombre","frmContenido" );
      ((Element)v.get(8)).setAttribute("oculto","S" );
      ((Element)v.get(0)).appendChild((Element)v.get(8));

      /* Empieza nodo:9 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(9)).setAttribute("nombre","accion" );
      ((Element)v.get(9)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(10)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(10)).setAttribute("valor","LPSolicitudesBloqueadas" );
      ((Element)v.get(8)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */

      /* Empieza nodo:11 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(11)).setAttribute("nombre","errCodigo" );
      ((Element)v.get(11)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(11));
      /* Termina nodo:11   */

      /* Empieza nodo:12 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(12)).setAttribute("nombre","errDescripcion" );
      ((Element)v.get(12)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(12));
      /* Termina nodo:12   */

      /* Empieza nodo:13 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(13)).setAttribute("nombre","pais" );
      ((Element)v.get(13)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(13));
      /* Termina nodo:13   */

      /* Empieza nodo:14 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(14)).setAttribute("nombre","varNivelJerarquico" );
      ((Element)v.get(14)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(14));
      /* Termina nodo:14   */

      /* Empieza nodo:15 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(15)).setAttribute("nombre","varEjecutivo" );
      ((Element)v.get(15)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(15));
      /* Termina nodo:15   */

      /* Empieza nodo:16 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(16)).setAttribute("nombre","oidSolicitudBloqueada" );
      ((Element)v.get(16)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(16));
      /* Termina nodo:16   */

      /* Empieza nodo:17 / Elemento padre: 8   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(17)).setAttribute("nombre","seleccion" );
      ((Element)v.get(17)).setAttribute("valor","" );
      ((Element)v.get(8)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */

      /* Empieza nodo:18 / Elemento padre: 8   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(18)).setAttribute("nombre","capaContenido" );
      ((Element)v.get(8)).appendChild((Element)v.get(18));

      /* Empieza nodo:19 / Elemento padre: 18   */
      v.add(doc.createElement("table"));
      ((Element)v.get(19)).setAttribute("width","100%" );
      ((Element)v.get(19)).setAttribute("border","0" );
      ((Element)v.get(19)).setAttribute("cellspacing","0" );
      ((Element)v.get(19)).setAttribute("cellpadding","0" );
      ((Element)v.get(18)).appendChild((Element)v.get(19));

      /* Empieza nodo:20 / Elemento padre: 19   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(19)).appendChild((Element)v.get(20));

      /* Empieza nodo:21 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
      ((Element)v.get(21)).setAttribute("width","12" );
      ((Element)v.get(21)).setAttribute("align","center" );
      ((Element)v.get(20)).appendChild((Element)v.get(21));

      /* Empieza nodo:22 / Elemento padre: 21   */
      v.add(doc.createElement("IMG"));
   }

   private void getXML90(Document doc) {
      ((Element)v.get(22)).setAttribute("src","b.gif" );
      ((Element)v.get(22)).setAttribute("width","12" );
      ((Element)v.get(22)).setAttribute("height","12" );
      ((Element)v.get(21)).appendChild((Element)v.get(22));
      /* Termina nodo:22   */
      /* Termina nodo:21   */

      /* Empieza nodo:23 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
      ((Element)v.get(23)).setAttribute("width","750" );
      ((Element)v.get(20)).appendChild((Element)v.get(23));

      /* Empieza nodo:24 / Elemento padre: 23   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(24)).setAttribute("src","b.gif" );
      ((Element)v.get(23)).appendChild((Element)v.get(24));
      /* Termina nodo:24   */
      /* Termina nodo:23   */

      /* Empieza nodo:25 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
      ((Element)v.get(25)).setAttribute("width","12" );
      ((Element)v.get(20)).appendChild((Element)v.get(25));

      /* Empieza nodo:26 / Elemento padre: 25   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(26)).setAttribute("src","b.gif" );
      ((Element)v.get(26)).setAttribute("width","12" );
      ((Element)v.get(26)).setAttribute("height","1" );
      ((Element)v.get(25)).appendChild((Element)v.get(26));
      /* Termina nodo:26   */
      /* Termina nodo:25   */
      /* Termina nodo:20   */

      /* Empieza nodo:27 / Elemento padre: 19   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(19)).appendChild((Element)v.get(27));

      /* Empieza nodo:28 / Elemento padre: 27   */
      v.add(doc.createElement("td"));
      ((Element)v.get(27)).appendChild((Element)v.get(28));

      /* Empieza nodo:29 / Elemento padre: 28   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(29)).setAttribute("src","b.gif" );
      ((Element)v.get(28)).appendChild((Element)v.get(29));
      /* Termina nodo:29   */
      /* Termina nodo:28   */

      /* Empieza nodo:30 / Elemento padre: 27   */
      v.add(doc.createElement("td"));
      ((Element)v.get(27)).appendChild((Element)v.get(30));

      /* Empieza nodo:31 / Elemento padre: 30   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(30)).appendChild((Element)v.get(31));

      /* Empieza nodo:32 / Elemento padre: 31   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(32)).setAttribute("class","legend" );
      ((Element)v.get(31)).appendChild((Element)v.get(32));

      /* Empieza nodo:33 / Elemento padre: 32   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(33)).setAttribute("nombre","lblDatosSolicitud" );
      ((Element)v.get(33)).setAttribute("alto","13" );
      ((Element)v.get(33)).setAttribute("filas","1" );
      ((Element)v.get(33)).setAttribute("valor","" );
      ((Element)v.get(33)).setAttribute("id","legend" );
      ((Element)v.get(33)).setAttribute("cod","00174" );
      ((Element)v.get(32)).appendChild((Element)v.get(33));
      /* Termina nodo:33   */
      /* Termina nodo:32   */

      /* Empieza nodo:34 / Elemento padre: 31   */
      v.add(doc.createElement("table"));
      ((Element)v.get(34)).setAttribute("width","100%" );
      ((Element)v.get(34)).setAttribute("border","0" );
      ((Element)v.get(34)).setAttribute("align","center" );
      ((Element)v.get(34)).setAttribute("cellspacing","0" );
      ((Element)v.get(34)).setAttribute("cellpadding","0" );
      ((Element)v.get(31)).appendChild((Element)v.get(34));

      /* Empieza nodo:35 / Elemento padre: 34   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(34)).appendChild((Element)v.get(35));

      /* Empieza nodo:36 / Elemento padre: 35   */
      v.add(doc.createElement("td"));
      ((Element)v.get(35)).appendChild((Element)v.get(36));

      /* Empieza nodo:37 / Elemento padre: 36   */
      v.add(doc.createElement("table"));
      ((Element)v.get(37)).setAttribute("width","704" );
      ((Element)v.get(37)).setAttribute("border","0" );
      ((Element)v.get(37)).setAttribute("align","left" );
      ((Element)v.get(37)).setAttribute("cellspacing","0" );
      ((Element)v.get(37)).setAttribute("cellpadding","0" );
      ((Element)v.get(36)).appendChild((Element)v.get(37));

      /* Empieza nodo:38 / Elemento padre: 37   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(37)).appendChild((Element)v.get(38));

      /* Empieza nodo:39 / Elemento padre: 38   */
      v.add(doc.createElement("td"));
      ((Element)v.get(39)).setAttribute("colspan","4" );
      ((Element)v.get(38)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(40)).setAttribute("src","b.gif" );
      ((Element)v.get(40)).setAttribute("width","8" );
      ((Element)v.get(40)).setAttribute("height","8" );
      ((Element)v.get(39)).appendChild((Element)v.get(40));
      /* Termina nodo:40   */
      /* Termina nodo:39   */
      /* Termina nodo:38   */

      /* Empieza nodo:41 / Elemento padre: 37   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(37)).appendChild((Element)v.get(41));

      /* Empieza nodo:42 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(41)).appendChild((Element)v.get(42));

      /* Empieza nodo:43 / Elemento padre: 42   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(43)).setAttribute("src","b.gif" );
      ((Element)v.get(43)).setAttribute("width","8" );
      ((Element)v.get(43)).setAttribute("height","8" );
      ((Element)v.get(42)).appendChild((Element)v.get(43));
      /* Termina nodo:43   */
      /* Termina nodo:42   */

      /* Empieza nodo:44 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(41)).appendChild((Element)v.get(44));

      /* Empieza nodo:45 / Elemento padre: 44   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(45)).setAttribute("nombre","lblNJerarUsuAprob" );
      ((Element)v.get(45)).setAttribute("alto","13" );
      ((Element)v.get(45)).setAttribute("filas","1" );
      ((Element)v.get(45)).setAttribute("valor","" );
      ((Element)v.get(45)).setAttribute("id","datosTitle" );
      ((Element)v.get(45)).setAttribute("cod","927" );
      ((Element)v.get(44)).appendChild((Element)v.get(45));
      /* Termina nodo:45   */
      /* Termina nodo:44   */

      /* Empieza nodo:46 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(41)).appendChild((Element)v.get(46));

      /* Empieza nodo:47 / Elemento padre: 46   */
      v.add(doc.createElement("IMG"));
   }

   private void getXML180(Document doc) {
      ((Element)v.get(47)).setAttribute("src","b.gif" );
      ((Element)v.get(47)).setAttribute("width","25" );
      ((Element)v.get(47)).setAttribute("height","8" );
      ((Element)v.get(46)).appendChild((Element)v.get(47));
      /* Termina nodo:47   */
      /* Termina nodo:46   */

      /* Empieza nodo:48 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(41)).appendChild((Element)v.get(48));

      /* Empieza nodo:49 / Elemento padre: 48   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(49)).setAttribute("nombre","lblEjecutivoCuenta" );
      ((Element)v.get(49)).setAttribute("alto","13" );
      ((Element)v.get(49)).setAttribute("filas","1" );
      ((Element)v.get(49)).setAttribute("valor","" );
      ((Element)v.get(49)).setAttribute("id","datosTitle" );
      ((Element)v.get(49)).setAttribute("cod","855" );
      ((Element)v.get(48)).appendChild((Element)v.get(49));
      /* Termina nodo:49   */
      /* Termina nodo:48   */

      /* Empieza nodo:50 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(50)).setAttribute("width","100%" );
      ((Element)v.get(41)).appendChild((Element)v.get(50));

      /* Empieza nodo:51 / Elemento padre: 50   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(51)).setAttribute("src","b.gif" );
      ((Element)v.get(51)).setAttribute("width","8" );
      ((Element)v.get(51)).setAttribute("height","8" );
      ((Element)v.get(50)).appendChild((Element)v.get(51));
      /* Termina nodo:51   */
      /* Termina nodo:50   */
      /* Termina nodo:41   */

      /* Empieza nodo:52 / Elemento padre: 37   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(37)).appendChild((Element)v.get(52));

      /* Empieza nodo:53 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(52)).appendChild((Element)v.get(53));

      /* Empieza nodo:54 / Elemento padre: 53   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(54)).setAttribute("src","b.gif" );
      ((Element)v.get(54)).setAttribute("width","8" );
      ((Element)v.get(54)).setAttribute("height","8" );
      ((Element)v.get(53)).appendChild((Element)v.get(54));
      /* Termina nodo:54   */
      /* Termina nodo:53   */

      /* Empieza nodo:55 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(55)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(52)).appendChild((Element)v.get(55));

      /* Empieza nodo:56 / Elemento padre: 55   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(56)).setAttribute("nombre","lblNJerarUsuAprobX" );
      ((Element)v.get(56)).setAttribute("alto","13" );
      ((Element)v.get(56)).setAttribute("filas","1" );
      ((Element)v.get(56)).setAttribute("valor","" );
      ((Element)v.get(56)).setAttribute("id","datosCampos" );
      ((Element)v.get(56)).setAttribute("codi","5" );
      ((Element)v.get(55)).appendChild((Element)v.get(56));
      /* Termina nodo:56   */
      /* Termina nodo:55   */

      /* Empieza nodo:57 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(52)).appendChild((Element)v.get(57));

      /* Empieza nodo:58 / Elemento padre: 57   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(58)).setAttribute("src","b.gif" );
      ((Element)v.get(58)).setAttribute("width","25" );
      ((Element)v.get(58)).setAttribute("height","8" );
      ((Element)v.get(57)).appendChild((Element)v.get(58));
      /* Termina nodo:58   */
      /* Termina nodo:57   */

      /* Empieza nodo:59 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(59)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(52)).appendChild((Element)v.get(59));

      /* Empieza nodo:60 / Elemento padre: 59   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(60)).setAttribute("nombre","lblEjecutivoCuentaX" );
      ((Element)v.get(60)).setAttribute("alto","13" );
      ((Element)v.get(60)).setAttribute("filas","1" );
      ((Element)v.get(60)).setAttribute("valor","" );
      ((Element)v.get(60)).setAttribute("id","datosCampos" );
      ((Element)v.get(60)).setAttribute("codi","5" );
      ((Element)v.get(59)).appendChild((Element)v.get(60));
      /* Termina nodo:60   */
      /* Termina nodo:59   */

      /* Empieza nodo:61 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(61)).setAttribute("width","100%" );
      ((Element)v.get(52)).appendChild((Element)v.get(61));

      /* Empieza nodo:62 / Elemento padre: 61   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(62)).setAttribute("src","b.gif" );
      ((Element)v.get(62)).setAttribute("width","8" );
      ((Element)v.get(62)).setAttribute("height","8" );
      ((Element)v.get(61)).appendChild((Element)v.get(62));
      /* Termina nodo:62   */
      /* Termina nodo:61   */
      /* Termina nodo:52   */

      /* Empieza nodo:63 / Elemento padre: 37   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(37)).appendChild((Element)v.get(63));

      /* Empieza nodo:64 / Elemento padre: 63   */
      v.add(doc.createElement("td"));
      ((Element)v.get(64)).setAttribute("colspan","4" );
      ((Element)v.get(63)).appendChild((Element)v.get(64));

      /* Empieza nodo:65 / Elemento padre: 64   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(65)).setAttribute("src","b.gif" );
      ((Element)v.get(65)).setAttribute("width","8" );
      ((Element)v.get(65)).setAttribute("height","8" );
      ((Element)v.get(64)).appendChild((Element)v.get(65));
      /* Termina nodo:65   */
      /* Termina nodo:64   */
      /* Termina nodo:63   */
      /* Termina nodo:37   */
      /* Termina nodo:36   */
      /* Termina nodo:35   */

      /* Empieza nodo:66 / Elemento padre: 34   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(34)).appendChild((Element)v.get(66));

      /* Empieza nodo:67 / Elemento padre: 66   */
      v.add(doc.createElement("td"));
      ((Element)v.get(66)).appendChild((Element)v.get(67));

      /* Empieza nodo:68 / Elemento padre: 67   */
      v.add(doc.createElement("table"));
      ((Element)v.get(68)).setAttribute("width","704" );
      ((Element)v.get(68)).setAttribute("border","0" );
      ((Element)v.get(68)).setAttribute("align","left" );
      ((Element)v.get(68)).setAttribute("cellspacing","0" );
      ((Element)v.get(68)).setAttribute("cellpadding","0" );
      ((Element)v.get(67)).appendChild((Element)v.get(68));

      /* Empieza nodo:69 / Elemento padre: 68   */
      v.add(doc.createElement("tr"));
   }

   private void getXML270(Document doc) {
      ((Element)v.get(68)).appendChild((Element)v.get(69));

      /* Empieza nodo:70 / Elemento padre: 69   */
      v.add(doc.createElement("td"));
      ((Element)v.get(69)).appendChild((Element)v.get(70));

      /* Empieza nodo:71 / Elemento padre: 70   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(71)).setAttribute("src","b.gif" );
      ((Element)v.get(71)).setAttribute("width","8" );
      ((Element)v.get(71)).setAttribute("height","8" );
      ((Element)v.get(70)).appendChild((Element)v.get(71));
      /* Termina nodo:71   */
      /* Termina nodo:70   */

      /* Empieza nodo:72 / Elemento padre: 69   */
      v.add(doc.createElement("td"));
      ((Element)v.get(69)).appendChild((Element)v.get(72));

      /* Empieza nodo:73 / Elemento padre: 72   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(73)).setAttribute("nombre","lblObservacionesAprob" );
      ((Element)v.get(73)).setAttribute("alto","13" );
      ((Element)v.get(73)).setAttribute("filas","1" );
      ((Element)v.get(73)).setAttribute("valor","" );
      ((Element)v.get(73)).setAttribute("id","datosTitle" );
      ((Element)v.get(73)).setAttribute("cod","950" );
      ((Element)v.get(72)).appendChild((Element)v.get(73));
      /* Termina nodo:73   */
      /* Termina nodo:72   */

      /* Empieza nodo:74 / Elemento padre: 69   */
      v.add(doc.createElement("td"));
      ((Element)v.get(74)).setAttribute("width","100%" );
      ((Element)v.get(69)).appendChild((Element)v.get(74));

      /* Empieza nodo:75 / Elemento padre: 74   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(75)).setAttribute("src","b.gif" );
      ((Element)v.get(75)).setAttribute("width","8" );
      ((Element)v.get(75)).setAttribute("height","8" );
      ((Element)v.get(74)).appendChild((Element)v.get(75));
      /* Termina nodo:75   */
      /* Termina nodo:74   */
      /* Termina nodo:69   */

      /* Empieza nodo:76 / Elemento padre: 68   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(68)).appendChild((Element)v.get(76));

      /* Empieza nodo:77 / Elemento padre: 76   */
      v.add(doc.createElement("td"));
      ((Element)v.get(76)).appendChild((Element)v.get(77));

      /* Empieza nodo:78 / Elemento padre: 77   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(78)).setAttribute("src","b.gif" );
      ((Element)v.get(78)).setAttribute("width","8" );
      ((Element)v.get(78)).setAttribute("height","8" );
      ((Element)v.get(77)).appendChild((Element)v.get(78));
      /* Termina nodo:78   */
      /* Termina nodo:77   */

      /* Empieza nodo:79 / Elemento padre: 76   */
      v.add(doc.createElement("td"));
      ((Element)v.get(79)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(76)).appendChild((Element)v.get(79));

      /* Empieza nodo:80 / Elemento padre: 79   */
      v.add(doc.createElement("AREATEXTO"));
      ((Element)v.get(80)).setAttribute("cols","50" );
      ((Element)v.get(80)).setAttribute("id","datosCampos" );
      ((Element)v.get(80)).setAttribute("msjreq","" );
      ((Element)v.get(80)).setAttribute("nombre","areaObservacionesAprob" );
      ((Element)v.get(80)).setAttribute("readonly","N" );
      ((Element)v.get(80)).setAttribute("req","N" );
      ((Element)v.get(80)).setAttribute("rows","3" );
      ((Element)v.get(80)).setAttribute("tabindex","2" );
      ((Element)v.get(80)).setAttribute("valor","" );
      ((Element)v.get(80)).setAttribute("ontab","tab('areaObservacionesAprob')" );
      ((Element)v.get(80)).setAttribute("onshtab","tab('areaObservacionesAprob')" );
      ((Element)v.get(79)).appendChild((Element)v.get(80));
      /* Termina nodo:80   */
      /* Termina nodo:79   */

      /* Empieza nodo:81 / Elemento padre: 76   */
      v.add(doc.createElement("td"));
      ((Element)v.get(81)).setAttribute("width","100%" );
      ((Element)v.get(76)).appendChild((Element)v.get(81));

      /* Empieza nodo:82 / Elemento padre: 81   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(82)).setAttribute("src","b.gif" );
      ((Element)v.get(82)).setAttribute("width","8" );
      ((Element)v.get(82)).setAttribute("height","8" );
      ((Element)v.get(81)).appendChild((Element)v.get(82));
      /* Termina nodo:82   */
      /* Termina nodo:81   */
      /* Termina nodo:76   */

      /* Empieza nodo:83 / Elemento padre: 68   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(68)).appendChild((Element)v.get(83));

      /* Empieza nodo:84 / Elemento padre: 83   */
      v.add(doc.createElement("td"));
      ((Element)v.get(84)).setAttribute("colspan","4" );
      ((Element)v.get(83)).appendChild((Element)v.get(84));

      /* Empieza nodo:85 / Elemento padre: 84   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(85)).setAttribute("src","b.gif" );
      ((Element)v.get(85)).setAttribute("width","8" );
      ((Element)v.get(85)).setAttribute("height","292" );
      ((Element)v.get(84)).appendChild((Element)v.get(85));
      /* Termina nodo:85   */
      /* Termina nodo:84   */
      /* Termina nodo:83   */
      /* Termina nodo:68   */
      /* Termina nodo:67   */
      /* Termina nodo:66   */

      /* Empieza nodo:86 / Elemento padre: 34   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(34)).appendChild((Element)v.get(86));

      /* Empieza nodo:87 / Elemento padre: 86   */
      v.add(doc.createElement("td"));
      ((Element)v.get(86)).appendChild((Element)v.get(87));

      /* Empieza nodo:88 / Elemento padre: 87   */
      v.add(doc.createElement("table"));
      ((Element)v.get(88)).setAttribute("width","677" );
      ((Element)v.get(88)).setAttribute("border","0" );
      ((Element)v.get(88)).setAttribute("align","left" );
      ((Element)v.get(88)).setAttribute("cellspacing","0" );
      ((Element)v.get(88)).setAttribute("cellpadding","0" );
      ((Element)v.get(87)).appendChild((Element)v.get(88));

      /* Empieza nodo:89 / Elemento padre: 88   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(88)).appendChild((Element)v.get(89));

      /* Empieza nodo:90 / Elemento padre: 89   */
      v.add(doc.createElement("td"));
      ((Element)v.get(90)).setAttribute("colspan","4" );
      ((Element)v.get(89)).appendChild((Element)v.get(90));

      /* Empieza nodo:91 / Elemento padre: 90   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(91)).setAttribute("src","b.gif" );
      ((Element)v.get(91)).setAttribute("width","8" );
      ((Element)v.get(91)).setAttribute("height","8" );
      ((Element)v.get(90)).appendChild((Element)v.get(91));
      /* Termina nodo:91   */
      /* Termina nodo:90   */
      /* Termina nodo:89   */
      /* Termina nodo:88   */
      /* Termina nodo:87   */
      /* Termina nodo:86   */
      /* Termina nodo:34   */
      /* Termina nodo:31   */
      /* Termina nodo:30   */

      /* Empieza nodo:92 / Elemento padre: 27   */
   }

   private void getXML360(Document doc) {
      v.add(doc.createElement("td"));
      ((Element)v.get(27)).appendChild((Element)v.get(92));

      /* Empieza nodo:93 / Elemento padre: 92   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(93)).setAttribute("src","b.gif" );
      ((Element)v.get(92)).appendChild((Element)v.get(93));
      /* Termina nodo:93   */
      /* Termina nodo:92   */
      /* Termina nodo:27   */

      /* Empieza nodo:94 / Elemento padre: 19   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(19)).appendChild((Element)v.get(94));

      /* Empieza nodo:95 / Elemento padre: 94   */
      v.add(doc.createElement("td"));
      ((Element)v.get(94)).appendChild((Element)v.get(95));

      /* Empieza nodo:96 / Elemento padre: 95   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(96)).setAttribute("src","b.gif" );
      ((Element)v.get(95)).appendChild((Element)v.get(96));
      /* Termina nodo:96   */
      /* Termina nodo:95   */

      /* Empieza nodo:97 / Elemento padre: 94   */
      v.add(doc.createElement("td"));
      ((Element)v.get(94)).appendChild((Element)v.get(97));

      /* Empieza nodo:98 / Elemento padre: 97   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(97)).appendChild((Element)v.get(98));

      /* Empieza nodo:99 / Elemento padre: 98   */
      v.add(doc.createElement("table"));
      ((Element)v.get(99)).setAttribute("width","100%" );
      ((Element)v.get(99)).setAttribute("border","0" );
      ((Element)v.get(99)).setAttribute("align","center" );
      ((Element)v.get(99)).setAttribute("cellspacing","0" );
      ((Element)v.get(99)).setAttribute("cellpadding","0" );
      ((Element)v.get(98)).appendChild((Element)v.get(99));

      /* Empieza nodo:100 / Elemento padre: 99   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(99)).appendChild((Element)v.get(100));

      /* Empieza nodo:101 / Elemento padre: 100   */
      v.add(doc.createElement("td"));
      ((Element)v.get(101)).setAttribute("class","botonera" );
      ((Element)v.get(100)).appendChild((Element)v.get(101));

      /* Empieza nodo:102 / Elemento padre: 101   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(102)).setAttribute("nombre","btnAceptar" );
      ((Element)v.get(102)).setAttribute("ID","botonContenido" );
      ((Element)v.get(102)).setAttribute("tipo","html" );
      ((Element)v.get(102)).setAttribute("accion","aceptar_click()" );
      ((Element)v.get(102)).setAttribute("estado","false" );
      ((Element)v.get(102)).setAttribute("cod","12" );
      ((Element)v.get(102)).setAttribute("ontab","tab('btnAceptar')" );
      ((Element)v.get(102)).setAttribute("onshtab","tab('btnAceptar')" );
      ((Element)v.get(101)).appendChild((Element)v.get(102));
      /* Termina nodo:102   */
      /* Termina nodo:101   */
      /* Termina nodo:100   */
      /* Termina nodo:99   */
      /* Termina nodo:98   */
      /* Termina nodo:97   */

      /* Empieza nodo:103 / Elemento padre: 94   */
      v.add(doc.createElement("td"));
      ((Element)v.get(94)).appendChild((Element)v.get(103));

      /* Empieza nodo:104 / Elemento padre: 103   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(104)).setAttribute("src","b.gif" );
      ((Element)v.get(104)).setAttribute("width","8" );
      ((Element)v.get(104)).setAttribute("height","12" );
      ((Element)v.get(103)).appendChild((Element)v.get(104));
      /* Termina nodo:104   */
      /* Termina nodo:103   */
      /* Termina nodo:94   */

      /* Empieza nodo:105 / Elemento padre: 19   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(19)).appendChild((Element)v.get(105));

      /* Empieza nodo:106 / Elemento padre: 105   */
      v.add(doc.createElement("td"));
      ((Element)v.get(106)).setAttribute("width","12" );
      ((Element)v.get(106)).setAttribute("align","center" );
      ((Element)v.get(105)).appendChild((Element)v.get(106));

      /* Empieza nodo:107 / Elemento padre: 106   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(107)).setAttribute("src","b.gif" );
      ((Element)v.get(107)).setAttribute("width","12" );
      ((Element)v.get(107)).setAttribute("height","12" );
      ((Element)v.get(106)).appendChild((Element)v.get(107));
      /* Termina nodo:107   */
      /* Termina nodo:106   */

      /* Empieza nodo:108 / Elemento padre: 105   */
      v.add(doc.createElement("td"));
      ((Element)v.get(108)).setAttribute("width","750" );
      ((Element)v.get(105)).appendChild((Element)v.get(108));

      /* Empieza nodo:109 / Elemento padre: 108   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(109)).setAttribute("src","b.gif" );
      ((Element)v.get(108)).appendChild((Element)v.get(109));
      /* Termina nodo:109   */
      /* Termina nodo:108   */

      /* Empieza nodo:110 / Elemento padre: 105   */
      v.add(doc.createElement("td"));
      ((Element)v.get(110)).setAttribute("width","12" );
      ((Element)v.get(105)).appendChild((Element)v.get(110));

      /* Empieza nodo:111 / Elemento padre: 110   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(111)).setAttribute("src","b.gif" );
      ((Element)v.get(111)).setAttribute("width","12" );
      ((Element)v.get(111)).setAttribute("height","1" );
      ((Element)v.get(110)).appendChild((Element)v.get(111));
      /* Termina nodo:111   */
      /* Termina nodo:110   */
      /* Termina nodo:105   */
      /* Termina nodo:19   */
      /* Termina nodo:18   */

      /* Empieza nodo:112 / Elemento padre: 8   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(112)).setAttribute("nombre","listado1" );
      ((Element)v.get(112)).setAttribute("ancho","680" );
      ((Element)v.get(112)).setAttribute("alto","277" );
      ((Element)v.get(112)).setAttribute("x","24" );
      ((Element)v.get(112)).setAttribute("y","133" );
      ((Element)v.get(112)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(112)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(8)).appendChild((Element)v.get(112));

      /* Empieza nodo:113 / Elemento padre: 112   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(113)).setAttribute("precarga","S" );
      ((Element)v.get(113)).setAttribute("conROver","S" );
      ((Element)v.get(112)).appendChild((Element)v.get(113));

      /* Empieza nodo:114 / Elemento padre: 113   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(114)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(114)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(114)).setAttribute("seleccionado","btnLista2M.gif" );
      ((Element)v.get(114)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(113)).appendChild((Element)v.get(114));
      /* Termina nodo:114   */

      /* Empieza nodo:115 / Elemento padre: 113   */
      v.add(doc.createElement("BTNMINIMIZAR"));
   }

   private void getXML450(Document doc) {
      ((Element)v.get(115)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(115)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(115)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(115)).setAttribute("maximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(113)).appendChild((Element)v.get(115));
      /* Termina nodo:115   */

      /* Empieza nodo:116 / Elemento padre: 113   */
      v.add(doc.createElement("BTNORDENAR"));
      ((Element)v.get(116)).setAttribute("ordenar","ascendente_on.gif" );
      ((Element)v.get(116)).setAttribute("ordenarInv","descendente_on.gif" );
      ((Element)v.get(113)).appendChild((Element)v.get(116));
      /* Termina nodo:116   */
      /* Termina nodo:113   */

      /* Empieza nodo:117 / Elemento padre: 112   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(112)).appendChild((Element)v.get(117));

      /* Empieza nodo:118 / Elemento padre: 117   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(118)).setAttribute("borde","1" );
      ((Element)v.get(118)).setAttribute("horizDatos","1" );
      ((Element)v.get(118)).setAttribute("horizCabecera","1" );
      ((Element)v.get(118)).setAttribute("vertical","1" );
      ((Element)v.get(118)).setAttribute("horizTitulo","1" );
      ((Element)v.get(118)).setAttribute("horizBase","1" );
      ((Element)v.get(117)).appendChild((Element)v.get(118));
      /* Termina nodo:118   */

      /* Empieza nodo:119 / Elemento padre: 117   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(119)).setAttribute("borde","#999999" );
      ((Element)v.get(119)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(119)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(119)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(119)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(119)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(119)).setAttribute("horizBase","#999999" );
      ((Element)v.get(117)).appendChild((Element)v.get(119));
      /* Termina nodo:119   */
      /* Termina nodo:117   */

      /* Empieza nodo:120 / Elemento padre: 112   */
      v.add(doc.createElement("BASE"));
      ((Element)v.get(120)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(120)).setAttribute("alto","22" );
      ((Element)v.get(120)).setAttribute("imgFondo","" );
      ((Element)v.get(112)).appendChild((Element)v.get(120));
      /* Termina nodo:120   */

      /* Empieza nodo:121 / Elemento padre: 112   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(121)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(121)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(121)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(121)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(121)).setAttribute("AnchoMinimizadas","20" );
      ((Element)v.get(121)).setAttribute("botonOrdenar","S" );
      ((Element)v.get(112)).appendChild((Element)v.get(121));

      /* Empieza nodo:122 / Elemento padre: 121   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(122)).setAttribute("ancho","30" );
      ((Element)v.get(122)).setAttribute("minimizable","S" );
      ((Element)v.get(122)).setAttribute("minimizada","N" );
      ((Element)v.get(121)).appendChild((Element)v.get(122));
      /* Termina nodo:122   */
      /* Termina nodo:121   */

      /* Empieza nodo:123 / Elemento padre: 112   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(123)).setAttribute("alto","20" );
      ((Element)v.get(123)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(123)).setAttribute("imgFondo","" );
      ((Element)v.get(123)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(112)).appendChild((Element)v.get(123));

      /* Empieza nodo:124 / Elemento padre: 123   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(124)).setAttribute("colFondo","" );
      ((Element)v.get(124)).setAttribute("ID","EstCab" );
      ((Element)v.get(124)).setAttribute("align","center" );
      ((Element)v.get(124)).setAttribute("cod","946" );
      ((Element)v.get(123)).appendChild((Element)v.get(124));

      /* Elemento padre:124 / Elemento actual: 125   */
      v.add(doc.createTextNode("Nuevo ejecutivo cuenta"));
      ((Element)v.get(124)).appendChild((Text)v.get(125));

      /* Termina nodo Texto:125   */
      /* Termina nodo:124   */
      /* Termina nodo:123   */

      /* Empieza nodo:126 / Elemento padre: 112   */
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(126)).setAttribute("alto","22" );
      ((Element)v.get(126)).setAttribute("accion","" );
      ((Element)v.get(126)).setAttribute("tipoEnvio","edicion" );
      ((Element)v.get(126)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(126)).setAttribute("maxSel","1" );
      ((Element)v.get(126)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(126)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(126)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(126)).setAttribute("onLoad","" );
      ((Element)v.get(126)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(112)).appendChild((Element)v.get(126));

      /* Empieza nodo:127 / Elemento padre: 126   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(127)).setAttribute("tipo","texto" );
      ((Element)v.get(127)).setAttribute("ID","EstDat" );
      ((Element)v.get(126)).appendChild((Element)v.get(127));
      /* Termina nodo:127   */
      /* Termina nodo:126   */

      /* Empieza nodo:128 / Elemento padre: 112   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(112)).appendChild((Element)v.get(128));
      /* Termina nodo:128   */

      /* Empieza nodo:129 / Elemento padre: 112   */
      v.add(doc.createElement("PAGINADO"));
      ((Element)v.get(129)).setAttribute("nombre","mipgndo" );
      ((Element)v.get(129)).setAttribute("ancho","687" );
      ((Element)v.get(129)).setAttribute("sep","$" );
      ((Element)v.get(129)).setAttribute("x","12" );
      ((Element)v.get(129)).setAttribute("class","botonera" );
      ((Element)v.get(129)).setAttribute("y","387" );
      ((Element)v.get(129)).setAttribute("control","|" );
      ((Element)v.get(129)).setAttribute("conector","conector_prototipo_2" );
      ((Element)v.get(129)).setAttribute("rowset","" );
      ((Element)v.get(129)).setAttribute("cargainicial","N" );
      ((Element)v.get(129)).setAttribute("onload","procesarPaginado(mipgndo, msgError, ultima, rowset, 'gestionaLista(ultima, rowset)')" );
   }

   private void getXML540(Document doc) {
      ((Element)v.get(112)).appendChild((Element)v.get(129));

      /* Empieza nodo:130 / Elemento padre: 129   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(130)).setAttribute("nombre","ret1" );
      ((Element)v.get(130)).setAttribute("x","49" );
      ((Element)v.get(130)).setAttribute("y","391" );
      ((Element)v.get(130)).setAttribute("ID","botonContenido" );
      ((Element)v.get(130)).setAttribute("img","retroceder_on" );
      ((Element)v.get(130)).setAttribute("tipo","0" );
      ((Element)v.get(130)).setAttribute("estado","false" );
      ((Element)v.get(130)).setAttribute("alt","" );
      ((Element)v.get(130)).setAttribute("codigo","" );
      ((Element)v.get(130)).setAttribute("accion","mipgndo.retroceder();" );
      ((Element)v.get(129)).appendChild((Element)v.get(130));
      /* Termina nodo:130   */

      /* Empieza nodo:131 / Elemento padre: 129   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(131)).setAttribute("nombre","ava1" );
      ((Element)v.get(131)).setAttribute("x","64" );
      ((Element)v.get(131)).setAttribute("y","391" );
      ((Element)v.get(131)).setAttribute("ID","botonContenido" );
      ((Element)v.get(131)).setAttribute("img","avanzar_on" );
      ((Element)v.get(131)).setAttribute("tipo","0" );
      ((Element)v.get(131)).setAttribute("estado","false" );
      ((Element)v.get(131)).setAttribute("alt","" );
      ((Element)v.get(131)).setAttribute("codigo","" );
      ((Element)v.get(131)).setAttribute("accion","mipgndo.avanzar();" );
      ((Element)v.get(129)).appendChild((Element)v.get(131));
      /* Termina nodo:131   */
      /* Termina nodo:129   */
      /* Termina nodo:112   */

      /* Empieza nodo:132 / Elemento padre: 8   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(132)).setAttribute("nombre","primera1" );
      ((Element)v.get(132)).setAttribute("x","32" );
      ((Element)v.get(132)).setAttribute("y","391" );
      ((Element)v.get(132)).setAttribute("ID","botonContenido" );
      ((Element)v.get(132)).setAttribute("img","primera_on" );
      ((Element)v.get(132)).setAttribute("tipo","-2" );
      ((Element)v.get(132)).setAttribute("estado","false" );
      ((Element)v.get(132)).setAttribute("alt","" );
      ((Element)v.get(132)).setAttribute("codigo","" );
      ((Element)v.get(132)).setAttribute("accion","mipgndo.retrocederPrimeraPagina();" );
      ((Element)v.get(8)).appendChild((Element)v.get(132));
      /* Termina nodo:132   */

      /* Empieza nodo:133 / Elemento padre: 8   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(133)).setAttribute("nombre","separa" );
      ((Element)v.get(133)).setAttribute("x","71" );
      ((Element)v.get(133)).setAttribute("y","387" );
      ((Element)v.get(133)).setAttribute("ID","botonContenido" );
      ((Element)v.get(133)).setAttribute("img","separa_base" );
      ((Element)v.get(133)).setAttribute("tipo","0" );
      ((Element)v.get(133)).setAttribute("estado","false" );
      ((Element)v.get(133)).setAttribute("alt","" );
      ((Element)v.get(133)).setAttribute("codigo","" );
      ((Element)v.get(133)).setAttribute("accion","" );
      ((Element)v.get(8)).appendChild((Element)v.get(133));
      /* Termina nodo:133   */

      /* Empieza nodo:134 / Elemento padre: 8   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(134)).setAttribute("nombre","capaEspacio" );
      ((Element)v.get(134)).setAttribute("alto","18" );
      ((Element)v.get(134)).setAttribute("ancho","100" );
      ((Element)v.get(134)).setAttribute("colorf","" );
      ((Element)v.get(134)).setAttribute("borde","0" );
      ((Element)v.get(134)).setAttribute("imagenf","" );
      ((Element)v.get(134)).setAttribute("repeat","" );
      ((Element)v.get(134)).setAttribute("padding","" );
      ((Element)v.get(134)).setAttribute("visibilidad","visible" );
      ((Element)v.get(134)).setAttribute("contravsb","" );
      ((Element)v.get(134)).setAttribute("x","0" );
      ((Element)v.get(134)).setAttribute("y","410" );
      ((Element)v.get(134)).setAttribute("zindex","" );
      ((Element)v.get(8)).appendChild((Element)v.get(134));
      /* Termina nodo:134   */
      /* Termina nodo:8   */


   }

}
