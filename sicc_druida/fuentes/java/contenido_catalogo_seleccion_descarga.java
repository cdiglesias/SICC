
import org.w3c.dom.*;
import java.util.ArrayList;

public class contenido_catalogo_seleccion_descarga  implements es.indra.druida.base.ObjetoXML {
   private ArrayList v = new ArrayList();

   public Element getXML (Document doc){
      

      getXML0(doc);
         

      getXML90(doc);
         

      getXML180(doc);
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","contenido_catalogo_seleccion_descarga" );
      ((Element)v.get(0)).setAttribute("cod","01019" );
      ((Element)v.get(0)).setAttribute("titulo","Crear matriz de facturación" );
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
      v.add(doc.createElement("JAVASCRIPT"));
      ((Element)v.get(0)).appendChild((Element)v.get(2));

      /* Elemento padre:2 / Elemento actual: 3   */
      v.add(doc.createTextNode("\r   \r      function onLoadPag() {\r        configurarMenuSecundario(\"formulario\");\r        eval (ON_RSZ);  \r      }\r      \r      function aceptar() {      \r			lpOrigen = get('formulario.lpOrigen');\r            set('formulario.conectorAction',lpOrigen);\r	        set('formulario.accion','CatalogoSeleccionado');\r		    enviaSICC('formulario');\r      }  \r      \r      function fGuardar(){\r        aceptar();\r      }\r      \r      function fLimpiar(){\r          set('formulario.cbCatalogo','');\r      }    \r	  \r	  function descargar(url){\r			window.open(\"../descargas/\"+url,\"\",\"height=600,width=400,status=no,toolbar=no,menubar=no,location=no,resible=yes\");\r\r\r	  }\r      \r   \r"));
      ((Element)v.get(2)).appendChild((Text)v.get(3));

      /* Termina nodo Texto:3   */
      /* Termina nodo:2   */

      /* Empieza nodo:4 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(4)).setAttribute("nombre","formulario" );
      ((Element)v.get(4)).setAttribute("oculto","S" );
      ((Element)v.get(0)).appendChild((Element)v.get(4));

      /* Empieza nodo:5 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(5)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(5)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(5));
      /* Termina nodo:5   */

      /* Empieza nodo:6 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(6)).setAttribute("nombre","accion" );
      ((Element)v.get(6)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(6));
      /* Termina nodo:6   */

      /* Empieza nodo:7 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(7)).setAttribute("nombre","errCodigo" );
      ((Element)v.get(7)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */

      /* Empieza nodo:8 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(8)).setAttribute("nombre","errDescripcion" );
      ((Element)v.get(8)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(8));
      /* Termina nodo:8   */

      /* Empieza nodo:9 / Elemento padre: 4   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(9)).setAttribute("nombre","lpOrigen" );
      ((Element)v.get(9)).setAttribute("valor","" );
      ((Element)v.get(4)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 4   */
      v.add(doc.createElement("table"));
      ((Element)v.get(10)).setAttribute("width","100%" );
      ((Element)v.get(10)).setAttribute("border","0" );
      ((Element)v.get(10)).setAttribute("cellspacing","0" );
      ((Element)v.get(10)).setAttribute("cellpadding","0" );
      ((Element)v.get(4)).appendChild((Element)v.get(10));

      /* Empieza nodo:11 / Elemento padre: 10   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(10)).appendChild((Element)v.get(11));

      /* Empieza nodo:12 / Elemento padre: 11   */
      v.add(doc.createElement("td"));
      ((Element)v.get(12)).setAttribute("width","12" );
      ((Element)v.get(12)).setAttribute("align","center" );
      ((Element)v.get(11)).appendChild((Element)v.get(12));

      /* Empieza nodo:13 / Elemento padre: 12   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(13)).setAttribute("src","b.gif" );
      ((Element)v.get(13)).setAttribute("width","12" );
      ((Element)v.get(13)).setAttribute("height","12" );
      ((Element)v.get(12)).appendChild((Element)v.get(13));
      /* Termina nodo:13   */
      /* Termina nodo:12   */

      /* Empieza nodo:14 / Elemento padre: 11   */
      v.add(doc.createElement("td"));
      ((Element)v.get(14)).setAttribute("width","750" );
      ((Element)v.get(11)).appendChild((Element)v.get(14));

      /* Empieza nodo:15 / Elemento padre: 14   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(15)).setAttribute("src","b.gif" );
      ((Element)v.get(14)).appendChild((Element)v.get(15));
      /* Termina nodo:15   */
      /* Termina nodo:14   */

      /* Empieza nodo:16 / Elemento padre: 11   */
      v.add(doc.createElement("td"));
      ((Element)v.get(16)).setAttribute("width","12" );
      ((Element)v.get(11)).appendChild((Element)v.get(16));

      /* Empieza nodo:17 / Elemento padre: 16   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(17)).setAttribute("src","b.gif" );
      ((Element)v.get(17)).setAttribute("width","12" );
      ((Element)v.get(17)).setAttribute("height","1" );
      ((Element)v.get(16)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */
      /* Termina nodo:16   */
      /* Termina nodo:11   */

      /* Empieza nodo:18 / Elemento padre: 10   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(10)).appendChild((Element)v.get(18));

      /* Empieza nodo:19 / Elemento padre: 18   */
      v.add(doc.createElement("td"));
      ((Element)v.get(18)).appendChild((Element)v.get(19));

      /* Empieza nodo:20 / Elemento padre: 19   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(20)).setAttribute("src","b.gif" );
      ((Element)v.get(19)).appendChild((Element)v.get(20));
      /* Termina nodo:20   */
      /* Termina nodo:19   */

      /* Empieza nodo:21 / Elemento padre: 18   */
      v.add(doc.createElement("td"));
      ((Element)v.get(18)).appendChild((Element)v.get(21));

      /* Empieza nodo:22 / Elemento padre: 21   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(21)).appendChild((Element)v.get(22));

      /* Empieza nodo:23 / Elemento padre: 22   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(23)).setAttribute("class","legend" );
      ((Element)v.get(22)).appendChild((Element)v.get(23));

      /* Empieza nodo:24 / Elemento padre: 23   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(24)).setAttribute("nombre","lblDatosSeleccion" );
      ((Element)v.get(24)).setAttribute("alto","13" );
      ((Element)v.get(24)).setAttribute("filas","1" );
   }

   private void getXML90(Document doc) {
      ((Element)v.get(24)).setAttribute("valor","" );
      ((Element)v.get(24)).setAttribute("id","legend" );
      ((Element)v.get(24)).setAttribute("cod","00263" );
      ((Element)v.get(23)).appendChild((Element)v.get(24));
      /* Termina nodo:24   */
      /* Termina nodo:23   */

      /* Empieza nodo:25 / Elemento padre: 22   */
      v.add(doc.createElement("table"));
      ((Element)v.get(25)).setAttribute("width","100%" );
      ((Element)v.get(25)).setAttribute("border","0" );
      ((Element)v.get(25)).setAttribute("align","center" );
      ((Element)v.get(25)).setAttribute("cellspacing","0" );
      ((Element)v.get(25)).setAttribute("cellpadding","0" );
      ((Element)v.get(22)).appendChild((Element)v.get(25));

      /* Empieza nodo:26 / Elemento padre: 25   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(25)).appendChild((Element)v.get(26));

      /* Empieza nodo:27 / Elemento padre: 26   */
      v.add(doc.createElement("td"));
      ((Element)v.get(26)).appendChild((Element)v.get(27));

      /* Empieza nodo:28 / Elemento padre: 27   */
      v.add(doc.createElement("table"));
      ((Element)v.get(28)).setAttribute("width","530" );
      ((Element)v.get(28)).setAttribute("border","0" );
      ((Element)v.get(28)).setAttribute("align","left" );
      ((Element)v.get(28)).setAttribute("cellspacing","0" );
      ((Element)v.get(28)).setAttribute("cellpadding","0" );
      ((Element)v.get(27)).appendChild((Element)v.get(28));

      /* Empieza nodo:29 / Elemento padre: 28   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(28)).appendChild((Element)v.get(29));

      /* Empieza nodo:30 / Elemento padre: 29   */
      v.add(doc.createElement("td"));
      ((Element)v.get(30)).setAttribute("colspan","3" );
      ((Element)v.get(29)).appendChild((Element)v.get(30));

      /* Empieza nodo:31 / Elemento padre: 30   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(31)).setAttribute("src","b.gif" );
      ((Element)v.get(31)).setAttribute("width","8" );
      ((Element)v.get(31)).setAttribute("height","8" );
      ((Element)v.get(30)).appendChild((Element)v.get(31));
      /* Termina nodo:31   */
      /* Termina nodo:30   */
      /* Termina nodo:29   */

      /* Empieza nodo:32 / Elemento padre: 28   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(28)).appendChild((Element)v.get(32));

      /* Empieza nodo:33 / Elemento padre: 32   */
      v.add(doc.createElement("td"));
      ((Element)v.get(32)).appendChild((Element)v.get(33));

      /* Empieza nodo:34 / Elemento padre: 33   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(34)).setAttribute("src","b.gif" );
      ((Element)v.get(34)).setAttribute("width","8" );
      ((Element)v.get(34)).setAttribute("height","8" );
      ((Element)v.get(33)).appendChild((Element)v.get(34));
      /* Termina nodo:34   */
      /* Termina nodo:33   */

      /* Empieza nodo:35 / Elemento padre: 32   */
      v.add(doc.createElement("td"));
      ((Element)v.get(32)).appendChild((Element)v.get(35));

      /* Empieza nodo:36 / Elemento padre: 35   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(36)).setAttribute("nombre","lblCatalogo" );
      ((Element)v.get(36)).setAttribute("alto","13" );
      ((Element)v.get(36)).setAttribute("filas","1" );
      ((Element)v.get(36)).setAttribute("valor","" );
      ((Element)v.get(36)).setAttribute("id","datosTitle" );
      ((Element)v.get(36)).setAttribute("cod","516" );
      ((Element)v.get(35)).appendChild((Element)v.get(36));
      /* Termina nodo:36   */
      /* Termina nodo:35   */

      /* Empieza nodo:37 / Elemento padre: 32   */
      v.add(doc.createElement("td"));
      ((Element)v.get(37)).setAttribute("width","100%" );
      ((Element)v.get(32)).appendChild((Element)v.get(37));

      /* Empieza nodo:38 / Elemento padre: 37   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(38)).setAttribute("src","b.gif" );
      ((Element)v.get(38)).setAttribute("width","8" );
      ((Element)v.get(38)).setAttribute("height","8" );
      ((Element)v.get(37)).appendChild((Element)v.get(38));
      /* Termina nodo:38   */
      /* Termina nodo:37   */
      /* Termina nodo:32   */

      /* Empieza nodo:39 / Elemento padre: 28   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(28)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("td"));
      ((Element)v.get(39)).appendChild((Element)v.get(40));

      /* Empieza nodo:41 / Elemento padre: 40   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(41)).setAttribute("src","b.gif" );
      ((Element)v.get(41)).setAttribute("width","8" );
      ((Element)v.get(41)).setAttribute("height","8" );
      ((Element)v.get(40)).appendChild((Element)v.get(41));
      /* Termina nodo:41   */
      /* Termina nodo:40   */

      /* Empieza nodo:42 / Elemento padre: 39   */
      v.add(doc.createElement("td"));
      ((Element)v.get(42)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(39)).appendChild((Element)v.get(42));

      /* Empieza nodo:43 / Elemento padre: 42   */
      v.add(doc.createElement("COMBO"));
      ((Element)v.get(43)).setAttribute("nombre","cbCatalogo" );
      ((Element)v.get(43)).setAttribute("id","datosCampos" );
      ((Element)v.get(43)).setAttribute("size","1" );
      ((Element)v.get(43)).setAttribute("multiple","N" );
      ((Element)v.get(43)).setAttribute("req","N" );
      ((Element)v.get(43)).setAttribute("valorinicial","" );
      ((Element)v.get(43)).setAttribute("textoinicial","" );
      ((Element)v.get(42)).appendChild((Element)v.get(43));

      /* Empieza nodo:44 / Elemento padre: 43   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(43)).appendChild((Element)v.get(44));
      /* Termina nodo:44   */
      /* Termina nodo:43   */
      /* Termina nodo:42   */

      /* Empieza nodo:45 / Elemento padre: 39   */
      v.add(doc.createElement("td"));
      ((Element)v.get(45)).setAttribute("width","100%" );
      ((Element)v.get(39)).appendChild((Element)v.get(45));

      /* Empieza nodo:46 / Elemento padre: 45   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(46)).setAttribute("src","b.gif" );
      ((Element)v.get(46)).setAttribute("width","8" );
      ((Element)v.get(46)).setAttribute("height","8" );
      ((Element)v.get(45)).appendChild((Element)v.get(46));
      /* Termina nodo:46   */
      /* Termina nodo:45   */
      /* Termina nodo:39   */

      /* Empieza nodo:47 / Elemento padre: 28   */
   }

