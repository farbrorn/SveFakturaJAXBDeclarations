//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package sfti.commonaggregatecomponents._1._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.unspecializeddatatypes._1._0.IdentifierType;


/**
 * <p>Java class for SFTILineReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SFTILineReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}DocumentReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SFTILineReferenceType", propOrder = {
    "lineID",
    "documentReference"
})
public class SFTILineReferenceType {

    @XmlElement(name = "LineID", required = true)
    protected IdentifierType lineID;
    @XmlElement(name = "DocumentReference")
    protected SFTIDocumentReferenceType documentReference;

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLineID(IdentifierType value) {
        this.lineID = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SFTIDocumentReferenceType }
     *     
     */
    public SFTIDocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTIDocumentReferenceType }
     *     
     */
    public void setDocumentReference(SFTIDocumentReferenceType value) {
        this.documentReference = value;
    }

}
