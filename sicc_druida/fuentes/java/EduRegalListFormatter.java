
/*
    INDRA/CAR/mmg
    $Id: EduRegalListFormatter.java,v 1.1 2009/12/03 18:34:20 pecbazalar Exp $
    DESC
*/


import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;

import es.indra.belcorp.mso.*;
import es.indra.druida.DruidaFormatoObjeto;
import es.indra.druida.belcorp.MMGDruidaFormatoObjeto;
import es.indra.druida.belcorp.MMGDruidaHelper;
import es.indra.mare.common.dto.IMareDTO;

import es.indra.utils.*;

/**
 * Clase de formateo de objetos "EduRegal" para Druida
 * 
 * @author Indra
 */
public class EduRegalListFormatter extends MMGDruidaFormatoObjeto {
	
	public EduRegalListFormatter() {
	}

	public void formatea(String s, Object obj) throws Exception {

		IMareDTO dto = (IMareDTO) obj;
		Vector eduRegalList = (Vector) dto.getProperty("result");

		Vector result = new Vector();

		for (int i = 0; i < eduRegalList.size(); i++) {
		
			EduRegalData eduRegalData = (EduRegalData) eduRegalList.elementAt(i);

			Vector row = new Vector();

			// A�adir la clave
			Hashtable primaryKey = eduRegalData.mmgGetPrimaryKey();
			Enumeration keys = primaryKey.keys();
			
			while (keys.hasMoreElements()) {
				Object element = primaryKey.get(keys.nextElement());
				row.add((element != null ? element.toString() : ""));
			}

			// A�adir el resto de atributos
			row.add((eduRegalData.getCodRega() != null ? 
				FormatUtils.formatObject(eduRegalData.getCodRega(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((eduRegalData.getProdOidProd() != null ? 
				FormatUtils.formatObject(eduRegalData.getProdOidProd(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			

			// A�adir el atributo timestamp. Por ahora queda deshabilitado (ponemos un 0) ya que no hay bloqueos....
			//row.add(new Long(eduRegalData.jdoGetTimeStamp()).toString());		
			row.add(new Long(0).toString());		
			
			result.add(row);
		}

		setCampo(s, result);
	}
}
