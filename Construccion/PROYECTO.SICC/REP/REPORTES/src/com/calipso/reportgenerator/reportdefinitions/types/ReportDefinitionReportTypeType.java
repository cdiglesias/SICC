/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.calipso.reportgenerator.reportdefinitions.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ReportDefinitionReportTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ReportDefinitionReportTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The CUBE type
     */
    public static final int CUBE_TYPE = 0;

    /**
     * The instance of the CUBE type
     */
    public static final ReportDefinitionReportTypeType CUBE = new ReportDefinitionReportTypeType(CUBE_TYPE, "CUBE");

    /**
     * The CHARTCUBE type
     */
    public static final int CHARTCUBE_TYPE = 1;

    /**
     * The instance of the CHARTCUBE type
     */
    public static final ReportDefinitionReportTypeType CHARTCUBE = new ReportDefinitionReportTypeType(CHARTCUBE_TYPE, "CHARTCUBE");

    /**
     * The ACCUM type
     */
    public static final int ACCUM_TYPE = 2;

    /**
     * The instance of the ACCUM type
     */
    public static final ReportDefinitionReportTypeType ACCUM = new ReportDefinitionReportTypeType(ACCUM_TYPE, "ACCUM");

    /**
     * The GROUP type
     */
    public static final int GROUP_TYPE = 3;

    /**
     * The instance of the GROUP type
     */
    public static final ReportDefinitionReportTypeType GROUP = new ReportDefinitionReportTypeType(GROUP_TYPE, "GROUP");

    /**
     * The STATICSQL type
     */
    public static final int STATICSQL_TYPE = 4;

    /**
     * The instance of the STATICSQL type
     */
    public static final ReportDefinitionReportTypeType STATICSQL = new ReportDefinitionReportTypeType(STATICSQL_TYPE, "STATICSQL");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private ReportDefinitionReportTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.calipso.reportgenerator.reportdefinitions.types.ReportDefinitionReportTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ReportDefinitionReportTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ReportDefinitionReportTypeType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("CUBE", CUBE);
        members.put("CHARTCUBE", CHARTCUBE);
        members.put("ACCUM", ACCUM);
        members.put("GROUP", GROUP);
        members.put("STATICSQL", STATICSQL);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * ReportDefinitionReportTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ReportDefinitionReportTypeType
     * based on the given String value.
     * 
     * @param string
     */
    public static com.calipso.reportgenerator.reportdefinitions.types.ReportDefinitionReportTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReportDefinitionReportTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ReportDefinitionReportTypeType) obj;
    } //-- com.calipso.reportgenerator.reportdefinitions.types.ReportDefinitionReportTypeType valueOf(java.lang.String) 

}