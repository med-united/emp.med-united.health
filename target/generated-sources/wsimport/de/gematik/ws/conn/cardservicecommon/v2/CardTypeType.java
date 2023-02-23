
package de.gematik.ws.conn.cardservicecommon.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="64"/&gt;
 *     &lt;enumeration value="EGK"/&gt;
 *     &lt;enumeration value="HBA-qSig"/&gt;
 *     &lt;enumeration value="HBA"/&gt;
 *     &lt;enumeration value="SMC-B"/&gt;
 *     &lt;enumeration value="HSM-B"/&gt;
 *     &lt;enumeration value="SMC-KT"/&gt;
 *     &lt;enumeration value="KVK"/&gt;
 *     &lt;enumeration value="ZOD_2.0"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="HBAx"/&gt;
 *     &lt;enumeration value="SM-B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardTypeType")
@XmlEnum
public enum CardTypeType {

    EGK("EGK"),
    @XmlEnumValue("HBA-qSig")
    HBA_Q_SIG("HBA-qSig"),
    HBA("HBA"),
    @XmlEnumValue("SMC-B")
    SMC_B("SMC-B"),
    @XmlEnumValue("HSM-B")
    HSM_B("HSM-B"),
    @XmlEnumValue("SMC-KT")
    SMC_KT("SMC-KT"),
    KVK("KVK"),
    @XmlEnumValue("ZOD_2.0")
    ZOD_2_0("ZOD_2.0"),
    UNKNOWN("UNKNOWN"),
    @XmlEnumValue("HBAx")
    HB_AX("HBAx"),
    @XmlEnumValue("SM-B")
    SM_B("SM-B");
    private final String value;

    CardTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardTypeType fromValue(String v) {
        for (CardTypeType c: CardTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
