

/*
    INDRA/CAR/mmg
    $Id: CobEscalLiquiLPExecution.java,v 1.1 2009/12/03 18:41:56 pecbazalar Exp $
    DESC
*/

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import es.indra.druida.DruidaConector;
import es.indra.druida.belcorp.MMGDruidaBase;
import es.indra.druida.belcorp.MMGDruidaHelper;
import es.indra.druida.belcorp.MMGException;
import es.indra.mare.common.dto.MareDTO;
import es.indra.mare.common.mln.MareBusinessID;
import es.indra.sicc.cmn.presentacion.i18n.Idioma;
import es.indra.utils.FormatUtils;
import java.util.HashMap;
import java.text.DecimalFormatSymbols;
import es.indra.mare.common.mgu.manager.Property;
import es.indra.sicc.util.UtilidadesSession;
import es.indra.belcorp.mso.*;

public class CobEscalLiquiLPExecution extends MMGDruidaBase{
	//Constantes de l�ogica de negocio
	public static final String BUSINESSID_CREATE= "MMGCobEscalLiquiCreateI18N";
	public static final String BUSINESSID_UPDATE = "MMGCobEscalLiquiUpdateI18N";
	public static final String BUSINESSID_REMOVE = "MMGCobEscalLiquiRemoveSeveral";
	public static final String BUSINESSID_QUERY = "MMGCobEscalLiquiQueryFromToUserPage";	
	
	
	public static final String CONECTOR_CREATE = "CobEscalLiquiConectorCreate";
	public static final String CONECTOR_UPDATE = "CobEscalLiquiConectorUpdate";
	public static final String CONECTOR_REMOVE = "CobEscalLiquiConectorRemove";

	public CobEscalLiquiLPExecution(){
		super();
	}

	public void inicio() throws Exception {
	    pagina("CobEscalLiquiPage");
	}

	// Definicion del metodo abstracto ejecucion
	public void ejecucion() throws Exception {
		//Activamos las trazas
		setTrazaFichero();
	
		try{
			//Sacamos la acci�n a realizar y ejecutamos la acci�n correspondiente
			String accion = conectorParametro(PARAMETRO_GENERICO_ACCION);
			String origen = conectorParametro(PARAMETRO_GENERICO_ORIGEN);
			
			//Caragamos los elemetnos en la pagina
			asignar("VAR",PARAMETRO_GENERICO_ACCION,accion);
			asignar("VAR",PARAMETRO_GENERICO_ORIGEN,origen);
	
			//Ejecutamos la acci�n indicada
			if(accion.equals(ACCION_CREATE)) cmdCreate();
			if(accion.equals(ACCION_UPDATE)) cmdUpdate();
			if(accion.equals(ACCION_REMOVE)) cmdRemove();
		}catch(Exception e){
			handleException(e);
		}
  }
  
