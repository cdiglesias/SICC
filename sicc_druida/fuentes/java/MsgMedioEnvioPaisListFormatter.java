
/*
    INDRA/CAR/mmg
    $Id: MsgMedioEnvioPaisListFormatter.java,v 1.1 2009/12/03 18:42:04 pecbazalar Exp $
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
import java.util.HashMap;
import java.text.DecimalFormatSymbols;
import es.indra.mare.common.mgu.manager.Property;
import es.indra.utils.*;

/**
 * Clase de formateo de objetos "MsgMedioEnvioPais" para Druida
 * 
 * @author Indra
 */
public class MsgMedioEnvioPaisListFormatter extends MMGDruidaFormatoObjeto {
	
	public MsgMedioEnvioPaisListFormatter() {
	}

	public void formatea(String s, Object obj) throws Exception {

		IMareDTO dto = (IMareDTO) obj;
		Vector msgMedioEnvioPaisList = (Vector) dto.getProperty("result");

		Vector result = new Vector();

		HashMap propiedades = this.getUserProperties();
		Property propiedadFecha = (Property)propiedades.get("FormatoFecha");
		Property propiedadMiles = (Property)propiedades.get("FormatoNumericoSeparadorMiles");
		Property propiedadDecimal = (Property)propiedades.get("FormatoNumericoSeparadorDecimales");		
		DecimalFormatSymbols symbols = new  DecimalFormatSymbols();
		symbols.setDecimalSeparator(propiedadDecimal.getValue().toString().charAt(0));
		symbols.setGroupingSeparator(propiedadMiles.getValue().toString().charAt(0));


		for (int i = 0; i < msgMedioEnvioPaisList.size(); i++) {
		
			MsgMedioEnvioPaisData msgMedioEnvioPaisData = (MsgMedioEnvioPaisData) msgMedioEnvioPaisList.elementAt(i);

			Vector row = new Vector();

			// A�adir la clave
			Hashtable primaryKey = msgMedioEnvioPaisData.mmgGetPrimaryKey();
			Enumeration keys = primaryKey.keys();
			
			while (keys.hasMoreElements()) {
				Object element = primaryKey.get(keys.nextElement());
				row.add((element != null ? element.toString() : ""));
			}

			// A�adir el resto de atributos
			row.add((msgMedioEnvioPaisData.getPaisOidPais() != null ? 
				FormatUtils.formatObject(msgMedioEnvioPaisData.getPaisOidPais(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				symbols) : ""));
			row.add((msgMedioEnvioPaisData.getMeenOidMediEnvi() != null ? 
				FormatUtils.formatObject(msgMedioEnvioPaisData.getMeenOidMediEnvi(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				symbols) : ""));
			row.add((msgMedioEnvioPaisData.getCodEsta() != null ? 
				FormatUtils.formatObject(msgMedioEnvioPaisData.getCodEsta(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				symbols) : ""));
			

			// A�adir el atributo timestamp. Por ahora queda deshabilitado (ponemos un 0) ya que no hay bloqueos....
			//row.add(new Long(msgMedioEnvioPaisData.jdoGetTimeStamp()).toString());		
			row.add(new Long(0).toString());		
			
			result.add(row);
		}

		setCampo(s, result);
	}
}
