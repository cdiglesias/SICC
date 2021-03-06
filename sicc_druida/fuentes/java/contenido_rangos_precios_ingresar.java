
import org.w3c.dom.*;
import java.util.ArrayList;

public class contenido_rangos_precios_ingresar  implements es.indra.druida.base.ObjetoXML {
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
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","contenido_rangos_precios_ingresar" );
      ((Element)v.get(0)).setAttribute("cod","3192" );
      ((Element)v.get(0)).setAttribute("titulo","Ingresar rangos de precios" );
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
      ((Element)v.get(3)).setAttribute("src","UtilidadesDefinirOferta.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(3));
      /* Termina nodo:3   */

      /* Empieza nodo:4 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(4)).setAttribute("src","contenido_rangos_precios_ingresar.js" );
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
      ((Element)v.get(7)).setAttribute("name","txtDesde" );
      ((Element)v.get(7)).setAttribute("required","false" );
      ((Element)v.get(7)).setAttribute("format","E" );
      ((Element)v.get(7)).setAttribute("cod","1831" );
      ((Element)v.get(7)).setAttribute("req","N" );
      ((Element)v.get(7)).setAttribute("max","999999" );
      ((Element)v.get(7)).setAttribute("min","0" );
      ((Element)v.get(6)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */

      /* Empieza nodo:8 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(8)).setAttribute("name","txtHasta" );
      ((Element)v.get(8)).setAttribute("required","false" );
      ((Element)v.get(8)).setAttribute("format","E" );
      ((Element)v.get(8)).setAttribute("cod","1832" );
      ((Element)v.get(8)).setAttribute("req","N" );
      ((Element)v.get(8)).setAttribute("max","999999" );
      ((Element)v.get(8)).setAttribute("min","0" );
      ((Element)v.get(6)).appendChild((Element)v.get(8));
      /* Termina nodo:8   */

      /* Empieza nodo:9 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(9)).setAttribute("name","txtPosic" );
      ((Element)v.get(9)).setAttribute("required","false" );
      ((Element)v.get(9)).setAttribute("format","N" );
      ((Element)v.get(9)).setAttribute("cod","1116" );
      ((Element)v.get(9)).setAttribute("req","N" );
      ((Element)v.get(9)).setAttribute("max","999999999999.99" );
      ((Element)v.get(9)).setAttribute("min","0" );
      ((Element)v.get(6)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(10)).setAttribute("name","txtPrecioCat" );
      ((Element)v.get(10)).setAttribute("required","false" );
      ((Element)v.get(10)).setAttribute("format","N" );
      ((Element)v.get(10)).setAttribute("cod","503" );
      ((Element)v.get(10)).setAttribute("req","N" );
      ((Element)v.get(10)).setAttribute("max","999999999999.99" );
      ((Element)v.get(10)).setAttribute("min","0" );
      ((Element)v.get(6)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */

      /* Empieza nodo:11 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(11)).setAttribute("name","txtDesde" );
      ((Element)v.get(11)).setAttribute("required","true" );
      ((Element)v.get(11)).setAttribute("cod","1831" );
      ((Element)v.get(6)).appendChild((Element)v.get(11));
      /* Termina nodo:11   */

      /* Empieza nodo:12 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(12)).setAttribute("name","txtHasta" );
      ((Element)v.get(12)).setAttribute("required","true" );
      ((Element)v.get(12)).setAttribute("cod","1832" );
      ((Element)v.get(6)).appendChild((Element)v.get(12));
      /* Termina nodo:12   */

      /* Empieza nodo:13 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(13)).setAttribute("name","txtPosic" );
      ((Element)v.get(13)).setAttribute("required","true" );
      ((Element)v.get(13)).setAttribute("cod","1116" );
      ((Element)v.get(6)).appendChild((Element)v.get(13));
      /* Termina nodo:13   */

      /* Empieza nodo:14 / Elemento padre: 6   */
      v.add(doc.createElement("ELEMENTO"));
      ((Element)v.get(14)).setAttribute("name","txtPrecioCat" );
      ((Element)v.get(14)).setAttribute("required","true" );
      ((Element)v.get(14)).setAttribute("cod","503" );
      ((Element)v.get(6)).appendChild((Element)v.get(14));
      /* Termina nodo:14   */
      /* Termina nodo:6   */

      /* Empieza nodo:15 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(15)).setAttribute("nombre","formulario" );
      ((Element)v.get(15)).setAttribute("oculto","N" );
      ((Element)v.get(0)).appendChild((Element)v.get(15));

      /* Empieza nodo:16 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(16)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(16)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(16));
      /* Termina nodo:16   */

      /* Empieza nodo:17 / Elemento padre: 15   */
   }

