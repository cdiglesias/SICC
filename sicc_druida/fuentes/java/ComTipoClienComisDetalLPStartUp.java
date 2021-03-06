/*
    INDRA/CAR/mmg
    $Id: ComTipoClienComisDetalLPStartUp.java,v 1.1 2009/12/03 18:42:22 pecbazalar Exp $
    DESC
*/
import java.util.*;

import org.jaxen.dom.DOMXPath;
import org.w3c.dom.Element;

import es.indra.utils.*;
import es.indra.druida.Contexto;
import es.indra.druida.DruidaConector;
import es.indra.druida.belcorp.MMGDruidaBase;
import es.indra.druida.belcorp.MMGDruidaHelper;
import es.indra.druida.belcorp.MMGException;
import es.indra.druida.belcorp.MMGNoSessionException;
import es.indra.druida.belcorp.MMGNoLanguageException;
import es.indra.druida.dom.DruidaDOMObjeto;
import es.indra.mare.common.dto.MareDTO;
import es.indra.mare.common.dto.IMareDTO;
import es.indra.mare.common.mln.MareBusinessID;
import java.text.DecimalFormatSymbols;
import es.indra.sicc.util.UtilidadesSession;
import es.indra.belcorp.mso.*;

// Definicion de la clase
public class ComTipoClienComisDetalLPStartUp extends MMGDruidaBase{
	//Constantes que definen la altura de los formularios seg�n el modo
	public static final short QUERYFORM_SIZE = 189;
	public static final short CREATEFORM_SIZE = 175;
	public static final short UPDATEFORM_SIZE = 175;
	public static final short VIEWFORM_SIZE = 175;

	//Cosntantes que definen elementos de la logica de negocio de las entidades
	//y de los elementos asociados a la entidad
	public static final String BUSINESSID_QUERY = "MMGComTipoClienComisDetalQueryFromToUserPage";
	
	
				public static final String BUSINESSID_TCCCOIDTIPOCLIECOMICABE_QUERY ="MMGComTipoClienComisCabecQueryFromToUser";
				public static final String TCCCOIDTIPOCLIECOMICABE_COMBO_CONNECTOR = "ComTipoClienComisCabecConectorCombo";
	
				public static final String BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_TICLOIDTIPOCLIE_QUERY ="MMGMaeTipoClienQueryFromToUser";
				public static final String BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_QUERY ="MMGMaeSubtiClienQueryFromToUser";
				public static final String BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_QUERY ="MMGMaeTipoClasiClienQueryFromToUser";
				public static final String BUSINESSID_CLASOIDCLAS_QUERY ="MMGMaeClasiQueryFromToUser";
				public static final String CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_TICLOIDTIPOCLIE_COMBO_CONNECTOR = "MaeTipoClienConectorCombo";
	
				public static final String CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_COMBO_CONNECTOR = "MaeSubtiClienConectorCombo";
	
				public static final String CLASOIDCLAS_TCCLOIDTIPOCLAS_COMBO_CONNECTOR = "MaeTipoClasiClienConectorCombo";
	
				public static final String CLASOIDCLAS_COMBO_CONNECTOR = "MaeClasiConectorCombo";
	
		
	//Hashtables con los valores est�ticos de radiobuttons y combos
	
	
	// Definicion del constructor
	public ComTipoClienComisDetalLPStartUp(){
		super();
	}

	public void inicio() throws Exception {
		pagina("ComTipoClienComisDetalPage");
	}

	public void ejecucion() throws Exception {
		try{
			//Llamamos al metodo sobresctrito de la clase padre para ejecutar las acciones comunes:
			//obtener configuraci�n del mantenimiento
			super.ejecucion();
		
			this.getFormatosValidaciones();

			//Activamos las trazas
			setTrazaFichero();
			
			//Establecemos el tama�o de la p�gina
			buildJsPageSize("ComTipoClienComisDetal");
			
			//Determinamos la acci�n y el origen
			String accion = conectorParametro(PARAMETRO_GENERICO_ACCION);
			String origen = conectorParametro(PARAMETRO_GENERICO_ORIGEN);
			asignar("VAR",PARAMETRO_GENERICO_ACCION,accion);
			asignar("VAR",PARAMETRO_GENERICO_ORIGEN,origen);
			
			//Establecemos el valor del atributro cod de la pagina para que ponga el t�tulo i18nalizado
			//y para que funcione de forma correcta la configuraci�n del men� secundario
			asignarAtributo("PAGINA", "ComTipoClienComisDetalPage", "cod", "ComTipoClienComisDetal." + accion + ".label");
			
			//Ponemos en la p�gina el idioma de usuario, el idioma de la pagina para mostrar los errores, 
			//y el codigo del idioma por defecto
			asignar("VAR", VAR_IDIOMA, MMGDruidaHelper.getUserDefaultLanguage(this));
			asignar("VAR", VAR_IDIOMA_XML, MMGDruidaHelper.getIdioma(this));
			asignar("VAR", VAR_DEFAULT_LANGUAGE_CODE, MMGDruidaHelper.getUserDefaultLanguage(this));
			
			//Establecemos los tama�os y posiciones de la capas de la pantalla
			establecerSizeCapas(accion, origen);
			
			//Establecemos los valores por defecto de la entidades estructurales
			setDefaultStructuralValues();
			
			//Limpiamos la botonera
			limpiarBotoneraLista("comTipoClienComisDetal", accion);
			
			
			
			
			
			//Ejecutanos la acci�n solicitada		
			System.out.println("accion " + accion + " origen " + origen);
			if(accion.equals(ACCION_LOV)) cmdLov();
			else if(accion.equals(ACCION_QUERY)) cmdQuery();
			else if(accion.equals(ACCION_CREATE)) cmdCreate();
			else if(accion.equals(ACCION_REMOVE)) cmdRemove();
			else if(accion.equals(ACCION_UPDATE) && origen.equals("menu")) cmdUpdate();
			else if(accion.equals(ACCION_UPDATE) && origen.equals("pagina")) cmdPreUpdateForm();
			else if(accion.equals(ACCION_UPDATE) && origen.equals("preupdate")) cmdUpdateForm();
			else if(accion.equals(ACCION_VIEW) && origen.equals("pagina")) cmdPreView();
			else if(accion.equals(ACCION_VIEW) && origen.equals("preview")) cmdView();
			
			//Eliminamos los TRs del formulario que no tengan campos
			eliminarTrsVacios(accion, origen);
		}catch(Exception e){
			handleException(e);
		}
	}
	
