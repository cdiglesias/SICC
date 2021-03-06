
/*
    INDRA/CAR/mmg
    $Id: ZonTerriListFormatter.java,v 1.1 2009/12/03 18:38:14 pecbazalar Exp $
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
 * Clase de formateo de objetos "ZonTerri" para Druida
 * 
 * @author Indra
 */
public class ZonTerriListFormatter extends MMGDruidaFormatoObjeto {
	
	public ZonTerriListFormatter() {
	}

	public void formatea(String s, Object obj) throws Exception {

		IMareDTO dto = (IMareDTO) obj;
		Vector zonTerriList = (Vector) dto.getProperty("result");

		Vector result = new Vector();

		for (int i = 0; i < zonTerriList.size(); i++) {
		
			ZonTerriData zonTerriData = (ZonTerriData) zonTerriList.elementAt(i);

			Vector row = new Vector();

			// A�adir la clave
			Hashtable primaryKey = zonTerriData.mmgGetPrimaryKey();
			Enumeration keys = primaryKey.keys();
			
			while (keys.hasMoreElements()) {
				Object element = primaryKey.get(keys.nextElement());
				row.add((element != null ? element.toString() : ""));
			}

			// A�adir el resto de atributos
			row.add((zonTerriData.getPaisOidPais() != null ? 
				FormatUtils.formatObject(zonTerriData.getPaisOidPais(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getCodTerr() != null ? 
				FormatUtils.formatObject(zonTerriData.getCodTerr(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getCodNse1() != null ? 
				FormatUtils.formatObject(zonTerriData.getCodNse1(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getCodNse2() != null ? 
				FormatUtils.formatObject(zonTerriData.getCodNse2(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getCodNse3() != null ? 
				FormatUtils.formatObject(zonTerriData.getCodNse3(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getIndBorr() != null ? 
				FormatUtils.formatObject(zonTerriData.getIndBorr(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getVepoOidValoEstrGeop() != null ? 
				FormatUtils.formatObject(zonTerriData.getVepoOidValoEstrGeop(), 
				 MMGDruidaHelper.getUserDecimalFormatPattern(this), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			row.add((zonTerriData.getFecRtz() != null ? 
				FormatUtils.formatObject(zonTerriData.getFecRtz(), 
				 MMGDruidaHelper.getUserDatePattern(this, true), 
				MMGDruidaHelper.getUserDecimalFormatSymbols(this)) : ""));
			

			// A�adir el atributo timestamp. Por ahora queda deshabilitado (ponemos un 0) ya que no hay bloqueos....
			//row.add(new Long(zonTerriData.jdoGetTimeStamp()).toString());		
			row.add(new Long(0).toString());		
			
			result.add(row);
		}

		setCampo(s, result);
	}
}
