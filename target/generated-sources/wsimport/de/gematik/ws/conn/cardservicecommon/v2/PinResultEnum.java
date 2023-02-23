
package de.gematik.ws.conn.cardservicecommon.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PinResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="WASBLOCKED"/&gt;
 *     &lt;enumeration value="NOWBLOCKED"/&gt;
 *     &lt;enumeration value="TRANSPORT_PIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PinResultEnum")
@XmlEnum
public enum PinResultEnum {

    ERROR,
    OK,
    REJECTED,
    WASBLOCKED,
    NOWBLOCKED,
    TRANSPORT_PIN;

    public String value() {
        return name();
    }

    public static PinResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