	/**Acciones que se realizan cuando la pantalla se arranca en modo lov*/
	protected void cmdLov() throws Exception{
		//Establecemos los codigos de internacionalizaci�n para las etiquetas de los campos con b�squeda por intervalo
		setIntervalSearchFromLavels();
	
		//Cargamos las combos finales de las jerarqu�as de herencia
		loadLeafDependenceCombos(null);
		
		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
	        Long loidPais = UtilidadesSession.getPais(this);
	        userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		
		
		asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");
		
		//Primero determianmos el nombre del campo en la entidad de oriegen donde se van a cargar los datos
		asignar("VAR", "idAttributeLovOpener", conectorParametro(PARAMETRO_LOV_ATTRIBUTO));
		asignar("VAR", "idEntityLovOpener", conectorParametro(PARAMETRO_LOV_ENTIDAD));
		//asignarAtributo("CAPA", "comTipoClienComisDetalLovLayer", "visibilidad", "visible");
		asignarAtributo("PAGINA", "ComTipoClienComisDetalPage", "onblur", "window.focus();");
		
		//Borramos los elementos de internacionalizaci�n()
		removeLocalizationElements();
		removeNonSearchElements();
	}

	/**Acci�n previa para poder permitir la carga de datos en el formulario 
	de view con ventana oculta. Para ello simplemente redireccionamos al m�todo*/
	protected void cmdPreView() throws Exception{
		//metemos en la sesi�n las query para realizar la requery
		conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY, conectorParametro(VAR_LAST_QUERY_TO_SESSION) != null?
			conectorParametro(VAR_LAST_QUERY_TO_SESSION): "");