   private void getXML90(Document doc) {
      v.add(doc.createElement("VAR"));
      ((Element)v.get(17)).setAttribute("nombre","accion" );
      ((Element)v.get(17)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */

      /* Empieza nodo:18 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(18)).setAttribute("nombre","errCodigo" );
      ((Element)v.get(18)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(18));
      /* Termina nodo:18   */

      /* Empieza nodo:19 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(19)).setAttribute("nombre","errDescripcion" );
      ((Element)v.get(19)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(19));
      /* Termina nodo:19   */

      /* Empieza nodo:20 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(20)).setAttribute("nombre","casoDeUso" );
      ((Element)v.get(20)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(20));
      /* Termina nodo:20   */

      /* Empieza nodo:21 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(21)).setAttribute("nombre","htipoOperacion" );
      ((Element)v.get(21)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(21));
      /* Termina nodo:21   */

      /* Empieza nodo:22 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(22)).setAttribute("nombre","htipoOperacionMODIFICACION" );
      ((Element)v.get(22)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(22));
      /* Termina nodo:22   */

      /* Empieza nodo:23 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(23)).setAttribute("nombre","hRangosSerializados" );
      ((Element)v.get(23)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(23));
      /* Termina nodo:23   */

      /* Empieza nodo:24 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(24)).setAttribute("nombre","hOidDetalle" );
      ((Element)v.get(24)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(24));
      /* Termina nodo:24   */

      /* Empieza nodo:25 / Elemento padre: 15   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(25)).setAttribute("nombre","hPrecioPosicionamiento" );
      ((Element)v.get(25)).setAttribute("valor","" );
      ((Element)v.get(15)).appendChild((Element)v.get(25));
      /* Termina nodo:25   */

      /* Empieza nodo:26 / Elemento padre: 15   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(26)).setAttribute("nombre","capa1" );
      ((Element)v.get(26)).setAttribute("alto","439" );
      ((Element)v.get(26)).setAttribute("ancho","100%" );
      ((Element)v.get(26)).setAttribute("colorf","" );
      ((Element)v.get(26)).setAttribute("borde","0" );
      ((Element)v.get(26)).setAttribute("imagenf","" );
      ((Element)v.get(26)).setAttribute("repeat","" );
      ((Element)v.get(26)).setAttribute("padding","" );
      ((Element)v.get(26)).setAttribute("visibilidad","visible" );
      ((Element)v.get(26)).setAttribute("contravsb","" );
      ((Element)v.get(26)).setAttribute("x","0" );
      ((Element)v.get(26)).setAttribute("y","10" );
      ((Element)v.get(26)).setAttribute("zindex","" );
      ((Element)v.get(15)).appendChild((Element)v.get(26));

      /* Empieza nodo:27 / Elemento padre: 26   */
      v.add(doc.createElement("table"));
      ((Element)v.get(27)).setAttribute("width","100%" );
      ((Element)v.get(27)).setAttribute("border","0" );
      ((Element)v.get(27)).setAttribute("cellspacing","0" );
      ((Element)v.get(27)).setAttribute("cellpadding","0" );
      ((Element)v.get(26)).appendChild((Element)v.get(27));

      /* Empieza nodo:28 / Elemento padre: 27   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(27)).appendChild((Element)v.get(28));

      /* Empieza nodo:29 / Elemento padre: 28   */
      v.add(doc.createElement("td"));
      ((Element)v.get(29)).setAttribute("width","12" );
      ((Element)v.get(29)).setAttribute("align","center" );
      ((Element)v.get(28)).appendChild((Element)v.get(29));

      /* Empieza nodo:30 / Elemento padre: 29   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(30)).setAttribute("src","b.gif" );
      ((Element)v.get(30)).setAttribute("width","12" );
      ((Element)v.get(30)).setAttribute("height","12" );
      ((Element)v.get(29)).appendChild((Element)v.get(30));
      /* Termina nodo:30   */
      /* Termina nodo:29   */

      /* Empieza nodo:31 / Elemento padre: 28   */
      v.add(doc.createElement("td"));
      ((Element)v.get(31)).setAttribute("width","756" );
      ((Element)v.get(28)).appendChild((Element)v.get(31));

      /* Empieza nodo:32 / Elemento padre: 31   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(32)).setAttribute("src","b.gif" );
      ((Element)v.get(31)).appendChild((Element)v.get(32));
      /* Termina nodo:32   */
      /* Termina nodo:31   */

      /* Empieza nodo:33 / Elemento padre: 28   */
      v.add(doc.createElement("td"));
      ((Element)v.get(33)).setAttribute("width","12" );
      ((Element)v.get(28)).appendChild((Element)v.get(33));

      /* Empieza nodo:34 / Elemento padre: 33   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(34)).setAttribute("src","b.gif" );
      ((Element)v.get(34)).setAttribute("width","12" );
      ((Element)v.get(34)).setAttribute("height","12" );
      ((Element)v.get(33)).appendChild((Element)v.get(34));
      /* Termina nodo:34   */
      /* Termina nodo:33   */
      /* Termina nodo:28   */

      /* Empieza nodo:35 / Elemento padre: 27   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(27)).appendChild((Element)v.get(35));

      /* Empieza nodo:36 / Elemento padre: 35   */
      v.add(doc.createElement("td"));
      ((Element)v.get(35)).appendChild((Element)v.get(36));

      /* Empieza nodo:37 / Elemento padre: 36   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(37)).setAttribute("src","b.gif" );
      ((Element)v.get(36)).appendChild((Element)v.get(37));
      /* Termina nodo:37   */
      /* Termina nodo:36   */

      /* Empieza nodo:38 / Elemento padre: 35   */
      v.add(doc.createElement("td"));
   }

   private void getXML180(Document doc) {
      ((Element)v.get(35)).appendChild((Element)v.get(38));

      /* Empieza nodo:39 / Elemento padre: 38   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(38)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(40)).setAttribute("class","legend" );
      ((Element)v.get(39)).appendChild((Element)v.get(40));

      /* Empieza nodo:41 / Elemento padre: 40   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(41)).setAttribute("nombre","lblEscalasDescuento" );
      ((Element)v.get(41)).setAttribute("alto","13" );
      ((Element)v.get(41)).setAttribute("filas","1" );
      ((Element)v.get(41)).setAttribute("valor","" );
      ((Element)v.get(41)).setAttribute("cod","3192" );
      ((Element)v.get(41)).setAttribute("id","legend" );
      ((Element)v.get(40)).appendChild((Element)v.get(41));
      /* Termina nodo:41   */
      /* Termina nodo:40   */

      /* Empieza nodo:42 / Elemento padre: 39   */
      v.add(doc.createElement("table"));
      ((Element)v.get(42)).setAttribute("width","100%" );
      ((Element)v.get(42)).setAttribute("border","0" );
      ((Element)v.get(42)).setAttribute("align","center" );
      ((Element)v.get(42)).setAttribute("cellspacing","0" );
      ((Element)v.get(42)).setAttribute("cellpadding","0" );
      ((Element)v.get(39)).appendChild((Element)v.get(42));

      /* Empieza nodo:43 / Elemento padre: 42   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(42)).appendChild((Element)v.get(43));

      /* Empieza nodo:44 / Elemento padre: 43   */
      v.add(doc.createElement("td"));
      ((Element)v.get(43)).appendChild((Element)v.get(44));

      /* Empieza nodo:45 / Elemento padre: 44   */
      v.add(doc.createElement("table"));
      ((Element)v.get(45)).setAttribute("width","575" );
      ((Element)v.get(45)).setAttribute("border","0" );
      ((Element)v.get(45)).setAttribute("align","left" );
      ((Element)v.get(45)).setAttribute("cellspacing","0" );
      ((Element)v.get(45)).setAttribute("cellpadding","0" );
      ((Element)v.get(44)).appendChild((Element)v.get(45));

      /* Empieza nodo:46 / Elemento padre: 45   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(45)).appendChild((Element)v.get(46));

      /* Empieza nodo:47 / Elemento padre: 46   */
      v.add(doc.createElement("td"));
      ((Element)v.get(47)).setAttribute("colspan","4" );
      ((Element)v.get(46)).appendChild((Element)v.get(47));

      /* Empieza nodo:48 / Elemento padre: 47   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(48)).setAttribute("src","b.gif" );
      ((Element)v.get(48)).setAttribute("width","8" );
      ((Element)v.get(48)).setAttribute("height","8" );
      ((Element)v.get(47)).appendChild((Element)v.get(48));
      /* Termina nodo:48   */
      /* Termina nodo:47   */
      /* Termina nodo:46   */

      /* Empieza nodo:49 / Elemento padre: 45   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(45)).appendChild((Element)v.get(49));

      /* Empieza nodo:50 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(50));

      /* Empieza nodo:51 / Elemento padre: 50   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(51)).setAttribute("src","b.gif" );
      ((Element)v.get(51)).setAttribute("width","8" );
      ((Element)v.get(51)).setAttribute("height","8" );
      ((Element)v.get(50)).appendChild((Element)v.get(51));
      /* Termina nodo:51   */
      /* Termina nodo:50   */

      /* Empieza nodo:52 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(52));

      /* Empieza nodo:53 / Elemento padre: 52   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(53)).setAttribute("nombre","lblDesde" );
      ((Element)v.get(53)).setAttribute("alto","13" );
      ((Element)v.get(53)).setAttribute("filas","1" );
      ((Element)v.get(53)).setAttribute("valor","" );
      ((Element)v.get(53)).setAttribute("id","datosTitle" );
      ((Element)v.get(53)).setAttribute("cod","3204" );
      ((Element)v.get(52)).appendChild((Element)v.get(53));
      /* Termina nodo:53   */
      /* Termina nodo:52   */

      /* Empieza nodo:54 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(54));

      /* Empieza nodo:55 / Elemento padre: 54   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(55)).setAttribute("src","b.gif" );
      ((Element)v.get(55)).setAttribute("width","8" );
      ((Element)v.get(55)).setAttribute("height","8" );
      ((Element)v.get(54)).appendChild((Element)v.get(55));
      /* Termina nodo:55   */
      /* Termina nodo:54   */

      /* Empieza nodo:56 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(56));

      /* Empieza nodo:57 / Elemento padre: 56   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(57)).setAttribute("nombre","lblHasta" );
      ((Element)v.get(57)).setAttribute("alto","13" );
      ((Element)v.get(57)).setAttribute("filas","1" );
      ((Element)v.get(57)).setAttribute("valor","" );
      ((Element)v.get(57)).setAttribute("id","datosTitle" );
      ((Element)v.get(57)).setAttribute("cod","3205" );
      ((Element)v.get(56)).appendChild((Element)v.get(57));
      /* Termina nodo:57   */
      /* Termina nodo:56   */

      /* Empieza nodo:58 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(58));

      /* Empieza nodo:59 / Elemento padre: 58   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(59)).setAttribute("src","b.gif" );
      ((Element)v.get(59)).setAttribute("width","8" );
      ((Element)v.get(59)).setAttribute("height","8" );
      ((Element)v.get(58)).appendChild((Element)v.get(59));
      /* Termina nodo:59   */
      /* Termina nodo:58   */

      /* Empieza nodo:60 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(60));

      /* Empieza nodo:61 / Elemento padre: 60   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(61)).setAttribute("nombre","lblPosic" );
      ((Element)v.get(61)).setAttribute("alto","13" );
   }

   private void getXML270(Document doc) {
      ((Element)v.get(61)).setAttribute("filas","1" );
      ((Element)v.get(61)).setAttribute("valor","" );
      ((Element)v.get(61)).setAttribute("id","datosTitle" );
      ((Element)v.get(61)).setAttribute("cod","1116" );
      ((Element)v.get(60)).appendChild((Element)v.get(61));
      /* Termina nodo:61   */
      /* Termina nodo:60   */

      /* Empieza nodo:62 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(62));

      /* Empieza nodo:63 / Elemento padre: 62   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(63)).setAttribute("src","b.gif" );
      ((Element)v.get(63)).setAttribute("width","8" );
      ((Element)v.get(63)).setAttribute("height","8" );
      ((Element)v.get(62)).appendChild((Element)v.get(63));
      /* Termina nodo:63   */
      /* Termina nodo:62   */

      /* Empieza nodo:64 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).appendChild((Element)v.get(64));

      /* Empieza nodo:65 / Elemento padre: 64   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(65)).setAttribute("nombre","lblPreCat" );
      ((Element)v.get(65)).setAttribute("alto","13" );
      ((Element)v.get(65)).setAttribute("filas","1" );
      ((Element)v.get(65)).setAttribute("valor","" );
      ((Element)v.get(65)).setAttribute("id","datosTitle" );
      ((Element)v.get(65)).setAttribute("cod","503" );
      ((Element)v.get(64)).appendChild((Element)v.get(65));
      /* Termina nodo:65   */
      /* Termina nodo:64   */

      /* Empieza nodo:66 / Elemento padre: 49   */
      v.add(doc.createElement("td"));
      ((Element)v.get(66)).setAttribute("width","100%" );
      ((Element)v.get(49)).appendChild((Element)v.get(66));

      /* Empieza nodo:67 / Elemento padre: 66   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(67)).setAttribute("src","b.gif" );
      ((Element)v.get(67)).setAttribute("width","8" );
      ((Element)v.get(67)).setAttribute("height","8" );
      ((Element)v.get(66)).appendChild((Element)v.get(67));
      /* Termina nodo:67   */
      /* Termina nodo:66   */
      /* Termina nodo:49   */

      /* Empieza nodo:68 / Elemento padre: 45   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(45)).appendChild((Element)v.get(68));

      /* Empieza nodo:69 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(69));

      /* Empieza nodo:70 / Elemento padre: 69   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(70)).setAttribute("src","b.gif" );
      ((Element)v.get(70)).setAttribute("width","8" );
      ((Element)v.get(70)).setAttribute("height","8" );
      ((Element)v.get(69)).appendChild((Element)v.get(70));
      /* Termina nodo:70   */
      /* Termina nodo:69   */

      /* Empieza nodo:71 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(71));

      /* Empieza nodo:72 / Elemento padre: 71   */
      v.add(doc.createElement("CTEXTO"));
      ((Element)v.get(72)).setAttribute("nombre","txtDesde" );
      ((Element)v.get(72)).setAttribute("id","datosCampos" );
      ((Element)v.get(72)).setAttribute("tipo","" );
      ((Element)v.get(72)).setAttribute("onchange","" );
      ((Element)v.get(72)).setAttribute("req","S" );
      ((Element)v.get(72)).setAttribute("size","5" );
      ((Element)v.get(72)).setAttribute("max","6" );
      ((Element)v.get(72)).setAttribute("valor","" );
      ((Element)v.get(72)).setAttribute("validacion","" );
      ((Element)v.get(72)).setAttribute("onshtab","focalizaBotonHTML('botonContenido','btnAnadir')" );
      ((Element)v.get(71)).appendChild((Element)v.get(72));
      /* Termina nodo:72   */
      /* Termina nodo:71   */

      /* Empieza nodo:73 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(73));

      /* Empieza nodo:74 / Elemento padre: 73   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(74)).setAttribute("src","b.gif" );
      ((Element)v.get(74)).setAttribute("width","8" );
      ((Element)v.get(74)).setAttribute("height","8" );
      ((Element)v.get(73)).appendChild((Element)v.get(74));
      /* Termina nodo:74   */
      /* Termina nodo:73   */

      /* Empieza nodo:75 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(75));

      /* Empieza nodo:76 / Elemento padre: 75   */
      v.add(doc.createElement("CTEXTO"));
      ((Element)v.get(76)).setAttribute("nombre","txtHasta" );
      ((Element)v.get(76)).setAttribute("id","datosCampos" );
      ((Element)v.get(76)).setAttribute("tipo","" );
      ((Element)v.get(76)).setAttribute("onchange","" );
      ((Element)v.get(76)).setAttribute("req","S" );
      ((Element)v.get(76)).setAttribute("size","5" );
      ((Element)v.get(76)).setAttribute("max","6" );
      ((Element)v.get(76)).setAttribute("valor","" );
      ((Element)v.get(76)).setAttribute("validacion","" );
      ((Element)v.get(75)).appendChild((Element)v.get(76));
      /* Termina nodo:76   */
      /* Termina nodo:75   */

      /* Empieza nodo:77 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(77));

      /* Empieza nodo:78 / Elemento padre: 77   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(78)).setAttribute("src","b.gif" );
      ((Element)v.get(78)).setAttribute("width","8" );
      ((Element)v.get(78)).setAttribute("height","8" );
      ((Element)v.get(77)).appendChild((Element)v.get(78));
      /* Termina nodo:78   */
      /* Termina nodo:77   */

      /* Empieza nodo:79 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(79));

      /* Empieza nodo:80 / Elemento padre: 79   */
      v.add(doc.createElement("CTEXTO"));
      ((Element)v.get(80)).setAttribute("nombre","txtPosic" );
      ((Element)v.get(80)).setAttribute("id","datosCampos" );
      ((Element)v.get(80)).setAttribute("tipo","" );
      ((Element)v.get(80)).setAttribute("onchange","" );
      ((Element)v.get(80)).setAttribute("req","S" );
      ((Element)v.get(80)).setAttribute("size","10" );
      ((Element)v.get(80)).setAttribute("max","15" );
   }

   private void getXML360(Document doc) {
      ((Element)v.get(80)).setAttribute("valor","" );
      ((Element)v.get(80)).setAttribute("validacion","" );
      ((Element)v.get(79)).appendChild((Element)v.get(80));
      /* Termina nodo:80   */
      /* Termina nodo:79   */

      /* Empieza nodo:81 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(81));

      /* Empieza nodo:82 / Elemento padre: 81   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(82)).setAttribute("src","b.gif" );
      ((Element)v.get(82)).setAttribute("width","8" );
      ((Element)v.get(82)).setAttribute("height","8" );
      ((Element)v.get(81)).appendChild((Element)v.get(82));
      /* Termina nodo:82   */
      /* Termina nodo:81   */

      /* Empieza nodo:83 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(68)).appendChild((Element)v.get(83));

      /* Empieza nodo:84 / Elemento padre: 83   */
      v.add(doc.createElement("CTEXTO"));
      ((Element)v.get(84)).setAttribute("nombre","txtPrecioCat" );
      ((Element)v.get(84)).setAttribute("id","datosCampos" );
      ((Element)v.get(84)).setAttribute("tipo","" );
      ((Element)v.get(84)).setAttribute("onchange","" );
      ((Element)v.get(84)).setAttribute("req","S" );
      ((Element)v.get(84)).setAttribute("size","8" );
      ((Element)v.get(84)).setAttribute("max","15" );
      ((Element)v.get(84)).setAttribute("valor","" );
      ((Element)v.get(84)).setAttribute("validacion","" );
      ((Element)v.get(84)).setAttribute("ontab","focalizaBotonHTML('botonContenido','btnEliminar')" );
      ((Element)v.get(83)).appendChild((Element)v.get(84));
      /* Termina nodo:84   */
      /* Termina nodo:83   */

      /* Empieza nodo:85 / Elemento padre: 68   */
      v.add(doc.createElement("td"));
      ((Element)v.get(85)).setAttribute("width","100%" );
      ((Element)v.get(68)).appendChild((Element)v.get(85));

      /* Empieza nodo:86 / Elemento padre: 85   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(86)).setAttribute("src","b.gif" );
      ((Element)v.get(86)).setAttribute("width","8" );
      ((Element)v.get(86)).setAttribute("height","8" );
      ((Element)v.get(85)).appendChild((Element)v.get(86));
      /* Termina nodo:86   */
      /* Termina nodo:85   */
      /* Termina nodo:68   */

      /* Empieza nodo:87 / Elemento padre: 45   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(45)).appendChild((Element)v.get(87));

      /* Empieza nodo:88 / Elemento padre: 87   */
      v.add(doc.createElement("td"));
      ((Element)v.get(87)).appendChild((Element)v.get(88));

      /* Empieza nodo:89 / Elemento padre: 88   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(89)).setAttribute("src","b.gif" );
      ((Element)v.get(89)).setAttribute("width","8" );
      ((Element)v.get(89)).setAttribute("height","330" );
      ((Element)v.get(88)).appendChild((Element)v.get(89));
      /* Termina nodo:89   */
      /* Termina nodo:88   */
      /* Termina nodo:87   */
      /* Termina nodo:45   */
      /* Termina nodo:44   */
      /* Termina nodo:43   */
      /* Termina nodo:42   */
      /* Termina nodo:39   */
      /* Termina nodo:38   */

      /* Empieza nodo:90 / Elemento padre: 35   */
      v.add(doc.createElement("td"));
      ((Element)v.get(35)).appendChild((Element)v.get(90));

      /* Empieza nodo:91 / Elemento padre: 90   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(91)).setAttribute("src","b.gif" );
      ((Element)v.get(91)).setAttribute("width","8" );
      ((Element)v.get(91)).setAttribute("height","12" );
      ((Element)v.get(90)).appendChild((Element)v.get(91));
      /* Termina nodo:91   */
      /* Termina nodo:90   */
      /* Termina nodo:35   */

      /* Empieza nodo:92 / Elemento padre: 27   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(27)).appendChild((Element)v.get(92));

      /* Empieza nodo:93 / Elemento padre: 92   */
      v.add(doc.createElement("td"));
      ((Element)v.get(93)).setAttribute("width","12" );
      ((Element)v.get(93)).setAttribute("align","center" );
      ((Element)v.get(92)).appendChild((Element)v.get(93));

      /* Empieza nodo:94 / Elemento padre: 93   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(94)).setAttribute("src","b.gif" );
      ((Element)v.get(94)).setAttribute("width","12" );
      ((Element)v.get(94)).setAttribute("height","12" );
      ((Element)v.get(93)).appendChild((Element)v.get(94));
      /* Termina nodo:94   */
      /* Termina nodo:93   */

      /* Empieza nodo:95 / Elemento padre: 92   */
      v.add(doc.createElement("td"));
      ((Element)v.get(95)).setAttribute("width","756" );
      ((Element)v.get(92)).appendChild((Element)v.get(95));

      /* Empieza nodo:96 / Elemento padre: 95   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(96)).setAttribute("src","b.gif" );
      ((Element)v.get(95)).appendChild((Element)v.get(96));
      /* Termina nodo:96   */
      /* Termina nodo:95   */

      /* Empieza nodo:97 / Elemento padre: 92   */
      v.add(doc.createElement("td"));
      ((Element)v.get(97)).setAttribute("width","12" );
      ((Element)v.get(92)).appendChild((Element)v.get(97));

      /* Empieza nodo:98 / Elemento padre: 97   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(98)).setAttribute("src","b.gif" );
      ((Element)v.get(98)).setAttribute("width","12" );
      ((Element)v.get(98)).setAttribute("height","12" );
      ((Element)v.get(97)).appendChild((Element)v.get(98));
      /* Termina nodo:98   */
      /* Termina nodo:97   */
      /* Termina nodo:92   */
      /* Termina nodo:27   */
      /* Termina nodo:26   */

      /* Empieza nodo:99 / Elemento padre: 15   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(99)).setAttribute("nombre","listado1" );
      ((Element)v.get(99)).setAttribute("ancho","555" );
      ((Element)v.get(99)).setAttribute("alto","321" );
      ((Element)v.get(99)).setAttribute("x","24" );
      ((Element)v.get(99)).setAttribute("y","85" );
      ((Element)v.get(99)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(99)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(15)).appendChild((Element)v.get(99));

      /* Empieza nodo:100 / Elemento padre: 99   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(100)).setAttribute("precarga","S" );
      ((Element)v.get(100)).setAttribute("conROver","S" );
      ((Element)v.get(99)).appendChild((Element)v.get(100));

      /* Empieza nodo:101 / Elemento padre: 100   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(101)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(101)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(101)).setAttribute("seleccionado","btnLista2M.gif" );
   }

   private void getXML450(Document doc) {
      ((Element)v.get(101)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(100)).appendChild((Element)v.get(101));
      /* Termina nodo:101   */

      /* Empieza nodo:102 / Elemento padre: 100   */
      v.add(doc.createElement("BTNMINIMIZAR"));
      ((Element)v.get(102)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(102)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(102)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(102)).setAttribute("maximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(100)).appendChild((Element)v.get(102));
      /* Termina nodo:102   */

      /* Empieza nodo:103 / Elemento padre: 100   */
      v.add(doc.createElement("BTNORDENAR"));
      ((Element)v.get(103)).setAttribute("ordenar","ascendente_on.gif" );
      ((Element)v.get(103)).setAttribute("ordenarInv","descendente_on.gif" );
      ((Element)v.get(100)).appendChild((Element)v.get(103));
      /* Termina nodo:103   */
      /* Termina nodo:100   */

      /* Empieza nodo:104 / Elemento padre: 99   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(99)).appendChild((Element)v.get(104));

      /* Empieza nodo:105 / Elemento padre: 104   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(105)).setAttribute("borde","1" );
      ((Element)v.get(105)).setAttribute("horizDatos","1" );
      ((Element)v.get(105)).setAttribute("horizCabecera","1" );
      ((Element)v.get(105)).setAttribute("vertical","0" );
      ((Element)v.get(105)).setAttribute("horizTitulo","1" );
      ((Element)v.get(105)).setAttribute("horizBase","1" );
      ((Element)v.get(104)).appendChild((Element)v.get(105));
      /* Termina nodo:105   */

      /* Empieza nodo:106 / Elemento padre: 104   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(106)).setAttribute("borde","#999999" );
      ((Element)v.get(106)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(106)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(106)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(106)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(106)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(106)).setAttribute("horizBase","#999999" );
      ((Element)v.get(104)).appendChild((Element)v.get(106));
      /* Termina nodo:106   */
      /* Termina nodo:104   */

      /* Empieza nodo:107 / Elemento padre: 99   */
      v.add(doc.createElement("TITULO"));
      ((Element)v.get(107)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(107)).setAttribute("alto","22" );
      ((Element)v.get(107)).setAttribute("imgFondo","" );
      ((Element)v.get(107)).setAttribute("cod","0098" );
      ((Element)v.get(107)).setAttribute("ID","datosTitle" );
      ((Element)v.get(99)).appendChild((Element)v.get(107));
      /* Termina nodo:107   */

      /* Empieza nodo:108 / Elemento padre: 99   */
      v.add(doc.createElement("BASE"));
      ((Element)v.get(108)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(108)).setAttribute("alto","22" );
      ((Element)v.get(108)).setAttribute("imgFondo","" );
      ((Element)v.get(99)).appendChild((Element)v.get(108));
      /* Termina nodo:108   */

      /* Empieza nodo:109 / Elemento padre: 99   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(109)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(109)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(109)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(109)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(109)).setAttribute("AnchoMinimizadas","20" );
      ((Element)v.get(109)).setAttribute("botonOrdenar","S" );
      ((Element)v.get(99)).appendChild((Element)v.get(109));

      /* Empieza nodo:110 / Elemento padre: 109   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(110)).setAttribute("ancho","100" );
      ((Element)v.get(110)).setAttribute("minimizable","S" );
      ((Element)v.get(110)).setAttribute("minimizada","N" );
      ((Element)v.get(109)).appendChild((Element)v.get(110));
      /* Termina nodo:110   */

      /* Empieza nodo:111 / Elemento padre: 109   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(111)).setAttribute("ancho","100" );
      ((Element)v.get(111)).setAttribute("minimizable","S" );
      ((Element)v.get(111)).setAttribute("minimizada","N" );
      ((Element)v.get(109)).appendChild((Element)v.get(111));
      /* Termina nodo:111   */

      /* Empieza nodo:112 / Elemento padre: 109   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(112)).setAttribute("ancho","100" );
      ((Element)v.get(112)).setAttribute("minimizable","S" );
      ((Element)v.get(112)).setAttribute("minimizada","N" );
      ((Element)v.get(109)).appendChild((Element)v.get(112));
      /* Termina nodo:112   */

      /* Empieza nodo:113 / Elemento padre: 109   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(113)).setAttribute("ancho","100" );
      ((Element)v.get(113)).setAttribute("minimizable","S" );
      ((Element)v.get(113)).setAttribute("minimizada","N" );
      ((Element)v.get(109)).appendChild((Element)v.get(113));
      /* Termina nodo:113   */
      /* Termina nodo:109   */

      /* Empieza nodo:114 / Elemento padre: 99   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(114)).setAttribute("alto","20" );
      ((Element)v.get(114)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(114)).setAttribute("imgFondo","" );
      ((Element)v.get(114)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(99)).appendChild((Element)v.get(114));

      /* Empieza nodo:115 / Elemento padre: 114   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(115)).setAttribute("colFondo","" );
      ((Element)v.get(115)).setAttribute("ID","EstCab" );
      ((Element)v.get(115)).setAttribute("align","center" );
      ((Element)v.get(115)).setAttribute("cod","3204" );
      ((Element)v.get(114)).appendChild((Element)v.get(115));
      /* Termina nodo:115   */

      /* Empieza nodo:116 / Elemento padre: 114   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(116)).setAttribute("colFondo","" );
      ((Element)v.get(116)).setAttribute("ID","EstCab" );
      ((Element)v.get(116)).setAttribute("cod","3205" );
      ((Element)v.get(114)).appendChild((Element)v.get(116));
      /* Termina nodo:116   */

      /* Empieza nodo:117 / Elemento padre: 114   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(117)).setAttribute("colFondo","" );
   }

   private void getXML540(Document doc) {
      ((Element)v.get(117)).setAttribute("ID","EstCab" );
      ((Element)v.get(117)).setAttribute("cod","1116" );
      ((Element)v.get(114)).appendChild((Element)v.get(117));
      /* Termina nodo:117   */

      /* Empieza nodo:118 / Elemento padre: 114   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(118)).setAttribute("colFondo","" );
      ((Element)v.get(118)).setAttribute("ID","EstCab" );
      ((Element)v.get(118)).setAttribute("cod","503" );
      ((Element)v.get(114)).appendChild((Element)v.get(118));
      /* Termina nodo:118   */
      /* Termina nodo:114   */

      /* Empieza nodo:119 / Elemento padre: 99   */
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(119)).setAttribute("alto","22" );
      ((Element)v.get(119)).setAttribute("accion","" );
      ((Element)v.get(119)).setAttribute("tipoEnvio","edicion" );
      ((Element)v.get(119)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(119)).setAttribute("maxSel","-1" );
      ((Element)v.get(119)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(119)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(119)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(119)).setAttribute("onLoad","" );
      ((Element)v.get(119)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(99)).appendChild((Element)v.get(119));

      /* Empieza nodo:120 / Elemento padre: 119   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(120)).setAttribute("tipo","texto" );
      ((Element)v.get(120)).setAttribute("ID","EstDat" );
      ((Element)v.get(119)).appendChild((Element)v.get(120));
      /* Termina nodo:120   */

      /* Empieza nodo:121 / Elemento padre: 119   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(121)).setAttribute("tipo","texto" );
      ((Element)v.get(121)).setAttribute("ID","EstDat2" );
      ((Element)v.get(119)).appendChild((Element)v.get(121));
      /* Termina nodo:121   */

      /* Empieza nodo:122 / Elemento padre: 119   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(122)).setAttribute("tipo","texto" );
      ((Element)v.get(122)).setAttribute("ID","EstDat" );
      ((Element)v.get(119)).appendChild((Element)v.get(122));
      /* Termina nodo:122   */

      /* Empieza nodo:123 / Elemento padre: 119   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(123)).setAttribute("tipo","texto" );
      ((Element)v.get(123)).setAttribute("ID","EstDat2" );
      ((Element)v.get(119)).appendChild((Element)v.get(123));
      /* Termina nodo:123   */
      /* Termina nodo:119   */

      /* Empieza nodo:124 / Elemento padre: 99   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(99)).appendChild((Element)v.get(124));
      /* Termina nodo:124   */

      /* Empieza nodo:125 / Elemento padre: 99   */
      v.add(doc.createElement("PAGINADO"));
      ((Element)v.get(125)).setAttribute("nombre","mipgndo" );
      ((Element)v.get(125)).setAttribute("ancho","726" );
      ((Element)v.get(125)).setAttribute("sep","$" );
      ((Element)v.get(125)).setAttribute("x","12" );
      ((Element)v.get(125)).setAttribute("class","botonera" );
      ((Element)v.get(125)).setAttribute("y","393" );
      ((Element)v.get(125)).setAttribute("control","|" );
      ((Element)v.get(125)).setAttribute("conector","" );
      ((Element)v.get(125)).setAttribute("rowset","" );
      ((Element)v.get(125)).setAttribute("cargainicial","N" );
      ((Element)v.get(99)).appendChild((Element)v.get(125));

      /* Empieza nodo:126 / Elemento padre: 125   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(126)).setAttribute("nombre","ret" );
      ((Element)v.get(126)).setAttribute("x","49" );
      ((Element)v.get(126)).setAttribute("y","387" );
      ((Element)v.get(126)).setAttribute("ID","botonContenido" );
      ((Element)v.get(126)).setAttribute("img","retroceder_on" );
      ((Element)v.get(126)).setAttribute("tipo","0" );
      ((Element)v.get(126)).setAttribute("estado","false" );
      ((Element)v.get(126)).setAttribute("alt","" );
      ((Element)v.get(126)).setAttribute("codigo","" );
      ((Element)v.get(126)).setAttribute("accion","mipgndo.retroceder();" );
      ((Element)v.get(125)).appendChild((Element)v.get(126));
      /* Termina nodo:126   */

      /* Empieza nodo:127 / Elemento padre: 125   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(127)).setAttribute("nombre","ava" );
      ((Element)v.get(127)).setAttribute("x","64" );
      ((Element)v.get(127)).setAttribute("y","387" );
      ((Element)v.get(127)).setAttribute("ID","botonContenido" );
      ((Element)v.get(127)).setAttribute("img","avanzar_on" );
      ((Element)v.get(127)).setAttribute("tipo","0" );
      ((Element)v.get(127)).setAttribute("estado","false" );
      ((Element)v.get(127)).setAttribute("alt","" );
      ((Element)v.get(127)).setAttribute("codigo","" );
      ((Element)v.get(127)).setAttribute("accion","mipgndo.avanzar();" );
      ((Element)v.get(125)).appendChild((Element)v.get(127));
      /* Termina nodo:127   */
      /* Termina nodo:125   */
      /* Termina nodo:99   */

      /* Empieza nodo:128 / Elemento padre: 15   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(128)).setAttribute("nombre","primera" );
      ((Element)v.get(128)).setAttribute("x","32" );
      ((Element)v.get(128)).setAttribute("y","387" );
      ((Element)v.get(128)).setAttribute("ID","botonContenido" );
      ((Element)v.get(128)).setAttribute("img","primera_on" );
      ((Element)v.get(128)).setAttribute("tipo","1" );
      ((Element)v.get(128)).setAttribute("estado","false" );
      ((Element)v.get(128)).setAttribute("alt","" );
      ((Element)v.get(128)).setAttribute("codigo","" );
      ((Element)v.get(128)).setAttribute("accion","mipgndo3.retrocederPrimeraPagina();" );
      ((Element)v.get(15)).appendChild((Element)v.get(128));
      /* Termina nodo:128   */

      /* Empieza nodo:129 / Elemento padre: 15   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(129)).setAttribute("nombre","separa" );
      ((Element)v.get(129)).setAttribute("x","71" );
      ((Element)v.get(129)).setAttribute("y","383" );
   }

   private void getXML630(Document doc) {
      ((Element)v.get(129)).setAttribute("ID","botonContenido" );
      ((Element)v.get(129)).setAttribute("img","separa_base" );
      ((Element)v.get(129)).setAttribute("tipo","0" );
      ((Element)v.get(129)).setAttribute("estado","false" );
      ((Element)v.get(129)).setAttribute("alt","" );
      ((Element)v.get(129)).setAttribute("codigo","" );
      ((Element)v.get(129)).setAttribute("accion","" );
      ((Element)v.get(15)).appendChild((Element)v.get(129));
      /* Termina nodo:129   */

      /* Empieza nodo:130 / Elemento padre: 15   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(130)).setAttribute("nombre","btnAnadir" );
      ((Element)v.get(130)).setAttribute("x","79" );
      ((Element)v.get(130)).setAttribute("y","384" );
      ((Element)v.get(130)).setAttribute("ID","botonContenido" );
      ((Element)v.get(130)).setAttribute("tipo","html" );
      ((Element)v.get(130)).setAttribute("estado","false" );
      ((Element)v.get(130)).setAttribute("cod","404" );
      ((Element)v.get(130)).setAttribute("accion","accionAnadir();" );
      ((Element)v.get(130)).setAttribute("ontab","focaliza('formulario.txtDesde')" );
      ((Element)v.get(130)).setAttribute("onshtab","focalizaBotonHTML('botonContenido','btnEliminar')" );
      ((Element)v.get(15)).appendChild((Element)v.get(130));
      /* Termina nodo:130   */

      /* Empieza nodo:131 / Elemento padre: 15   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(131)).setAttribute("nombre","btnEliminar" );
      ((Element)v.get(131)).setAttribute("x","25" );
      ((Element)v.get(131)).setAttribute("y","384" );
      ((Element)v.get(131)).setAttribute("ID","botonContenido" );
      ((Element)v.get(131)).setAttribute("tipo","html" );
      ((Element)v.get(131)).setAttribute("estado","false" );
      ((Element)v.get(131)).setAttribute("cod","1254" );
      ((Element)v.get(131)).setAttribute("accion","accionEliminar();" );
      ((Element)v.get(131)).setAttribute("onshtab","focaliza('formulario.txtPrecioCat')" );
      ((Element)v.get(131)).setAttribute("ontab","focalizaBotonHTML('botonContenido','btnAnadir')" );
      ((Element)v.get(15)).appendChild((Element)v.get(131));
      /* Termina nodo:131   */
      /* Termina nodo:15   */


   }

}
