//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package oasis.names.tc.ubl.commonaggregatecomponents._1._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.DateTimeType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.DeliveryDateTimeType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.QuantityType;
import oasis.names.tc.ubl.unspecializeddatatypes._1._0.IdentifierType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;delivery information about a quantity and an event.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for DeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0}IdentifierType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}Quantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}MinimumQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}MaximumQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}RequestedDeliveryDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}PromisedDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}ActualDeliveryDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0}DeliveryAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0}DespatchAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0}OrderLineReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "id",
    "quantity",
    "minimumQuantity",
    "maximumQuantity",
    "requestedDeliveryDateTime",
    "promisedDateTime",
    "actualDeliveryDateTime",
    "deliveryAddress",
    "despatchAddress",
    "orderLineReference"
})
public class DeliveryType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected QuantityType quantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected QuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected QuantityType maximumQuantity;
    @XmlElement(name = "RequestedDeliveryDateTime", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected DeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "PromisedDateTime", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected DateTimeType promisedDateTime;
    @XmlElement(name = "ActualDeliveryDateTime", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected DeliveryDateTimeType actualDeliveryDateTime;
    @XmlElement(name = "DeliveryAddress")
    protected AddressType deliveryAddress;
    @XmlElement(name = "DespatchAddress")
    protected AddressType despatchAddress;
    @XmlElement(name = "OrderLineReference")
    protected List<OrderLineReferenceType> orderLineReference;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Quantity&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the quantity to be shipped at a specific delivery event.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Quantity&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Quantity. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Minimum_ Quantity. Quantity&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the minimum quantity to be shipped at a specific delivery event.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Minimum&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Quantity&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Quantity. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMinimumQuantity(QuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Maximum_ Quantity. Quantity&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the maximum quantity to be shipped at a specific delivery event.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Maximum&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Quantity&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Quantity. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMaximumQuantity(QuantityType value) {
        this.maximumQuantity = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Requested_ Delivery Date Time. Date Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the date the buyer requested delivery for a specific delivery event.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Requested&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Delivery Date Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date Time. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public DeliveryDateTimeType getRequestedDeliveryDateTime() {
        return requestedDeliveryDateTime;
    }

    /**
     * Sets the value of the requestedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public void setRequestedDeliveryDateTime(DeliveryDateTimeType value) {
        this.requestedDeliveryDateTime = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Promised_ Date Time. Date Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;used mainly for confirming orders when a date was promised for delivery by the supplier over the phone.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Promised&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Date Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date Time. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPromisedDateTime() {
        return promisedDateTime;
    }

    /**
     * Sets the value of the promisedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPromisedDateTime(DateTimeType value) {
        this.promisedDateTime = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Actual_ Delivery Date Time. Date Time&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;the date of the delivery which has actually taken place&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Actual&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Delivery Date Time&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Date Time&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Date Time. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public DeliveryDateTimeType getActualDeliveryDateTime() {
        return actualDeliveryDateTime;
    }

    /**
     * Sets the value of the actualDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public void setActualDeliveryDateTime(DeliveryDateTimeType value) {
        this.actualDeliveryDateTime = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Delivery_ Address. Address&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;information directly relating to the address/location to which a delivery is shipped&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Delivery&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Address&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Address&lt;/ccts:AssociatedObjectClass&gt;
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
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Despatch_ Address. Address&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;information directly relating to the address/location from which a delivery is shipped&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Despatch&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Address&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Address&lt;/ccts:AssociatedObjectClass&gt;
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
    public AddressType getDespatchAddress() {
        return despatchAddress;
    }

    /**
     * Sets the value of the despatchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDespatchAddress(AddressType value) {
        this.despatchAddress = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:oasis:names:tc:ubl:CoreComponentParameters:1:0" xmlns="urn:oasis:names:tc:ubl:CommonAggregateComponents:1:0" xmlns:cbc="urn:oasis:names:tc:ubl:CommonBasicComponents:1:0" xmlns:chc="urn:oasis:names:tc:ubl:codelist:ChipCode:1:0" xmlns:chn="urn:oasis:names:tc:ubl:codelist:ChannelCode:1:0" xmlns:cnt="urn:oasis:names:tc:ubl:codelist:CountryIdentificationCode:1:0" xmlns:cur="urn:oasis:names:tc:ubl:codelist:CurrencyCode:1:0" xmlns:lat="urn:oasis:names:tc:ubl:codelist:LatitudeDirectionCode:1:0" xmlns:lon="urn:oasis:names:tc:ubl:codelist:LongitudeDirectionCode:1:0" xmlns:lstat="urn:oasis:names:tc:ubl:codelist:LineStatusCode:1:0" xmlns:pty="urn:oasis:names:tc:ubl:codelist:PaymentMeansCode:1:0" xmlns:rsn="urn:oasis:names:tc:ubl:codelist:AllowanceChargeReasonCode:1:0" xmlns:sdt="urn:oasis:names:tc:ubl:SpecializedDatatypes:1:0" xmlns:sst="urn:oasis:names:tc:ubl:codelist:SubstitutionStatusCode:1:0" xmlns:stat="urn:oasis:names:tc:ubl:codelist:DocumentStatusCode:1:0" xmlns:udt="urn:oasis:names:tc:ubl:UnspecializedDatatypes:1:0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery. Order Line Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;associates the delivery information to the order item, which identifies the ordered item but only detail about the item that are pertinent to one occurrence on a line item, e.g. quantity etc.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Order Line Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Order Line Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the orderLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineReferenceType }
     * 
     * 
     */
    public List<OrderLineReferenceType> getOrderLineReference() {
        if (orderLineReference == null) {
            orderLineReference = new ArrayList<OrderLineReferenceType>();
        }
        return this.orderLineReference;
    }

}
