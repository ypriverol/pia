//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.25 at 05:55:05 PM CEST 
//


package de.mpc.pia.tools.openms.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType NAME="MassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="average"/>
 *     &lt;enumeration value="monoisotopic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassType")
@XmlEnum
public enum MassType {

    @XmlEnumValue("average")
    AVERAGE("average"),
    @XmlEnumValue("monoisotopic")
    MONOISOTOPIC("monoisotopic");
    private final String value;

    MassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassType fromValue(String v) {
        for (MassType c: MassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
