//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.unspecializeddatatypes._1._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.corecomponenttypes._1._0.BinaryObjectType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:cct="urn:oasis:names:tc:ubl:CoreComponentTypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;DT&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Graphic. Type&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A set of finite-length sequences of binary octets.&lt;/ccts:Definition&gt;&lt;ccts:RepresentationTerm&gt;Graphic&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Binary Object. Type&lt;/ccts:DataType&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for GraphicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphicType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:oasis:names:tc:ubl:CoreComponentTypes:1:0>BinaryObjectType">
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphicType")
public class GraphicType
    extends BinaryObjectType
{


}