   private void getXML180(Document doc) {
      v.add(doc.createElement("tr"));
      ((Element)v.get(28)).appendChild((Element)v.get(47));

      /* Empieza nodo:48 / Elemento padre: 47   */
      v.add(doc.createElement("td"));
      ((Element)v.get(48)).setAttribute("colspan","4" );
      ((Element)v.get(47)).appendChild((Element)v.get(48));

      /* Empieza nodo:49 / Elemento padre: 48   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(49)).setAttribute("src","b.gif" );
      ((Element)v.get(49)).setAttribute("width","8" );
      ((Element)v.get(49)).setAttribute("height","8" );
      ((Element)v.get(48)).appendChild((Element)v.get(49));
      /* Termina nodo:49   */
      /* Termina nodo:48   */
      /* Termina nodo:47   */
      /* Termina nodo:28   */
      /* Termina nodo:27   */
      /* Termina nodo:26   */
      /* Termina nodo:25   */
      /* Termina nodo:22   */
      /* Termina nodo:21   */

      /* Empieza nodo:50 / Elemento padre: 18   */
      v.add(doc.createElement("td"));
      ((Element)v.get(18)).appendChild((Element)v.get(50));

      /* Empieza nodo:51 / Elemento padre: 50   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(51)).setAttribute("src","b.gif" );
      ((Element)v.get(50)).appendChild((Element)v.get(51));
      /* Termina nodo:51   */
      /* Termina nodo:50   */
      /* Termina nodo:18   */

      /* Empieza nodo:52 / Elemento padre: 10   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(10)).appendChild((Element)v.get(52));

      /* Empieza nodo:53 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(52)).appendChild((Element)v.get(53));

      /* Empieza nodo:54 / Elemento padre: 53   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(54)).setAttribute("src","b.gif" );
      ((Element)v.get(53)).appendChild((Element)v.get(54));
      /* Termina nodo:54   */
      /* Termina nodo:53   */

      /* Empieza nodo:55 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(52)).appendChild((Element)v.get(55));

      /* Empieza nodo:56 / Elemento padre: 55   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(55)).appendChild((Element)v.get(56));

      /* Empieza nodo:57 / Elemento padre: 56   */
      v.add(doc.createElement("table"));
      ((Element)v.get(57)).setAttribute("width","100%" );
      ((Element)v.get(57)).setAttribute("border","0" );
      ((Element)v.get(57)).setAttribute("align","center" );
      ((Element)v.get(57)).setAttribute("cellspacing","0" );
      ((Element)v.get(57)).setAttribute("cellpadding","0" );
      ((Element)v.get(56)).appendChild((Element)v.get(57));

      /* Empieza nodo:58 / Elemento padre: 57   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(57)).appendChild((Element)v.get(58));

      /* Empieza nodo:59 / Elemento padre: 58   */
      v.add(doc.createElement("td"));
      ((Element)v.get(59)).setAttribute("class","botonera" );
      ((Element)v.get(58)).appendChild((Element)v.get(59));

      /* Empieza nodo:60 / Elemento padre: 59   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(60)).setAttribute("nombre","btnAceptar" );
      ((Element)v.get(60)).setAttribute("ID","botonContenido" );
      ((Element)v.get(60)).setAttribute("tipo","html" );
      ((Element)v.get(60)).setAttribute("accion","aceptar();" );
      ((Element)v.get(60)).setAttribute("estado","false" );
      ((Element)v.get(60)).setAttribute("cod","12" );
      ((Element)v.get(59)).appendChild((Element)v.get(60));
      /* Termina nodo:60   */
      /* Termina nodo:59   */
      /* Termina nodo:58   */
      /* Termina nodo:57   */
      /* Termina nodo:56   */
      /* Termina nodo:55   */

      /* Empieza nodo:61 / Elemento padre: 52   */
      v.add(doc.createElement("td"));
      ((Element)v.get(52)).appendChild((Element)v.get(61));

      /* Empieza nodo:62 / Elemento padre: 61   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(62)).setAttribute("src","b.gif" );
      ((Element)v.get(62)).setAttribute("width","8" );
      ((Element)v.get(62)).setAttribute("height","12" );
      ((Element)v.get(61)).appendChild((Element)v.get(62));
      /* Termina nodo:62   */
      /* Termina nodo:61   */
      /* Termina nodo:52   */

      /* Empieza nodo:63 / Elemento padre: 10   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(10)).appendChild((Element)v.get(63));

      /* Empieza nodo:64 / Elemento padre: 63   */
      v.add(doc.createElement("td"));
      ((Element)v.get(64)).setAttribute("width","12" );
      ((Element)v.get(64)).setAttribute("align","center" );
      ((Element)v.get(63)).appendChild((Element)v.get(64));

      /* Empieza nodo:65 / Elemento padre: 64   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(65)).setAttribute("src","b.gif" );
      ((Element)v.get(65)).setAttribute("width","12" );
      ((Element)v.get(65)).setAttribute("height","12" );
      ((Element)v.get(64)).appendChild((Element)v.get(65));
      /* Termina nodo:65   */
      /* Termina nodo:64   */

      /* Empieza nodo:66 / Elemento padre: 63   */
      v.add(doc.createElement("td"));
      ((Element)v.get(66)).setAttribute("width","756" );
      ((Element)v.get(63)).appendChild((Element)v.get(66));

      /* Empieza nodo:67 / Elemento padre: 66   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(67)).setAttribute("src","b.gif" );
      ((Element)v.get(66)).appendChild((Element)v.get(67));
      /* Termina nodo:67   */
      /* Termina nodo:66   */

      /* Empieza nodo:68 / Elemento padre: 63   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).setAttribute("width","12" );
      ((Element)v.get(63)).appendChild((Element)v.get(68));

      /* Empieza nodo:69 / Elemento padre: 68   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(69)).setAttribute("src","b.gif" );
      ((Element)v.get(69)).setAttribute("width","12" );
      ((Element)v.get(69)).setAttribute("height","1" );
      ((Element)v.get(68)).appendChild((Element)v.get(69));
      /* Termina nodo:69   */
      /* Termina nodo:68   */
      /* Termina nodo:63   */
      /* Termina nodo:10   */
      /* Termina nodo:4   */


   }

}
