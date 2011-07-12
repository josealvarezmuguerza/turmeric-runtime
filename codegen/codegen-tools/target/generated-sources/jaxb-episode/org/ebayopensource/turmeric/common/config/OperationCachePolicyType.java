//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.29 at 01:13:31 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationCachePolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationCachePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TTL" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="keyExpressionSet" type="{http://www.ebayopensource.org/turmeric/common/config}KeyExpressionSetType"/>
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
@XmlType(name = "OperationCachePolicyType", propOrder = {
    "ttl",
    "keyExpressionSet"
})
public class OperationCachePolicyType {

    @XmlElement(name = "TTL")
    protected long ttl;
    @XmlElement(required = true)
    protected KeyExpressionSetType keyExpressionSet;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the ttl property.
     * 
     */
    public long getTTL() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTTL(long value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the keyExpressionSet property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExpressionSetType }
     *     
     */
    public KeyExpressionSetType getKeyExpressionSet() {
        return keyExpressionSet;
    }

    /**
     * Sets the value of the keyExpressionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExpressionSetType }
     *     
     */
    public void setKeyExpressionSet(KeyExpressionSetType value) {
        this.keyExpressionSet = value;
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
