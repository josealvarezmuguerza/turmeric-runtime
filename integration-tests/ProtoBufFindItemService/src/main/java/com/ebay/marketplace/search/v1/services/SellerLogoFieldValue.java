//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 12:06:52 PM GMT+05:30 
//


package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This type contains aggregated information about
 * 						seller logo.
 * 					
 * 
 * <p>Java class for SellerLogoFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerLogoFieldValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}FieldValueBase">
 *       &lt;sequence>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerLogoFieldValue", propOrder = {
    "imageUrl",
    "imageType"
})
public class SellerLogoFieldValue
    extends FieldValueBase
{

    @XmlElement(required = true)
    protected String imageUrl;
    protected int imageType;

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     */
    public int getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     */
    public void setImageType(int value) {
        this.imageType = value;
    }

}
