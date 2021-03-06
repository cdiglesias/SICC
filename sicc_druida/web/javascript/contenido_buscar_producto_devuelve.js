/* posiciones de la lista Resultado */
	var LST_RESULTADO_OID = 0;
	var LST_RESULTADO_DESCRIPCION = 1;
	var LST_RESULTADO_PERIODO = 2;
	var LST_RESULTADO_DESC_TIPO_OFERTA = 3;
	var LST_RESULTADO_OID_TIPO_OFERTA = 4;
	var LST_RESULTADO_UNIDADES_ATENDIDAS = 5;
	var LST_RESULTADO_UNIDADES_RECLAMADAS = 6;
	var LST_RESULTADO_UNIDADES_DISPONIBLES = 7;
	var LST_RESULTADO_CODIGO_VENTA = 8;
	var LST_RESULTADO_OID_COD_VENTA = 9;
	var LST_RESULTADO_PRECIO_CATALOGO_UNIT_DOC = 10;
	var LST_RESULTADO_DESCUENTO_UNITARIO = 11;
	var LST_RESULTADO_PRECIO_FACTURA_UNITARIO_DOC = 12;
	var LST_RESULTADO_PRECIO_CONTABLE_UNITARIO = 13;
	var LST_RESULTADO_NUMERO_CONCURSO = 14;
	var LST_RESULTADO_NUMERO_NIVEL = 15;
	var LST_RESULTADO_NUMERO_LOTE = 16;
	var LST_RESULTADO_CODIGO_PRODUCTO = 17;
	var LST_RESULTADO_OID_PRODUCTO = 18;
	var LST_RESULTADO_OID_SOLI_POSI = 19;
	var LST_RESULTADO_OID_CONCURSO = 20;
    var LST_RESULTADO_OID_NIVEL = 21;
    var LST_RESULTADO_OID_PREMIO = 22;

	/* posiciones de la lista Producto */
    var LST_PRODUCTO_OID = 0;
    var LST_PRODUCTO_DESCRIPCION = 1;
    var LST_PRODUCTO_PERIODO = 2;
    var LST_PRODUCTO_DESC_TIPO_OFERTA = 3;
    var LST_PRODUCTO_OID_TIPO_OFERTA = 4;
    var LST_PRODUCTO_UNIDADES_A_RECLAMAR = 5;
    var LST_PRODUCTO_PRECIO_TOTAL = 6;
	var LST_PRODUCTO_MOTIVO_DEVOLUCION = 7;
    var LST_PRODUCTO_UNIDADES_A_DEVOLVER = 8;
	var LST_PRODUCTO_CODIGO_VENTA = 9;
    var LST_PRODUCTO_OID_COD_VENTA = 10;
    var LST_PRODUCTO_CODIGO_PRODUCTO = 11;
    var LST_PRODUCTO_OID_PRODUCTO = 12;
    var LST_PRODUCTO_PRECIO_CATALOGO_UNIT_DOC = 13;
    var LST_PRODUCTO_DESCUENTO_UNITARIO = 14;
    var LST_PRODUCTO_PRECIO_FACTURA_UNITARIO_DOC = 15;
	var LST_PRODUCTO_PRECIO_CONTABLE_UNITARIO = 16;
    var LST_PRODUCTO_UNIDADES_ATENDIDAS = 17;
    var LST_PRODUCTO_UNIDADES_RECLAMADAS = 18;
    var LST_PRODUCTO_UNIDADES_DISPONIBLES = 19;

	var LST_PRODUCTO_OID_SOLI_POSI = 20;
	var LST_PRODUCTO_OID_CONCURSO = 21;
    var LST_PRODUCTO_OID_NIVEL = 22;
    var LST_PRODUCTO_OID_PREMIO = 23;
	/* ========================================================= */
	/* las siguientes constantes se utilizan para convertir a String los valores de */
	/* lstProducto en onClickAceptar, y asi poder asignar dichos valores a un VAR. */
	/* Esto es necesario en el caso de Operacion "Devuelve Envia" ya que en este caso*/
	/* es necesario mantener en memoria los datos de lstProductos seleccionados */
	/* por el usuario, cuando se pasa de la pantalla de Devuelve a la de Envia */
	var OBJLINEA_OID = 0;
	var OBJLINEA_DESC = 1;
	var OBJLINEA_PERI = 2;
	var OBJLINEA_DESC_TIPO_OFER = 3;
	var OBJLINEA_OID_TIPO_OFER = 4;
	var OBJLINEA_UNID_A_RECL = 5;
	var OBJLINEA_PREC_TOTA = 6;
	var OBJLINEA_OID_MOTI_DEVO = 7;
	var OBJLINEA_DESC_MOTI_DEVO = 8;
	var OBJLINEA_COD_VENT = 9;
	var OBJLINEA_OID_COD_VENT = 10;
	var OBJLINEA_COD_PROD = 11;
	var OBJLINEA_OID_PROD = 12;
	var OBJLINEA_PREC_CATA_UNIT = 13;
	var OBJLINEA_DESC_UNIT = 14;
	var OBJLINEA_PREC_FACT_UNIT = 15;
	var OBJLINEA_PREC_CONT_UNIT = 16;
	var OBJLINEA_UNID_ATEN = 17;
	var OBJLINEA_UNID_DISP = 18;
	var OBJLINEA_UNID_A_DEVO = 19;
	var OBJLINEA_DESC_TIPO_MOVI = 20;
	var OBJLINEA_OID_TIPO_MOVI = 21;
	var OBJLINEA_UNID_RECL = 22;
	var OBJLINEA_IMPO_CARG = 23;
	var OBJLINEA_IMPO_ABON = 24;
    var OBJLINEA_SOLI_POSI = 25;
	var OBJLINEA_OID_CONCURSO = 26;
	var OBJLINEA_OID_NIVEL = 27;
	var OBJLINEA_OID_PREMIO = 28;


	/* ========================================================= */


    var tipoMovimiento = '';
    var oidTipoMovimiento = '';
	var arrayControlProductosDevuelve = new Array();

	function muestraLista(ultima, rowset){

		if (rowset != null && rowset.length > 0){
			if (get('frmContenido.indBuscar') == '1'){
				for (var i = 0; i < rowset.length; i++){

					//	OJO: Se recupera estas columnas porque vienen en orden diferente desde query
					var tempCV = rowset[i][7];	// COL7= CODIGOVENTA
					var tempOCV = rowset[i][8]; // COL8= OID_COD_VENTA
					var tempPU = rowset[i][9];	// COL9= PRECIOUNITARIO
					var tempPC = rowset[i][10];	// COL10= PRECIOCONTABLE
					var tempNC = rowset[i][11];	// COL11= NUMEROCONCURSO
					var tempNN = rowset[i][12];  // COL12= NUMERONIVEL
					var tempNP = rowset[i][13]; // COL13= NUMPREMIO
					var tempProd = rowset[i][14];	// COL14= CODIGOPRODUCTO
					var tempOProd = rowset[i][15];   //	COL15= OID_PRODUCTO
					var tempOSP = rowset[i][16];	// COL16= OID_SOLI_POSI
					var tempOC = rowset[i][17];	// COL17= OIDCONCURSO
					var tempON = rowset[i][18];	// COL18= OIDNIVEL
					var tempOP = rowset[i][19];	// COL19= OIDPREMIO

					/*
					COL0= OID
					COL1= DESCRIPCION
					COL2= PERIODO
					COL3= DESCRIPCIONTIPOOFERTA
					COL4= OIDTIPOOFERTA
					COL5= UNIDADADESATENDIDAS
					COL6= UNIDADESYARECLAMADAS
					COL7= CODIGOVENTA
					COL8= OID_COD_VENTA
					COL9= PRECIOUNITARIO
					COL10= PRECIOCONTABLE
					COL11= NUMEROCONCURSO
					COL12= NUMERONIVEL
					COL13= NUMPREMIO
					COL14= CODIGOPRODUCTO
					COL15= OID_PRODUCTO
					COL16= OID_SOLI_POSI
					COL17= OIDCONCURSO
					COL18= OIDNIVEL
					COL19= OIDPREMIO
					*/

					rowset[i][LST_RESULTADO_UNIDADES_DISPONIBLES] = ' '; // Columna 8
					rowset[i][LST_RESULTADO_CODIGO_VENTA] = tempCV;  // Columna 8
					rowset[i][LST_RESULTADO_OID_COD_VENTA] = tempOCV; // Columna 9
					rowset[i][LST_RESULTADO_PRECIO_CATALOGO_UNIT_DOC] = tempPU; // Columna 10
					rowset[i][LST_RESULTADO_DESCUENTO_UNITARIO] = ' '; // Columna  11
					rowset[i][LST_RESULTADO_PRECIO_FACTURA_UNITARIO_DOC] = ' '; // Columna 12
					rowset[i][LST_RESULTADO_PRECIO_CONTABLE_UNITARIO] = tempPC; // Columna 13
					rowset[i][LST_RESULTADO_NUMERO_CONCURSO] = tempNC;  // Columna 14
					rowset[i][LST_RESULTADO_NUMERO_NIVEL] = tempNN; // Columna 15
					rowset[i][LST_RESULTADO_NUMERO_LOTE] = tempNP;  // Columna 16
					rowset[i][LST_RESULTADO_CODIGO_PRODUCTO] = tempProd; // Columna 17
					rowset[i][LST_RESULTADO_OID_PRODUCTO] = tempOProd; // Columna 18
					rowset[i][LST_RESULTADO_OID_SOLI_POSI] = tempOSP; // Columna 19
					rowset[i][LST_RESULTADO_OID_CONCURSO] = tempOC; // Columna 20
					rowset[i][LST_RESULTADO_OID_NIVEL] = tempON; // Columna 21
					rowset[i][LST_RESULTADO_OID_PREMIO] = tempOP; // Columna 22

				}
			}
		
			rowset = actualizarDatosControlEnLista(rowset, arrayControlProductosDevuelve);
			
			return true;
		} else {
			return false;
		}
	}

    /* autor: Marcelo J. Maidana */
    /* Fecha: 06/03/2006 */
	function onLoadPag(){

		
		var parametros = new Array();
        var numDocumento = get("frmContenido.oidNumDocumento");
        var oidCliente = get("frmContenido.oidCliente");
		
		focaliza('frmContenido.txtDescripcion');
		var matriz = get("frmContenido.matriz");
//		alert("Devuelve "+matriz);
        if(matriz=="I"){
				accion("frmContenido.txtPagCat", ".disabled=true");
				lstResultado.alternaVerColumna(2, false, true);
				lstProductos.alternaVerColumna(2, false, true);
		}


        tipoMovimiento = get('frmContenido.tipoMovimiento');
        oidTipoMovimiento = get('frmContenido.oidTipoMovimiento');

		if (get('frmContenido.indBuscar') == '1'){
			lstResultado.alternaVerColumna(LST_RESULTADO_DESCUENTO_UNITARIO - 1, false, false);
			lstProductos.alternaVerColumna(LST_PRODUCTO_DESCUENTO_UNITARIO - 1, false, false);
		}

		if (get('frmContenido.errDescripcion') != '') {
			var wnd = fMostrarMensajeError(get('frmContenido.errCodigo'), get('frmContenido.errDescripcion'));
			window.close();
		}

		configurarMenuSecundario("frmContenido");

		if (get('frmContenido.indBuscar') != '1'){
			parametros = [["numDocumento", numDocumento], ["oidCliente", oidCliente],["indicadorMatriz",matriz]];
			configurarPaginado(mipgndo, "RECObtenerProductosDevuelveSi", "ConectorObtenerProductosDevuelveSiREC", "es.indra.sicc.dtos.rec.DTOBuscarClientesREC", parametros);
			deshabilitaCamposBusqueda();
//			alert(lstResultado.datos);
		}

		arrayControlProductosDevuelve = obtenerControlProductosDevuelve(get('frmContenido.controlProductosDevuelve'));

		if (get('frmContenido.hRecojo')=='true') {//Verdadero
			lstProductos.tiposCol[LST_PRODUCTO_UNIDADES_A_DEVOLVER-1][8]=false;//hab
		} else {
			lstProductos.tiposCol[LST_PRODUCTO_UNIDADES_A_DEVOLVER-1][8]=true;//des
		}

        mostrarListas();
        cargarComboMotivosDevolucion();

		if (txtDescripcion.disabled == false){
			focaliza('frmContenido.txtDescripcion');
		}
	}

	function actualizarDatosControlEnLista(datosLista, datosControl){

		if (get('frmContenido.indBuscar') != '1' && datosControl != null && datosControl != undefined &&
				datosLista != null && datosLista != undefined){

			for (var i = 0; i < datosLista.length; i++){
				for (var j = 0; j < datosControl.length; j++){
					if (datosLista[i][LST_RESULTADO_OID_SOLI_POSI] == datosControl[j].oidPosicion){
						if(datosControl[j].flagModificacion == '1'){
							datosLista[i][LST_RESULTADO_UNIDADES_RECLAMADAS] = new Number(datosLista[i][LST_RESULTADO_UNIDADES_RECLAMADAS])+ new Number(datosControl[j].unidadesReclamadas);
							datosLista[i][LST_RESULTADO_UNIDADES_DISPONIBLES] = new Number(datosLista[i][LST_RESULTADO_UNIDADES_DISPONIBLES])+new Number(datosControl[j].unidadesDisponibles);	
						}else{
							datosLista[i][LST_RESULTADO_UNIDADES_RECLAMADAS] = datosControl[j].unidadesReclamadas;
							datosLista[i][LST_RESULTADO_UNIDADES_DISPONIBLES] = datosControl[j].unidadesDisponibles;
						}
					}
				}
			}
		}

		return datosLista;
	}

	function deshabilitaCamposBusqueda(){
		accion("frmContenido.txtDescripcion", ".disabled=true");
//		accion("frmContenido.txtCodVenta", ".disabled=true");
		accion("frmContenido.txtCodProducto", ".disabled=true");
		accion("frmContenido.txtPagCat", ".disabled=true");
//		deshabilitarHabilitarBoton('botonContenido','buscar','D');
	}

    function mostrarListas(){
        mostrarListaResultado();
        mostrarListaProductos();
		eval (ON_RSZ); 
    }

	function mostrarListaResultado() {
		DrdEnsanchaConMargenDcho('lstResultado', 12);
		document.all['CplstResultado'].style.visibility='visible';
		document.all['CpLin1lstResultado'].style.visibility='visible';
		document.all['CpLin2lstResultado'].style.visibility='visible';
		document.all['CpLin3lstResultado'].style.visibility='visible';
		document.all['CpLin4lstResultado'].style.visibility='visible';
	}

	function mostrarListaProductos() {
		DrdEnsanchaConMargenDcho('lstProductos', 12);
		document.all['CplstProductos'].style.visibility='visible';
		document.all['CpLin1lstProductos'].style.visibility='visible';
		document.all['CpLin2lstProductos'].style.visibility='visible';
		document.all['CpLin3lstProductos'].style.visibility='visible';
		document.all['CpLin4lstProductos'].style.visibility='visible';
	}

	/*Autor: Marcelo J. Maidana*/
	/*Fecha: 08/03/2006*/
	/*Carga combo de lista editable (Motivo devolucion).*/
	function cargarComboMotivosDevolucion(){
		var aOidsMotivoDevolucion;
		var aDescsMotivoDevolucion;

		aOidsMotivoDevolucion = get('frmContenido.hOidsMotivoDevolucion').split(','); 
		aDescsMotivoDevolucion = get('frmContenido.hDescsMotivoDevolucion').split(','); 

		aDatosComboMotivoDevolucion = new Array();
		aDatosComboMotivoDevolucion[0] = new Array('', '');

		for (var i = 0; i < aOidsMotivoDevolucion.length; i++){
			aDatosComboMotivoDevolucion[i + 1] = new Array(aOidsMotivoDevolucion[i], aDescsMotivoDevolucion[i]);
		}
			

//LST_PRODUCTO_MOTIVO_DEVOLUCION
		lstProductos.tiposCol[6][2] = aDatosComboMotivoDevolucion;			
		
		lstProductos.repinta();
            
		return true;
	}

	function obtenerDescMotivoDevolucion(oid){
		var aOidsMotivoDevolucion = new Array();
		var aDescsMotivoDevolucion = new Array();

		if (oid != null && oid != undefined && oid != ''){
			aOidsMotivoDevolucion = get('frmContenido.hOidsMotivoDevolucion').split(','); 
			aDescsMotivoDevolucion = get('frmContenido.hDescsMotivoDevolucion').split(','); 

			for (var i = 0; i < aOidsMotivoDevolucion.length; i++){
				if (aOidsMotivoDevolucion[i] == oid){
					return aDescsMotivoDevolucion[i];
				}
			}
		}

		return '';
	}

    /* autor: Marcelo J. Maidana */
    /* Fecha: 07/03/2006 */
	function onClickBuscar(){

		if (!sicc_validaciones_generales('CuadroBusqueda')){
			return;
		}

		var codigoProducto = get('frmContenido.txtCodProducto');
		var descripcion = get('frmContenido.txtDescripcion');
		var codigoVenta = get('frmContenido.txtCodVenta');
		var paginaCatalogo = get( 'frmContenido.txtPagCat');
		var idioma = get('frmContenido.idioma');
		var pais = get('frmContenido.pais');
		var numDocumento = get('frmContenido.oidNumDocumento');
		var operacion = get('frmContenido.oidOperacion');
		var parametros = new Array();
		
		
		if (get('frmContenido.indBuscar') != '1'){
			parametros = [["numDocumento",numDocumento],["oidCliente", get("frmContenido.oidCliente")],
				["indicadorMatriz",get("frmContenido.matriz")],["codigoVenta",codigoVenta]];
			configurarPaginado(mipgndo, "RECObtenerProductosDevuelveSi", "ConectorObtenerProductosDevuelveSiREC", "es.indra.sicc.dtos.rec.DTOBuscarClientesREC", parametros);
		}else{
				

				

				
				var devuelveFisicoFactura = '';
				
				/* Oculta la columna Tipo de Oferta */
				lstResultado.alternaVerColumna(2, false, true);
				lstProductos.alternaVerColumna(2, false, true);

				/* alternaVerColumna(columna,visib,noRepintar) */
				
				/* alternaVerColumna(2, false, true); */
				
				if (get('frmContenido.devuelveFisicoFactura') == '1'){
					devuelveFisicoFactura = 'true';
				} else {
					devuelveFisicoFactura = 'false';
				}

				if (codigoVenta == '' && (descripcion != '' || codigoProducto != '')) { 

					parametros = [ 
						["oidPais", pais], 
						["oidIdioma", idioma], 
						["descripcion", descripcion],
						/* ["codigoVenta", codigoVenta], */ /* codigoVenta no se utiliza en la query */ 
						["codigoProducto", codigoProducto], 
						/* ["paginaCatalogo", paginaCatalogo], */ /* paginaCatalogo no se utiliza en la query */
						["numDocumento", numDocumento],
						["operacion", operacion],
						["devuelveFisicoFactura", devuelveFisicoFactura]];

					configurarPaginado(mipgndo, "RECObtenerProductosCodigoVentaNo", 
						"ConectorObtenerProductosCodigoVentaNoREC", 
						"es.indra.sicc.dtos.rec.DTOBuscarProductosDevuelveNoREC", parametros);

				} else if (codigoVenta != '' || paginaCatalogo != '') {

					parametros = [ 
						/* ["oidPais", pais], */ /* no se usa */
						["oidIdioma", idioma], 
						/* ["descripcion", descripcion], */ /* no se usa */
						["codigoVenta", codigoVenta], 
						/* ["codigoProducto", codigoProducto], */ /* no se usa */
						["paginaCatalogo", paginaCatalogo], 
						["numDocumento", numDocumento],
						["operacion", operacion],
						["devuelveFisicoFactura", devuelveFisicoFactura]];
						
					configurarPaginado(mipgndo, "RECObtenerProductosCodigoVentaSi", 
						"ConectorObtenerProductosCodigoVentaNoREC", 
						"es.indra.sicc.dtos.rec.DTOBuscarProductosDevuelveNoREC", parametros);

				} else {
					GestionarMensaje('REC009');	
				}
		}
	}

    /* Autor: Marcelo J. Maidana */
    /* Fecha: 07/03/2006 */
	function onClickAnyadir(){
        var fila;
		var desc;

		var oidMotivoDevolucionDefecto = get('frmContenido.hOidMotivoDevolucionDefecto');

		var filaAgregar = new Array();

		lstResultado.actualizaDat();

		if (lstResultado.numSelecc() == 0) {
            GestionarMensaje('1021');
		} else {
			var seleccionados = lstResultado.codSeleccionados();
			var matDatos1 = lstResultado.datos;
			var indiceMatriz;

			for (j = 0; j < seleccionados.length; j++){
				encontrado = false;
				indiceMatriz = buscarIndiceCodigo(seleccionados[j], matDatos1);
                fila = matDatos1[indiceMatriz];
//                alert("fila"+fila);
				for (k=0; k < lstProductos.datos.length; k++) {
					if (comparaLinea(fila, lstProductos.datos[k])){
						encontrado = true;
						break;
					}
				 }
             	
				if (new Number(fila[LST_RESULTADO_UNIDADES_DISPONIBLES]) < 1  && fila[LST_RESULTADO_UNIDADES_DISPONIBLES] != " " ){
				
					/* Mostrar el mensaje de error REC025: */
					/* "No puede reclamar un n�mero de unidades mayor al de la factura" */
					
					GestionarMensaje('REC025');
					
					return;
				}

				if (!eval(encontrado)){

					filaAgregar = new Array();
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_DESCRIPCION];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_PERIODO];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_DESC_TIPO_OFERTA];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_TIPO_OFERTA];
					filaAgregar[filaAgregar.length] = '1'; // unidades a reclamar
					filaAgregar[filaAgregar.length] = ''; // precio total
					filaAgregar[filaAgregar.length] = oidMotivoDevolucionDefecto;

					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_UNIDADES_RECLAMADAS]; //Cambio 20080765 Se coloca por defecto el valor de unidades reclamadas
						//Cambio previo '0';//unidades devueltas cambio SC-REC-10 se agrega el 0 por defecto

					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_CODIGO_VENTA];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_COD_VENTA];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_CODIGO_PRODUCTO];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_PRODUCTO];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_PRECIO_CATALOGO_UNIT_DOC];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_DESCUENTO_UNITARIO];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_PRECIO_FACTURA_UNITARIO_DOC];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_PRECIO_CONTABLE_UNITARIO];
					
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_UNIDADES_ATENDIDAS];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_UNIDADES_RECLAMADAS];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_UNIDADES_DISPONIBLES];

					/* yyy */

					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_SOLI_POSI];

					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_CONCURSO];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_NIVEL];
					filaAgregar[filaAgregar.length] = fila[LST_RESULTADO_OID_PREMIO];

					lstProductos.insertar(filaAgregar);
					lstProductos.reajusta();
					lstResultado.reajusta();
					
					
					lstProductos.actualizaDat();
					lstProductos.repinta();

				}
			}/*fin for*/
		} 
	}


	/* linea1: linea de lstResultado */
	/* linea2: linea de lstProducto */
	function comparaLinea(linea1, linea2) {
		if (linea1[LST_RESULTADO_DESCRIPCION] == linea2[LST_PRODUCTO_DESCRIPCION] && 
				linea1[LST_RESULTADO_PERIODO] == linea2[LST_PRODUCTO_PERIODO] && 
				linea1[LST_RESULTADO_DESC_TIPO_OFERTA] == linea2[LST_PRODUCTO_DESC_TIPO_OFERTA] &&
				linea1[LST_RESULTADO_OID_TIPO_OFERTA] == linea2[LST_PRODUCTO_OID_TIPO_OFERTA] && 
				linea1[LST_RESULTADO_CODIGO_VENTA] == linea2[LST_PRODUCTO_CODIGO_VENTA] && 
				linea1[LST_RESULTADO_OID_COD_VENTA] == linea2[LST_PRODUCTO_OID_COD_VENTA] &&
				linea1[LST_RESULTADO_CODIGO_PRODUCTO] == linea2[LST_PRODUCTO_CODIGO_PRODUCTO] && 
				linea1[LST_RESULTADO_OID_PRODUCTO] == linea2[LST_PRODUCTO_OID_PRODUCTO] && 
				linea1[LST_RESULTADO_PRECIO_CATALOGO_UNIT_DOC] == linea2[LST_PRODUCTO_PRECIO_CATALOGO_UNIT_DOC] &&
				linea1[LST_RESULTADO_DESCUENTO_UNITARIO] == linea2[LST_PRODUCTO_DESCUENTO_UNITARIO] && 
				linea1[LST_RESULTADO_PRECIO_FACTURA_UNITARIO_DOC] == linea2[LST_PRODUCTO_PRECIO_FACTURA_UNITARIO_DOC] && 
				linea1[LST_RESULTADO_PRECIO_CONTABLE_UNITARIO] == linea2[LST_PRODUCTO_PRECIO_CONTABLE_UNITARIO] && 
		
				linea1[LST_RESULTADO_UNIDADES_ATENDIDAS] == linea2[LST_PRODUCTO_UNIDADES_ATENDIDAS] &&
				linea1[LST_RESULTADO_UNIDADES_RECLAMADAS] == linea2[LST_PRODUCTO_UNIDADES_RECLAMADAS] && 
				linea1[LST_RESULTADO_UNIDADES_DISPONIBLES] == linea2[LST_PRODUCTO_UNIDADES_DISPONIBLES] &&
				linea1[LST_RESULTADO_OID_SOLI_POSI] == linea2[LST_PRODUCTO_OID_SOLI_POSI] &&
				linea1[LST_RESULTADO_OID_CONCURSO] == linea2[LST_PRODUCTO_OID_CONCURSO] &&
				linea1[LST_RESULTADO_OID_NIVEL] == linea2[LST_PRODUCTO_OID_NIVEL] &&
				linea1[LST_RESULTADO_OID_PREMIO] == linea2[LST_PRODUCTO_OID_PREMIO]){


			return true;
		}

		return false;
	}


	function buscarIndiceCodigo(cod, arrDatos){
		for (var i = 0; i < arrDatos.length; i++){
			if (cod == arrDatos[i][0]){
				return i;
			}
		}
	}

	function onClickAceptar(){

		lstProductos.actualizaDat();

        var objNumeroLinea = new Number(get('frmContenido.numeroLinea'));
        var numeroLinea = objNumeroLinea.valueOf();
        var objLinea = new Object();
        var unidadesAReclamar = new Number();
        var unidadesDisponibles = new Number();
        var unidadesDevueltas = new Number();
        var primUnidadesAReclamar = 0;
        var primUnidadesDisponibles = 0;
        var primUnidadesDevueltas = 0;
    
        /*Se hacen las validaciones*/
        
        /* validar que haya registros */
        if (lstProductos.datos.length == 0){
        
            /* - Mostrar el mensaje de error REC013: "Se debe a�adir a la lista al menos un registro" */
        
            GestionarMensaje('REC013');
        
            return;
        }

		/* Se valida que los campos editables de la lista - 'N unid. a reclamar' y 'N unid. devueltas' - */
		/* sean numericos */
		if (!sicc_valida_requerido_LE('txtUnidadesReclamadasSi', obtenerDescripcionCampo('descUnidadesAReclamar'), 
					'lstProductos', LST_PRODUCTO_UNIDADES_A_RECLAMAR) ||
				!sicc_valida_numero_LE('txtUnidadesReclamadasSi', obtenerDescripcionCampo('descUnidadesAReclamar'), '1', '9999999', 'Entero', 
					'lstProductos', LST_PRODUCTO_UNIDADES_A_RECLAMAR) ||
				!sicc_valida_requerido_LE('txtUnidadesDevueltasSi', obtenerDescripcionCampo('descUnidadesADevolver'), 
					'lstProductos', LST_PRODUCTO_UNIDADES_A_DEVOLVER) ||
			/* inc DBLG500000872 : BELC300023398 - gPineda - el valor m�nimo de unidades devueltas debe ser 0 en vez de 1 */
				!sicc_valida_numero_LE('txtUnidadesDevueltasSi', obtenerDescripcionCampo('descUnidadesADevolver'), '0', '9999999', 'Entero', 
					'lstProductos', LST_PRODUCTO_UNIDADES_A_DEVOLVER)){
			
			return;
		}

		/* --------------------------------------------------------------------------------------------- */

        /* validar numero de unidades */
		/* en caso de que este deshabilitada la capa de Criterios de busqueda */
		if (get('frmContenido.indBuscar') != '1'){
			for (var i = 0; i < lstProductos.datos.length; i++){
				unidadesAReclamar = new Number(lstProductos.datos[i][LST_PRODUCTO_UNIDADES_A_RECLAMAR]);
				unidadesDisponibles = new Number(lstProductos.datos[i][LST_PRODUCTO_UNIDADES_DISPONIBLES]);
				unidadesDevueltas = new Number(lstProductos.datos[i][LST_PRODUCTO_UNIDADES_A_DEVOLVER]);

				primUnidadesAReclamar = unidadesAReclamar.valueOf();
				primUnidadesDisponibles = unidadesDisponibles.valueOf();
				primUnidadesDevueltas = unidadesDevueltas.valueOf();

				//RI SiCC 20102706 - sapaza - 22/04/2010, se quita el segundo filtro: || primUnidadesDevueltas > primUnidadesAReclamar
				if (primUnidadesAReclamar > primUnidadesDisponibles){
				
					/* Mostrar el mensaje de error REC025: */
					/* "No puede reclamar un n�mero de unidades mayor al de la factura" */
					
					GestionarMensaje('REC025');
					
					return;
				}
			}
		}

        /*Si se pasan las validaciones, se obtienen los registros de lstProductos*/
        /*para enviarlos a la pagina de Agregar operacion.*/

		var arrayLineas = new Array();
        if(get('frmContenido.indicadorDevuelveProcesado')=='1'){
            arrayLineas = obtenerProductosDevuelveProcesado();
        }
        var objReturn = new Object();
        var precioCatalogo = new Number();
        var primPrecioCatalogo = 0;
        var datosProductos = lstProductos.datos

        for (var j = 0; j < datosProductos.length; j++){
			objLinea = new Object();
            objLinea.oid = ++numeroLinea;
            objLinea.descripcion = datosProductos[j][LST_PRODUCTO_DESCRIPCION];
            objLinea.periodo = datosProductos[j][LST_PRODUCTO_PERIODO];
            objLinea.descripcionTipoOferta = datosProductos[j][LST_PRODUCTO_DESC_TIPO_OFERTA];
            objLinea.oidTipoOferta = datosProductos[j][LST_PRODUCTO_OID_TIPO_OFERTA];
            objLinea.codigoVenta = datosProductos[j][LST_PRODUCTO_CODIGO_VENTA];
            objLinea.oidCodVenta = datosProductos[j][LST_PRODUCTO_OID_COD_VENTA];
            objLinea.codigoProducto = datosProductos[j][LST_PRODUCTO_CODIGO_PRODUCTO];
            objLinea.oidProducto = datosProductos[j][LST_PRODUCTO_OID_PRODUCTO];
            objLinea.precioCatalogoUnitario = datosProductos[j][LST_PRODUCTO_PRECIO_CATALOGO_UNIT_DOC];
			objLinea.descuentoUnitario = datosProductos[j][LST_PRODUCTO_DESCUENTO_UNITARIO];
            objLinea.precioFacturaUnitario = datosProductos[j][LST_PRODUCTO_PRECIO_FACTURA_UNITARIO_DOC];
            objLinea.precioContableUnitario = datosProductos[j][LST_PRODUCTO_PRECIO_CONTABLE_UNITARIO];
			
            objLinea.unidadesAtendidas = datosProductos[j][LST_PRODUCTO_UNIDADES_ATENDIDAS];
            objLinea.unidadesDisponibles = datosProductos[j][LST_PRODUCTO_UNIDADES_DISPONIBLES];
			objLinea.unidadesAReclamar = datosProductos[j][LST_PRODUCTO_UNIDADES_A_RECLAMAR];
            objLinea.precioTotal = datosProductos[j][LST_PRODUCTO_PRECIO_TOTAL];
            objLinea.unidadesADevolver = datosProductos[j][LST_PRODUCTO_UNIDADES_A_DEVOLVER];
            objLinea.oidMotivoDevolucion = datosProductos[j][LST_PRODUCTO_MOTIVO_DEVOLUCION];
            objLinea.motivoDevolucion = obtenerDescMotivoDevolucion(objLinea.oidMotivoDevolucion);
            objLinea.tipoMovimiento = tipoMovimiento;
            objLinea.oidTipoMovimiento = oidTipoMovimiento;
			objLinea.unidadesReclamadas = datosProductos[j][LST_PRODUCTO_UNIDADES_RECLAMADAS];
			objLinea.oidPosicion = datosProductos[j][LST_PRODUCTO_OID_SOLI_POSI];
			
			objLinea.oidConcurso = datosProductos[j][LST_PRODUCTO_OID_CONCURSO];
			objLinea.oidNivel = datosProductos[j][LST_PRODUCTO_OID_NIVEL];
			objLinea.oidPremio = datosProductos[j][LST_PRODUCTO_OID_PREMIO];


            /* ============================================================== */
            var precioEnvia = get("frmContenido.precioEnvia");
			precioCatalogo = numeroDeFormatoSICC(datosProductos[j][LST_PRODUCTO_PRECIO_CATALOGO_UNIT_DOC]);
            primPrecioCatalogo = precioCatalogo.valueOf();

			precioFactura = numeroDeFormatoSICC(datosProductos[j][LST_PRODUCTO_PRECIO_FACTURA_UNITARIO_DOC]);
			primPrecioFactura = precioFactura.valueOf();
			
			unidadesAReclamar = numeroDeFormatoSICC(datosProductos[j][LST_PRODUCTO_UNIDADES_A_RECLAMAR]);
			primUnidadesAReclamar = unidadesAReclamar.valueOf();
            /* ============================================================== */
            /*alert("Precio Envia " + get("frmContenido.precioEnvia"));*/
			if (precioEnvia == "F"){
 			   var tmpImporteAbono = primUnidadesAReclamar * primPrecioFactura;
			}else{
			   var tmpImporteAbono = primUnidadesAReclamar * primPrecioCatalogo;
			}

			objLinea.importeCargo = '0';
            objLinea.importeAbono = '' + tmpImporteAbono;

            arrayLineas.push(objLinea);
        }

		var datosListaDevuelve = datosListaToString(arrayLineas);

		/* arrayControlProductosDevuelve = obtenerControlProductosDevuelve(get('frmContenido.controlProductosDevuelve')); */

		/* Se hace esto solo en caso de que se haya realizado un busqueda automatica, ya que en el caso de la */
		/* busqueda manual la query no trae los campos necesarios para realizar los calculos correspondientes */
		/* como p ej. unidades reclamadas, unidades disponibles, etc. */
		if (get('frmContenido.indBuscar') != '1'){
			arrayControlProductosDevuelve = agregarLineasControl(arrayLineas, arrayControlProductosDevuelve);
		}

		objReturn.arrayLineas = arrayLineas;
		objReturn.controlProductosDevuelve = arrayControlToString(arrayControlProductosDevuelve);
		objReturn.oidOperacion = get('frmContenido.oidOperacion');

		var ingresaDevuelve = get('frmContenido.ingresaDevuelve');
		var ingresaEnvia = get('frmContenido.ingresaEnvia');
		var devuelveFisicoFactura = get('frmContenido.devuelveFisicoFactura');	// DBLG700000293: Indicador si el producto devuelto fisicamente esta en la factura

        if (ingresaDevuelve == '1' && ingresaEnvia == '1'){
            if(get('frmContenido.indicadorDevuelveProcesado')=='1'){
                set('frmContenido.ind2doDevuelveProcesado', '1');
            }
            set('frmContenido.indicadorDevuelveProcesado', '1');
			set('frmContenido.accion', 'buscarProducto');
			set('frmContenido.conectorAction', 'LPOperacionReclamos');
			set('frmContenido.datosListaDevuelve', datosListaDevuelve);
			enviaSICC("frmContenido");
		}
		else if (ingresaDevuelve == '1' && ingresaEnvia == '0' && devuelveFisicoFactura == '0')	{  // Agregado para DBLG700000293

			if(get('frmContenido.indicadorDevuelveProcesado')=='1'){
				window.returnValue = objReturn;
				window.close();
			}
			set('frmContenido.ind2doDevuelve', '1');
			set('frmContenido.indicadorDevuelveProcesado', '1');
			set('frmContenido.accion', 'buscarProducto');
			set('frmContenido.conectorAction', 'LPOperacionReclamos');
			set('frmContenido.datosListaDevuelve', datosListaDevuelve);
			enviaSICC("frmContenido");
	    }
		else{
			window.returnValue = objReturn;
			window.close();
			
		}
	}

	function datosListaToString(arrayDatos){

		var s = '';
		var sLinea = '';
		var objLinea = new Object();
		var arrayLinea = new Array();
		var separador = '@';

		for (var i = 0; i < arrayDatos.length; i++){

			objLinea = arrayDatos[i];

			arrayLinea = new Array();
/*
			arrayLinea[OBJLINEA_OID] = objLinea.oid != '' ? objLinea.oid : ' ';
			arrayLinea[OBJLINEA_DESC] = objLinea.descripcion != '' ? objLinea.descripcion : ' ';
			arrayLinea[OBJLINEA_PERI] = objLinea.periodo != '' ? objLinea.periodo : ' ';
			arrayLinea[OBJLINEA_DESC_TIPO_OFER] = objLinea.descripcionTipoOferta != '' ? objLinea.descripcionTipoOferta : ' ';
			arrayLinea[OBJLINEA_OID_TIPO_OFER] = objLinea.oidTipoOferta != '' ? objLinea.oidTipoOferta : ' ';
			arrayLinea[OBJLINEA_COD_VENT] = objLinea.codigoVenta != '' ? objLinea.codigoVenta : ' ';
			arrayLinea[OBJLINEA_OID_COD_VENT] = objLinea.oidCodVenta != '' ? objLinea.oidCodVenta : ' ';
			arrayLinea[OBJLINEA_COD_PROD] = objLinea.codigoProducto != '' ? objLinea.codigoProducto : ' ';
			arrayLinea[OBJLINEA_OID_PROD] = objLinea.oidProducto != '' ? objLinea.oidProducto : ' ';
			arrayLinea[OBJLINEA_PREC_CATA_UNIT] = objLinea.precioCatalogoUnitario != '' ? objLinea.precioCatalogoUnitario : ' ';
			arrayLinea[OBJLINEA_DESC_UNIT] = objLinea.descuentoUnitario != '' ? objLinea.descuentoUnitario : '0';
			arrayLinea[OBJLINEA_PREC_FACT_UNIT] = objLinea.precioFacturaUnitario != '' ? objLinea.precioFacturaUnitario : ' ';
	
			arrayLinea[OBJLINEA_UNID_ATEN] = objLinea.unidadesAtendidas != '' ? objLinea.unidadesAtendidas : ' ';
			arrayLinea[OBJLINEA_UNID_DISP] = objLinea.unidadesDisponibles != '' ? objLinea.unidadesDisponibles : ' ';
			arrayLinea[OBJLINEA_UNID_A_RECL] = objLinea.unidadesAReclamar != '' ? objLinea.unidadesAReclamar : ' ';
			arrayLinea[OBJLINEA_PREC_TOTA] = objLinea.precioTotal != '' ? objLinea.precioTotal : ' ';
			arrayLinea[OBJLINEA_UNID_A_DEVO] = objLinea.unidadesADevolver != '' ? objLinea.unidadesADevolver : ' ';
			arrayLinea[OBJLINEA_OID_MOTI_DEVO] = objLinea.oidMotivoDevolucion != '' ? objLinea.oidMotivoDevolucion : ' ';
			arrayLinea[OBJLINEA_DESC_MOTI_DEVO] = objLinea.motivoDevolucion != '' ? objLinea.motivoDevolucion : ' ';
			arrayLinea[OBJLINEA_DESC_TIPO_MOVI] = objLinea.tipoMovimiento != '' ? objLinea.tipoMovimiento : ' ';
			arrayLinea[OBJLINEA_OID_TIPO_MOVI] = objLinea.oidTipoMovimiento != '' ? objLinea.oidTipoMovimiento : ' ';
			arrayLinea[OBJLINEA_UNID_RECL] = objLinea.unidadesReclamadas != '' ? objLinea.unidadesReclamadas : ' ';
			arrayLinea[OBJLINEA_IMPO_CARG] = objLinea.importeCargo != '' ? objLinea.importeCargo : ' ';
			arrayLinea[OBJLINEA_IMPO_ABON] = objLinea.importeAbono != '' ? objLinea.importeAbono : ' ';
			arrayLinea[OBJLINEA_SOLI_POSI] = objLinea.oidPosicion != '' ? objLinea.oidPosicion : ' ';

			arrayLinea[OBJLINEA_OID_CONCURSO] = objLinea.oidConcurso != '' ? objLinea.oidConcurso : ' ';
			arrayLinea[OBJLINEA_OID_NIVEL] = objLinea.oidNivel != '' ? objLinea.oidNivel : ' ';
			arrayLinea[OBJLINEA_OID_PREMIO] = objLinea.oidPremio != '' ? objLinea.oidPremio : ' ';
	
			arrayLinea[OBJLINEA_PREC_CONT_UNIT] = objLinea.precioContableUnitario != '' ? objLinea.precioContableUnitario : ' ';

			sLinea = arrayLinea.join();
*/
			sLinea = '';


			sLinea += objLinea.oid != '' ? objLinea.oid : ' ';
			sLinea += separador;
			sLinea += objLinea.descripcion != '' ? objLinea.descripcion : ' ';
			sLinea += separador;
			sLinea += objLinea.periodo != '' ? objLinea.periodo : ' ';
			sLinea += separador;
			sLinea += objLinea.descripcionTipoOferta != '' ? objLinea.descripcionTipoOferta : ' ';
			sLinea += separador;
			sLinea += objLinea.oidTipoOferta != '' ? objLinea.oidTipoOferta : ' ';
			sLinea += separador;
			sLinea += objLinea.unidadesAReclamar != '' ? objLinea.unidadesAReclamar : ' ';
			sLinea += separador;
			sLinea += objLinea.precioTotal != '' ? objLinea.precioTotal : ' ';
			sLinea += separador;
			sLinea += objLinea.oidMotivoDevolucion != '' ? objLinea.oidMotivoDevolucion : ' ';
			sLinea += separador;
			sLinea += objLinea.motivoDevolucion != '' ? objLinea.motivoDevolucion : ' ';
			sLinea += separador;
			sLinea += objLinea.codigoVenta != '' ? objLinea.codigoVenta : ' ';
			sLinea += separador;
			sLinea += objLinea.oidCodVenta != '' ? objLinea.oidCodVenta : ' ';
			sLinea += separador;
			sLinea += objLinea.codigoProducto != '' ? objLinea.codigoProducto : ' ';
			sLinea += separador;
			sLinea += objLinea.oidProducto != '' ? objLinea.oidProducto : ' ';
			sLinea += separador;
			sLinea += objLinea.precioCatalogoUnitario != '' ? objLinea.precioCatalogoUnitario : ' ';
			sLinea += separador;
			sLinea += objLinea.descuentoUnitario != '' ? objLinea.descuentoUnitario : '0';
			sLinea += separador;
			sLinea += objLinea.precioFacturaUnitario != '' ? objLinea.precioFacturaUnitario : ' ';
			sLinea += separador;
			sLinea += objLinea.precioContableUnitario != '' ? objLinea.precioContableUnitario : ' ';
			sLinea += separador;
			sLinea += objLinea.unidadesAtendidas != '' ? objLinea.unidadesAtendidas : ' ';
			sLinea += separador;
			sLinea += objLinea.unidadesDisponibles != '' ? objLinea.unidadesDisponibles : ' ';
			sLinea += separador;
			sLinea += objLinea.unidadesADevolver != '' ? objLinea.unidadesADevolver : ' ';
     		sLinea += separador;
			sLinea += objLinea.tipoMovimiento != '' ? objLinea.tipoMovimiento : ' ';
			sLinea += separador;
			sLinea += objLinea.oidTipoMovimiento != '' ? objLinea.oidTipoMovimiento : ' ';
			sLinea += separador;
			sLinea += objLinea.unidadesReclamadas != '' ? objLinea.unidadesReclamadas : ' ';
			sLinea += separador;
			sLinea += objLinea.importeCargo != '' ? objLinea.importeCargo : ' ';
			sLinea += separador;
			sLinea += objLinea.importeAbono != '' ? objLinea.importeAbono : ' ';
			sLinea += separador;
			sLinea += objLinea.oidPosicion != '' ? objLinea.oidPosicion : ' ';
			sLinea += separador;
			sLinea += objLinea.oidConcurso != '' ? objLinea.oidConcurso : ' ';
			sLinea += separador;
			sLinea += objLinea.oidNivel != '' ? objLinea.oidNivel : ' ';
			sLinea += separador;
			sLinea += objLinea.oidPremio != '' ? objLinea.oidPremio : ' ';




			if (s != ''){
				s += '|';
			}

			s += sLinea;
		}

		return s;
	}

	/* Autor: Marcelo J. Maidana */
	/* Fecha: 27/03/2006 */
	/* Obtiene la descripcion internacionalizada del codigo que se pasa como parametro */
	/* para ser utilizada en validaciones */
	function obtenerDescripcionCampo(cod){
		for (var j = 0; j < objValidacionSICC.length; j++){
			var obj = objValidacionSICC[j];

			if (obj.nombre == cod){
				return obj.mostrar;
			}
		}
		
		return '';
	}

	function arrayControlToString(array){
		var linea = new Object();
		var strLinea = '';
		var str = '';

		for (var i = 0; i < array.length; i++){
			linea = array[i];
			strLinea = linea.oidPosicion + ',' + linea.unidadesReclamadas + ',' + linea.unidadesDisponibles;

			if (str == null || str == undefined || str == ''){
				str = strLinea;
			} else {
				str += '|' + strLinea;
			}
		}

		return str;
	}

	function agregarLineasControl(arrayLineas, arrayControl){

		var pos;
		var objLinea = new Object();
		var objLineaControl = new Object();

		var objUnidadesReclamadas = new Number();
		var objUnidadesAReclamar = new Number();
		var objUnidadesDisponibles = new Number();
		var objUnidadesAtendidas = new Number();

		var nUnidadesReclamadas = 0;
		var nUnidadesAReclamar = 0;
		var nUnidadesDisponibles = 0;
		var nUnidadesAtendidas = 0;


		for (var i = 0; i < arrayLineas.length; i++){
			objLinea = arrayLineas[i];
			pos = buscarOidPosicionEnControl(objLinea.oidPosicion, arrayControl);

			if (objLinea.unidadesReclamadas == null || objLinea.unidadesReclamadas == undefined || objLinea.unidadesReclamadas == ''){
				objLinea.unidadesReclamadas = '0';
			}

			if (objLinea.unidadesAReclamar == null || objLinea.unidadesAReclamar == undefined || objLinea.unidadesAReclamar == ''){
				objLinea.unidadesAReclamar = '0';
			}

			if (objLinea.unidadesDisponibles == null || objLinea.unidadesDisponibles == undefined || objLinea.unidadesDisponibles == ''){
				objLinea.unidadesDisponibles = '0';
			}

			if (objLinea.unidadesAtendidas == null || objLinea.unidadesAtendidas == undefined || objLinea.unidadesAtendidas == ''){
				objLinea.unidadesAtendidas = '0';
			}

			objUnidadesReclamadas = new Number(objLinea.unidadesReclamadas);
			objUnidadesAReclamar = new Number(objLinea.unidadesAReclamar);
			objUnidadesDisponibles = new Number(objLinea.unidadesDisponibles);
			objUnidadesAtendidas = new Number(objLinea.unidadesAtendidas);

			var nUnidadesReclamadas = objUnidadesReclamadas.valueOf();
			var nUnidadesAReclamar = objUnidadesAReclamar.valueOf();
			var nUnidadesDisponibles = objUnidadesDisponibles.valueOf();
			var nUnidadesAtendidas = objUnidadesAtendidas.valueOf();

			nUnidadesReclamadas += nUnidadesAReclamar;
			nUnidadesDisponibles = nUnidadesAtendidas - nUnidadesReclamadas;

			objLineaControl.oidPosicion = objLinea.oidPosicion;
			objLineaControl.unidadesReclamadas = nUnidadesReclamadas;
			objLineaControl.unidadesDisponibles = nUnidadesDisponibles;

			if (pos == -1){
				arrayControl[arrayControl.length] = objLineaControl;
			} else {
				arrayControl[pos] = objLineaControl;
			}
		}
	
		return arrayControl;
	}

	/* devuelve la posicion en el array lineas, o -1 si no se encuentra */
	function buscarOidPosicionEnControl(oidPosicion, arrayControl){
		for (var j = 0; j < arrayControl.length; j++){
			if (arrayControl[j].oidPosicion == oidPosicion){
				return j;
			}
		}

		return -1;
	}



	var CONTROL_OID_POSICION = 0;
	var CONTROL_UNIDADES_RECLAMADAS = 1;
	var CONTROL_UNIDADES_DISPONIBLES = 2;
	var CONTROL_MODIFICACION = 3;

	function obtenerControlProductosDevuelve(str){
		var controlProductosDevuelve = new Array();
		var objLinea = new Object();
		var arrayLineas = str.split('|');
		var linea = new Array();

		if (str != null && str != undefined && str != ''){
			for (var i = 0; i < arrayLineas.length; i++){
				linea = arrayLineas[i].split(',');
				
				objLinea = new Object();
				objLinea.oidPosicion = linea[CONTROL_OID_POSICION];
				objLinea.unidadesReclamadas = linea[CONTROL_UNIDADES_RECLAMADAS];
				objLinea.unidadesDisponibles = linea[CONTROL_UNIDADES_DISPONIBLES];
				objLinea.flagModificacion = linea[CONTROL_MODIFICACION];

				controlProductosDevuelve[controlProductosDevuelve.length] = objLinea;
			}
		}

		return controlProductosDevuelve;
	}


	function onClickEliminar(){
        if (lstProductos.numSelecc() == 0) {
			// Muestra el mensaje: "Debe seleccionar al menos un elemento de la lista"
			GestionarMensaje('1021');
		} else {
			lstProductos.eliminarSelecc();
		}
	}

	function mayusculas(nombreElemento) {
		var cadena = get('frmContenido.' + nombreElemento);
		
		if (cadena != ""){
			set('frmContenido.' + nombreElemento, cadena.toUpperCase());
		}
	}

	function fVolver(){
		window.close();
	}

	function fLimpiar(){
		if (get_visibilidad('capaContenido')){
			set('frmContenido.txtDescripcion', '');
			set('frmContenido.txtCodVenta', '');
			set('frmContenido.txtCodProducto', '');
			set('frmContenido.txtPagCat', '');
		}
	}

	function onChangeUnidadesAReclamar(fila){
		lstProductos.actualizaDat();
		var datos = lstProductos.datos;
		var objPrecioUnitario = numeroDeFormatoSICC(datos[fila][LST_PRODUCTO_PRECIO_FACTURA_UNITARIO_DOC], '');

		var objUnidadesAReclamar = numeroDeFormatoSICC(datos[fila][LST_PRODUCTO_UNIDADES_A_RECLAMAR], '');
		var nPrecioUnitario = objPrecioUnitario.valueOf();
		var nUnidadesAReclamar = objUnidadesAReclamar.valueOf();
		var nPrecioTotal = nPrecioUnitario * nUnidadesAReclamar;

		datos[fila][LST_PRODUCTO_PRECIO_TOTAL] = nPrecioTotal;
		lstProductos.setDatos(datos);
		lstProductos.repintaDat();
	}


	function setTabFocus(componente){
		if (componente == 'txtDescripcion'){
			if (txtCodVenta.disabled == false){
				focaliza('frmContenido.txtCodVenta');
			} else {
				setTabFocus('txtCodVenta');
			}
		} else if (componente == 'txtCodVenta'){
			if (txtCodProducto.disabled == false){
				focaliza('frmContenido.txtCodProducto');
			} else {
				setTabFocus('txtCodProducto');
			}
		} else if (componente == 'txtCodProducto'){
			if (txtPagCat.disabled == false){
				focaliza('frmContenido.txtPagCat');
			} else {
				setTabFocus('txtPagCat');
			}
		} else if (componente == 'txtPagCat'){
			if (document.all['buscar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'buscar');
			} else {
				setTabFocus('buscar');
			}
		} else if (componente == 'buscar'){
			if (document.all['anadir'].disabled == false){
				focalizaBotonHTML("botonContenido", 'anadir');
			} else {
				setTabFocus('anadir');
			}
		} else if (componente == 'anadir'){
			if (document.all['aceptar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'aceptar');
			} else {
				setTabFocus('aceptar');
			}
		} else if (componente == 'aceptar'){
			if (document.all['eliminar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'eliminar');
			} else {
				setTabFocus('eliminar');
			}
		} else if (componente == 'eliminar'){
			if (txtDescripcion.disabled == false){
				focaliza('frmContenido.txtDescripcion');
			} else {
				setTabFocus('txtDescripcion');
			}
		}
	}

	function setShTabFocus(componente){
		if (componente == 'txtDescripcion'){
			if (document.all['eliminar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'eliminar');
			} else {
				setShTabFocus('eliminar');
			}			
		} else if (componente == 'txtCodVenta'){
			if (txtDescripcion.disabled == false){
				focaliza('frmContenido.txtDescripcion');
			} else {
				setShTabFocus('txtDescripcion');
			}
		} else if (componente == 'txtCodProducto'){
			if (txtCodVenta.disabled == false){
				focaliza('frmContenido.txtCodVenta');
			} else {
				setShTabFocus('txtCodVenta');
			}
		} else if (componente == 'txtPagCat'){
			if (txtCodProducto.disabled == false){
				focaliza('frmContenido.txtCodProducto');
			} else {
				setShTabFocus('txtCodProducto');
			}
		} else if (componente == 'buscar'){
			if (txtPagCat.disabled == false){
				focaliza('frmContenido.txtPagCat');
			} else {
				setShTabFocus('txtPagCat');
			}
		} else if (componente == 'anadir'){
			if (document.all['buscar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'buscar');
			} else {
				setShTabFocus('buscar');
			}
		} else if (componente == 'aceptar'){
			if (document.all['anadir'].disabled == false){
				focalizaBotonHTML("botonContenido", 'anadir');
			} else {
				setShTabFocus('anadir');
			}
		} else if (componente == 'eliminar'){
			if (document.all['aceptar'].disabled == false){
				focalizaBotonHTML("botonContenido", 'aceptar');
			} else {
				setShTabFocus('aceptar');
			}
		}
	}

function obtenerProductosDevuelveProcesado(){

		var datosListaDevuelve = get('frmContenido.datosListaDevuelve');

		var lineas = new Array();
		var lineas = datosListaDevuelve.split('|');
		var linea = '';
		var arrayLinea = new Array();
		var arrayDatos = new Array();
		var objLinea = new Object();

		for (var i = 0; i < lineas.length; i++){

			linea = lineas[i];

			arrayLinea = linea.split('@');

			objLinea = new Object();
            objLinea.oid = arrayLinea[OBJLINEA_OID];
            objLinea.descripcion = arrayLinea[OBJLINEA_DESC];
            objLinea.periodo = arrayLinea[OBJLINEA_PERI];
            objLinea.descripcionTipoOferta = arrayLinea[OBJLINEA_DESC_TIPO_OFER];
            objLinea.oidTipoOferta = arrayLinea[OBJLINEA_OID_TIPO_OFER];
            objLinea.codigoVenta = arrayLinea[OBJLINEA_COD_VENT];
            objLinea.oidCodVenta = arrayLinea[OBJLINEA_OID_COD_VENT];
            objLinea.codigoProducto = arrayLinea[OBJLINEA_COD_PROD];
            objLinea.oidProducto = arrayLinea[OBJLINEA_OID_PROD];
            objLinea.precioCatalogoUnitario = arrayLinea[OBJLINEA_PREC_CATA_UNIT];
            objLinea.descuentoUnitario = arrayLinea[OBJLINEA_DESC_UNIT];
            objLinea.precioFacturaUnitario = arrayLinea[OBJLINEA_PREC_FACT_UNIT];
			objLinea.precioContableUnitario = arrayLinea[OBJLINEA_PREC_CONT_UNIT];
            objLinea.unidadesAtendidas = arrayLinea[OBJLINEA_UNID_ATEN];
            objLinea.unidadesDisponibles = arrayLinea[OBJLINEA_UNID_DISP];
			objLinea.unidadesAReclamar = arrayLinea[OBJLINEA_UNID_A_RECL];
            objLinea.precioTotal = arrayLinea[OBJLINEA_PREC_TOTA];
            objLinea.unidadesADevolver = arrayLinea[OBJLINEA_UNID_A_DEVO];
            objLinea.oidMotivoDevolucion = arrayLinea[OBJLINEA_OID_MOTI_DEVO];
            objLinea.motivoDevolucion = arrayLinea[OBJLINEA_DESC_MOTI_DEVO];
            objLinea.tipoMovimiento = arrayLinea[OBJLINEA_DESC_TIPO_MOVI];
            objLinea.oidTipoMovimiento = arrayLinea[OBJLINEA_OID_TIPO_MOVI];
			objLinea.unidadesReclamadas = arrayLinea[OBJLINEA_UNID_RECL];
			objLinea.importeCargo = arrayLinea[OBJLINEA_IMPO_CARG];
            objLinea.importeAbono = arrayLinea[OBJLINEA_IMPO_ABON];
			objLinea.oidPosicion = arrayLinea[OBJLINEA_SOLI_POSI];

			objLinea.oidConcurso = arrayLinea[OBJLINEA_OID_CONCURSO];
            objLinea.oidNivel = arrayLinea[OBJLINEA_OID_NIVEL];
            objLinea.oidPremio = arrayLinea[OBJLINEA_OID_PREMIO];	
			
			arrayDatos[arrayDatos.length] = objLinea;
		}

		return arrayDatos;
	}
