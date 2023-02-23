
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import de.gematik.ws.conn.cardservicecommon.v2.PinResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.cardservice.v8 package. 
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

    private final static QName _Pin_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "Pin");
    private final static QName _Puk_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "Puk");
    private final static QName _OldPin_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "OldPin");
    private final static QName _NewPin_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "NewPin");
    private final static QName _Kvnr_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "Kvnr");
    private final static QName _CardHolderName_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "CardHolderName");
    private final static QName _CertificateExpirationDate_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "CertificateExpirationDate");
    private final static QName _Card_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "Card");
    private final static QName _VerifyPinResponse_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "VerifyPinResponse");
    private final static QName _ChangePinResponse_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "ChangePinResponse");
    private final static QName _UnblockPinResponse_QNAME = new QName("http://ws.gematik.de/conn/CardService/v8.1", "UnblockPinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.cardservice.v8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardInfoType }
     * 
     */
    public CardInfoType createCardInfoType() {
        return new CardInfoType();
    }

    /**
     * Create an instance of {@link Cards }
     * 
     */
    public Cards createCards() {
        return new Cards();
    }

    /**
     * Create an instance of {@link VerifyPin }
     * 
     */
    public VerifyPin createVerifyPin() {
        return new VerifyPin();
    }

    /**
     * Create an instance of {@link ChangePin }
     * 
     */
    public ChangePin createChangePin() {
        return new ChangePin();
    }

    /**
     * Create an instance of {@link GetPinStatus }
     * 
     */
    public GetPinStatus createGetPinStatus() {
        return new GetPinStatus();
    }

    /**
     * Create an instance of {@link GetPinStatusResponse }
     * 
     */
    public GetPinStatusResponse createGetPinStatusResponse() {
        return new GetPinStatusResponse();
    }

    /**
     * Create an instance of {@link UnblockPin }
     * 
     */
    public UnblockPin createUnblockPin() {
        return new UnblockPin();
    }

    /**
     * Create an instance of {@link AuthorizeSmc }
     * 
     */
    public AuthorizeSmc createAuthorizeSmc() {
        return new AuthorizeSmc();
    }

    /**
     * Create an instance of {@link AuthorizeSmcResponse }
     * 
     */
    public AuthorizeSmcResponse createAuthorizeSmcResponse() {
        return new AuthorizeSmcResponse();
    }

    /**
     * Create an instance of {@link VersionInfoType }
     * 
     */
    public VersionInfoType createVersionInfoType() {
        return new VersionInfoType();
    }

    /**
     * Create an instance of {@link CardInfoErrType }
     * 
     */
    public CardInfoErrType createCardInfoErrType() {
        return new CardInfoErrType();
    }

    /**
     * Create an instance of {@link CardInfoType.CardVersion }
     * 
     */
    public CardInfoType.CardVersion createCardInfoTypeCardVersion() {
        return new CardInfoType.CardVersion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "Pin")
    public JAXBElement<String> createPin(String value) {
        return new JAXBElement<String>(_Pin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "Puk")
    public JAXBElement<String> createPuk(String value) {
        return new JAXBElement<String>(_Puk_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "OldPin")
    public JAXBElement<String> createOldPin(String value) {
        return new JAXBElement<String>(_OldPin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "NewPin")
    public JAXBElement<String> createNewPin(String value) {
        return new JAXBElement<String>(_NewPin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "Kvnr")
    public JAXBElement<String> createKvnr(String value) {
        return new JAXBElement<String>(_Kvnr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "CardHolderName")
    public JAXBElement<String> createCardHolderName(String value) {
        return new JAXBElement<String>(_CardHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "CertificateExpirationDate")
    public JAXBElement<XMLGregorianCalendar> createCertificateExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateExpirationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "Card")
    public JAXBElement<CardInfoType> createCard(CardInfoType value) {
        return new JAXBElement<CardInfoType>(_Card_QNAME, CardInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "VerifyPinResponse")
    public JAXBElement<PinResponseType> createVerifyPinResponse(PinResponseType value) {
        return new JAXBElement<PinResponseType>(_VerifyPinResponse_QNAME, PinResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "ChangePinResponse")
    public JAXBElement<PinResponseType> createChangePinResponse(PinResponseType value) {
        return new JAXBElement<PinResponseType>(_ChangePinResponse_QNAME, PinResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardService/v8.1", name = "UnblockPinResponse")
    public JAXBElement<PinResponseType> createUnblockPinResponse(PinResponseType value) {
        return new JAXBElement<PinResponseType>(_UnblockPinResponse_QNAME, PinResponseType.class, null, value);
    }

}
