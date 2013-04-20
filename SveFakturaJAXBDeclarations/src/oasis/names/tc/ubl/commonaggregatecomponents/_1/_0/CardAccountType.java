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
import oasis.names.tc.ubl.codelist.chipcode._1._0.ChipCodeType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.ExpiryDateType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.HolderNameType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.ValidityStartDateType;
import oasis.names.tc.ubl.unspecializeddatatypes._1._0.CodeType;
import oasis.names.tc.ubl.unspecializeddatatypes._1._0.IdentifierType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Card Account. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;information that directly relates to a credit or debit card, a small plastic card issued by a financial institution, bank or building society, allowing the holder to make purchases against the card.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Card Account&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for CardAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryAccountNumberID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType"/>
 *         &lt;element name="NetworkID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType"/>
 *         &lt;element name="CardTypeCode" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}CodeType" minOccurs="0"/>
 *         &lt;element name="CustomerID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}ValidityStartDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}ExpiryDate" minOccurs="0"/>
 *         &lt;element name="IssuerID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element name="IssueNumberID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element name="CV2ID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ChipCode" type="{urn:oasis:names:tc:ubl:codelist:ChipCode:1:0}ChipCodeType" minOccurs="0"/>
 *         &lt;element name="ChipApplicationID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}HolderName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccountType", propOrder = {
    "primaryAccountNumberID",
    "networkID",
    "cardTypeCode",
    "customerID",
    "validityStartDate",
    "expiryDate",
    "issuerID",
    "issueNumberID",
    "cv2ID",
    "chipCode",
    "chipApplicationID",
    "holderName"
})
public class CardAccountType {

    @XmlElement(name = "PrimaryAccountNumberID", required = true)
    protected IdentifierType primaryAccountNumberID;
    @XmlElement(name = "NetworkID", required = true)
    protected IdentifierType networkID;
    @XmlElement(name = "CardTypeCode")
    protected CodeType cardTypeCode;
    @XmlElement(name = "CustomerID")
    protected IdentifierType customerID;
    @XmlElement(name = "ValidityStartDate", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected ValidityStartDateType validityStartDate;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected ExpiryDateType expiryDate;
    @XmlElement(name = "IssuerID")
    protected IdentifierType issuerID;
    @XmlElement(name = "IssueNumberID")
    protected IdentifierType issueNumberID;
    @XmlElement(name = "CV2ID")
    protected IdentifierType cv2ID;
    @XmlElement(name = "ChipCode")
    protected ChipCodeType chipCode;
    @XmlElement(name = "ChipApplicationID")
    protected IdentifierType chipApplicationID;
    @XmlElement(name = "HolderName", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected HolderNameType holderName;

    /**
     * Gets the value of the primaryAccountNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Sets the value of the primaryAccountNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPrimaryAccountNumberID(IdentifierType value) {
        this.primaryAccountNumberID = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setNetworkID(IdentifierType value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the cardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Sets the value of the cardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCardTypeCode(CodeType value) {
        this.cardTypeCode = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setCustomerID(IdentifierType value) {
        this.customerID = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Card Account. Validity Start Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the date from which the card is valid .&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Card Account&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Validity Start Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date_Date Time. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link ValidityStartDateType }
     *     
     */
    public ValidityStartDateType getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Sets the value of the validityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStartDateType }
     *     
     */
    public void setValidityStartDate(ValidityStartDateType value) {
        this.validityStartDate = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Card Account. Expiry Date. Date&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the date up to which the card is valid .&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Card Account&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Expiry Date&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date_Date Time. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDateType }
     *     
     */
    public ExpiryDateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDateType }
     *     
     */
    public void setExpiryDate(ExpiryDateType value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the issuerID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIssuerID() {
        return issuerID;
    }

    /**
     * Sets the value of the issuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIssuerID(IdentifierType value) {
        this.issuerID = value;
    }

    /**
     * Gets the value of the issueNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * Sets the value of the issueNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIssueNumberID(IdentifierType value) {
        this.issueNumberID = value;
    }

    /**
     * Gets the value of the cv2ID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getCV2ID() {
        return cv2ID;
    }

    /**
     * Sets the value of the cv2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setCV2ID(IdentifierType value) {
        this.cv2ID = value;
    }

    /**
     * Gets the value of the chipCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChipCodeType }
     *     
     */
    public ChipCodeType getChipCode() {
        return chipCode;
    }

    /**
     * Sets the value of the chipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipCodeType }
     *     
     */
    public void setChipCode(ChipCodeType value) {
        this.chipCode = value;
    }

    /**
     * Gets the value of the chipApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * Sets the value of the chipApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setChipApplicationID(IdentifierType value) {
        this.chipApplicationID = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Card Account. Holder. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the name of the holder of the card.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Card Account&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Holder&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name_Text. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link HolderNameType }
     *     
     */
    public HolderNameType getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolderNameType }
     *     
     */
    public void setHolderName(HolderNameType value) {
        this.holderName = value;
    }

}
