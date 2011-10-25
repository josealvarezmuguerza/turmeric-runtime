//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 12:06:52 PM GMT+05:30 
//


package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Base type of image similarity sort type
 * 					
 * 
 * <p>Java class for BaseImageSimilaritySortTypeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseImageSimilaritySortTypeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BestMatchSortTypeBase">
 *       &lt;sequence>
 *         &lt;element name="colorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edgeVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="textureVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colorDimensionWeight" type="{http://www.ebay.com/marketplace/search/v1/services}ColorDimensionWeight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseImageSimilaritySortTypeBase", propOrder = {
    "colorVersion",
    "edgeVersion",
    "textureVersion",
    "colorDimensionWeight"
})
@XmlSeeAlso({
    ImageSimilaritySortTypeByItem.class,
    ImageSimilaritySortTypeBySignature.class
})
public abstract class BaseImageSimilaritySortTypeBase
    extends BestMatchSortTypeBase
{

    protected int colorVersion;
    protected int edgeVersion;
    protected int textureVersion;
    protected ColorDimensionWeight colorDimensionWeight;

    /**
     * Gets the value of the colorVersion property.
     * 
     */
    public int getColorVersion() {
        return colorVersion;
    }

    /**
     * Sets the value of the colorVersion property.
     * 
     */
    public void setColorVersion(int value) {
        this.colorVersion = value;
    }

    /**
     * Gets the value of the edgeVersion property.
     * 
     */
    public int getEdgeVersion() {
        return edgeVersion;
    }

    /**
     * Sets the value of the edgeVersion property.
     * 
     */
    public void setEdgeVersion(int value) {
        this.edgeVersion = value;
    }

    /**
     * Gets the value of the textureVersion property.
     * 
     */
    public int getTextureVersion() {
        return textureVersion;
    }

    /**
     * Sets the value of the textureVersion property.
     * 
     */
    public void setTextureVersion(int value) {
        this.textureVersion = value;
    }

    /**
     * Gets the value of the colorDimensionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ColorDimensionWeight }
     *     
     */
    public ColorDimensionWeight getColorDimensionWeight() {
        return colorDimensionWeight;
    }

    /**
     * Sets the value of the colorDimensionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorDimensionWeight }
     *     
     */
    public void setColorDimensionWeight(ColorDimensionWeight value) {
        this.colorDimensionWeight = value;
    }

}