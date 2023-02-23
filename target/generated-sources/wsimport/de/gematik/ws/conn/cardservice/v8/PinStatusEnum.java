
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PinStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VERIFIED"/&gt;
 *     &lt;enumeration value="TRANSPORT_PIN"/&gt;
 *     &lt;enumeration value="EMPTY_PIN"/&gt;
 *     &lt;enumeration value="BLOCKED"/&gt;
 *     &lt;enumeration value="VERIFIABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PinStatusEnum")
@XmlEnum
public enum PinStatusEnum {

    VERIFIED,
    TRANSPORT_PIN,
    EMPTY_PIN,
    BLOCKED,
    VERIFIABLE;

    public String value() {
        return name();
    }

    public static PinStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
