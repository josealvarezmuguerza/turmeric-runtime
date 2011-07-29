//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:57 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservedErrorBlockList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReservedErrorBlock" type="{http://www.ebayopensource.org/turmeric/common/config}ReservedErrorBlock" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UsedErrorBlockList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UsedErrorBlock" type="{http://www.ebayopensource.org/turmeric/common/config}UsedErrorBlock" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="organization" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultBlockSize" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservedErrorBlockList",
    "usedErrorBlockList",
    "any"
})
@XmlRootElement(name = "OrganizationErrorBlocks")
public class OrganizationErrorBlocks {

    @XmlElement(name = "ReservedErrorBlockList", required = true)
    protected OrganizationErrorBlocks.ReservedErrorBlockList reservedErrorBlockList;
    @XmlElement(name = "UsedErrorBlockList", required = true)
    protected OrganizationErrorBlocks.UsedErrorBlockList usedErrorBlockList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(required = true)
    protected String organization;
    @XmlAttribute(required = true)
    protected long defaultBlockSize;

    /**
     * Gets the value of the reservedErrorBlockList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationErrorBlocks.ReservedErrorBlockList }
     *     
     */
    public OrganizationErrorBlocks.ReservedErrorBlockList getReservedErrorBlockList() {
        return reservedErrorBlockList;
    }

    /**
     * Sets the value of the reservedErrorBlockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationErrorBlocks.ReservedErrorBlockList }
     *     
     */
    public void setReservedErrorBlockList(OrganizationErrorBlocks.ReservedErrorBlockList value) {
        this.reservedErrorBlockList = value;
    }

    /**
     * Gets the value of the usedErrorBlockList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationErrorBlocks.UsedErrorBlockList }
     *     
     */
    public OrganizationErrorBlocks.UsedErrorBlockList getUsedErrorBlockList() {
        return usedErrorBlockList;
    }

    /**
     * Sets the value of the usedErrorBlockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationErrorBlocks.UsedErrorBlockList }
     *     
     */
    public void setUsedErrorBlockList(OrganizationErrorBlocks.UsedErrorBlockList value) {
        this.usedErrorBlockList = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     * Gets the value of the defaultBlockSize property.
     * 
     */
    public long getDefaultBlockSize() {
        return defaultBlockSize;
    }

    /**
     * Sets the value of the defaultBlockSize property.
     * 
     */
    public void setDefaultBlockSize(long value) {
        this.defaultBlockSize = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ReservedErrorBlock" type="{http://www.ebayopensource.org/turmeric/common/config}ReservedErrorBlock" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reservedErrorBlock"
    })
    public static class ReservedErrorBlockList {

        @XmlElement(name = "ReservedErrorBlock")
        protected List<ReservedErrorBlock> reservedErrorBlock;

        /**
         * Gets the value of the reservedErrorBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservedErrorBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservedErrorBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReservedErrorBlock }
         * 
         * 
         */
        public List<ReservedErrorBlock> getReservedErrorBlock() {
            if (reservedErrorBlock == null) {
                reservedErrorBlock = new ArrayList<ReservedErrorBlock>();
            }
            return this.reservedErrorBlock;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UsedErrorBlock" type="{http://www.ebayopensource.org/turmeric/common/config}UsedErrorBlock" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usedErrorBlock"
    })
    public static class UsedErrorBlockList {

        @XmlElement(name = "UsedErrorBlock")
        protected List<UsedErrorBlock> usedErrorBlock;

        /**
         * Gets the value of the usedErrorBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usedErrorBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsedErrorBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UsedErrorBlock }
         * 
         * 
         */
        public List<UsedErrorBlock> getUsedErrorBlock() {
            if (usedErrorBlock == null) {
                usedErrorBlock = new ArrayList<UsedErrorBlock>();
            }
            return this.usedErrorBlock;
        }

    }

}