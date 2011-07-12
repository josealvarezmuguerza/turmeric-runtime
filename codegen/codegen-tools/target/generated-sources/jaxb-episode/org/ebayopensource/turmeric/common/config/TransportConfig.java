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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TransportConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="class-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="default-options" type="{http://www.ebayopensource.org/turmeric/common/config}TransportOptionConfig" minOccurs="0"/>
 *         &lt;element name="header-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
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
@XmlType(name = "TransportConfig", propOrder = {
    "className",
    "defaultOptions",
    "headerOptions"
})
public class TransportConfig {

    @XmlElement(name = "class-name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String className;
    @XmlElement(name = "default-options")
    protected TransportOptionConfig defaultOptions;
    @XmlElement(name = "header-options")
    protected OptionList headerOptions;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the defaultOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TransportOptionConfig }
     *     
     */
    public TransportOptionConfig getDefaultOptions() {
        return defaultOptions;
    }

    /**
     * Sets the value of the defaultOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOptionConfig }
     *     
     */
    public void setDefaultOptions(TransportOptionConfig value) {
        this.defaultOptions = value;
    }

    /**
     * Gets the value of the headerOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getHeaderOptions() {
        return headerOptions;
    }

    /**
     * Sets the value of the headerOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setHeaderOptions(OptionList value) {
        this.headerOptions = value;
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
