//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 12:06:52 PM GMT+05:30 
//


package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestMatchSortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestMatchSortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="baseImageSimilaritySortType" type="{http://www.ebay.com/marketplace/search/v1/services}BaseImageSimilaritySortType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestMatchSortType", propOrder = {
    "baseImageSimilaritySortType"
})
public class BestMatchSortType {

    protected BaseImageSimilaritySortType baseImageSimilaritySortType;

    /**
     * Gets the value of the baseImageSimilaritySortType property.
     * 
     * @return
     *     possible object is
     *     {@link BaseImageSimilaritySortType }
     *     
     */
    public BaseImageSimilaritySortType getBaseImageSimilaritySortType() {
        return baseImageSimilaritySortType;
    }

    /**
     * Sets the value of the baseImageSimilaritySortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseImageSimilaritySortType }
     *     
     */
    public void setBaseImageSimilaritySortType(BaseImageSimilaritySortType value) {
        this.baseImageSimilaritySortType = value;
    }

}