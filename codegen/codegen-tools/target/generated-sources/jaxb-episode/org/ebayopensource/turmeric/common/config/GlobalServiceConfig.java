//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:54 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalServiceConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalServiceConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitor-config" type="{http://www.ebayopensource.org/turmeric/common/config}MonitorConfig" minOccurs="0"/>
 *         &lt;element name="service-config-groups" type="{http://www.ebayopensource.org/turmeric/common/config}ServiceConfigGroups" minOccurs="0"/>
 *         &lt;element name="service-layer-config" type="{http://www.ebayopensource.org/turmeric/common/config}ServiceLayerNames" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalServiceConfig", propOrder = {
    "monitorConfig",
    "serviceConfigGroups",
    "serviceLayerConfig"
})
public class GlobalServiceConfig {

    @XmlElement(name = "monitor-config")
    protected MonitorConfig monitorConfig;
    @XmlElement(name = "service-config-groups")
    protected ServiceConfigGroups serviceConfigGroups;
    @XmlElement(name = "service-layer-config")
    protected ServiceLayerNames serviceLayerConfig;

    /**
     * Gets the value of the monitorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorConfig }
     *     
     */
    public MonitorConfig getMonitorConfig() {
        return monitorConfig;
    }

    /**
     * Sets the value of the monitorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorConfig }
     *     
     */
    public void setMonitorConfig(MonitorConfig value) {
        this.monitorConfig = value;
    }

    /**
     * Gets the value of the serviceConfigGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfigGroups }
     *     
     */
    public ServiceConfigGroups getServiceConfigGroups() {
        return serviceConfigGroups;
    }

    /**
     * Sets the value of the serviceConfigGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfigGroups }
     *     
     */
    public void setServiceConfigGroups(ServiceConfigGroups value) {
        this.serviceConfigGroups = value;
    }

    /**
     * Gets the value of the serviceLayerConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLayerNames }
     *     
     */
    public ServiceLayerNames getServiceLayerConfig() {
        return serviceLayerConfig;
    }

    /**
     * Sets the value of the serviceLayerConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLayerNames }
     *     
     */
    public void setServiceLayerConfig(ServiceLayerNames value) {
        this.serviceLayerConfig = value;
    }

}
