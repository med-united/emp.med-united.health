
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Operation"/&gt;
 *     &lt;enumeration value="Security"/&gt;
 *     &lt;enumeration value="Infrastructure"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    @XmlEnumValue("Operation")
    OPERATION("Operation"),
    @XmlEnumValue("Security")
    SECURITY("Security"),
    @XmlEnumValue("Infrastructure")
    INFRASTRUCTURE("Infrastructure"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
