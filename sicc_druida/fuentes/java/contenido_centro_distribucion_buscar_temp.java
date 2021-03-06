
import org.w3c.dom.*;
import java.util.ArrayList;

public class contenido_centro_distribucion_buscar_temp  implements es.indra.druida.base.ObjetoXML {
   private ArrayList v = new ArrayList();

   public Element getXML (Document doc){
      

      getXML0(doc);
         

      getXML90(doc);
         

      getXML180(doc);
         

      getXML270(doc);
         

      getXML360(doc);
         
      return (Element)v.get(0);
      
   }

   
/* Primer nodo */
   

   private void getXML0(Document doc) {
      v.add(doc.createElement("PAGINA"));
      ((Element)v.get(0)).setAttribute("nombre","contenido_centro_distribucion_buscar" );
      ((Element)v.get(0)).setAttribute("cod","" );
      ((Element)v.get(0)).setAttribute("titulo","" );
      ((Element)v.get(0)).setAttribute("estilos","estilosB3.css" );
      ((Element)v.get(0)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(0)).setAttribute("msgle","" );
      ((Element)v.get(0)).setAttribute("onload","" );
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
      v.add(doc.createElement("JAVASCRIPT"));
      ((Element)v.get(0)).appendChild((Element)v.get(4));
      /* Termina nodo:4   */

      /* Empieza nodo:5 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(5)).setAttribute("nombre","formulario" );
      ((Element)v.get(5)).setAttribute("oculto","N" );
      ((Element)v.get(0)).appendChild((Element)v.get(5));

      /* Empieza nodo:6 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(6)).setAttribute("nombre","capa1" );
      ((Element)v.get(5)).appendChild((Element)v.get(6));

      /* Empieza nodo:7 / Elemento padre: 6   */
      v.add(doc.createElement("table"));
      ((Element)v.get(7)).setAttribute("width","100%" );
      ((Element)v.get(7)).setAttribute("border","0" );
      ((Element)v.get(7)).setAttribute("cellspacing","0" );
      ((Element)v.get(7)).setAttribute("cellpadding","0" );
      ((Element)v.get(6)).appendChild((Element)v.get(7));

      /* Empieza nodo:8 / Elemento padre: 7   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(7)).appendChild((Element)v.get(8));

      /* Empieza nodo:9 / Elemento padre: 8   */
      v.add(doc.createElement("td"));
      ((Element)v.get(9)).setAttribute("width","12" );
      ((Element)v.get(9)).setAttribute("align","center" );
      ((Element)v.get(8)).appendChild((Element)v.get(9));

      /* Empieza nodo:10 / Elemento padre: 9   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(10)).setAttribute("src","b.gif" );
      ((Element)v.get(10)).setAttribute("width","12" );
      ((Element)v.get(10)).setAttribute("height","12" );
      ((Element)v.get(9)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */
      /* Termina nodo:9   */

      /* Empieza nodo:11 / Elemento padre: 8   */
      v.add(doc.createElement("td"));
      ((Element)v.get(11)).setAttribute("width","750" );
      ((Element)v.get(8)).appendChild((Element)v.get(11));

      /* Empieza nodo:12 / Elemento padre: 11   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(12)).setAttribute("src","b.gif" );
      ((Element)v.get(11)).appendChild((Element)v.get(12));
      /* Termina nodo:12   */
      /* Termina nodo:11   */

      /* Empieza nodo:13 / Elemento padre: 8   */
      v.add(doc.createElement("td"));
      ((Element)v.get(13)).setAttribute("width","12" );
      ((Element)v.get(8)).appendChild((Element)v.get(13));

      /* Empieza nodo:14 / Elemento padre: 13   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(14)).setAttribute("src","b.gif" );
      ((Element)v.get(14)).setAttribute("width","12" );
      ((Element)v.get(14)).setAttribute("height","1" );
      ((Element)v.get(13)).appendChild((Element)v.get(14));
      /* Termina nodo:14   */
      /* Termina nodo:13   */
      /* Termina nodo:8   */

      /* Empieza nodo:15 / Elemento padre: 7   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(7)).appendChild((Element)v.get(15));

      /* Empieza nodo:16 / Elemento padre: 15   */
      v.add(doc.createElement("td"));
      ((Element)v.get(15)).appendChild((Element)v.get(16));

      /* Empieza nodo:17 / Elemento padre: 16   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(17)).setAttribute("src","b.gif" );
      ((Element)v.get(16)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */
      /* Termina nodo:16   */

      /* Empieza nodo:18 / Elemento padre: 15   */
      v.add(doc.createElement("td"));
      ((Element)v.get(15)).appendChild((Element)v.get(18));

      /* Empieza nodo:19 / Elemento padre: 18   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(18)).appendChild((Element)v.get(19));

      /* Empieza nodo:20 / Elemento padre: 19   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(20)).setAttribute("class","legend" );
      ((Element)v.get(19)).appendChild((Element)v.get(20));

      /* Empieza nodo:21 / Elemento padre: 20   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(21)).setAttribute("nombre","lblCriteriosDeBusqueda" );
      ((Element)v.get(21)).setAttribute("alto","13" );
      ((Element)v.get(21)).setAttribute("filas","1" );
      ((Element)v.get(21)).setAttribute("cod","MMGGlobal.legend.searchcriteria.label" );
      ((Element)v.get(21)).setAttribute("id","legend" );
      ((Element)v.get(20)).appendChild((Element)v.get(21));
      /* Termina nodo:21   */
      /* Termina nodo:20   */

      /* Empieza nodo:22 / Elemento padre: 19   */
      v.add(doc.createElement("table"));
      ((Element)v.get(22)).setAttribute("width","100%" );
      ((Element)v.get(22)).setAttribute("border","0" );
      ((Element)v.get(22)).setAttribute("align","center" );
      ((Element)v.get(22)).setAttribute("cellspacing","0" );
      ((Element)v.get(22)).setAttribute("cellpadding","0" );
      ((Element)v.get(19)).appendChild((Element)v.get(22));

      /* Empieza nodo:23 / Elemento padre: 22   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(22)).appendChild((Element)v.get(23));

      /* Empieza nodo:24 / Elemento padre: 23   */
      v.add(doc.createElement("td"));
   }

