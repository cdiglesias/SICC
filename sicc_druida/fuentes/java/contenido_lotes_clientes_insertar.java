
import org.w3c.dom.*;
import java.util.ArrayList;

public class contenido_lotes_clientes_insertar  implements es.indra.druida.base.ObjetoXML {
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
      ((Element)v.get(0)).setAttribute("nombre","contenido_lotes_clientes_insertar" );
      ((Element)v.get(0)).setAttribute("cod","0311" );
      ((Element)v.get(0)).setAttribute("titulo","" );
      ((Element)v.get(0)).setAttribute("estilos","estilosB3.css" );
      ((Element)v.get(0)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(0)).setAttribute("msgle","" );
      ((Element)v.get(0)).setAttribute("onload","onLoadPag();" );
      ((Element)v.get(0)).setAttribute("xml:lang","es" );
      ((Element)v.get(0)).setAttribute("repeat","N" );

      /* Empieza nodo:1 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(1)).setAttribute("src","menu_basicas.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(1));
      /* Termina nodo:1   */

      /* Empieza nodo:2 / Elemento padre: 0   */
      v.add(doc.createElement("JS"));
      ((Element)v.get(2)).setAttribute("src","sicc_util.js" );
      ((Element)v.get(0)).appendChild((Element)v.get(2));
      /* Termina nodo:2   */

      /* Empieza nodo:3 / Elemento padre: 0   */
      v.add(doc.createElement("JAVASCRIPT"));
      ((Element)v.get(0)).appendChild((Element)v.get(3));

      /* Elemento padre:3 / Elemento actual: 4   */
      v.add(doc.createTextNode("\r  \r\r  function onLoadPag(){\r     DrdEnsanchaConMargenDcho('listado1',12);\r     eval (ON_RSZ); \r     ocultarLista();\r     configurarMenuSecundario(\"frmContenido\");\r  \r 	   if(!ShowError()){\r        focaliza('frmContenido.txtNumClientes');\r\r        if(get('frmContenido.accion')=='crearClientes'){\r           set('frmContenido.desplegado','1' );\r           mostrarLista();\r                  }\r	   }\r   }\r   \rfunction ocultarLista(){\r	document.all[\"Cplistado1\"].style.visibility='hidden'\r	document.all[\"CpLin1listado1\"].style.visibility='hidden' \r  document.all[\"CpLin2listado1\"].style.visibility='hidden' \r	document.all[\"CpLin3listado1\"].style.visibility='hidden' \r  document.all[\"CpLin4listado1\"].style.visibility='hidden' \r	document.all[\"prim1Div\"].style.visibility='hidden'; \r  document.all[\"ret1Div\"].style.visibility='hidden'; \r  document.all[\"ava1Div\"].style.visibility='hidden'; \r  document.all[\"separaDiv\"].style.visibility='hidden';\r  document.all[\"ImprimirNumDiv\"].style.visibility='hidden'; \r	document.all[\"ImprimirCuponesDiv\"].style.visibility='hidden'; \r}\r\rfunction mostrarLista(){\r	document.all[\"Cplistado1\"].style.visibility='visible'\r	document.all[\"CpLin1listado1\"].style.visibility='visible' \r  document.all[\"CpLin2listado1\"].style.visibility='visible' \r	document.all[\"CpLin3listado1\"].style.visibility='visible' \r  document.all[\"CpLin4listado1\"].style.visibility='visible'\r	         document.all[\"separaDiv\"].style.visibility='visible';\r  document.all[\"ImprimirNumDiv\"].style.visibility='visible'; \r	document.all[\"ImprimirCuponesDiv\"].style.visibility='visible'; \r	\r	listado1.display();\r}\r\rfunction generar(){\r    var numClientes  = document.getElementById('txtNumClientes');\r   eval('frmContenido').oculto = 'N';\r\r   if (numClientes.value == 0){\r      GestionarMensaje(\"1129\");\r      focaliza('frmContenido.txtNumClientes'); \r   }else if(fValidarNumero(numClientes.value, 200, 0, 9999999)!='OK'){\r      GestionarMensaje(\"1243\");\r      focaliza('frmContenido.txtNumClientes'); \r      return;\r   }else{\r    	set('frmContenido.accion','crearClientes' );\r			set('frmContenido.conectorAction','LPCrearLotesClientes' );\r			enviaSICC('frmContenido');	\r    }		\r}\r\rfunction MostrarPantallaExito(){\r        \r          if (get('frmContenido.exito')=='S'){\r              var wnd = fMostrarMensajeExito(get('frmContenido.casoDeUso').toLowerCase());\r              set('frmContenido.exito',\"\");\r              \r          }\r      }\r\rfunction ShowError(){\r            if(fMostrarMensajeError()){\r                	                    setMV(\"frmContenido.txtNumClientes\",\"N\");	                        \r				set('frmContenido.conectorAction','LPInicioBelcorp' );\r				enviaSICC('frmContenido');\r        } \r              \r        }\r\rfunction fLimpiar(){\r	set('frmContenido.txtNumClientes','' );\r	focaliza('frmContenido.txtNumClientes');\r}\r\r\rfunction alertarError(){\r    \r   GestionarMensaje(\"1428\");\r   \r}\r\rfunction imprimirCupones(){\r  eval('frmContenido').oculto = 'S';\r	setMV(\"frmContenido.txtNumClientes\",\"N\");	\r	set('frmContenido.accion','ImprimirCupones' );\r	set('frmContenido.conectorAction','LPCrearLotesClientes' );\r	enviaSICC('frmContenido');\r	\r}\rfunction imprimirNumeros(){\r  eval('frmContenido').oculto = 'S';\r	setMV(\"frmContenido.txtNumClientes\",\"N\");\r	set('frmContenido.accion','ImprimirCodigos' );\r	set('frmContenido.conectorAction','LPCrearLotesClientes' );\r	enviaSICC('frmContenido');\r	\r}\r\r	function TabShift(){\r		if(document.all[\"ImprimirCuponesDiv\"].style.visibility =='visible'){\r		   focalizaBotonHTML_XY('ImprimirCupones');\r    }else{\r       focalizaBotonHTML('btnGenerar','botonContenido');\r    }\r	}\r\r	function TabUp(){\r			focaliza('frmContenido.txtNumClientes');\r	}\r\r	function TabGenerar(){\r	  if(get('frmContenido.desplegado')!='1'){\r		focaliza('frmContenido.txtNumClientes');\r			}else{\r			var obj =document.getElementsByName(\"ImprimirNum\");\r						obj.item(0).focus();\r			\r	  }	\r	}\r\r   \r  "));
      ((Element)v.get(3)).appendChild((Text)v.get(4));