  /**Permite crear un nuevo elemento de la entidad. Invoca la l�gica de negocio
  	correspondiente a la creaci�n de un/a nuevo CobEscalLiqui*/  
	protected void cmdCreate() throws Exception{
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
		Long loidPais = UtilidadesSession.getPais(this);
	        userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		traza("datePattern" + datePattern);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";		
		DecimalFormatSymbols symbols = new  DecimalFormatSymbols();
		symbols.setDecimalSeparator(decimalSeparator.charAt(0));
		symbols.setGroupingSeparator(separadorMiles.charAt(0));	
		
		traza("MMG::Creando CobEscalLiqui");
		
		String numOrdeEsca = conectorParametro("numOrdeEsca").trim();
		traza("MMG:: Valor de atributo numOrdeEsca: " + numOrdeEsca);
		
		String impRangDesdImpo = conectorParametro("impRangDesdImpo").trim();
		traza("MMG:: Valor de atributo impRangDesdImpo: " + impRangDesdImpo);
		
		String impRangHastImpo = conectorParametro("impRangHastImpo").trim();
		traza("MMG:: Valor de atributo impRangHastImpo: " + impRangHastImpo);
		
		String valRangDesdPorc = conectorParametro("valRangDesdPorc").trim();
		traza("MMG:: Valor de atributo valRangDesdPorc: " + valRangDesdPorc);
		
		String valRangHastPorc = conectorParametro("valRangHastPorc").trim();
		traza("MMG:: Valor de atributo valRangHastPorc: " + valRangHastPorc);
		
		String impComiPorc = conectorParametro("impComiPorc").trim();
		traza("MMG:: Valor de atributo impComiPorc: " + impComiPorc);
		
		String impComiImpo = conectorParametro("impComiImpo").trim();
		traza("MMG:: Valor de atributo impComiImpo: " + impComiImpo);
		
		String valObse = conectorParametro("valObse").trim();
		traza("MMG:: Valor de atributo valObse: " + valObse);
		
		String melcOidMetoLiquCobr = conectorParametro("melcOidMetoLiquCobr").trim();
		traza("MMG:: Valor de atributo melcOidMetoLiquCobr: " + melcOidMetoLiquCobr);
		
		
		//Construimos el mso y le vamos haciendo los sets de los atributo
		CobEscalLiquiData cobEscalLiqui= new CobEscalLiquiData();
		cobEscalLiqui.setNumOrdeEsca(
			(java.lang.Long)FormatUtils.parseObject(numOrdeEsca, "java.lang.Long", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpRangDesdImpo(
			(java.lang.Double)FormatUtils.parseObject(impRangDesdImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpRangHastImpo(
			(java.lang.Double)FormatUtils.parseObject(impRangHastImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValRangDesdPorc(
			(java.lang.Double)FormatUtils.parseObject(valRangDesdPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValRangHastPorc(
			(java.lang.Double)FormatUtils.parseObject(valRangHastPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpComiPorc(
			(java.lang.Double)FormatUtils.parseObject(impComiPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpComiImpo(
			(java.lang.Double)FormatUtils.parseObject(impComiImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValObse(
			(java.lang.String)FormatUtils.parseObject(valObse, "java.lang.String", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		es.indra.belcorp.mso.CobMetodLiquiViewData melcOidMetoLiquCobrData = null;
		if(melcOidMetoLiquCobr != null && !melcOidMetoLiquCobr.trim().equals("")){
			melcOidMetoLiquCobrData = new es.indra.belcorp.mso.CobMetodLiquiViewData();
			melcOidMetoLiquCobrData.setId(new Long(melcOidMetoLiquCobr));
		}
		cobEscalLiqui.setMelcOidMetoLiquCobr(melcOidMetoLiquCobrData);
		
		
		//Determinamos las descripciones de los atributos internacionalizables
		Vector localizationLabels = buildLocalizationValues();
		
		//Creamos el dto y el bussines id correspondientes a la acci�n de create
		Vector datos = new Vector();
		MareDTO dto = new MareDTO();
		dto.addProperty("cobEscalLiqui", cobEscalLiqui);
		dto.addProperty("localizationLabels", localizationLabels);
		dto.addProperty("userProperties", userProperties);
		datos.add(dto);
		datos.add(new MareBusinessID(BUSINESSID_CREATE));

		

		//Invocamos la l�gica de negocio
		traza("MMG:: Iniciada ejecuci�n Create de entidad CobEscalLiqui");
		DruidaConector conectorCreate =  conectar(CONECTOR_CREATE, datos);
		traza("MMG:: Finalizada ejecuci�n Create de entidad CobEscalLiqui");
		
		
		
		//Redirigimos a la LP de StartUp con la acci�n de StartUp
		conectorAction("CobEscalLiquiLPStartUp");
		conectorActionParametro(PARAMETRO_GENERICO_ORIGEN, "menu");
		conectorActionParametro(PARAMETRO_GENERICO_ACCION, ACCION_CREATE);
	}
	
	
  /**Invoca la operaci�n de modificaci�n sobre el elemento seleccionado*/  
	protected void cmdUpdate() throws Exception{
		HashMap userProperties = MMGDruidaHelper.getUserProperties(this);
	        Long loidPais = UtilidadesSession.getPais(this);
	        userProperties.put("loidPais",loidPais);

		String datePattern = UtilidadesSession.getFormatoFecha(this);
		traza("datePattern" + datePattern);
		String decimalSeparator = UtilidadesSession.getSeparadorDecimales(this);
		String decimales = UtilidadesSession.getFormatoNumerico(this);
		String separadorMiles = decimalSeparator.equals(".") ? "," : ".";		
		DecimalFormatSymbols symbols = new  DecimalFormatSymbols();
		symbols.setDecimalSeparator(decimalSeparator.charAt(0));
		symbols.setGroupingSeparator(separadorMiles.charAt(0));	
		traza("MMG::Creando CobEscalLiqui");
		
		String numOrdeEsca = conectorParametro("numOrdeEsca").trim();
		traza("MMG:: Valor de atributo numOrdeEsca: " + numOrdeEsca);
		
		String impRangDesdImpo = conectorParametro("impRangDesdImpo").trim();
		traza("MMG:: Valor de atributo impRangDesdImpo: " + impRangDesdImpo);
		
		String impRangHastImpo = conectorParametro("impRangHastImpo").trim();
		traza("MMG:: Valor de atributo impRangHastImpo: " + impRangHastImpo);
		
		String valRangDesdPorc = conectorParametro("valRangDesdPorc").trim();
		traza("MMG:: Valor de atributo valRangDesdPorc: " + valRangDesdPorc);
		
		String valRangHastPorc = conectorParametro("valRangHastPorc").trim();
		traza("MMG:: Valor de atributo valRangHastPorc: " + valRangHastPorc);
		
		String impComiPorc = conectorParametro("impComiPorc").trim();
		traza("MMG:: Valor de atributo impComiPorc: " + impComiPorc);
		
		String impComiImpo = conectorParametro("impComiImpo").trim();
		traza("MMG:: Valor de atributo impComiImpo: " + impComiImpo);
		
		String valObse = conectorParametro("valObse").trim();
		traza("MMG:: Valor de atributo valObse: " + valObse);
		
		String melcOidMetoLiquCobr = conectorParametro("melcOidMetoLiquCobr").trim();
		traza("MMG:: Valor de atributo melcOidMetoLiquCobr: " + melcOidMetoLiquCobr);
		
		
		
		//Sacamos de la base de datos el elemento a modificar. SI ya no existe lanzamos excepcion
		CobEscalLiquiData cobEscalLiqui= new CobEscalLiquiData();
		String id = conectorParametro("idSelection");
		if(id != null && !id.trim().equals("")){
			cobEscalLiqui.setId(new Long(id));
		}
		cobEscalLiqui = (CobEscalLiquiData)getSingleObject(BUSINESSID_QUERY, cobEscalLiqui, 
			cobEscalLiqui.clone(), "cobEscalLiqui");
		
		if(cobEscalLiqui == null) throw new MMGException(ERRORCODE_ELEMENTO_INEXISTENTE);
		
		//Vamos actualizando los valores
		cobEscalLiqui.setNumOrdeEsca(
			(java.lang.Long)FormatUtils.parseObject(numOrdeEsca, "java.lang.Long", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpRangDesdImpo(
			(java.lang.Double)FormatUtils.parseObject(impRangDesdImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpRangHastImpo(
			(java.lang.Double)FormatUtils.parseObject(impRangHastImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValRangDesdPorc(
			(java.lang.Double)FormatUtils.parseObject(valRangDesdPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValRangHastPorc(
			(java.lang.Double)FormatUtils.parseObject(valRangHastPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpComiPorc(
			(java.lang.Double)FormatUtils.parseObject(impComiPorc, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setImpComiImpo(
			(java.lang.Double)FormatUtils.parseObject(impComiImpo, "java.lang.Double", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		cobEscalLiqui.setValObse(
			(java.lang.String)FormatUtils.parseObject(valObse, "java.lang.String", 
			 MMGDruidaHelper.getUserDecimalFormatPattern(this), symbols));
		es.indra.belcorp.mso.CobMetodLiquiViewData melcOidMetoLiquCobrData = null;
		if(melcOidMetoLiquCobr != null && !melcOidMetoLiquCobr.trim().equals("")){
			melcOidMetoLiquCobrData = new es.indra.belcorp.mso.CobMetodLiquiViewData();
			melcOidMetoLiquCobrData.setId(new Long(melcOidMetoLiquCobr));
		}
		cobEscalLiqui.setMelcOidMetoLiquCobr(melcOidMetoLiquCobrData);
		

		//Determinamos las descripciones de los atributos internacionalizables
		Vector localizationLabels = buildLocalizationValues();
		
		//Sacamos el timestamp y se lo ponemos el timestamp. Queda deshabilitado ya que en sicc no hay bloqueos.....
		//cobEscalLiqui.jdoSetTimeStamp(Long.parseLong(conectorParametro("timestamp")));
		
		//Creamos el dto y el bussines id correspondientes a la acci�n de realizar una modificaci�n
		Vector datos = new Vector();
		MareDTO dto = new MareDTO();
		dto.addProperty("cobEscalLiqui", cobEscalLiqui);
		dto.addProperty("localizationLabels", localizationLabels);
		datos.add(dto);
		datos.add(new MareBusinessID(BUSINESSID_UPDATE));

		

		//Invocamos la l�gica de negocio
		traza("MMG:: Iniciada ejecuci�n Update de entidad CobEscalLiqui");
		DruidaConector conectorCreate =  conectar(MMG_UPDATE_CONNECTOR, datos);
		traza("MMG:: Finalizada ejecuci�n Update de entidad CobEscalLiqui");

		
		
		//Redirigimos a la LP que cierra el dialogo
		//Registramos que se recagen los datos en la venta en la cual se ha producido la operaci�n
		conectorAction(LP_CLOSE_DIALOG);
		conectorActionOpener(false);
	}
	
	/**Nos permite borrar los elementos de la entidad seleccionados*/
	protected void cmdRemove() throws Exception{
		//Determinamos los elementos a eliminar. De cada uno sacamos el id y el timestamp
		Vector entities = new Vector();
		StringTokenizer claves = new StringTokenizer(conectorParametro("idSelection"), "|");
		StringTokenizer timestamps = new StringTokenizer(conectorParametro("timestamp"), "|");
		traza("MMG::Se van a borrar " + claves.countTokens() + " y son " + conectorParametro("idSelection"));
		while(claves.hasMoreTokens() && timestamps.hasMoreTokens()){
			CobEscalLiquiData cobEscalLiqui = new CobEscalLiquiData();
			cobEscalLiqui.setId(new Long(claves.nextToken()));
			//cobEscalLiqui.jdoSetTimeStamp(Long.parseLong(timestamps.nextToken()));
			entities.addElement(cobEscalLiqui);
		}
		
		//Construimos el DTO para realizar la llamada
		Vector datos = new Vector();
		MareDTO dto = new MareDTO();
		dto.addProperty("entities", entities);
		datos.add(dto);
		datos.add(new MareBusinessID(BUSINESSID_REMOVE));
		
		
		
		//Invocamos la l�gica de negocio
		traza("MMG:: Iniciada ejecuci�n Remove de entidad CobEscalLiqui");
		DruidaConector conectorCreate =  conectar(CONECTOR_REMOVE, datos);
		traza("MMG:: Finalizada ejecuci�n Remove de entidad CobEscalLiqui");
		
		

		//metemos en la sesi�n las query para realizar la requery
		conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY, conectorParametro(VAR_LAST_QUERY_TO_SESSION));
		
		//Redirigimos a la LP de StartUp con la acci�n de StartUp y requery
		conectorAction("CobEscalLiquiLPStartUp");
		conectorActionParametro(PARAMETRO_GENERICO_ORIGEN, "menu");
		conectorActionParametro(PARAMETRO_GENERICO_ACCION, ACCION_REMOVE);
		conectorActionParametro(VAR_PERFORM_REQUERY, "true");
	}
	
	protected Vector buildLocalizationValues() throws Exception{
		ArrayList languages = getIdiomas();
		Vector localizationLabels = new Vector();;
		
		
		return localizationLabels;
	}
	
	

	
	
	

	

	
	
	
	
}




