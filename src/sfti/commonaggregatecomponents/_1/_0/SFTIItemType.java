//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 06:07:59 em CEST 
//


package sfti.commonaggregatecomponents._1._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.DescriptionType;


/**
 * <p>Java class for SFTIItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SFTIItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}BuyersItemIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}SellersItemIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}StandardItemIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}TaxCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}BasePrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SFTIItemType", propOrder = {
    "description",
    "buyersItemIdentification",
    "sellersItemIdentification",
    "standardItemIdentification",
    "taxCategory",
    "basePrice"
})
public class SFTIItemType {

    @XmlElement(name = "Description", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0")
    protected DescriptionType description;
    @XmlElement(name = "BuyersItemIdentification")
    protected SFTIItemIdentificationType buyersItemIdentification;
    @XmlElement(name = "SellersItemIdentification")
    protected SFTIItemIdentificationType sellersItemIdentification;
    @XmlElement(name = "StandardItemIdentification")
    protected SFTIItemIdentificationType standardItemIdentification;
    @XmlElement(name = "TaxCategory")
    protected List<SFTITaxCategoryType> taxCategory;
    @XmlElement(name = "BasePrice")
    protected SFTIBasePriceType basePrice;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the buyersItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public SFTIItemIdentificationType getBuyersItemIdentification() {
        return buyersItemIdentification;
    }

    /**
     * Sets the value of the buyersItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public void setBuyersItemIdentification(SFTIItemIdentificationType value) {
        this.buyersItemIdentification = value;
    }

    /**
     * Gets the value of the sellersItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public SFTIItemIdentificationType getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Sets the value of the sellersItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public void setSellersItemIdentification(SFTIItemIdentificationType value) {
        this.sellersItemIdentification = value;
    }

    /**
     * Gets the value of the standardItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public SFTIItemIdentificationType getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Sets the value of the standardItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTIItemIdentificationType }
     *     
     */
    public void setStandardItemIdentification(SFTIItemIdentificationType value) {
        this.standardItemIdentification = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SFTITaxCategoryType }
     * 
     * 
     */
    public List<SFTITaxCategoryType> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<SFTITaxCategoryType>();
        }
        return this.taxCategory;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SFTIBasePriceType }
     *     
     */
    public SFTIBasePriceType getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTIBasePriceType }
     *     
     */
    public void setBasePrice(SFTIBasePriceType value) {
        this.basePrice = value;
    }

}