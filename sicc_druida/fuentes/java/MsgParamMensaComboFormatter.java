
/*
    INDRA/CAR/mmg
    $Id: MsgParamMensaComboFormatter.java,v 1.1 2009/12/03 18:40:41 pecbazalar Exp $
    DESC
*/


/*
    INDRA/CAR/mmg
    $Id: MsgParamMensaComboFormatter.java,v 1.1 2009/12/03 18:40:41 pecbazalar Exp $
    fdsfdsf

    DRUIDATARGET=/install/cvsiniciales
*/

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import es.indra.belcorp.mso.*;
import es.indra.druida.DruidaFormatoObjeto;
import es.indra.druida.belcorp.MMGDruidaFormatoObjeto;
import es.indra.druida.belcorp.MMGDruidaHelper;
import es.indra.mare.common.dto.IMareDTO;

import es.indra.utils.*;

/**
 * Clase de formateo de objetos "MsgParamMensa" para Druida
 * 
 * @author Indra
 */
public class MsgParamMensaComboFormatter extends MMGDruidaFormatoObjeto {
	
	public MsgParamMensaComboFormatter() {
	}

	public void formatea(String s, Object obj) throws Exception {

		IMareDTO dto = (IMareDTO) obj;
		Vector msgParamMensaCombo = (Vector) dto.getProperty("result");
		Vector result = new Vector();

		//Ordenamos los elementos
		//TreeMap orderBy = new TreeMap();
		TreeMap orderBy = new TreeMap(new Comparador());
		for(int i=0; i< msgParamMensaCombo.size(); i++){
			MsgParamMensaData msgParamMensaData = (MsgParamMensaData)msgParamMensaCombo.get(i);
			String description = msgParamMensaData.getDesDatoVari() != null ? 
				FormatUtils.formatObject(msgParamMensaData.getDesDatoVari(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : "";
			
			orderBy.put(description.toUpperCase(), msgParamMensaData);
		}

		//Construimos cada fila con los valores de la clave y la descripci�n del elemento que se mostrar� en el combo
		for (Iterator it = orderBy.entrySet().iterator() ; it.hasNext();) {
			MsgParamMensaData msgParamMensaData = (MsgParamMensaData)((Map.Entry)it.next()).getValue();
			Vector row = new Vector();

			// A�adir la clave
			Hashtable primaryKey = msgParamMensaData.mmgGetPrimaryKey();
			Enumeration keys = primaryKey.keys();
			
			while (keys.hasMoreElements()) {
				Object element = primaryKey.get(keys.nextElement());
				row.add((element != null ? element.toString() : ""));
			}

			// A�adir el atributo choice
			row.add((msgParamMensaData.getDesDatoVari() != null ? 
				FormatUtils.formatObject(msgParamMensaData.getDesDatoVari(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			

			result.add(row);
		}

		setCampo(s, result);
	}
}