      /* Termina nodo Texto:4   */
      /* Termina nodo:3   */

      /* Empieza nodo:5 / Elemento padre: 0   */
      v.add(doc.createElement("FORMULARIO"));
      ((Element)v.get(5)).setAttribute("nombre","frmContenido" );
      ((Element)v.get(0)).appendChild((Element)v.get(5));

      /* Empieza nodo:6 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(6)).setAttribute("nombre","accion" );
      ((Element)v.get(6)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(6));
      /* Termina nodo:6   */

      /* Empieza nodo:7 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(7)).setAttribute("nombre","conectorAction" );
      ((Element)v.get(7)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(7));
      /* Termina nodo:7   */

      /* Empieza nodo:8 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(8)).setAttribute("nombre","casoDeUso" );
      ((Element)v.get(8)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(8));
      /* Termina nodo:8   */

      /* Empieza nodo:9 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(9)).setAttribute("nombre","exito" );
      ((Element)v.get(9)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(9));
      /* Termina nodo:9   */

      /* Empieza nodo:10 / Elemento padre: 5   */
      v.add(doc.createElement("VAR"));
      ((Element)v.get(10)).setAttribute("nombre","desplegado" );
      ((Element)v.get(10)).setAttribute("valor","" );
      ((Element)v.get(5)).appendChild((Element)v.get(10));
      /* Termina nodo:10   */

      /* Empieza nodo:11 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(11)).setAttribute("nombre","capaContenido" );
      ((Element)v.get(11)).setAttribute("colorf","#F0F0F0" );
      ((Element)v.get(11)).setAttribute("borde","0" );
      ((Element)v.get(11)).setAttribute("imagenf","" );
      ((Element)v.get(11)).setAttribute("repeat","" );
      ((Element)v.get(11)).setAttribute("padding","" );
      ((Element)v.get(11)).setAttribute("visibilidad","" );
      ((Element)v.get(11)).setAttribute("contravsb","" );
      ((Element)v.get(11)).setAttribute("x","0" );
      ((Element)v.get(11)).setAttribute("y","0" );
      ((Element)v.get(11)).setAttribute("zindex","" );
      ((Element)v.get(5)).appendChild((Element)v.get(11));

      /* Empieza nodo:12 / Elemento padre: 11   */
      v.add(doc.createElement("table"));
      ((Element)v.get(12)).setAttribute("width","100%" );
      ((Element)v.get(12)).setAttribute("border","0" );
      ((Element)v.get(12)).setAttribute("cellspacing","0" );
      ((Element)v.get(12)).setAttribute("cellpadding","0" );
      ((Element)v.get(11)).appendChild((Element)v.get(12));

      /* Empieza nodo:13 / Elemento padre: 12   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(12)).appendChild((Element)v.get(13));

      /* Empieza nodo:14 / Elemento padre: 13   */
      v.add(doc.createElement("td"));
      ((Element)v.get(14)).setAttribute("width","12" );
      ((Element)v.get(14)).setAttribute("align","center" );
      ((Element)v.get(13)).appendChild((Element)v.get(14));

      /* Empieza nodo:15 / Elemento padre: 14   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(15)).setAttribute("src","b.gif" );
      ((Element)v.get(15)).setAttribute("width","12" );
      ((Element)v.get(15)).setAttribute("height","12" );
      ((Element)v.get(14)).appendChild((Element)v.get(15));
      /* Termina nodo:15   */
      /* Termina nodo:14   */

      /* Empieza nodo:16 / Elemento padre: 13   */
      v.add(doc.createElement("td"));
      ((Element)v.get(16)).setAttribute("width","750" );
      ((Element)v.get(13)).appendChild((Element)v.get(16));

      /* Empieza nodo:17 / Elemento padre: 16   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(17)).setAttribute("src","b.gif" );
      ((Element)v.get(16)).appendChild((Element)v.get(17));
      /* Termina nodo:17   */
      /* Termina nodo:16   */

      /* Empieza nodo:18 / Elemento padre: 13   */
      v.add(doc.createElement("td"));
      ((Element)v.get(18)).setAttribute("width","12" );
      ((Element)v.get(13)).appendChild((Element)v.get(18));

      /* Empieza nodo:19 / Elemento padre: 18   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(19)).setAttribute("src","b.gif" );
      ((Element)v.get(19)).setAttribute("width","12" );
      ((Element)v.get(19)).setAttribute("height","1" );
      ((Element)v.get(18)).appendChild((Element)v.get(19));
      /* Termina nodo:19   */
      /* Termina nodo:18   */
      /* Termina nodo:13   */

      /* Empieza nodo:20 / Elemento padre: 12   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(12)).appendChild((Element)v.get(20));

      /* Empieza nodo:21 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
   }

   private void getXML90(Document doc) {
      ((Element)v.get(20)).appendChild((Element)v.get(21));

      /* Empieza nodo:22 / Elemento padre: 21   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(22)).setAttribute("src","b.gif" );
      ((Element)v.get(21)).appendChild((Element)v.get(22));
      /* Termina nodo:22   */
      /* Termina nodo:21   */

      /* Empieza nodo:23 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
      ((Element)v.get(20)).appendChild((Element)v.get(23));

      /* Empieza nodo:24 / Elemento padre: 23   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(23)).appendChild((Element)v.get(24));

      /* Empieza nodo:25 / Elemento padre: 24   */
      v.add(doc.createElement("legend"));
      ((Element)v.get(25)).setAttribute("class","legend" );
      ((Element)v.get(24)).appendChild((Element)v.get(25));