		//Redirigimos a la acci�n de view pasando la accion, y la acci�n anterior y actulizando el origen
		conectorAction("ComTipoClienComisDetalLPStartUp");
		conectorActionParametro("idSelection", conectorParametro("idSelection"));
		conectorActionParametro(PARAMETRO_GENERICO_ACCION, conectorParametro(PARAMETRO_GENERICO_ACCION)!= null?  
			conectorParametro(PARAMETRO_GENERICO_ACCION): "");
		conectorActionParametro(PARAMETRO_GENERICO_ORIGEN, "preview");
		conectorActionParametro(VAR_ACCION_ANTERIOR, conectorParametro(VAR_ACCION_ANTERIOR) != null?
			conectorParametro(VAR_ACCION_ANTERIOR): "");
		conectorActionParametro(VAR_APPLY_STRUCTURAL_ENTITY, conectorParametro(VAR_APPLY_STRUCTURAL_ENTITY));
			
	}
	
	/**Acciones que se realizan cunado la pantalla se arranca en modo view
	*/
	protected void cmdView() throws Exception{
		//Construimos el mso con los elementos de la b�squeda a partir del id que
		//lo sacamos de la request
		ComTipoClienComisDetalData comTipoClienComisDetalQuery= new ComTipoClienComisDetalData();
		comTipoClienComisDetalQuery.setId(new Long(conectorParametro("idSelection")));
		
		//Asiganmos el valor a la variable de acci�n anterior para poder volver hacia atras y hacer requery
		asignar("VAR", VAR_ACCION_ANTERIOR, conectorParametro(VAR_ACCION_ANTERIOR));
		
		//Sacamos de la base de datos la entidad a visualizar
		ComTipoClienComisDetalData datosResult = (ComTipoClienComisDetalData)getSingleObject(BUSINESSID_QUERY, comTipoClienComisDetalQuery, 
			comTipoClienComisDetalQuery.clone(), "comTipoClienComisDetal");
		
		
		//Comprobamos que haya datos. Si no indicamos la situaci�n
		if(datosResult == null) throw new MMGException(ERRORCODE_ELEMENTO_INEXISTENTE);
		
		//Creamos los campos ocultos para la internacionalizaci�n
		preservaHiddensI18n(new Integer(1), "COM_TIPO_CLIEN_COMIS_DETAL", "comTipoClienComisDetalFrm", "Descripcion", true);
		
		
		
		
		//Cargamos los combos y seleccionamos en los combos los valores correspondientes
		loadLeafDependenceCombos(datosResult);
		loadNonLeafDependenceCombos(datosResult);
		
		//Damos los valores a los labels del modo view
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setDecimalSeparator(UtilidadesSession.getSeparadorDecimales(this).charAt(0));
		decimalFormatSymbols.setGroupingSeparator(UtilidadesSession.getSeparadorDecimales(this).equals(".") ? ",".charAt(0) : ".".charAt(0));
		ComTipoClienComisDetalData comTipoClienComisDetal = datosResult;
		es.indra.belcorp.mso.ComTipoClienComisCabecData tcccOidTipoClieComiCabe = comTipoClienComisDetal.getTcccOidTipoClieComiCabe();
		if(tcccOidTipoClieComiCabe != null && tcccOidTipoClieComiCabe.getId() != null) checkCombo("tcccOidTipoClieComiCabe" , tcccOidTipoClieComiCabe.getId().toString());
		es.indra.belcorp.mso.MaeClasiData clasOidClas = comTipoClienComisDetal.getClasOidClas();
		if(clasOidClas != null && clasOidClas.getId() != null) checkCombo("clasOidClas" , clasOidClas.getId().toString());
		asignar("TEXT", "Descripcion", FormatUtils.formatObject(comTipoClienComisDetal.getDescripcion(), 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), decimalFormatSymbols));
		
			
		//Sacamos la informaci�n de los campos internacionalizables. Para cada campo internacionalizable
		//	Construimos el mso con los elementos de la b�squeda
		//	Creamos el dto y metemos la informaci�n necesaria para ejecutar la query
		//	Invocamos la l�gica de negocio
		loadLocalizationVars(comTipoClienComisDetal);
		
			
		//Deshabilitamos todos los campos para que no se editen
		
					asignarAtributo("COMBO", "tcccOidTipoClieComiCabe", "disabled", "S");
									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie", "disabled", "S");

									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "disabled", "S");

									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas", "disabled", "S");

					asignarAtributo("COMBO", "clasOidClas", "disabled", "S");asignarAtributo("TEXT", "Descripcion", "disabled", "S");
		
		
	
		//Ponemos la pagina en modo view: Eliminamos el bot�n de buscar
		//Borramos tambien las celdas con los botones
		//borramos tambien todos los elementos de from y to dejando s�lo el campo simple
		//Eliminamos los elementos correspondientes a la internacionalizacion
		removeLovElements();
		removeQueryElements();
		removeNonViewElements();
		
	}
	
	/**Acciones que se realizan cuando la pantalla se arranca en modo create*/
	protected void cmdCreate() throws Exception{
		//Creamos los campos ocultos para la internacionalizaci�n
		preservaHiddensI18n(new Integer(1), "COM_TIPO_CLIEN_COMIS_DETAL", "comTipoClienComisDetalFrm", "Descripcion", false);
		

		//Cargamos las combos finales de las jerarqu�as de herencia
		loadLeafDependenceCombos(null);
	
		//Ponemos los campos requeridos a true
		asignarAtributo("COMBO", "tcccOidTipoClieComiCabe", "req", "S");
		asignarAtributo("COMBO", "clasOidClas", "req", "S");
		asignarAtributo("TEXT", "Descripcion", "req", "S");
		
		
		//Asiganamos a los campos internacionalizables la funci�n de onblur para actualizar el 
		//valor del idioma por defecto
		asignarAtributo("TEXT", "Descripcion", "onblur", "setDefaultLanguageValue('Descripcion', get('comTipoClienComisDetalFrm.Descripcion'))");
		
		
		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
		Long loidPais = UtilidadesSession.getPais(this);
	        userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		
		
		asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");
		
		
		//Ponemos la pagina en modo view: 
		//Eliminamos el bot�n de buscar
		//Borramos tambien las celdas con los botones
		//borramos tambien todos los elementos de from y to dejando s�lo el campo simple
		removeLovElements();
		removeQueryElements();
		removeNonInsertElements();
	}
	
	/**Acciones a ejecutar cuando la ventana se abre en modo remove*/
	protected void cmdRemove() throws Exception{
		//Establecemos los codigos de internacionalizaci�n para las etiquetas de los campos con b�squeda por intervalo
		setIntervalSearchFromLavels();

		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
	        Long loidPais = UtilidadesSession.getPais(this);
		userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		
		
		asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");
		
		
		//Actualizamos el legend del formulario para indicar criterios de b�squeda
		asignarAtributo("LABEL", "legendLbl", "cod", "MMGGlobal.legend.searchcriteria.label");

		//Si hay que hacer requery por volver hacia a tras lo marcamos en las variables de la p�gina
		//Cargamos las combos finales de las jerarqu�as de herencia
		if(isPerformRequery()){
			loadNonLeafDependenceCombosForRequery();
			performActionForRequery();
		}else loadLeafDependenceCombos(null);

		//Eliminamos los elementos correspondientes a la internacionalizacion y lov
		removeLocalizationElements();
		removeLovElements();
		removeNonSearchElements();
	}

	/**Acciones a ejecutar cuando la ventana se abre en modo query*/
	protected void cmdQuery() throws Exception{
		//Establecemos los codigos de internacionalizaci�n para las etiquetas de los campos con b�squeda por intervalo
		setIntervalSearchFromLavels();
		
		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
	        Long loidPais = UtilidadesSession.getPais(this);
		userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		
		
		asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");
		
		
		//Actualizamos el legend del formulario para indicar criterios de b�squeda
		asignarAtributo("LABEL", "legendLbl", "cod", "MMGGlobal.legend.searchcriteria.label");

		//Cargamos las combos finales de las jerarqu�as de herencia
		//Si hay que hacer requery por volver hacia a tras lo marcamos en las variables de la p�gina
		if(isPerformRequery()){
			loadNonLeafDependenceCombosForRequery();
			performActionForRequery();
		}loadLeafDependenceCombos(null);

		//Eliminamos los elementos correspondientes a la internacionalizacion
		//elimnamos el bot�n lov de null selection
		removeLocalizationElements();
		removeLovElements();
		removeNonSearchElements();
	}
	
	/**Acciones a ejecutar cuando la ventana se abre en modo update*/
	protected void cmdUpdate() throws Exception{
		//Establecemos los codigos de internacionalizaci�n para las etiquetas de los campos con b�squeda por intervalo
		setIntervalSearchFromLavels();

		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
	        Long loidPais = UtilidadesSession.getPais(this);
	        userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		
		
		asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");
		
		
		//Actualizamos el legend del formulario para indicar criterios de b�squeda
		asignarAtributo("LABEL", "legendLbl", "cod", "MMGGlobal.legend.searchcriteria.label");

		//Cargamos las combos finales de las jerarqu�as de herencia
		//Si hay que hacer requery por volver hacia a tras lo marcamos en las variables de la p�gina
		if(isPerformRequery()){
			loadNonLeafDependenceCombosForRequery();
			performActionForRequery();
		}loadLeafDependenceCombos(null);

		//Simplemente elimnamos el bot�n lov de null selection y la internacionalizaci�n
		removeLocalizationElements();
		removeLovElements();
		removeNonSearchElements();
	}

	
	/**Acci�n previa para poder permitir la carga de datos en el formulario 
	de updatecon ventana oculta. Para ello simplemente redireccionamos al m�todo*/
	protected void cmdPreUpdateForm() throws Exception{
		//metemos en la sesi�n las query para realizar la requery
		conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY, conectorParametro(VAR_LAST_QUERY_TO_SESSION) != null?
			conectorParametro(VAR_LAST_QUERY_TO_SESSION): "");

		//Redirigimos al update form
		conectorAction("ComTipoClienComisDetalLPStartUp");
		conectorActionParametro("idSelection", conectorParametro("idSelection"));
		conectorActionParametro(PARAMETRO_GENERICO_ACCION, conectorParametro("accion") != null?
			conectorParametro("accion"): "");
		conectorActionParametro(PARAMETRO_GENERICO_ORIGEN, "preupdate");
		conectorActionParametro(VAR_ACCION_ANTERIOR, conectorParametro(VAR_ACCION_ANTERIOR) != null?
			conectorParametro(VAR_ACCION_ANTERIOR): "");
		conectorActionParametro(VAR_APPLY_STRUCTURAL_ENTITY, conectorParametro(VAR_APPLY_STRUCTURAL_ENTITY));
			
	}
	
	/**Prepara el formulario para mostrar los datos de un elemento de la entidad
	y estos puedan ser modificados*/  
	protected void cmdUpdateForm() throws Exception{
		//Asiganmos el valor a la variable de acci�n anterior para poder volver hacia atras y hacer requery
		asignar("VAR", VAR_ACCION_ANTERIOR, conectorParametro(VAR_ACCION_ANTERIOR));

		//Actualizamos el valor de enviar de forma oculta el formulario. 
		//asignarAtributo("FORMULARIO", "comTipoClienComisDetalFrm", "oculto", "N");

		//Ponemos los campos requeridos a true
		
				asignarAtributo("COMBO", "tcccOidTipoClieComiCabe", "req", "S");
				asignarAtributo("COMBO", "clasOidClas", "req", "S");
				asignarAtributo("TEXT", "Descripcion", "req", "S");
		
		//Asignamos a los campos internacionalizables la funci�n de onblur para actualizar el valor
		//para el idioma por defecto
		asignarAtributo("TEXT", "Descripcion", "onblur", "setDefaultLanguageValue('Descripcion', get('comTipoClienComisDetalFrm.Descripcion'))");
		
		
		//Asignamos las validaciones
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
		Long loidPais = UtilidadesSession.getPais(this);
		userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";
		String codigoIdioma = MMGDruidaHelper.getUserDefaultLanguage(this);
		
			
			
			asignarAtributo("TEXT", "Descripcion", "validacion", "mensaje = ValidaLongitud(cdos_trim(valor), 1, 50);");

		//Obtenemos el id del elemento a seleccionar
		traza("MMG::Creando ComTipoClienComisDetal");
		String id = conectorParametro("idSelection");
		traza("MMG:: id del atributo a modificar: " + id);
	
		//Construimos el mso con los elementos de la b�squeda
		ComTipoClienComisDetalData comTipoClienComisDetalQuery= new ComTipoClienComisDetalData();
		comTipoClienComisDetalQuery.setId(new Long(id));

		//Sacamos de la base de datos la entidad a modificar
		ComTipoClienComisDetalData  datosResult = (ComTipoClienComisDetalData)getSingleObject(BUSINESSID_QUERY, comTipoClienComisDetalQuery, 
			comTipoClienComisDetalQuery.clone(), "comTipoClienComisDetal");
		

		//Comprobamos que haya datos. Si no indicamos la situaci�pn
		if(datosResult == null) throw new MMGException(ERRORCODE_ELEMENTO_INEXISTENTE);
		
		//Creamos los campos ocultos para la internacionalizaci�n
		preservaHiddensI18n(new Integer(1), "COM_TIPO_CLIEN_COMIS_DETAL", "comTipoClienComisDetalFrm", "Descripcion", false);
		
		
		

		//Cargamos los combos y seleccionamos en los combos los valores correspondientes
		loadLeafDependenceCombos(datosResult);
		loadNonLeafDependenceCombos(datosResult);
		
		//Vamos cargamos los datos en el formulario. Muy importante es establecer id del elemento que estamos modificando
		ComTipoClienComisDetalData comTipoClienComisDetal = datosResult;
		asignar("VAR", "idSelection", id);
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setDecimalSeparator(UtilidadesSession.getSeparadorDecimales(this).charAt(0));
		decimalFormatSymbols.setGroupingSeparator(UtilidadesSession.getSeparadorDecimales(this).equals(".") ? ",".charAt(0) : ".".charAt(0));
		es.indra.belcorp.mso.ComTipoClienComisCabecData tcccOidTipoClieComiCabe = comTipoClienComisDetal.getTcccOidTipoClieComiCabe();
		if(tcccOidTipoClieComiCabe != null && tcccOidTipoClieComiCabe.getId() != null) checkCombo("tcccOidTipoClieComiCabe" , tcccOidTipoClieComiCabe.getId().toString());
		es.indra.belcorp.mso.MaeClasiData clasOidClas = comTipoClienComisDetal.getClasOidClas();
		if(clasOidClas != null && clasOidClas.getId() != null) checkCombo("clasOidClas" , clasOidClas.getId().toString());
		asignar("TEXT", "Descripcion", FormatUtils.formatObject(comTipoClienComisDetal.getDescripcion(), 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), decimalFormatSymbols));
		

		//Sacamos la informaci�n de los campos internacionalizables. Para cada campo internacionalizable
		//	Construimos el mso con los elementos de la b�squeda
		//	Creamos el dto y metemos la informaci�n necesaria para ejecutar la query
		//	Invocamos la l�gica de negocio
		
				loadLocalizationVars(comTipoClienComisDetal);
		
		
		//Sobreescribimos el valor de origen para que en la siguiente llamada de la acci�n
		//vaya directamente al metodo que realmente modifica
		asignar("VAR",PARAMETRO_GENERICO_ORIGEN,"pagina");
		
		//Guardamos el timestamp del elemento que se est� modificando
		//Por ahora el timestamp no se usa ya que no existen bloqueos....(no comment)
		//asignar("VAR","timestamp",Long.toString(comTipoClienComisDetal.jdoGetTimeStamp()));
		
		//Ponemos la pagina en modo view: Eliminamos el bot�n de buscar
		//Borramos tambien las celdas con los botones
		//borramos tambien todos los elementos de from y to dejando s�lo el campo simple
		//Borramos los elementos correspondientes a la internacionalizaci�n
		removeLovElements();
		removeQueryElements();
		removeNonModifyFields();
		/** por eloy mier p�rez para agregar funcionalidad de desactivacion de campos */
		traza("MMG: antes de llamar a desactivateNonModifyFields .....");
		desactivateNonModifyFields();
		traza("MMG: despues de llamar a desactivateNonModifyFields ......");
		/** 
			por eloy mier p�rez para agregar funcionalidad de desactivacion de campos
			para reescribir funciones ontab y onshtab.
		 */
		cambiarAcciones();
	}

	/**
		Por EMP.
		Nos permite cambiar el evento ontab y onshtab de los objetos druida necesarios en el modo
		de modificaci�n.
	*/
	protected void cambiarAcciones() throws Exception{
				asignarAtributo("AREATEXTO", "id", "ontab","ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",1, true)");
				asignarAtributo("AREATEXTO", "id", "onshtab","ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",1, false)");
					asignarAtributo("COMBO","tcccOidTipoClieComiCabe", "ontab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",2, true)");
					asignarAtributo("COMBO","tcccOidTipoClieComiCabe", "onshtab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",2, false)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie", "ontab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, true)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie", "onshtab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, false)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "ontab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, true)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "onshtab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, false)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas", "ontab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, true)");
					asignarAtributo("COMBO","clasOidClas_tcclOidTipoClas", "onshtab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, false)");
					asignarAtributo("COMBO","clasOidClas", "ontab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, true)");
					asignarAtributo("COMBO","clasOidClas", "onshtab", "ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",3, false)");
				asignarAtributo("AREATEXTO", "Descripcion", "ontab","ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",4, true)");
				asignarAtributo("AREATEXTO", "Descripcion", "onshtab","ejecutarAccionFocoModificacion(\"comTipoClienComisDetalFrm\",4, false)");
	}
	
	/**Nos permite eliminar de la p�gina todos los elementos correspondiente
	a las internacionalizacion*/
	protected void removeLocalizationElements() throws Exception{
				borrarNodo("TD","nombre","DescripcionTdLocalizationButtonGap");
				borrarNodo("TD","nombre","DescripcionTdLocalizationButtonGapHeader");
				borrarNodo("TD","nombre","DescripcionTdLocalizationButton");
	}
	
	protected void removeLovElements() throws Exception{
		borrarNodo("TD","nombre","comTipoClienComisDetalTdLovNullSelectionButton");
	}
	
	protected void removeQueryElements() throws Exception{
		//Borramos los botones para realizar la b�suqeda
		borrarNodo("TR","nombre","comTipoClienComisDetalTrButtons");

		//Borramos los elementos no necesarios de la b�squeda para los campos con b�squda
		//por intervalo
	}
	
	/**
	* Nos permite elimnar los campos del formulario que no deben aparecer en el formulario en el
	* modo de view
	*/
	protected void removeNonViewElements() throws Exception{
		
						borrarCampo("id");
	}

	/**
	* Nos permite eliminar los campos del formulario que no deben aparecer en el formulario en el
	* modo de inserci�n
	*/
	protected void removeNonInsertElements() throws Exception{
		
						borrarCampo("id");
	}

	/**
	* Nos permite eliminar los campos del formulario que no deben aparecer en el formulario en el
	* modo de remove
	*/
	protected void removeNonSearchElements() throws Exception{
		borrarCampo("id");
		
	}
	
	/**
	* Nos permite eliminar los campos del formulario que no deben aparecer en el formulario 
	* de modificaci�n
	*/
	protected void removeNonModifyFields() throws Exception{
		borrarCampo("id");
		
	}
	
	/**
	* Nos permite desactivar los campos del formulario que no deben aparecer en el formulario 
	* para modificaci�n
	*/
	protected void desactivateNonModifyFields() throws Exception{
			traza("MMG: en desactivateNonModifyFields ");		
		
				traza("MMG: el atributo es id...");		
				
				traza("MMG: el atributo es tcccOidTipoClieComiCabe...");		
				
					traza("MMG: en desactivateNonModifyFields encontrado atributo no editable...");
				
						asignarAtributo("COMBO", "tcccOidTipoClieComiCabe", "disabled", "S");
				traza("MMG: el atributo es clasOidClas...");		
				
					traza("MMG: en desactivateNonModifyFields encontrado atributo no editable...");
				
									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie", "disabled", "S");

									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "disabled", "S");

									asignarAtributo("COMBO", "clasOidClas_tcclOidTipoClas", "disabled", "S");

						asignarAtributo("COMBO", "clasOidClas", "disabled", "S");
				traza("MMG: el atributo es Descripcion...");		
				
		}

	/**
	* Nos permite establecer el tama�o de las capas de la pantalla seg�n el modo
	* Esto se debe a que dependiendo del modo aparecen unos campos u otros 
	*/
	protected void establecerSizeCapas(String accion, String origen) throws Exception{
		//Dependiendo del modo el tama�o del formualrio ser� uno u otro
		int sizeForm = 0;
		if(accion.equals(ACCION_LOV)) sizeForm = QUERYFORM_SIZE;
		else if(accion.equals(ACCION_VIEW)) sizeForm = VIEWFORM_SIZE;
		else if(accion.equals(ACCION_CREATE)) sizeForm = CREATEFORM_SIZE;
		else if(accion.equals(ACCION_REMOVE)) sizeForm = QUERYFORM_SIZE;
		else if(accion.equals(ACCION_QUERY)) sizeForm = QUERYFORM_SIZE;
		else if(accion.equals(ACCION_UPDATE) && origen.equals("menu")) sizeForm = QUERYFORM_SIZE;
		else if(accion.equals(ACCION_UPDATE) && origen.equals("pagina")) sizeForm = UPDATEFORM_SIZE;
		else if(accion.equals(ACCION_UPDATE) && origen.equals("preupdate")) sizeForm = UPDATEFORM_SIZE;
		
		//Establecemos el tama�o de la capa del formulario
		asignarAtributo("CAPA","comTipoClienComisDetalFormLayer", "alto", String.valueOf(sizeForm));		
		
		//Estabelcemos la posicion y de la capa correspondiente a la lista y de su botonera
		asignarAtributo("CAPA","comTipoClienComisDetalListLayer", "y", String.valueOf(sizeForm + 26));		
		asignarAtributo("CAPA","comTipoClienComisDetalListButtonsLayer", "y", String.valueOf(sizeForm + 278));		
	}

	/**
	* Nos permite cargar las combos finales de la jerarqu�as de dependencia
	*/
	protected void loadLeafDependenceCombos(ComTipoClienComisDetalData comTipoClienComisDetal) throws Exception{
		HashMap checkedCombos = new HashMap();
		ComTipoClienComisCabecData tcccOidTipoClieComiCabe = new ComTipoClienComisCabecData();
		
						asignarComboResultados(BUSINESSID_TCCCOIDTIPOCLIECOMICABE_QUERY,TCCCOIDTIPOCLIECOMICABE_COMBO_CONNECTOR, 
			tcccOidTipoClieComiCabe, tcccOidTipoClieComiCabe.clone(), "comTipoClienComisCabec", "tcccOidTipoClieComiCabe", "result_ROWSET" );
		if(comTipoClienComisDetal != null && comTipoClienComisDetal.getTcccOidTipoClieComiCabe() != null){
				checkCombo("tcccOidTipoClieComiCabe" , comTipoClienComisDetal.getTcccOidTipoClieComiCabe().getId().toString());
			}
		MaeTipoClienData clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie = new MaeTipoClienData();
		
						asignarComboResultados(BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_TICLOIDTIPOCLIE_QUERY,CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_TICLOIDTIPOCLIE_COMBO_CONNECTOR, 
			clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie, clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie.clone(), "maeTipoClien", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie", "result_ROWSET" );
		if(comTipoClienComisDetal != null && 
		   comTipoClienComisDetal.getClasOidClas()!=null && 
           comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas()!=null &&
           comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie()!=null &&
           comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie().getTiclOidTipoClie() != null){
				checkCombo("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie" , comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie().getTiclOidTipoClie().getId().toString());
			}
		
	}
	
	/**
	* Nos permite cargar en cascada jerarqu�a de combos dependientes por la selecci�n de valor en uno de sus elementos
	*/
	public void cascadeComboLoad(HashMap checkedCombos, String comboName) throws Exception{
		
						if(comboName.trim().equals("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie") ){
			String clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClieDefaultValue = (String)checkedCombos.get("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClie");
			if(clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClieDefaultValue != null){
				MaeSubtiClienData clasOidClas_tcclOidTipoClas_sbtiOidSubtClie= new MaeSubtiClienData();
				es.indra.belcorp.mso.MaeTipoClienData clasOidClas_tcclOidTipoClas_sbtiOidSubtClieTiclOidTipoClie = new es.indra.belcorp.mso.MaeTipoClienData();
				clasOidClas_tcclOidTipoClas_sbtiOidSubtClieTiclOidTipoClie.setId(new Long(clasOidClas_tcclOidTipoClas_sbtiOidSubtClie_ticlOidTipoClieDefaultValue ));
				clasOidClas_tcclOidTipoClas_sbtiOidSubtClie.setTiclOidTipoClie(clasOidClas_tcclOidTipoClas_sbtiOidSubtClieTiclOidTipoClie);
				asignarComboResultados(BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_QUERY,CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_COMBO_CONNECTOR, 
					clasOidClas_tcclOidTipoClas_sbtiOidSubtClie, clasOidClas_tcclOidTipoClas_sbtiOidSubtClie.clone(), "maeSubtiClien", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "result_ROWSET",false );
			}
		}

						if(comboName.trim().equals("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie") ){
			String clasOidClas_tcclOidTipoClas_sbtiOidSubtClieDefaultValue = (String)checkedCombos.get("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie");
			if(clasOidClas_tcclOidTipoClas_sbtiOidSubtClieDefaultValue != null){
				MaeTipoClasiClienData clasOidClas_tcclOidTipoClas= new MaeTipoClasiClienData();
				es.indra.belcorp.mso.MaeSubtiClienData clasOidClas_tcclOidTipoClasSbtiOidSubtClie = new es.indra.belcorp.mso.MaeSubtiClienData();
				clasOidClas_tcclOidTipoClasSbtiOidSubtClie.setId(new Long(clasOidClas_tcclOidTipoClas_sbtiOidSubtClieDefaultValue ));
				clasOidClas_tcclOidTipoClas.setSbtiOidSubtClie(clasOidClas_tcclOidTipoClasSbtiOidSubtClie);
				asignarComboResultados(BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_QUERY,CLASOIDCLAS_TCCLOIDTIPOCLAS_COMBO_CONNECTOR, 
					clasOidClas_tcclOidTipoClas, clasOidClas_tcclOidTipoClas.clone(), "maeTipoClasiClien", "clasOidClas_tcclOidTipoClas", "result_ROWSET",false );
			}
		}

						if(comboName.trim().equals("clasOidClas_tcclOidTipoClas") ){
			String clasOidClas_tcclOidTipoClasDefaultValue = (String)checkedCombos.get("clasOidClas_tcclOidTipoClas");
			if(clasOidClas_tcclOidTipoClasDefaultValue != null){
				MaeClasiData clasOidClas= new MaeClasiData();
				es.indra.belcorp.mso.MaeTipoClasiClienData clasOidClasTcclOidTipoClas = new es.indra.belcorp.mso.MaeTipoClasiClienData();
				clasOidClasTcclOidTipoClas.setId(new Long(clasOidClas_tcclOidTipoClasDefaultValue ));
				clasOidClas.setTcclOidTipoClas(clasOidClasTcclOidTipoClas);
				asignarComboResultados(BUSINESSID_CLASOIDCLAS_QUERY,CLASOIDCLAS_COMBO_CONNECTOR, 
					clasOidClas, clasOidClas.clone(), "maeClasi", "clasOidClas", "result_ROWSET",false );
			}
		}

	}
	
	/**
	* Este m�todo carga todos los combos de una jerarqu�a de dependencia. La carga se realiza c
	* se realiza en funci�n de los datos de un mso del mantenimiento. 
	* @param comTipoClienComisDetal La el objetopar la cual se va a realizar la carga
	*/
	protected void loadNonLeafDependenceCombos(ComTipoClienComisDetalData comTipoClienComisDetal) 
		throws Exception{
		
						if(comTipoClienComisDetal.getClasOidClas() != null){
			
						MaeClasiData clasOidClas = new MaeClasiData();
			clasOidClas.setTcclOidTipoClas(comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas());
			asignarComboResultados(BUSINESSID_CLASOIDCLAS_QUERY,CLASOIDCLAS_COMBO_CONNECTOR, clasOidClas, clasOidClas.clone(), "maeClasi", "clasOidClas", "result_ROWSET");
			checkCombo("clasOidClas" , comTipoClienComisDetal.getClasOidClas().getId().toString());
			
						MaeTipoClasiClienData clasOidClas_tcclOidTipoClas = new MaeTipoClasiClienData();
			clasOidClas_tcclOidTipoClas.setSbtiOidSubtClie(comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie());
			asignarComboResultados(BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_QUERY,CLASOIDCLAS_TCCLOIDTIPOCLAS_COMBO_CONNECTOR, clasOidClas_tcclOidTipoClas, clasOidClas_tcclOidTipoClas.clone(), "maeTipoClasiClien", "clasOidClas_tcclOidTipoClas", "result_ROWSET");
			checkCombo("clasOidClas_tcclOidTipoClas" , comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getId().toString());
			
						MaeSubtiClienData clasOidClas_tcclOidTipoClas_sbtiOidSubtClie = new MaeSubtiClienData();
			clasOidClas_tcclOidTipoClas_sbtiOidSubtClie.setTiclOidTipoClie(comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie().getTiclOidTipoClie());
			asignarComboResultados(BUSINESSID_CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_QUERY,CLASOIDCLAS_TCCLOIDTIPOCLAS_SBTIOIDSUBTCLIE_COMBO_CONNECTOR, clasOidClas_tcclOidTipoClas_sbtiOidSubtClie, clasOidClas_tcclOidTipoClas_sbtiOidSubtClie.clone(), "maeSubtiClien", "clasOidClas_tcclOidTipoClas_sbtiOidSubtClie", "result_ROWSET");
			checkCombo("clasOidClas_tcclOidTipoClas_sbtiOidSubtClie" , comTipoClienComisDetal.getClasOidClas().getTcclOidTipoClas().getSbtiOidSubtClie().getId().toString());
			
						}
		
	}
	
	/**
	* Nos permite cargar los combos y seleccionar los elementos tal como estaban en la �ltima query
	*/
	protected void loadNonLeafDependenceCombosForRequery() throws Exception{
		//Priemero obtenemos lso objetos from y to con todos los datos de la b�squeda
		ComTipoClienComisDetalData comTipoClienComisDetal = 
			(ComTipoClienComisDetalData) conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_FROM);
		
		//Cargamos todos los objetos completos correspodnientes a los valores de los
		//Campos que sean raiz de una jerarqu�a de combos dependientes
		if(comTipoClienComisDetal.getTcccOidTipoClieComiCabe() != null){
			comTipoClienComisDetal.setTcccOidTipoClieComiCabe((es.indra.belcorp.mso.ComTipoClienComisCabecData)
			getSingleObject(BUSINESSID_TCCCOIDTIPOCLIECOMICABE_QUERY, 
			comTipoClienComisDetal.getTcccOidTipoClieComiCabe(),
			comTipoClienComisDetal.getTcccOidTipoClieComiCabe().clone(),
			"comTipoClienComisCabec"));
		}
		if(comTipoClienComisDetal.getClasOidClas() != null){
			comTipoClienComisDetal.setClasOidClas((es.indra.belcorp.mso.MaeClasiData)
			getSingleObject(BUSINESSID_CLASOIDCLAS_QUERY, 
			comTipoClienComisDetal.getClasOidClas(),
			comTipoClienComisDetal.getClasOidClas().clone(),
			"maeClasi"));
		}
		
		//Una vez que tenemos completo los datos de los atributos raices de jerarqu�as de dependencias
		//cargamos las combos y seleccionamos elementos
		loadNonLeafDependenceCombos(comTipoClienComisDetal);
		loadLeafDependenceCombos(comTipoClienComisDetal);
	}
	
	/**
	*	Por defecto en los campos que tienen la b�squeda por intervalo el label del campo es el label
	*	correspondiente a campos normal (como si no fuera un campo con intervalor). En los modos de busqueda 
	*	(search, update search y remove search) tendremos que poner el label a la b�squeda "desde"
	*/
	protected void setIntervalSearchFromLavels() throws Exception{
	}
	
	/**
	*	Metodo que nos elimina los trs que quedan vac�os por no aparecer sus campos por el modo
	*/
	protected void eliminarTrsVacios(String accion, String origen) throws Exception{
		if(accion.equals(ACCION_QUERY) || accion.equals(ACCION_LOV) ||
			(accion.equals(ACCION_UPDATE) && origen.equals("menu")) ||
			(accion.equals(ACCION_REMOVE) && origen.equals("menu"))){
			borrarNodo("TR","nombre","formTr0");
			borrarNodo("TR","nombre","formGapTr0");
			
		}else if(accion.equals(ACCION_VIEW) && origen.equals("preview")){
			borrarNodo("TR","nombre","formTr0");
			borrarNodo("TR","nombre","formGapTr0");
			
		}else if(accion.equals(ACCION_CREATE)){
			borrarNodo("TR","nombre","formTr0");
			borrarNodo("TR","nombre","formGapTr0");
			
		}else if(accion.equals(ACCION_UPDATE) && origen.equals("preupdate")){
			borrarNodo("TR","nombre","formTr0");
			borrarNodo("TR","nombre","formGapTr0");
			
		}
	}
	
	
	protected void loadLocalizationVars(ComTipoClienComisDetalData comTipoClienComisDetal) throws Exception{
		GenDetaSiccData mmgLocalizationQuery = null;
		Vector mmgLocalizationDatosResult = null;
		mmgLocalizationQuery = new GenDetaSiccData();
		mmgLocalizationQuery.setEnti("COM_TIPO_CLIEN_COMIS_DETAL");
		mmgLocalizationQuery.setEntiPk(comTipoClienComisDetal.getId());
		mmgLocalizationQuery.setAtri(new Long(1));
		mmgLocalizationDatosResult = getCollectionObjects(BUSINESID_GENDETASICC, mmgLocalizationQuery, 
			mmgLocalizationQuery.clone(), "genDetaSicc");		
		for(Iterator it = mmgLocalizationDatosResult.iterator(); it.hasNext();){
			GenDetaSiccData description = (GenDetaSiccData)it.next();
			if(description.getDeta() != null && !description.getDeta().trim().equals("")){
				asignar("VAR", "hi18NTraduccion_1_" + 
					description.getIdioOidIdio().getId().toString() , description.getDeta());
			}
		}
		
	}
	
	
		
}





