//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.codelist.acknowledgementresponsecode._1._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementResponseCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementResponseCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="OrderResponse"/>
 *     &lt;enumeration value="OrderResponseSimple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementResponseCodeContentType")
@XmlEnum
public enum AcknowledgementResponseCodeContentType {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeName xmlns="urn:oasis:names:tc:ubl:codelist:AcknowledgementResponseCode:1:0" xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBL OrderResponse document&lt;/CodeName&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OrderResponse")
    ORDER_RESPONSE("OrderResponse"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeName xmlns="urn:oasis:names:tc:ubl:codelist:AcknowledgementResponseCode:1:0" xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBL OrderResponseSimple document&lt;/CodeName&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OrderResponseSimple")
    ORDER_RESPONSE_SIMPLE("OrderResponseSimple");
    private final String value;

    AcknowledgementResponseCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcknowledgementResponseCodeContentType fromValue(String v) {
        for (AcknowledgementResponseCodeContentType c: AcknowledgementResponseCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
