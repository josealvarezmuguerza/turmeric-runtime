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
 * <p>Java class for ServiceCodeGenDefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCodeGenDefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service-info" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}ServiceType"/>
 *         &lt;element name="interface-info" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}InterfaceType"/>
 *         &lt;element name="config-info" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}ConfigType" minOccurs="0"/>
 *         &lt;element name="security-policy-info" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}SecurityConfigType" minOccurs="0"/>
 *         &lt;element name="tool-input-info" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}ToolInputType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCodeGenDefType", propOrder = {
    "serviceInfo",
    "interfaceInfo",
    "configInfo",
    "securityPolicyInfo",
    "toolInputInfo"
})
public class ServiceCodeGenDefType {

    @XmlElement(name = "service-info", required = true)
    protected ServiceType serviceInfo;
    @XmlElement(name = "interface-info", required = true)
    protected InterfaceType interfaceInfo;
    @XmlElement(name = "config-info")
    protected ConfigType configInfo;
    @XmlElement(name = "security-policy-info")
    protected SecurityConfigType securityPolicyInfo;
    @XmlElement(name = "tool-input-info", required = true)
    protected ToolInputType toolInputInfo;

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceInfo(ServiceType value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the interfaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceType }
     *     
     */
    public InterfaceType getInterfaceInfo() {
        return interfaceInfo;
    }

    /**
     * Sets the value of the interfaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceType }
     *     
     */
    public void setInterfaceInfo(InterfaceType value) {
        this.interfaceInfo = value;
    }

    /**
     * Gets the value of the configInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigType }
     *     
     */
    public ConfigType getConfigInfo() {
        return configInfo;
    }

    /**
     * Sets the value of the configInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigType }
     *     
     */
    public void setConfigInfo(ConfigType value) {
        this.configInfo = value;
    }

    /**
     * Gets the value of the securityPolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityConfigType }
     *     
     */
    public SecurityConfigType getSecurityPolicyInfo() {
        return securityPolicyInfo;
    }

    /**
     * Sets the value of the securityPolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityConfigType }
     *     
     */
    public void setSecurityPolicyInfo(SecurityConfigType value) {
        this.securityPolicyInfo = value;
    }

    /**
     * Gets the value of the toolInputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ToolInputType }
     *     
     */
    public ToolInputType getToolInputInfo() {
        return toolInputInfo;
    }

    /**
     * Sets the value of the toolInputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolInputType }
     *     
     */
    public void setToolInputInfo(ToolInputType value) {
        this.toolInputInfo = value;
    }

}