      /* Empieza nodo:26 / Elemento padre: 25   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(26)).setAttribute("nombre","lblDatosCli" );
      ((Element)v.get(26)).setAttribute("alto","13" );
      ((Element)v.get(26)).setAttribute("filas","1" );
      ((Element)v.get(26)).setAttribute("valor","Datos de clientes" );
      ((Element)v.get(26)).setAttribute("id","legend" );
      ((Element)v.get(26)).setAttribute("cod","00138" );
      ((Element)v.get(25)).appendChild((Element)v.get(26));
      /* Termina nodo:26   */
      /* Termina nodo:25   */

      /* Empieza nodo:27 / Elemento padre: 24   */
      v.add(doc.createElement("table"));
      ((Element)v.get(27)).setAttribute("width","100%" );
      ((Element)v.get(27)).setAttribute("border","0" );
      ((Element)v.get(27)).setAttribute("align","center" );
      ((Element)v.get(27)).setAttribute("cellspacing","0" );
      ((Element)v.get(27)).setAttribute("cellpadding","0" );
      ((Element)v.get(24)).appendChild((Element)v.get(27));

      /* Empieza nodo:28 / Elemento padre: 27   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(27)).appendChild((Element)v.get(28));

      /* Empieza nodo:29 / Elemento padre: 28   */
      v.add(doc.createElement("td"));
      ((Element)v.get(28)).appendChild((Element)v.get(29));

      /* Empieza nodo:30 / Elemento padre: 29   */
      v.add(doc.createElement("table"));
      ((Element)v.get(30)).setAttribute("width","400" );
      ((Element)v.get(30)).setAttribute("border","0" );
      ((Element)v.get(30)).setAttribute("align","left" );
      ((Element)v.get(30)).setAttribute("cellspacing","0" );
      ((Element)v.get(30)).setAttribute("cellpadding","0" );
      ((Element)v.get(29)).appendChild((Element)v.get(30));

      /* Empieza nodo:31 / Elemento padre: 30   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(30)).appendChild((Element)v.get(31));

      /* Empieza nodo:32 / Elemento padre: 31   */
      v.add(doc.createElement("td"));
      ((Element)v.get(32)).setAttribute("colspan","4" );
      ((Element)v.get(31)).appendChild((Element)v.get(32));

      /* Empieza nodo:33 / Elemento padre: 32   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(33)).setAttribute("src","b.gif" );
      ((Element)v.get(33)).setAttribute("width","8" );
      ((Element)v.get(33)).setAttribute("height","8" );
      ((Element)v.get(32)).appendChild((Element)v.get(33));
      /* Termina nodo:33   */
      /* Termina nodo:32   */
      /* Termina nodo:31   */

      /* Empieza nodo:34 / Elemento padre: 30   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(30)).appendChild((Element)v.get(34));

      /* Empieza nodo:35 / Elemento padre: 34   */
      v.add(doc.createElement("td"));
      ((Element)v.get(34)).appendChild((Element)v.get(35));

      /* Empieza nodo:36 / Elemento padre: 35   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(36)).setAttribute("src","b.gif" );
      ((Element)v.get(36)).setAttribute("width","8" );
      ((Element)v.get(36)).setAttribute("height","8" );
      ((Element)v.get(35)).appendChild((Element)v.get(36));
      /* Termina nodo:36   */
      /* Termina nodo:35   */

      /* Empieza nodo:37 / Elemento padre: 34   */
      v.add(doc.createElement("td"));
      ((Element)v.get(34)).appendChild((Element)v.get(37));

      /* Empieza nodo:38 / Elemento padre: 37   */
      v.add(doc.createElement("LABELC"));
      ((Element)v.get(38)).setAttribute("nombre","lblNumClientes" );
      ((Element)v.get(38)).setAttribute("alto","13" );
      ((Element)v.get(38)).setAttribute("filas","1" );
      ((Element)v.get(38)).setAttribute("valor","" );
      ((Element)v.get(38)).setAttribute("id","datosTitle" );
      ((Element)v.get(38)).setAttribute("cod","930" );
      ((Element)v.get(37)).appendChild((Element)v.get(38));
      /* Termina nodo:38   */
      /* Termina nodo:37   */

      /* Empieza nodo:39 / Elemento padre: 34   */
      v.add(doc.createElement("td"));
      ((Element)v.get(39)).setAttribute("width","100%" );
      ((Element)v.get(34)).appendChild((Element)v.get(39));

      /* Empieza nodo:40 / Elemento padre: 39   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(40)).setAttribute("src","b.gif" );
      ((Element)v.get(40)).setAttribute("width","8" );
      ((Element)v.get(40)).setAttribute("height","8" );
      ((Element)v.get(39)).appendChild((Element)v.get(40));
      /* Termina nodo:40   */
      /* Termina nodo:39   */
      /* Termina nodo:34   */

