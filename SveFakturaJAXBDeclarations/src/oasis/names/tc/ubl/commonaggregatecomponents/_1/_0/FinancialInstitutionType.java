//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.commonaggregatecomponents._1._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.NameType;
import oasis.names.tc.ubl.unspecializeddatatypes._1._0.IdentifierType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Financial Institution. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;information that directly relates to a bank or financial institution.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Financial Institution&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for FinancialInstitutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionType", propOrder = {
    "id",
    "name",
    "address"
})
public class FinancialInstitutionType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected NameType name;
    @XmlElement(name = "Address")
    protected AddressType address;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Financial Institution. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the name of the financial institution.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Financial Institution&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name_Text. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Financial Institution. Address&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;associates the financial institution with information that specifies the address and locates the place where it is situated.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Financial Institution&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Address&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Address&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}