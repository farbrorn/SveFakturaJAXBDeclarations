//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.unspecializeddatatypes._1._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.BackorderQuantityType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.PackQuantityType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:cct="urn:oasis:names:tc:ubl:CoreComponentTypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;DT&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:oasis:names:tc:ubl:CoreComponentTypes:1:0>QuantityType">
 *       &lt;attribute name="quantityUnitCode" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="quantityUnitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="quantityUnitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="quantityUnitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
@XmlSeeAlso({
    oasis.names.tc.ubl.commonbasiccomponents._1._0.QuantityType.class,
    BackorderQuantityType.class,
    PackQuantityType.class
})
public class QuantityType
    extends oasis.names.tc.ubl.corecomponenttypes._1._0.QuantityType
{


}