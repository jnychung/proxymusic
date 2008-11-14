//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.14 at 10:52:55 PM CET 
//


package proxymusic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for beam-value.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="beam-value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="begin"/>
 *     &lt;enumeration value="continue"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="forward hook"/>
 *     &lt;enumeration value="backward hook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum BeamValue {

    @XmlEnumValue("begin")
    BEGIN("begin"),
    @XmlEnumValue("continue")
    CONTINUE("continue"),
    @XmlEnumValue("end")
    END("end"),
    @XmlEnumValue("forward hook")
    FORWARD_HOOK("forward hook"),
    @XmlEnumValue("backward hook")
    BACKWARD_HOOK("backward hook");
    private final java.lang.String value;

    BeamValue(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BeamValue fromValue(java.lang.String v) {
        for (BeamValue c: BeamValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}