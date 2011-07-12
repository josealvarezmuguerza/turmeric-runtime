//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:54 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredTransportConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferredTransportConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="override-options" type="{http://www.ebayopensource.org/turmeric/common/config}TransportOptionConfig" minOccurs="0"/>
 *         &lt;element name="override-header-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferredTransportConfig", propOrder = {
    "overrideOptions",
    "overrideHeaderOptions"
})
public class PreferredTransportConfig {

    @XmlElement(name = "override-options")
    protected TransportOptionConfig overrideOptions;
    @XmlElement(name = "override-header-options")
    protected OptionList overrideHeaderOptions;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the overrideOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TransportOptionConfig }
     *     
     */
    public TransportOptionConfig getOverrideOptions() {
        return overrideOptions;
    }

    /**
     * Sets the value of the overrideOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOptionConfig }
     *     
     */
    public void setOverrideOptions(TransportOptionConfig value) {
        this.overrideOptions = value;
    }

    /**
     * Gets the value of the overrideHeaderOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getOverrideHeaderOptions() {
        return overrideHeaderOptions;
    }

    /**
     * Sets the value of the overrideHeaderOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setOverrideHeaderOptions(OptionList value) {
        this.overrideHeaderOptions = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
