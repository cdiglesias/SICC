

/*
    INDRA/CAR/mmg
    $Id: SegCanalViewTransactionQuery.java,v 1.1 2009/12/03 18:37:11 pecbazalar Exp $
    DESC
*/

import java.util.*;
import es.indra.utils.*;
import es.indra.druida.belcorp.MMGDruidaHelper;
import es.indra.druida.belcorp.MMGDruidaTransaction;
import es.indra.druida.belcorp.MMGException;
import es.indra.druida.belcorp.MMGNoSessionException;
import es.indra.druida.DruidaConector;
import es.indra.mare.common.dto.MareDTO;
import es.indra.mare.common.dto.IMareDTO;
import es.indra.mare.common.mln.MareBusinessID;
import es.indra.sicc.util.UtilidadesSession;
import es.indra.belcorp.mso.*;

// Definicion de la clase
public class SegCanalViewTransactionQuery extends MMGDruidaTransaction {
	//Constante que determina el atributo chocice de la entidada
	
	
	public static final String CHOICE_ATTRIBUTE = "Descripcion";
	

	//Constantes usadas en la clase. Simplemente representan 
	//los nombre de conectore y de logicas de negocio
	public static final String BUSINESSID_QUERY = "MMGSegCanalViewQueryFromToUserPageStructuralSecurity";
	public static final String CONECTOR_QUERY_LIST = "SegCanalViewConectorQueryList";

	// Definicion del constructor
	public SegCanalViewTransactionQuery(){
		super();
	}

	// Definicion del metodo abstracto ejecucion
	public void ejecucion() throws Exception {
		try{
			//Ejecutamos las acciones comunes
			super.ejecucion();
		
			//Metemos en la sesi�n la query de la busqueda en formato param1|param2|....|paramN(para el tema de volver a la 
			//pagina anterior y ,mantener los �ltimos resultados)
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY, 
				conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY));
			
			traza("MMG:: LLegao a transaction Query de entidad SegCanalView");
			String codCana = (String)getEntrada("codCana");
			traza("MMG:: Valor de atributo codCana: " + codCana);
			if(codCana != null && !codCana.trim().equals("")) codCana = codCana.toUpperCase();
			String Descripcion = (String)getEntrada("Descripcion");
			traza("MMG:: Valor de atributo Descripcion: " + Descripcion);
			String tipeOidTipoPeri = (String)getEntrada("tipeOidTipoPeri");
			traza("MMG:: Valor de atributo tipeOidTipoPeri: " + tipeOidTipoPeri);
			
		
			//Construimos los MSOs (from y to) con los elementos de la b�squeda
			SegCanalViewData segCanalViewFrom =new SegCanalViewData();
			SegCanalViewData segCanalViewTo = new SegCanalViewData();
			
			//Construimos el from. Los campos que no sean de intervalo ponemos
			//el mismo valor que el from. y los que si sen de intervalo ponemos el valor
			//corespondiente
			segCanalViewFrom.setCodCana(
				(java.lang.String)FormatUtils.parseObject(codCana, "java.lang.String", 
			MMGDruidaHelper.getUserDecimalFormatPattern(this)
			, MMGDruidaHelper.getUserDecimalFormatSymbols(this)));
			segCanalViewFrom.setDescripcion(
				(java.lang.String)FormatUtils.parseObject(Descripcion, "java.lang.String", 
			MMGDruidaHelper.getUserDecimalFormatPattern(this)
			, MMGDruidaHelper.getUserDecimalFormatSymbols(this)));
			es.indra.belcorp.mso.SegTipoPerioData tipeOidTipoPeriData = null;
			if(tipeOidTipoPeri != null && !tipeOidTipoPeri.trim().equals("")){
				tipeOidTipoPeriData = new es.indra.belcorp.mso.SegTipoPerioData();
				tipeOidTipoPeriData.setId(new Long(tipeOidTipoPeri));
			}
			segCanalViewFrom.setTipeOidTipoPeri(tipeOidTipoPeriData);
			
			
			//Construimos el to
			segCanalViewTo = (SegCanalViewData)segCanalViewFrom.clone();
			
			
			//Metemos tanto el fromo como el to como �ltimos mso con par�metros de b�squeda
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_FROM, segCanalViewFrom);
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_TO, segCanalViewTo);
			
			//Sacamos los datos de paginaci�n
			Integer pageCount = new Integer((String)getEntrada("pageCount"));
			Integer pageSize = new Integer((String)getEntrada("pageSize"));
			
			//Creamos el dto y el bussines id correspondientes a la acci�n de realiza una query
			Vector datos = new Vector();
			MareDTO dto = new MareDTO();
			dto.addProperty("segCanalViewFrom", segCanalViewFrom);
			dto.addProperty("segCanalViewTo", segCanalViewTo);
			dto.addProperty("pageCount", pageCount);
			dto.addProperty("pageSize", pageSize);
			dto.addProperty("userProperties", MMGDruidaHelper.getUserProperties(this));
			dto.addProperty("applyStructuralSecurity", new Boolean(false));
			datos.add(dto);
			datos.add(new MareBusinessID(BUSINESSID_QUERY));
			
			
			
			//Invocamos la l�gica de negocio
			traza("MMG:: Iniciada ejecuci�n Query de entidad SegCanalView");
			DruidaConector conectorQuery =  conectar(CONECTOR_QUERY_LIST, datos);
			traza("MMG:: Finalizada ejecuci�n Query de entidad SegCanalView");
			
			
	
			//Definimos el resultado del conector
			setConector(conectorQuery);
		}catch(Exception e){
			handleException(e);
		}
	}
	
	
	
	
	
}





