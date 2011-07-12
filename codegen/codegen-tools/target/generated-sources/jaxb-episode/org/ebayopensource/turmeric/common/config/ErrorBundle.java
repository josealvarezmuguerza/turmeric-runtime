//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:57 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorBundle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorlist" type="{http://www.ebayopensource.org/turmeric/common/config}ErrorList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="libraryVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="organization" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="packageName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorLibraryName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorBundle", propOrder = {
    "errorlist"
})
public class ErrorBundle {

    @XmlElement(required = true)
    protected ErrorList errorlist;
    @XmlAttribute(required = true)
    protected String libraryVersion;
    @XmlAttribute(required = true)
    protected String organization;
    @XmlAttribute
    protected String domain;
    @XmlAttribute(required = true)
    protected String packageName;
    @XmlAttribute(required = true)
    protected String errorLibraryName;

    /**
     * Gets the value of the errorlist property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrorlist() {
        return errorlist;
    }

    /**
     * Sets the value of the errorlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrorlist(ErrorList value) {
        this.errorlist = value;
    }

    /**
     * Gets the value of the libraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryVersion() {
        return libraryVersion;
    }

    /**
     * Sets the value of the libraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryVersion(String value) {
        this.libraryVersion = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
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
     * Gets the value of the errorLibraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLibraryName() {
        return errorLibraryName;
    }

    /**
     * Sets the value of the errorLibraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLibraryName(String value) {
        this.errorLibraryName = value;
    }

}
