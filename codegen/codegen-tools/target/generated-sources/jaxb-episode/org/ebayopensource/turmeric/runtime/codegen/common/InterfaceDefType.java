//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:56 AM GMT-08:00 
//


package org.ebayopensource.turmeric.runtime.codegen.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type definition to  indicate Legal Service Interface Definition
 * 
 * <p>Java class for InterfaceDefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceDefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interface-name" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}JavaIdentifierType"/>
 *         &lt;element name="package-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="method-def-list" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}MethodDefListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceDefType", propOrder = {
    "interfaceName",
    "packageName",
    "methodDefList"
})
public class InterfaceDefType {

    @XmlElement(name = "interface-name", required = true)
    protected String interfaceName;
    @XmlElement(name = "package-name", required = true)
    protected String packageName;
    @XmlElement(name = "method-def-list")
    protected MethodDefListType methodDefList;

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the methodDefList property.
     * 
     * @return
     *     possible object is
     *     {@link MethodDefListType }
     *     
     */
    public MethodDefListType getMethodDefList() {
        return methodDefList;
    }

    /**
     * Sets the value of the methodDefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodDefListType }
     *     
     */
    public void setMethodDefList(MethodDefListType value) {
        this.methodDefList = value;
    }

}