      /* Empieza nodo:41 / Elemento padre: 30   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(30)).appendChild((Element)v.get(41));

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
      ((Element)v.get(44)).setAttribute("nowrap","nowrap" );
      ((Element)v.get(41)).appendChild((Element)v.get(44));

      /* Empieza nodo:45 / Elemento padre: 44   */
      v.add(doc.createElement("CTEXTO"));
      ((Element)v.get(45)).setAttribute("nombre","txtNumClientes" );
      ((Element)v.get(45)).setAttribute("id","datosCampos" );
      ((Element)v.get(45)).setAttribute("max","3" );
   }

   private void getXML180(Document doc) {
      ((Element)v.get(45)).setAttribute("tipo","" );
      ((Element)v.get(45)).setAttribute("onchange","" );
      ((Element)v.get(45)).setAttribute("req","S" );
      ((Element)v.get(45)).setAttribute("size","3" );
      ((Element)v.get(45)).setAttribute("valor","" );
      ((Element)v.get(45)).setAttribute("validacion","" );
      ((Element)v.get(45)).setAttribute("onshtab","TabShift();" );
      ((Element)v.get(44)).appendChild((Element)v.get(45));
      /* Termina nodo:45   */
      /* Termina nodo:44   */

      /* Empieza nodo:46 / Elemento padre: 41   */
      v.add(doc.createElement("td"));
      ((Element)v.get(46)).setAttribute("width","100%" );
      ((Element)v.get(41)).appendChild((Element)v.get(46));

      /* Empieza nodo:47 / Elemento padre: 46   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(47)).setAttribute("src","b.gif" );
      ((Element)v.get(47)).setAttribute("width","216" );
      ((Element)v.get(47)).setAttribute("height","8" );
      ((Element)v.get(46)).appendChild((Element)v.get(47));
      /* Termina nodo:47   */
      /* Termina nodo:46   */
      /* Termina nodo:41   */

      /* Empieza nodo:48 / Elemento padre: 30   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(30)).appendChild((Element)v.get(48));

      /* Empieza nodo:49 / Elemento padre: 48   */
      v.add(doc.createElement("td"));
      ((Element)v.get(49)).setAttribute("colspan","4" );
      ((Element)v.get(48)).appendChild((Element)v.get(49));

      /* Empieza nodo:50 / Elemento padre: 49   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(50)).setAttribute("src","b.gif" );
      ((Element)v.get(50)).setAttribute("width","8" );
      ((Element)v.get(50)).setAttribute("height","8" );
      ((Element)v.get(49)).appendChild((Element)v.get(50));
      /* Termina nodo:50   */
      /* Termina nodo:49   */
      /* Termina nodo:48   */
      /* Termina nodo:30   */
      /* Termina nodo:29   */
      /* Termina nodo:28   */
      /* Termina nodo:27   */
      /* Termina nodo:24   */
      /* Termina nodo:23   */

      /* Empieza nodo:51 / Elemento padre: 20   */
      v.add(doc.createElement("td"));
      ((Element)v.get(20)).appendChild((Element)v.get(51));

      /* Empieza nodo:52 / Elemento padre: 51   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(52)).setAttribute("src","b.gif" );
      ((Element)v.get(51)).appendChild((Element)v.get(52));
      /* Termina nodo:52   */
      /* Termina nodo:51   */
      /* Termina nodo:20   */

      /* Empieza nodo:53 / Elemento padre: 12   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(12)).appendChild((Element)v.get(53));

      /* Empieza nodo:54 / Elemento padre: 53   */
      v.add(doc.createElement("td"));
      ((Element)v.get(53)).appendChild((Element)v.get(54));

      /* Empieza nodo:55 / Elemento padre: 54   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(55)).setAttribute("src","b.gif" );
      ((Element)v.get(54)).appendChild((Element)v.get(55));
      /* Termina nodo:55   */
      /* Termina nodo:54   */

      /* Empieza nodo:56 / Elemento padre: 53   */
      v.add(doc.createElement("td"));
      ((Element)v.get(53)).appendChild((Element)v.get(56));

      /* Empieza nodo:57 / Elemento padre: 56   */
      v.add(doc.createElement("fieldset"));
      ((Element)v.get(56)).appendChild((Element)v.get(57));

      /* Empieza nodo:58 / Elemento padre: 57   */
      v.add(doc.createElement("table"));
      ((Element)v.get(58)).setAttribute("width","100%" );
      ((Element)v.get(58)).setAttribute("border","0" );
      ((Element)v.get(58)).setAttribute("align","center" );
      ((Element)v.get(58)).setAttribute("cellspacing","0" );
      ((Element)v.get(58)).setAttribute("cellpadding","0" );
      ((Element)v.get(57)).appendChild((Element)v.get(58));

      /* Empieza nodo:59 / Elemento padre: 58   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(58)).appendChild((Element)v.get(59));

      /* Empieza nodo:60 / Elemento padre: 59   */
      v.add(doc.createElement("td"));
      ((Element)v.get(60)).setAttribute("class","botonera" );
      ((Element)v.get(59)).appendChild((Element)v.get(60));

      /* Empieza nodo:61 / Elemento padre: 60   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(61)).setAttribute("nombre","btnGenerar" );
      ((Element)v.get(61)).setAttribute("ID","botonContenido" );
      ((Element)v.get(61)).setAttribute("tipo","html" );
      ((Element)v.get(61)).setAttribute("accion","generar();" );
      ((Element)v.get(61)).setAttribute("estado","false" );
      ((Element)v.get(61)).setAttribute("cod","190" );
      ((Element)v.get(61)).setAttribute("ontab","TabGenerar();" );
      ((Element)v.get(60)).appendChild((Element)v.get(61));
      /* Termina nodo:61   */
      /* Termina nodo:60   */
      /* Termina nodo:59   */
      /* Termina nodo:58   */
      /* Termina nodo:57   */
      /* Termina nodo:56   */

      /* Empieza nodo:62 / Elemento padre: 53   */
      v.add(doc.createElement("td"));
      ((Element)v.get(53)).appendChild((Element)v.get(62));

      /* Empieza nodo:63 / Elemento padre: 62   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(63)).setAttribute("src","b.gif" );
      ((Element)v.get(63)).setAttribute("width","8" );
      ((Element)v.get(63)).setAttribute("height","12" );
      ((Element)v.get(62)).appendChild((Element)v.get(63));
      /* Termina nodo:63   */
      /* Termina nodo:62   */
      /* Termina nodo:53   */

      /* Empieza nodo:64 / Elemento padre: 12   */
      v.add(doc.createElement("tr"));
      ((Element)v.get(12)).appendChild((Element)v.get(64));

      /* Empieza nodo:65 / Elemento padre: 64   */
      v.add(doc.createElement("td"));
      ((Element)v.get(65)).setAttribute("width","12" );
      ((Element)v.get(65)).setAttribute("align","center" );
      ((Element)v.get(64)).appendChild((Element)v.get(65));

      /* Empieza nodo:66 / Elemento padre: 65   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(66)).setAttribute("src","b.gif" );
      ((Element)v.get(66)).setAttribute("width","12" );
      ((Element)v.get(66)).setAttribute("height","12" );
      ((Element)v.get(65)).appendChild((Element)v.get(66));
      /* Termina nodo:66   */
      /* Termina nodo:65   */

      /* Empieza nodo:67 / Elemento padre: 64   */
      v.add(doc.createElement("td"));
      ((Element)v.get(67)).setAttribute("width","750" );
      ((Element)v.get(64)).appendChild((Element)v.get(67));

      /* Empieza nodo:68 / Elemento padre: 67   */
      v.add(doc.createElement("IMG"));
      ((Element)v.get(68)).setAttribute("src","b.gif" );
      ((Element)v.get(67)).appendChild((Element)v.get(68));
      /* Termina nodo:68   */
      /* Termina nodo:67   */

      /* Empieza nodo:69 / Elemento padre: 64   */
      v.add(doc.createElement("td"));
      ((Element)v.get(69)).setAttribute("width","12" );
      ((Element)v.get(64)).appendChild((Element)v.get(69));

      /* Empieza nodo:70 / Elemento padre: 69   */
   }

   private void getXML270(Document doc) {
      v.add(doc.createElement("IMG"));
      ((Element)v.get(70)).setAttribute("src","b.gif" );
      ((Element)v.get(70)).setAttribute("width","12" );
      ((Element)v.get(70)).setAttribute("height","1" );
      ((Element)v.get(69)).appendChild((Element)v.get(70));
      /* Termina nodo:70   */
      /* Termina nodo:69   */
      /* Termina nodo:64   */
      /* Termina nodo:12   */
      /* Termina nodo:11   */

      /* Empieza nodo:71 / Elemento padre: 5   */
      v.add(doc.createElement("LISTAEDITABLE"));
      ((Element)v.get(71)).setAttribute("nombre","listado1" );
      ((Element)v.get(71)).setAttribute("ancho","403" );
      ((Element)v.get(71)).setAttribute("alto","301" );
      ((Element)v.get(71)).setAttribute("x","12" );
      ((Element)v.get(71)).setAttribute("y","128" );
      ((Element)v.get(71)).setAttribute("colorFondo","#CECFCE" );
      ((Element)v.get(71)).setAttribute("msgDebugJS","S" );
      ((Element)v.get(5)).appendChild((Element)v.get(71));

      /* Empieza nodo:72 / Elemento padre: 71   */
      v.add(doc.createElement("TITULO"));
      ((Element)v.get(72)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(72)).setAttribute("alto","22" );
      ((Element)v.get(72)).setAttribute("imgFondo","" );
      ((Element)v.get(72)).setAttribute("cod","00140" );
      ((Element)v.get(72)).setAttribute("ID","datosTitle" );
      ((Element)v.get(71)).appendChild((Element)v.get(72));
      /* Termina nodo:72   */

      /* Empieza nodo:73 / Elemento padre: 71   */
      v.add(doc.createElement("BASE"));
      ((Element)v.get(73)).setAttribute("colFondo","#CECFCE" );
      ((Element)v.get(73)).setAttribute("alto","22" );
      ((Element)v.get(73)).setAttribute("imgFondo","" );
      ((Element)v.get(71)).appendChild((Element)v.get(73));
      /* Termina nodo:73   */

      /* Empieza nodo:74 / Elemento padre: 71   */
      v.add(doc.createElement("IMGBOTONES"));
      ((Element)v.get(74)).setAttribute("precarga","S" );
      ((Element)v.get(74)).setAttribute("conROver","S" );
      ((Element)v.get(71)).appendChild((Element)v.get(74));

      /* Empieza nodo:75 / Elemento padre: 74   */
      v.add(doc.createElement("BTNSELECCION"));
      ((Element)v.get(75)).setAttribute("normal","btnLista2N.gif" );
      ((Element)v.get(75)).setAttribute("rollOver","btnLista2S.gif" );
      ((Element)v.get(75)).setAttribute("seleccionado","btnLista2M.gif" );
      ((Element)v.get(75)).setAttribute("desactivado","btnLista2D.gif" );
      ((Element)v.get(74)).appendChild((Element)v.get(75));
      /* Termina nodo:75   */

      /* Empieza nodo:76 / Elemento padre: 74   */
      v.add(doc.createElement("BTNMINIMIZAR"));
      ((Element)v.get(76)).setAttribute("minimizar","bot_pliega_columna_on.gif" );
      ((Element)v.get(76)).setAttribute("minimROver","bot_pliega_columna_over.gif" );
      ((Element)v.get(76)).setAttribute("maximizar","bot_despliega_columna_on.gif" );
      ((Element)v.get(76)).setAttribute("maximROver","bot_despliega_columna_over.gif" );
      ((Element)v.get(74)).appendChild((Element)v.get(76));
      /* Termina nodo:76   */

      /* Empieza nodo:77 / Elemento padre: 74   */
      v.add(doc.createElement("BTNORDENAR"));
      ((Element)v.get(77)).setAttribute("ordenar","ascendente_on.gif" );
      ((Element)v.get(77)).setAttribute("ordenarInv","descendente_on.gif" );
      ((Element)v.get(74)).appendChild((Element)v.get(77));
      /* Termina nodo:77   */
      /* Termina nodo:74   */

      /* Empieza nodo:78 / Elemento padre: 71   */
      v.add(doc.createElement("LINEAS"));
      ((Element)v.get(71)).appendChild((Element)v.get(78));

      /* Empieza nodo:79 / Elemento padre: 78   */
      v.add(doc.createElement("GROSOR"));
      ((Element)v.get(79)).setAttribute("borde","1" );
      ((Element)v.get(79)).setAttribute("horizDatos","1" );
      ((Element)v.get(79)).setAttribute("horizCabecera","1" );
      ((Element)v.get(79)).setAttribute("vertical","1" );
      ((Element)v.get(79)).setAttribute("horizTitulo","1" );
      ((Element)v.get(79)).setAttribute("horizBase","1" );
      ((Element)v.get(78)).appendChild((Element)v.get(79));
      /* Termina nodo:79   */

      /* Empieza nodo:80 / Elemento padre: 78   */
      v.add(doc.createElement("COLOR"));
      ((Element)v.get(80)).setAttribute("borde","#999999" );
      ((Element)v.get(80)).setAttribute("vertCabecera","#E0E0E0" );
      ((Element)v.get(80)).setAttribute("vertDatos","#FFFFFF" );
      ((Element)v.get(80)).setAttribute("horizDatos","#FFFFFF" );
      ((Element)v.get(80)).setAttribute("horizCabecera","#999999" );
      ((Element)v.get(80)).setAttribute("horizTitulo","#999999" );
      ((Element)v.get(80)).setAttribute("horizBase","#999999" );
      ((Element)v.get(78)).appendChild((Element)v.get(80));
      /* Termina nodo:80   */
      /* Termina nodo:78   */

      /* Empieza nodo:81 / Elemento padre: 71   */
      v.add(doc.createElement("COLUMNAS"));
      ((Element)v.get(81)).setAttribute("ajustarMinimo","S" );
      ((Element)v.get(81)).setAttribute("permiteOrdenar","S" );
      ((Element)v.get(81)).setAttribute("blancosAInsertar","1" );
      ((Element)v.get(81)).setAttribute("sinSaltoLinea","S" );
      ((Element)v.get(81)).setAttribute("AnchoMinimizadas","20" );
      ((Element)v.get(81)).setAttribute("botonOrdenar","S" );
      ((Element)v.get(71)).appendChild((Element)v.get(81));

      /* Empieza nodo:82 / Elemento padre: 81   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(82)).setAttribute("ancho","100" );
      ((Element)v.get(82)).setAttribute("minimizable","S" );
      ((Element)v.get(82)).setAttribute("minimizada","N" );
      ((Element)v.get(81)).appendChild((Element)v.get(82));
      /* Termina nodo:82   */
      /* Termina nodo:81   */

      /* Empieza nodo:83 / Elemento padre: 71   */
      v.add(doc.createElement("CABECERA"));
      ((Element)v.get(83)).setAttribute("alto","20" );
      ((Element)v.get(83)).setAttribute("IDScroll","EstCab" );
      ((Element)v.get(83)).setAttribute("imgFondo","" );
      ((Element)v.get(83)).setAttribute("colFondo","#CCCCCC" );
      ((Element)v.get(71)).appendChild((Element)v.get(83));

      /* Empieza nodo:84 / Elemento padre: 83   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(84)).setAttribute("colFondo","" );
      ((Element)v.get(84)).setAttribute("ID","EstCab" );
      ((Element)v.get(84)).setAttribute("align","center" );
      ((Element)v.get(84)).setAttribute("cod","263" );
      ((Element)v.get(83)).appendChild((Element)v.get(84));
      /* Termina nodo:84   */
      /* Termina nodo:83   */

      /* Empieza nodo:85 / Elemento padre: 71   */
   }

   private void getXML360(Document doc) {
      v.add(doc.createElement("DATOS"));
      ((Element)v.get(85)).setAttribute("alto","22" );
      ((Element)v.get(85)).setAttribute("accion","" );
      ((Element)v.get(85)).setAttribute("tipoEnvio","edicion" );
      ((Element)v.get(85)).setAttribute("formaEnvio","xml" );
      ((Element)v.get(85)).setAttribute("maxSel","-1" );
      ((Element)v.get(85)).setAttribute("msgErrMaxSel","" );
      ((Element)v.get(85)).setAttribute("coloresScrollNativo","#D4D0C8,black,white,#D4D0C8,#D4D0C8,#ECE9E4,black" );
      ((Element)v.get(85)).setAttribute("colorROver","#D0D9E8" );
      ((Element)v.get(85)).setAttribute("onLoad","" );
      ((Element)v.get(85)).setAttribute("colorSelecc","#D0D9E8" );
      ((Element)v.get(71)).appendChild((Element)v.get(85));

      /* Empieza nodo:86 / Elemento padre: 85   */
      v.add(doc.createElement("COL"));
      ((Element)v.get(86)).setAttribute("tipo","texto" );
      ((Element)v.get(86)).setAttribute("ID","EstDat" );
      ((Element)v.get(85)).appendChild((Element)v.get(86));
      /* Termina nodo:86   */
      /* Termina nodo:85   */

      /* Empieza nodo:87 / Elemento padre: 71   */
      v.add(doc.createElement("ROWSET"));
      ((Element)v.get(71)).appendChild((Element)v.get(87));

      /* Empieza nodo:88 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(88)).setAttribute("ID","1" );
      ((Element)v.get(87)).appendChild((Element)v.get(88));

      /* Empieza nodo:89 / Elemento padre: 88   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(89)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(89)).setAttribute("TIPO","STRING" );
      ((Element)v.get(89)).setAttribute("VALOR","COD0" );
      ((Element)v.get(88)).appendChild((Element)v.get(89));
      /* Termina nodo:89   */

      /* Empieza nodo:90 / Elemento padre: 88   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(90)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(90)).setAttribute("TIPO","STRING" );
      ((Element)v.get(90)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(88)).appendChild((Element)v.get(90));
      /* Termina nodo:90   */
      /* Termina nodo:88   */

      /* Empieza nodo:91 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(91)).setAttribute("ID","2" );
      ((Element)v.get(87)).appendChild((Element)v.get(91));

      /* Empieza nodo:92 / Elemento padre: 91   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(92)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(92)).setAttribute("TIPO","STRING" );
      ((Element)v.get(92)).setAttribute("VALOR","COD1" );
      ((Element)v.get(91)).appendChild((Element)v.get(92));
      /* Termina nodo:92   */

      /* Empieza nodo:93 / Elemento padre: 91   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(93)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(93)).setAttribute("TIPO","STRING" );
      ((Element)v.get(93)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(91)).appendChild((Element)v.get(93));
      /* Termina nodo:93   */
      /* Termina nodo:91   */

      /* Empieza nodo:94 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(94)).setAttribute("ID","3" );
      ((Element)v.get(87)).appendChild((Element)v.get(94));

      /* Empieza nodo:95 / Elemento padre: 94   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(95)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(95)).setAttribute("TIPO","STRING" );
      ((Element)v.get(95)).setAttribute("VALOR","COD2" );
      ((Element)v.get(94)).appendChild((Element)v.get(95));
      /* Termina nodo:95   */

      /* Empieza nodo:96 / Elemento padre: 94   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(96)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(96)).setAttribute("TIPO","STRING" );
      ((Element)v.get(96)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(94)).appendChild((Element)v.get(96));
      /* Termina nodo:96   */
      /* Termina nodo:94   */

      /* Empieza nodo:97 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(97)).setAttribute("ID","1" );
      ((Element)v.get(87)).appendChild((Element)v.get(97));

      /* Empieza nodo:98 / Elemento padre: 97   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(98)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(98)).setAttribute("TIPO","STRING" );
      ((Element)v.get(98)).setAttribute("VALOR","COD3" );
      ((Element)v.get(97)).appendChild((Element)v.get(98));
      /* Termina nodo:98   */

      /* Empieza nodo:99 / Elemento padre: 97   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(99)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(99)).setAttribute("TIPO","STRING" );
      ((Element)v.get(99)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(97)).appendChild((Element)v.get(99));
      /* Termina nodo:99   */
      /* Termina nodo:97   */

      /* Empieza nodo:100 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(100)).setAttribute("ID","2" );
      ((Element)v.get(87)).appendChild((Element)v.get(100));

      /* Empieza nodo:101 / Elemento padre: 100   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(101)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(101)).setAttribute("TIPO","STRING" );
      ((Element)v.get(101)).setAttribute("VALOR","COD4" );
      ((Element)v.get(100)).appendChild((Element)v.get(101));
      /* Termina nodo:101   */

      /* Empieza nodo:102 / Elemento padre: 100   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(102)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(102)).setAttribute("TIPO","STRING" );
      ((Element)v.get(102)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(100)).appendChild((Element)v.get(102));
      /* Termina nodo:102   */
      /* Termina nodo:100   */

      /* Empieza nodo:103 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(103)).setAttribute("ID","3" );
      ((Element)v.get(87)).appendChild((Element)v.get(103));

      /* Empieza nodo:104 / Elemento padre: 103   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(104)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(104)).setAttribute("TIPO","STRING" );
      ((Element)v.get(104)).setAttribute("VALOR","COD5" );
   }

   private void getXML450(Document doc) {
      ((Element)v.get(103)).appendChild((Element)v.get(104));
      /* Termina nodo:104   */

      /* Empieza nodo:105 / Elemento padre: 103   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(105)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(105)).setAttribute("TIPO","STRING" );
      ((Element)v.get(105)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(103)).appendChild((Element)v.get(105));
      /* Termina nodo:105   */
      /* Termina nodo:103   */

      /* Empieza nodo:106 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(106)).setAttribute("ID","3" );
      ((Element)v.get(87)).appendChild((Element)v.get(106));

      /* Empieza nodo:107 / Elemento padre: 106   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(107)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(107)).setAttribute("TIPO","STRING" );
      ((Element)v.get(107)).setAttribute("VALOR","COD6" );
      ((Element)v.get(106)).appendChild((Element)v.get(107));
      /* Termina nodo:107   */

      /* Empieza nodo:108 / Elemento padre: 106   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(108)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(108)).setAttribute("TIPO","STRING" );
      ((Element)v.get(108)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(106)).appendChild((Element)v.get(108));
      /* Termina nodo:108   */
      /* Termina nodo:106   */

      /* Empieza nodo:109 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(109)).setAttribute("ID","1" );
      ((Element)v.get(87)).appendChild((Element)v.get(109));

      /* Empieza nodo:110 / Elemento padre: 109   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(110)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(110)).setAttribute("TIPO","STRING" );
      ((Element)v.get(110)).setAttribute("VALOR","COD0" );
      ((Element)v.get(109)).appendChild((Element)v.get(110));
      /* Termina nodo:110   */

      /* Empieza nodo:111 / Elemento padre: 109   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(111)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(111)).setAttribute("TIPO","STRING" );
      ((Element)v.get(111)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(109)).appendChild((Element)v.get(111));
      /* Termina nodo:111   */
      /* Termina nodo:109   */

      /* Empieza nodo:112 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(112)).setAttribute("ID","2" );
      ((Element)v.get(87)).appendChild((Element)v.get(112));

      /* Empieza nodo:113 / Elemento padre: 112   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(113)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(113)).setAttribute("TIPO","STRING" );
      ((Element)v.get(113)).setAttribute("VALOR","COD1" );
      ((Element)v.get(112)).appendChild((Element)v.get(113));
      /* Termina nodo:113   */

      /* Empieza nodo:114 / Elemento padre: 112   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(114)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(114)).setAttribute("TIPO","STRING" );
      ((Element)v.get(114)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(112)).appendChild((Element)v.get(114));
      /* Termina nodo:114   */
      /* Termina nodo:112   */

      /* Empieza nodo:115 / Elemento padre: 87   */
      v.add(doc.createElement("ROW"));
      ((Element)v.get(115)).setAttribute("ID","3" );
      ((Element)v.get(87)).appendChild((Element)v.get(115));

      /* Empieza nodo:116 / Elemento padre: 115   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(116)).setAttribute("NOMBRE","dato1" );
      ((Element)v.get(116)).setAttribute("TIPO","STRING" );
      ((Element)v.get(116)).setAttribute("VALOR","COD2" );
      ((Element)v.get(115)).appendChild((Element)v.get(116));
      /* Termina nodo:116   */

      /* Empieza nodo:117 / Elemento padre: 115   */
      v.add(doc.createElement("CAMPO"));
      ((Element)v.get(117)).setAttribute("NOMBRE","dato4" );
      ((Element)v.get(117)).setAttribute("TIPO","STRING" );
      ((Element)v.get(117)).setAttribute("VALOR","xxxxxxxxxxxxxx1" );
      ((Element)v.get(115)).appendChild((Element)v.get(117));
      /* Termina nodo:117   */
      /* Termina nodo:115   */
      /* Termina nodo:87   */

      /* Empieza nodo:118 / Elemento padre: 71   */
      v.add(doc.createElement("PAGINADO"));
      ((Element)v.get(118)).setAttribute("nombre","mipgndo" );
      ((Element)v.get(118)).setAttribute("ancho","403" );
      ((Element)v.get(118)).setAttribute("sep","$" );
      ((Element)v.get(118)).setAttribute("x","12" );
      ((Element)v.get(118)).setAttribute("class","botonera" );
      ((Element)v.get(118)).setAttribute("y","406" );
      ((Element)v.get(118)).setAttribute("control","|" );
      ((Element)v.get(118)).setAttribute("conector","conector_prototipo_2" );
      ((Element)v.get(118)).setAttribute("rowset","" );
      ((Element)v.get(118)).setAttribute("cargainicial","N" );
      ((Element)v.get(71)).appendChild((Element)v.get(118));

      /* Empieza nodo:119 / Elemento padre: 118   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(119)).setAttribute("nombre","ret1" );
      ((Element)v.get(119)).setAttribute("x","37" );
      ((Element)v.get(119)).setAttribute("y","410" );
      ((Element)v.get(119)).setAttribute("ID","botonContenido" );
      ((Element)v.get(119)).setAttribute("img","retroceder_on" );
      ((Element)v.get(119)).setAttribute("tipo","0" );
      ((Element)v.get(119)).setAttribute("estado","false" );
      ((Element)v.get(119)).setAttribute("alt","" );
      ((Element)v.get(119)).setAttribute("codigo","" );
      ((Element)v.get(119)).setAttribute("accion","mipgndo.retroceder();" );
      ((Element)v.get(118)).appendChild((Element)v.get(119));
      /* Termina nodo:119   */

      /* Empieza nodo:120 / Elemento padre: 118   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(120)).setAttribute("nombre","ava1" );
      ((Element)v.get(120)).setAttribute("x","52" );
      ((Element)v.get(120)).setAttribute("y","410" );
      ((Element)v.get(120)).setAttribute("ID","botonContenido" );
      ((Element)v.get(120)).setAttribute("img","avanzar_on" );
      ((Element)v.get(120)).setAttribute("tipo","0" );
      ((Element)v.get(120)).setAttribute("estado","false" );
   }

   private void getXML540(Document doc) {
      ((Element)v.get(120)).setAttribute("alt","" );
      ((Element)v.get(120)).setAttribute("codigo","" );
      ((Element)v.get(120)).setAttribute("accion","mipgndo.avanzar();" );
      ((Element)v.get(118)).appendChild((Element)v.get(120));
      /* Termina nodo:120   */
      /* Termina nodo:118   */
      /* Termina nodo:71   */

      /* Empieza nodo:121 / Elemento padre: 5   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(121)).setAttribute("nombre","ImprimirNum" );
      ((Element)v.get(121)).setAttribute("x","80" );
      ((Element)v.get(121)).setAttribute("y","407" );
      ((Element)v.get(121)).setAttribute("ID","botonContenido" );
      ((Element)v.get(121)).setAttribute("tipo","html" );
      ((Element)v.get(121)).setAttribute("estado","false" );
      ((Element)v.get(121)).setAttribute("cod","1082" );
      ((Element)v.get(121)).setAttribute("accion","imprimirNumeros();" );
      ((Element)v.get(5)).appendChild((Element)v.get(121));
      /* Termina nodo:121   */

      /* Empieza nodo:122 / Elemento padre: 5   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(122)).setAttribute("nombre","ImprimirCupones" );
      ((Element)v.get(122)).setAttribute("x","201" );
      ((Element)v.get(122)).setAttribute("y","407" );
      ((Element)v.get(122)).setAttribute("ID","botonContenido" );
      ((Element)v.get(122)).setAttribute("tipo","html" );
      ((Element)v.get(122)).setAttribute("estado","false" );
      ((Element)v.get(122)).setAttribute("cod","1081" );
      ((Element)v.get(122)).setAttribute("accion","imprimirCupones();" );
      ((Element)v.get(122)).setAttribute("ontab","TabUp();" );
      ((Element)v.get(5)).appendChild((Element)v.get(122));
      /* Termina nodo:122   */

      /* Empieza nodo:123 / Elemento padre: 5   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(123)).setAttribute("nombre","prim1" );
      ((Element)v.get(123)).setAttribute("x","20" );
      ((Element)v.get(123)).setAttribute("y","410" );
      ((Element)v.get(123)).setAttribute("ID","botonContenido" );
      ((Element)v.get(123)).setAttribute("img","primera_on" );
      ((Element)v.get(123)).setAttribute("tipo","-2" );
      ((Element)v.get(123)).setAttribute("estado","false" );
      ((Element)v.get(123)).setAttribute("alt","" );
      ((Element)v.get(123)).setAttribute("codigo","" );
      ((Element)v.get(123)).setAttribute("accion","mipgndo.retrocederPrimeraPagina();" );
      ((Element)v.get(5)).appendChild((Element)v.get(123));
      /* Termina nodo:123   */

      /* Empieza nodo:124 / Elemento padre: 5   */
      v.add(doc.createElement("BOTON"));
      ((Element)v.get(124)).setAttribute("nombre","separa" );
      ((Element)v.get(124)).setAttribute("x","59" );
      ((Element)v.get(124)).setAttribute("y","406" );
      ((Element)v.get(124)).setAttribute("ID","botonContenido" );
      ((Element)v.get(124)).setAttribute("img","separa_base" );
      ((Element)v.get(124)).setAttribute("tipo","0" );
      ((Element)v.get(124)).setAttribute("estado","false" );
      ((Element)v.get(124)).setAttribute("alt","" );
      ((Element)v.get(124)).setAttribute("codigo","" );
      ((Element)v.get(124)).setAttribute("accion","" );
      ((Element)v.get(5)).appendChild((Element)v.get(124));
      /* Termina nodo:124   */

      /* Empieza nodo:125 / Elemento padre: 5   */
      v.add(doc.createElement("CAPA"));
      ((Element)v.get(125)).setAttribute("nombre","capaEspacio" );
      ((Element)v.get(125)).setAttribute("alto","12" );
      ((Element)v.get(125)).setAttribute("ancho","50" );
      ((Element)v.get(125)).setAttribute("colorf","" );
      ((Element)v.get(125)).setAttribute("borde","0" );
      ((Element)v.get(125)).setAttribute("imagenf","" );
      ((Element)v.get(125)).setAttribute("repeat","" );
      ((Element)v.get(125)).setAttribute("padding","" );
      ((Element)v.get(125)).setAttribute("visibilidad","visible" );
      ((Element)v.get(125)).setAttribute("contravsb","" );
      ((Element)v.get(125)).setAttribute("x","0" );
      ((Element)v.get(125)).setAttribute("y","429" );
      ((Element)v.get(125)).setAttribute("zindex","" );
      ((Element)v.get(5)).appendChild((Element)v.get(125));
      /* Termina nodo:125   */
      /* Termina nodo:5   */


   }

}
