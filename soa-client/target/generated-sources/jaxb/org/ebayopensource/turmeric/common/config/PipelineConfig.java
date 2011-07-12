//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.29 at 01:13:31 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PipelineConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PipelineConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request-pipeline" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineClassConfig" minOccurs="0"/>
 *         &lt;element name="response-pipeline" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineClassConfig" minOccurs="0"/>
 *         &lt;element name="request-dispatcher" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineClassConfig" minOccurs="0"/>
 *         &lt;element name="response-dispatcher" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineClassConfig" minOccurs="0"/>
 *         &lt;element name="request-handlers" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineTreeConfig" minOccurs="0"/>
 *         &lt;element name="response-handlers" type="{http://www.ebayopensource.org/turmeric/common/config}PipelineTreeConfig" minOccurs="0"/>
 *         &lt;element name="logging-handler" type="{http://www.ebayopensource.org/turmeric/common/config}FrameworkHandlerConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PipelineConfig", propOrder = {
    "requestPipeline",
    "responsePipeline",
    "requestDispatcher",
    "responseDispatcher",
    "requestHandlers",
    "responseHandlers",
    "loggingHandler"
})
public class PipelineConfig {

    @XmlElement(name = "request-pipeline")
    protected PipelineClassConfig requestPipeline;
    @XmlElement(name = "response-pipeline")
    protected PipelineClassConfig responsePipeline;
    @XmlElement(name = "request-dispatcher")
    protected PipelineClassConfig requestDispatcher;
    @XmlElement(name = "response-dispatcher")
    protected PipelineClassConfig responseDispatcher;
    @XmlElement(name = "request-handlers")
    protected PipelineTreeConfig requestHandlers;
    @XmlElement(name = "response-handlers")
    protected PipelineTreeConfig responseHandlers;
    @XmlElement(name = "logging-handler")
    protected List<FrameworkHandlerConfig> loggingHandler;

    /**
     * Gets the value of the requestPipeline property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineClassConfig }
     *     
     */
    public PipelineClassConfig getRequestPipeline() {
        return requestPipeline;
    }

    /**
     * Sets the value of the requestPipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineClassConfig }
     *     
     */
    public void setRequestPipeline(PipelineClassConfig value) {
        this.requestPipeline = value;
    }

    /**
     * Gets the value of the responsePipeline property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineClassConfig }
     *     
     */
    public PipelineClassConfig getResponsePipeline() {
        return responsePipeline;
    }

    /**
     * Sets the value of the responsePipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineClassConfig }
     *     
     */
    public void setResponsePipeline(PipelineClassConfig value) {
        this.responsePipeline = value;
    }

    /**
     * Gets the value of the requestDispatcher property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineClassConfig }
     *     
     */
    public PipelineClassConfig getRequestDispatcher() {
        return requestDispatcher;
    }

    /**
     * Sets the value of the requestDispatcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineClassConfig }
     *     
     */
    public void setRequestDispatcher(PipelineClassConfig value) {
        this.requestDispatcher = value;
    }

    /**
     * Gets the value of the responseDispatcher property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineClassConfig }
     *     
     */
    public PipelineClassConfig getResponseDispatcher() {
        return responseDispatcher;
    }

    /**
     * Sets the value of the responseDispatcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineClassConfig }
     *     
     */
    public void setResponseDispatcher(PipelineClassConfig value) {
        this.responseDispatcher = value;
    }

    /**
     * Gets the value of the requestHandlers property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineTreeConfig }
     *     
     */
    public PipelineTreeConfig getRequestHandlers() {
        return requestHandlers;
    }

    /**
     * Sets the value of the requestHandlers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineTreeConfig }
     *     
     */
    public void setRequestHandlers(PipelineTreeConfig value) {
        this.requestHandlers = value;
    }

    /**
     * Gets the value of the responseHandlers property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineTreeConfig }
     *     
     */
    public PipelineTreeConfig getResponseHandlers() {
        return responseHandlers;
    }

    /**
     * Sets the value of the responseHandlers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineTreeConfig }
     *     
     */
    public void setResponseHandlers(PipelineTreeConfig value) {
        this.responseHandlers = value;
    }

    /**
     * Gets the value of the loggingHandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loggingHandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoggingHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrameworkHandlerConfig }
     * 
     * 
     */
    public List<FrameworkHandlerConfig> getLoggingHandler() {
        if (loggingHandler == null) {
            loggingHandler = new ArrayList<FrameworkHandlerConfig>();
        }
        return this.loggingHandler;
    }

}
