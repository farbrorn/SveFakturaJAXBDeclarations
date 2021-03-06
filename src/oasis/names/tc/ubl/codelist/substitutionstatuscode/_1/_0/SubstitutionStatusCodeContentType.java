//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.codelist.substitutionstatuscode._1._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubstitutionStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstitutionStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Substitution"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstitutionStatusCodeContentType")
@XmlEnum
public enum SubstitutionStatusCodeContentType {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeName xmlns="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Original&lt;/CodeName&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeName xmlns="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Substitution&lt;/CodeName&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("Substitution")
    SUBSTITUTION("Substitution");
    private final String value;

    SubstitutionStatusCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubstitutionStatusCodeContentType fromValue(String v) {
        for (SubstitutionStatusCodeContentType c: SubstitutionStatusCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