   private void getXML90(Document doc) {
      ((Element)v.get(24)).setAttribute("colspan","4" );
      ((Element)v.get(23)).appendChild((Element)v.get(24));

      /* Empieza nodo:25 / Elemento padre: 24   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(25)).setAttribute("src","b.gif" );
      ((Element)v.get(25)).setAttribute("width","8" );
      ((Element)v.get(25)).setAttribute("height","8" );
      ((Element)v.get(24)).appendChild((Element)v.get(25));
      /* Termina nodo:25   */
      /* Termina nodo:24   */
      /* Termina nodo:23   */

      /* Empieza nodo:26 / Elemento padre: 22   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(22)).appendChild((Element)v.get(26));

      /* Empieza nodo:27 / Elemento padre: 26   */
      v.add(doc.createElement("td"));
      ((Element)v.get(26)).appendChild((Element)v.get(27));

      /* Empieza nodo:28 / Elemento padre: 27   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(28)).setAttribute("src","b.gif" );
      ((Element)v.get(28)).setAttribute("width","8" );
      ((Element)v.get(28)).setAttribute("height","8" );
      ((Element)v.get(27)).appendChild((Element)v.get(28));
      /* Termina nodo:28   */
      /* Termina nodo:27   */

      /* Empieza nodo:29 / Elemento padre: 26   */
      v.add(doc.createElement("td"));
      ((Element)v.get(26)).appendChild((Element)v.get(29));

      /* Empieza nodo:30 / Elemento padre: 29   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(30)).setAttribute("nombre","lblCentroDistribucion" );
      ((Element)v.get(30)).setAttribute("alto","13" );
      ((Element)v.get(30)).setAttribute("filas","1" );
      ((Element)v.get(30)).setAttribute("valor","" );
      ((Element)v.get(30)).setAttribute("id","datosTitle" );
      ((Element)v.get(30)).setAttribute("cod","2054" );
      ((Element)v.get(29)).appendChild((Element)v.get(30));
      /* Termina nodo:30   */
      /* Termina nodo:29   */

      /* Empieza nodo:31 / Elemento padre: 26   */
      v.add(doc.createElement("td"));
      ((Element)v.get(31)).setAttribute("width","100%" );
      ((Element)v.get(26)).appendChild((Element)v.get(31));

      /* Empieza nodo:32 / Elemento padre: 31   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(32)).setAttribute("src","b.gif" );
      ((Element)v.get(32)).setAttribute("width","8" );
      ((Element)v.get(32)).setAttribute("height","8" );
      ((Element)v.get(31)).appendChild((Element)v.get(32));
      /* Termina nodo:32   */
      /* Termina nodo:31   */
      /* Termina nodo:26   */

      /* Empieza nodo:33 / Elemento padre: 22   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(22)).appendChild((Element)v.get(33));

      /* Empieza nodo:34 / Elemento padre: 33   */
      v.add(doc.createElement("td"));
      ((Element)v.get(33)).appendChild((Element)v.get(34));

      /* Empieza nodo:35 / Elemento padre: 34   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(35)).setAttribute("src","b.gif" );
      ((Element)v.get(35)).setAttribute("width","8" );
      ((Element)v.get(35)).setAttribute("height","8" );
      ((Element)v.get(34)).appendChild((Element)v.get(35));
      /* Termina nodo:35   */
      /* Termina nodo:34   */

      /* Empieza nodo:36 / Elemento padre: 33   */
      v.add(doc.createElement("td"));
      ((Element)v.get(36)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(33)).appendChild((Element)v.get(36));

      /* Empieza nodo:37 / Elemento padre: 36   */
      v.add(doc.createElement("COMBO"));
      ((Element)v.get(37)).setAttribute("nombre","cbCentroDistribucion" );
      ((Element)v.get(37)).setAttribute("id","datosCampos" );
      ((Element)v.get(37)).setAttribute("size","1" );
      ((Element)v.get(37)).setAttribute("multiple","N" );
      ((Element)v.get(37)).setAttribute("req","N" );
      ((Element)v.get(37)).setAttribute("onchange","" );
      ((Element)v.get(37)).setAttribute("onshtab","" );
      ((Element)v.get(37)).setAttribute("valorinicial","" );
      ((Element)v.get(37)).setAttribute("textoinicial","" );
      ((Element)v.get(36)).appendChild((Element)v.get(37));

      /* Empieza nodo:38 / Elemento padre: 37   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(37)).appendChild((Element)v.get(38));
      /* Termina nodo:38   */
      /* Termina nodo:37   */
      /* Termina nodo:36   */

      /* Empieza nodo:39 / Elemento padre: 33   */
      v.add(doc.createElement("td"));
      ((Element)v.get(39)).setAttribute("width","100%" );
      ((Element)v.get(33)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(40)).setAttribute("src","b.gif" );
      ((Element)v.get(40)).setAttribute("width","8" );
      ((Element)v.get(40)).setAttribute("height","8" );
      ((Element)v.get(39)).appendChild((Element)v.get(40));
      /* Termina nodo:40   */
      /* Termina nodo:39   */
      /* Termina nodo:33   */

      /* Empieza nodo:41 / Elemento padre: 22   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(22)).appendChild((Element)v.get(41));

      /* Empieza nodo:42 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(42)).setAttribute("colspan","4" );
      ((Element)v.get(41)).appendChild((Element)v.get(42));

      /* Empieza nodo:43 / Elemento padre: 42   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(43)).setAttribute("src","b.gif" );
      ((Element)v.get(43)).setAttribute("width","8" );
      ((Element)v.get(43)).setAttribute("height","8" );
      ((Element)v.get(42)).appendChild((Element)v.get(43));
      /* Termina nodo:43   */
      /* Termina nodo:42   */
      /* Termina nodo:41   */
      /* Termina nodo:22   */
      /* Termina nodo:19   */

      /* Empieza nodo:44 / Elemento padre: 18   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(18)).appendChild((Element)v.get(44));

      /* Empieza nodo:45 / Elemento padre: 44   */
      v.add(doc.createElement("table"));
      ((Element)v.get(45)).setAttribute("width","100%" );
      ((Element)v.get(45)).setAttribute("border","0" );
      ((Element)v.get(45)).setAttribute("align","center" );
      ((Element)v.get(45)).setAttribute("cellspacing","0" );
      ((Element)v.get(45)).setAttribute("cellpadding","0" );
      ((Element)v.get(44)).appendChild((Element)v.get(45));

      /* Empieza nodo:46 / Elemento padre: 45   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(45)).appendChild((Element)v.get(46));

      /* Empieza nodo:47 / Elemento padre: 46   */
      v.add(doc.createElement("td"));
      ((Element)v.get(47)).setAttribute("class","botonera" );
   }

