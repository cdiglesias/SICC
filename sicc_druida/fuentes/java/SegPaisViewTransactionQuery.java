

/*
    INDRA/CAR/mmg
    $Id: SegPaisViewTransactionQuery.java,v 1.1 2009/12/03 18:32:15 pecbazalar Exp $
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
public class SegPaisViewTransactionQuery extends MMGDruidaTransaction {
	//Constante que determina el atributo chocice de la entidada
	
	
	
	
	public static final String CHOICE_ATTRIBUTE = "Descripcion";
	

	//Constantes usadas en la clase. Simplemente representan 
	//los nombre de conectore y de logicas de negocio
	public static final String BUSINESSID_QUERY = "MMGSegPaisViewQueryFromToUserPageStructuralSecurity";
	public static final String CONECTOR_QUERY_LIST = "SegPaisViewConectorQueryList";

	// Definicion del constructor
	public SegPaisViewTransactionQuery(){
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
			
			traza("MMG:: LLegao a transaction Query de entidad SegPaisView");
			String codPais = (String)getEntrada("codPais");
			traza("MMG:: Valor de atributo codPais: " + codPais);
			if(codPais != null && !codPais.trim().equals("")) codPais = codPais.toUpperCase();
			String moneOidMone = (String)getEntrada("moneOidMone");
			traza("MMG:: Valor de atributo moneOidMone: " + moneOidMone);
			
		
			//Construimos los MSOs (from y to) con los elementos de la b�squeda
			SegPaisViewData segPaisViewFrom =new SegPaisViewData();
			SegPaisViewData segPaisViewTo = new SegPaisViewData();
			
			//Construimos el from. Los campos que no sean de intervalo ponemos
			//el mismo valor que el from. y los que si sen de intervalo ponemos el valor
			//corespondiente
			segPaisViewFrom.setCodPais(
				(java.lang.String)FormatUtils.parseObject(codPais, "java.lang.String", 
			MMGDruidaHelper.getUserDecimalFormatPattern(this)
			, MMGDruidaHelper.getUserDecimalFormatSymbols(this)));
			es.indra.belcorp.mso.SegMonedData moneOidMoneData = null;
			if(moneOidMone != null && !moneOidMone.trim().equals("")){
				moneOidMoneData = new es.indra.belcorp.mso.SegMonedData();
				moneOidMoneData.setId(new Long(moneOidMone));
			}
			segPaisViewFrom.setMoneOidMone(moneOidMoneData);
			
			
			//Construimos el to
			segPaisViewTo = (SegPaisViewData)segPaisViewFrom.clone();
			
			
			//Metemos tanto el fromo como el to como �ltimos mso con par�metros de b�squeda
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_FROM, segPaisViewFrom);
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_TO, segPaisViewTo);
			
			//Sacamos los datos de paginaci�n
			Integer pageCount = new Integer((String)getEntrada("pageCount"));
			Integer pageSize = new Integer((String)getEntrada("pageSize"));
			
			//Creamos el dto y el bussines id correspondientes a la acci�n de realiza una query
			Vector datos = new Vector();
			MareDTO dto = new MareDTO();
			dto.addProperty("segPaisViewFrom", segPaisViewFrom);
			dto.addProperty("segPaisViewTo", segPaisViewTo);
			dto.addProperty("pageCount", pageCount);
			dto.addProperty("pageSize", pageSize);
			dto.addProperty("userProperties", MMGDruidaHelper.getUserProperties(this));
			dto.addProperty("applyStructuralSecurity", new Boolean(false));
			datos.add(dto);
			datos.add(new MareBusinessID(BUSINESSID_QUERY));
			
			
			
			//Invocamos la l�gica de negocio
			traza("MMG:: Iniciada ejecuci�n Query de entidad SegPaisView");
			DruidaConector conectorQuery =  conectar(CONECTOR_QUERY_LIST, datos);
			traza("MMG:: Finalizada ejecuci�n Query de entidad SegPaisView");
			
			
	
			//Definimos el resultado del conector
			setConector(conectorQuery);
		}catch(Exception e){
			handleException(e);
		}
	}
	
	
	
	
	
}





