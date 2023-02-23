
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestCardResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestCardResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="ALREADY_INSERTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestCardResultEnum")
@XmlEnum
public enum RequestCardResultEnum {

    ERROR,
    OK,
    ALREADY_INSERTED;

    public String value() {
        return name();
    }

    public static RequestCardResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