   private void getXML180(Document doc) {
      ((Element)v.get(46)).appendChild((Element)v.get(47));

      /* Empieza nodo:48 / Elemento padre: 47   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(48)).setAttribute("nombre","btnBuscar" );
      ((Element)v.get(48)).setAttribute("ID","botonContenido" );
      ((Element)v.get(48)).setAttribute("tipo","html" );
      ((Element)v.get(48)).setAttribute("accion","" );
      ((Element)v.get(48)).setAttribute("estado","false" );
      ((Element)v.get(48)).setAttribute("cod","MMGGlobal.queryButton.label" );
      ((Element)v.get(47)).appendChild((Element)v.get(48));
      /* Termina nodo:48   */
      /* Termina nodo:47   */
      /* Termina nodo:46   */
      /* Termina nodo:45   */
      /* Termina nodo:44   */
      /* Termina nodo:18   */
      /* Termina nodo:15   */
      /* Termina nodo:7   */
      /* Termina nodo:6   */

      /* Empieza nodo:49 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(49)).setAttribute("nombre","capaLista" );
      ((Element)v.get(49)).setAttribute("ancho","100%" );
      ((Element)v.get(49)).setAttribute("alto","330" );
      ((Element)v.get(49)).setAttribute("x","17" );
      ((Element)v.get(49)).setAttribute("y","120" );
      ((Element)v.get(49)).setAttribute("colorf","" );
      ((Element)v.get(49)).setAttribute("borde","0" );
      ((Element)v.get(49)).setAttribute("imagenf","" );
      ((Element)v.get(49)).setAttribute("repeat","" );
      ((Element)v.get(49)).setAttribute("padding","" );
      ((Element)v.get(49)).setAttribute("visibilidad","" );
      ((Element)v.get(49)).setAttribute("contravsb","" );
      ((Element)v.get(49)).setAttribute("zindex","" );
      ((Element)v.get(5)).appendChild((Element)v.get(49));

      /* Empieza nodo:50 / Elemento padre: 49   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(50)).setAttribute("nombre","listado1" );
      ((Element)v.get(50)).setAttribute("ancho","369" );
      ((Element)v.get(50)).setAttribute("alto","301" );
      ((Element)v.get(50)).setAttribute("x","12" );
      ((Element)v.get(50)).setAttribute("y","0" );
      ((Element)v.get(50)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(50)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(49)).appendChild((Element)v.get(50));

      /* Empieza nodo:51 / Elemento padre: 50   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(51)).setAttribute("precarga","S" );
      ((Element)v.get(51)).setAttribute("conROver","S" );
      ((Element)v.get(50)).appendChild((Element)v.get(51));

      /* Empieza nodo:52 / Elemento padre: 51   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(52)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(52)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(52)).setAttribute("seleccionado","btnLista2M.gif" );
      ((Element)v.get(52)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(51)).appendChild((Element)v.get(52));
      /* Termina nodo:52   */

      /* Empieza nodo:53 / Elemento padre: 51   */
      v.add(doc.createElement("BTNMINIMIZAR"));
      ((Element)v.get(53)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(53)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(53)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(53)).setAttribute("aximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(51)).appendChild((Element)v.get(53));
      /* Termina nodo:53   */

      /* Empieza nodo:54 / Elemento padre: 51   */
      v.add(doc.createElement("BTNORDENAR"));
      ((Element)v.get(54)).setAttribute("ordenar","ascendente_on.gif" );
      ((Element)v.get(54)).setAttribute("ordenarInv","descendente_on.gif" );
      ((Element)v.get(51)).appendChild((Element)v.get(54));
      /* Termina nodo:54   */
      /* Termina nodo:51   */

      /* Empieza nodo:55 / Elemento padre: 50   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(50)).appendChild((Element)v.get(55));

      /* Empieza nodo:56 / Elemento padre: 55   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(56)).setAttribute("borde","1" );
      ((Element)v.get(56)).setAttribute("horizDatos","1" );
      ((Element)v.get(56)).setAttribute("horizCabecera","1" );
      ((Element)v.get(56)).setAttribute("vertical","1" );
      ((Element)v.get(56)).setAttribute("horizTitulo","1" );
      ((Element)v.get(56)).setAttribute("horizBase","1" );
      ((Element)v.get(55)).appendChild((Element)v.get(56));
      /* Termina nodo:56   */

      /* Empieza nodo:57 / Elemento padre: 55   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(57)).setAttribute("borde","#999999" );
      ((Element)v.get(57)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(57)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(57)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(57)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(57)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(57)).setAttribute("horizBase","#999999" );
      ((Element)v.get(55)).appendChild((Element)v.get(57));
      /* Termina nodo:57   */
      /* Termina nodo:55   */

      /* Empieza nodo:58 / Elemento padre: 50   */
      v.add(doc.createElement("TITULO"));
      ((Element)v.get(58)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(58)).setAttribute("alto","22" );
      ((Element)v.get(58)).setAttribute("imgFondo","" );
      ((Element)v.get(58)).setAttribute("cod","00135" );
      ((Element)v.get(58)).setAttribute("ID","datosTitle" );
      ((Element)v.get(50)).appendChild((Element)v.get(58));
      /* Termina nodo:58   */

      /* Empieza nodo:59 / Elemento padre: 50   */
      v.add(doc.createElement("BASE"));
      ((Element)v.get(59)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(59)).setAttribute("alto","22" );
      ((Element)v.get(59)).setAttribute("imgFondo","" );
      ((Element)v.get(50)).appendChild((Element)v.get(59));
      /* Termina nodo:59   */

      /* Empieza nodo:60 / Elemento padre: 50   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(60)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(60)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(60)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(60)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(60)).setAttribute("AnchoMinimizadas","20" );
   }

   private void getXML270(Document doc) {
      ((Element)v.get(60)).setAttribute("botonOrdenar","S" );
      ((Element)v.get(50)).appendChild((Element)v.get(60));

      /* Empieza nodo:61 / Elemento padre: 60   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(61)).setAttribute("ancho","50" );
      ((Element)v.get(61)).setAttribute("minimizable","S" );
      ((Element)v.get(61)).setAttribute("minimizada","N" );
      ((Element)v.get(60)).appendChild((Element)v.get(61));
      /* Termina nodo:61   */

      /* Empieza nodo:62 / Elemento padre: 60   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(62)).setAttribute("ancho","50" );
      ((Element)v.get(62)).setAttribute("minimizable","S" );
      ((Element)v.get(62)).setAttribute("minimizada","N" );
      ((Element)v.get(60)).appendChild((Element)v.get(62));
      /* Termina nodo:62   */
      /* Termina nodo:60   */

      /* Empieza nodo:63 / Elemento padre: 50   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(63)).setAttribute("alto","25" );
      ((Element)v.get(63)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(63)).setAttribute("imgFondo","" );
      ((Element)v.get(63)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(50)).appendChild((Element)v.get(63));

      /* Empieza nodo:64 / Elemento padre: 63   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(64)).setAttribute("colFondo","" );
      ((Element)v.get(64)).setAttribute("ID","EstCab" );
      ((Element)v.get(64)).setAttribute("cod","MMGGlobal.localization.description.label" );
      ((Element)v.get(63)).appendChild((Element)v.get(64));

      /* Elemento padre:64 / Elemento actual: 65   */
      v.add(doc.createTextNode("Centro Distribución"));
      ((Element)v.get(64)).appendChild((Text)v.get(65));

      /* Termina nodo Texto:65   */
      /* Termina nodo:64   */

      /* Empieza nodo:66 / Elemento padre: 63   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(66)).setAttribute("colFondo","" );
      ((Element)v.get(66)).setAttribute("ID","EstCab" );
      ((Element)v.get(66)).setAttribute("cod","CobGuionArgumDetal.indValoDefe.label" );
      ((Element)v.get(63)).appendChild((Element)v.get(66));

      /* Elemento padre:66 / Elemento actual: 67   */
      v.add(doc.createTextNode("Por Defecto"));
      ((Element)v.get(66)).appendChild((Text)v.get(67));

      /* Termina nodo Texto:67   */
      /* Termina nodo:66   */
      /* Termina nodo:63   */

      /* Empieza nodo:68 / Elemento padre: 50   */
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(68)).setAttribute("alto","22" );
      ((Element)v.get(68)).setAttribute("accion","" );
      ((Element)v.get(68)).setAttribute("tipoEnvio","edicion" );
      ((Element)v.get(68)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(68)).setAttribute("maxSel","-1" );
      ((Element)v.get(68)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(68)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(68)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(68)).setAttribute("onLoad","" );
      ((Element)v.get(68)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(50)).appendChild((Element)v.get(68));

      /* Empieza nodo:69 / Elemento padre: 68   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(69)).setAttribute("tipo","texto" );
      ((Element)v.get(69)).setAttribute("ID","EstDat" );
      ((Element)v.get(68)).appendChild((Element)v.get(69));
      /* Termina nodo:69   */

      /* Empieza nodo:70 / Elemento padre: 68   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(70)).setAttribute("tipo","texto" );
      ((Element)v.get(70)).setAttribute("ID","EstDat" );
      ((Element)v.get(68)).appendChild((Element)v.get(70));
      /* Termina nodo:70   */
      /* Termina nodo:68   */

      /* Empieza nodo:71 / Elemento padre: 50   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(50)).appendChild((Element)v.get(71));
      /* Termina nodo:71   */

      /* Empieza nodo:72 / Elemento padre: 50   */
      v.add(doc.createElement("PAGINADO"));
      ((Element)v.get(72)).setAttribute("nombre","mipgndo" );
      ((Element)v.get(72)).setAttribute("ancho","679" );
      ((Element)v.get(72)).setAttribute("sep","$" );
      ((Element)v.get(72)).setAttribute("x","12" );
      ((Element)v.get(72)).setAttribute("class","botonera" );
      ((Element)v.get(72)).setAttribute("y","294" );
      ((Element)v.get(72)).setAttribute("control","|" );
      ((Element)v.get(72)).setAttribute("conector","ConectorBuscarCargosAbonos" );
      ((Element)v.get(72)).setAttribute("rowset","" );
      ((Element)v.get(72)).setAttribute("cargainicial","N" );
      ((Element)v.get(72)).setAttribute("onload","procesarPaginado(mipgndo,msgError, ultima, rowset, 'muestraLista(ultima, rowset)')" );
      ((Element)v.get(50)).appendChild((Element)v.get(72));

      /* Empieza nodo:73 / Elemento padre: 72   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(73)).setAttribute("nombre","ret1" );
      ((Element)v.get(73)).setAttribute("x","37" );
      ((Element)v.get(73)).setAttribute("y","282" );
      ((Element)v.get(73)).setAttribute("ID","botonContenido" );
      ((Element)v.get(73)).setAttribute("img","retroceder_on" );
      ((Element)v.get(73)).setAttribute("tipo","0" );
      ((Element)v.get(73)).setAttribute("estado","false" );
      ((Element)v.get(73)).setAttribute("alt","" );
      ((Element)v.get(73)).setAttribute("codigo","" );
      ((Element)v.get(73)).setAttribute("accion","mipgndo.retroceder();" );
      ((Element)v.get(72)).appendChild((Element)v.get(73));
      /* Termina nodo:73   */

      /* Empieza nodo:74 / Elemento padre: 72   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(74)).setAttribute("nombre","ava1" );
      ((Element)v.get(74)).setAttribute("x","52" );
      ((Element)v.get(74)).setAttribute("y","282" );
      ((Element)v.get(74)).setAttribute("ID","botonContenido" );
      ((Element)v.get(74)).setAttribute("img","avanzar_on" );
      ((Element)v.get(74)).setAttribute("tipo","0" );
      ((Element)v.get(74)).setAttribute("estado","false" );
      ((Element)v.get(74)).setAttribute("alt","" );
      ((Element)v.get(74)).setAttribute("codigo","" );
      ((Element)v.get(74)).setAttribute("accion","mipgndo.avanzar();" );
   }

   private void getXML360(Document doc) {
      ((Element)v.get(72)).appendChild((Element)v.get(74));
      /* Termina nodo:74   */
      /* Termina nodo:72   */
      /* Termina nodo:50   */

      /* Empieza nodo:75 / Elemento padre: 49   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(75)).setAttribute("nombre","primera1" );
      ((Element)v.get(75)).setAttribute("x","20" );
      ((Element)v.get(75)).setAttribute("y","282" );
      ((Element)v.get(75)).setAttribute("ID","botonContenido" );
      ((Element)v.get(75)).setAttribute("img","primera_on" );
      ((Element)v.get(75)).setAttribute("tipo","-2" );
      ((Element)v.get(75)).setAttribute("estado","false" );
      ((Element)v.get(75)).setAttribute("alt","" );
      ((Element)v.get(75)).setAttribute("codigo","" );
      ((Element)v.get(75)).setAttribute("accion","mipgndo.retrocederPrimeraPagina();" );
      ((Element)v.get(49)).appendChild((Element)v.get(75));
      /* Termina nodo:75   */

      /* Empieza nodo:76 / Elemento padre: 49   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(76)).setAttribute("nombre","separa" );
      ((Element)v.get(76)).setAttribute("x","59" );
      ((Element)v.get(76)).setAttribute("y","278" );
      ((Element)v.get(76)).setAttribute("ID","botonContenido" );
      ((Element)v.get(76)).setAttribute("img","separa_base" );
      ((Element)v.get(76)).setAttribute("tipo","0" );
      ((Element)v.get(76)).setAttribute("estado","false" );
      ((Element)v.get(76)).setAttribute("alt","" );
      ((Element)v.get(76)).setAttribute("codigo","" );
      ((Element)v.get(76)).setAttribute("accion","" );
      ((Element)v.get(49)).appendChild((Element)v.get(76));
      /* Termina nodo:76   */

      /* Empieza nodo:77 / Elemento padre: 49   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(77)).setAttribute("nombre","btnDetalle" );
      ((Element)v.get(77)).setAttribute("x","80" );
      ((Element)v.get(77)).setAttribute("y","279" );
      ((Element)v.get(77)).setAttribute("ID","botonContenido" );
      ((Element)v.get(77)).setAttribute("tipo","html" );
      ((Element)v.get(77)).setAttribute("estado","false" );
      ((Element)v.get(77)).setAttribute("cod","MMGGlobal.viewButton.label" );
      ((Element)v.get(77)).setAttribute("accion","" );
      ((Element)v.get(49)).appendChild((Element)v.get(77));
      /* Termina nodo:77   */
      /* Termina nodo:49   */
      /* Termina nodo:5   */


   }

}
