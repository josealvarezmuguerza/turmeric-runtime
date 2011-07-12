//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:54 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitorLevelConfig.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonitorLevelConfig">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fine"/>
 *     &lt;enumeration value="Finest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonitorLevelConfig")
@XmlEnum
public enum MonitorLevelConfig {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fine")
    FINE("Fine"),
    @XmlEnumValue("Finest")
    FINEST("Finest");
    private final String value;

    MonitorLevelConfig(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitorLevelConfig fromValue(String v) {
        for (MonitorLevelConfig c: MonitorLevelConfig.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
