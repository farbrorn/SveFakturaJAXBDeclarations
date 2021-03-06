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
import oasis.names.tc.ubl.commonbasiccomponents._1._0.AmountType;
import oasis.names.tc.ubl.commonbasiccomponents._1._0.TaxAmountType;


/**
 * <p>Java class for SFTITaxSubTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SFTITaxSubTotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}TaxableAmount"/>
 *         &lt;element ref="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}TaxAmount"/>
 *         &lt;element ref="{urn:sfti:CommonAggregateComponents:1:0}TaxCategory"/>
 *         &lt;element name="TaxCurrencyTaxAmount" type="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}TaxAmountType" minOccurs="0"/>
 *         &lt;element name="InitialInvoiceTaxAmount" type="{urn:oasis:names:tc:ubl:CommonBasicComponents:1:0}TaxAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SFTITaxSubTotalType", propOrder = {
    "taxableAmount",
    "taxAmount",
    "taxCategory",
    "taxCurrencyTaxAmount",
    "initialInvoiceTaxAmount"
})
public class SFTITaxSubTotalType {

    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0", required = true)
    protected AmountType taxableAmount;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:tc:ubl:CommonBasicComponents:1:0", required = true)
    protected TaxAmountType taxAmount;
    @XmlElement(name = "TaxCategory", required = true)
    protected SFTITaxCategoryType taxCategory;
    @XmlElement(name = "TaxCurrencyTaxAmount")
    protected TaxAmountType taxCurrencyTaxAmount;
    @XmlElement(name = "InitialInvoiceTaxAmount")
    protected TaxAmountType initialInvoiceTaxAmount;

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxableAmount(AmountType value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SFTITaxCategoryType }
     *     
     */
    public SFTITaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFTITaxCategoryType }
     *     
     */
    public void setTaxCategory(SFTITaxCategoryType value) {
        this.taxCategory = value;
    }

    /**
     * Gets the value of the taxCurrencyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxCurrencyTaxAmount() {
        return taxCurrencyTaxAmount;
    }

    /**
     * Sets the value of the taxCurrencyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxCurrencyTaxAmount(TaxAmountType value) {
        this.taxCurrencyTaxAmount = value;
    }

    /**
     * Gets the value of the initialInvoiceTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getInitialInvoiceTaxAmount() {
        return initialInvoiceTaxAmount;
    }

    /**
     * Sets the value of the initialInvoiceTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setInitialInvoiceTaxAmount(TaxAmountType value) {
        this.initialInvoiceTaxAmount = value;
    }

}
