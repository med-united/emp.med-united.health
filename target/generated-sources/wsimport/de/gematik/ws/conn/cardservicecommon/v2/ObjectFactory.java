
package de.gematik.ws.conn.cardservicecommon.v2;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.cardservicecommon.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PinTyp_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "PinTyp");
    private final static QName _CardType_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "CardType");
    private final static QName _CtId_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "CtId");
    private final static QName _SlotId_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "SlotId");
    private final static QName _Iccsn_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "Iccsn");
    private final static QName _PinResult_QNAME = new QName("http://ws.gematik.de/conn/CardServiceCommon/v2.0", "PinResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.cardservicecommon.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PinResponseType }
     * 
     */
    public PinResponseType createPinResponseType() {
        return new PinResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "PinTyp")
    public JAXBElement<String> createPinTyp(String value) {
        return new JAXBElement<String>(_PinTyp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "CardType")
    public JAXBElement<CardTypeType> createCardType(CardTypeType value) {
        return new JAXBElement<CardTypeType>(_CardType_QNAME, CardTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "CtId")
    public JAXBElement<String> createCtId(String value) {
        return new JAXBElement<String>(_CtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "SlotId")
    public JAXBElement<BigInteger> createSlotId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SlotId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "Iccsn")
    public JAXBElement<String> createIccsn(String value) {
        return new JAXBElement<String>(_Iccsn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinResultEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinResultEnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", name = "PinResult")
    public JAXBElement<PinResultEnum> createPinResult(PinResultEnum value) {
        return new JAXBElement<PinResultEnum>(_PinResult_QNAME, PinResultEnum.class, null, value);
    }

}
