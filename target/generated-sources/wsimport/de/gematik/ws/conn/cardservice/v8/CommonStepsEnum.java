
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonStepsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonStepsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CheckCardHandle"/&gt;
 *     &lt;enumeration value="VerifyPin"/&gt;
 *     &lt;enumeration value="VerifyEhcPin"/&gt;
 *     &lt;enumeration value="VerifyHpcPin"/&gt;
 *     &lt;enumeration value="VerifySmcPin"/&gt;
 *     &lt;enumeration value="WriteToEhc"/&gt;
 *     &lt;enumeration value="ReadFromEhc"/&gt;
 *     &lt;enumeration value="Logging"/&gt;
 *     &lt;enumeration value="CheckEhcBlocking"/&gt;
 *     &lt;enumeration value="FullfillAccessConditions"/&gt;
 *     &lt;enumeration value="CardToCard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommonStepsEnum")
@XmlEnum
public enum CommonStepsEnum {

    @XmlEnumValue("CheckCardHandle")
    CHECK_CARD_HANDLE("CheckCardHandle"),
    @XmlEnumValue("VerifyPin")
    VERIFY_PIN("VerifyPin"),
    @XmlEnumValue("VerifyEhcPin")
    VERIFY_EHC_PIN("VerifyEhcPin"),
    @XmlEnumValue("VerifyHpcPin")
    VERIFY_HPC_PIN("VerifyHpcPin"),
    @XmlEnumValue("VerifySmcPin")
    VERIFY_SMC_PIN("VerifySmcPin"),
    @XmlEnumValue("WriteToEhc")
    WRITE_TO_EHC("WriteToEhc"),
    @XmlEnumValue("ReadFromEhc")
    READ_FROM_EHC("ReadFromEhc"),
    @XmlEnumValue("Logging")
    LOGGING("Logging"),
    @XmlEnumValue("CheckEhcBlocking")
    CHECK_EHC_BLOCKING("CheckEhcBlocking"),
    @XmlEnumValue("FullfillAccessConditions")
    FULLFILL_ACCESS_CONDITIONS("FullfillAccessConditions"),
    @XmlEnumValue("CardToCard")
    CARD_TO_CARD("CardToCard");
    private final String value;

    CommonStepsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonStepsEnum fromValue(String v) {
        for (CommonStepsEnum c: CommonStepsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
