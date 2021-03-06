

/*
    INDRA/CAR/mmg
    $Id: EduRegalTransactionQuery.java,v 1.1 2009/12/03 18:34:02 pecbazalar Exp $
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
import es.indra.belcorp.mso.*;

// Definicion de la clase
public class EduRegalTransactionQuery extends MMGDruidaTransaction {
	//Constante que determina el atributo chocice de la entidada
	
	
	
	public static final String CHOICE_ATTRIBUTE = "Descripcion";
	

	//Constantes usadas en la clase. Simplemente representan 
	//los nombre de conectore y de logicas de negocio
	public static final String BUSINESSID_QUERY = "MMGEduRegalQueryFromToUserPage";
	public static final String CONECTOR_QUERY_LIST = "EduRegalConectorQueryList";

	// Definicion del constructor
	public EduRegalTransactionQuery(){
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
			
			traza("MMG:: LLegao a transaction Query de entidad EduRegal");
			String codRega = (String)getEntrada("codRega");
			traza("MMG:: Valor de atributo codRega: " + codRega);
			if(codRega != null && !codRega.trim().equals("")) codRega = codRega.toUpperCase();
			String prodOidProd = (String)getEntrada("prodOidProd");
			traza("MMG:: Valor de atributo prodOidProd: " + prodOidProd);
			if(prodOidProd != null && !prodOidProd.trim().equals("")) prodOidProd = prodOidProd.toUpperCase();
			
		
			//Construimos los MSOs (from y to) con los elementos de la b�squeda
			EduRegalData eduRegalFrom =new EduRegalData();
			EduRegalData eduRegalTo = new EduRegalData();
			
			//Construimos el from. Los campos que no sean de intervalo ponemos
			//el mismo valor que el from. y los que si sen de intervalo ponemos el valor
			//corespondiente
			eduRegalFrom.setCodRega(
				(java.lang.Integer)FormatUtils.parseObject(codRega, "java.lang.Integer", 
			MMGDruidaHelper.getUserDecimalFormatPattern(this)
			, MMGDruidaHelper.getUserDecimalFormatSymbols(this)));
			es.indra.belcorp.mso.MaeProduData prodOidProdData = null;
			if(prodOidProd != null && !prodOidProd.trim().equals("")){
				prodOidProdData = new es.indra.belcorp.mso.MaeProduData();
				prodOidProdData.setId(new Integer(prodOidProd));
			}
			eduRegalFrom.setProdOidProd(prodOidProdData);
			
			
			//Construimos el to
			eduRegalTo = (EduRegalData)eduRegalFrom.clone();
			
			
			//Metemos tanto el fromo como el to como �ltimos mso con par�metros de b�squeda
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_FROM, eduRegalFrom);
			conectorParametroSesion(SESSION_ATTRIBUTE_LAST_QUERY_OBJ_TO, eduRegalTo);
			
			//Sacamos los datos de paginaci�n
			Integer pageCount = new Integer((String)getEntrada("pageCount"));
			Integer pageSize = new Integer((String)getEntrada("pageSize"));
			
			//Creamos el dto y el bussines id correspondientes a la acci�n de realiza una query
			Vector datos = new Vector();
			MareDTO dto = new MareDTO();
			dto.addProperty("eduRegalFrom", eduRegalFrom);
			dto.addProperty("eduRegalTo", eduRegalTo);
			dto.addProperty("pageCount", pageCount);
			dto.addProperty("pageSize", pageSize);
			dto.addProperty("userProperties", MMGDruidaHelper.getUserProperties(this));
			
			datos.add(dto);
			datos.add(new MareBusinessID(BUSINESSID_QUERY));
			
			
			
			//Invocamos la l�gica de negocio
			traza("MMG:: Iniciada ejecuci�n Query de entidad EduRegal");
			DruidaConector conectorQuery =  conectar(CONECTOR_QUERY_LIST, datos);
			traza("MMG:: Finalizada ejecuci�n Query de entidad EduRegal");
			
			
	
			//Definimos el resultado del conector
			setConector(conectorQuery);
		}catch(Exception e){
			handleException(e);
		}
	}
	
	
	
	
	
}





