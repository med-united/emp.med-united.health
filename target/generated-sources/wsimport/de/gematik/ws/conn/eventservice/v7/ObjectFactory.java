
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.eventservice.v7 package. 
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

    private final static QName _SubscriptionID_QNAME = new QName("http://ws.gematik.de/conn/EventService/v7.2", "SubscriptionID");
    private final static QName _Subscription_QNAME = new QName("http://ws.gematik.de/conn/EventService/v7.2", "Subscription");
    private final static QName _TerminationTime_QNAME = new QName("http://ws.gematik.de/conn/EventService/v7.2", "TerminationTime");
    private final static QName _EventTo_QNAME = new QName("http://ws.gematik.de/conn/EventService/v7.2", "EventTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.eventservice.v7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link GetSubscriptionResponse }
     * 
     */
    public GetSubscriptionResponse createGetSubscriptionResponse() {
        return new GetSubscriptionResponse();
    }

    /**
     * Create an instance of {@link RenewSubscriptionsResponse }
     * 
     */
    public RenewSubscriptionsResponse createRenewSubscriptionsResponse() {
        return new RenewSubscriptionsResponse();
    }

    /**
     * Create an instance of {@link Event.Message }
     * 
     */
    public Event.Message createEventMessage() {
        return new Event.Message();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link SubscriptionType }
     * 
     */
    public SubscriptionType createSubscriptionType() {
        return new SubscriptionType();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link SubscriptionRenewal }
     * 
     */
    public SubscriptionRenewal createSubscriptionRenewal() {
        return new SubscriptionRenewal();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link GetSubscription }
     * 
     */
    public GetSubscription createGetSubscription() {
        return new GetSubscription();
    }

    /**
     * Create an instance of {@link GetSubscriptionResponse.Subscriptions }
     * 
     */
    public GetSubscriptionResponse.Subscriptions createGetSubscriptionResponseSubscriptions() {
        return new GetSubscriptionResponse.Subscriptions();
    }

    /**
     * Create an instance of {@link GetResourceInformation }
     * 
     */
    public GetResourceInformation createGetResourceInformation() {
        return new GetResourceInformation();
    }

    /**
     * Create an instance of {@link GetResourceInformationResponse }
     * 
     */
    public GetResourceInformationResponse createGetResourceInformationResponse() {
        return new GetResourceInformationResponse();
    }

    /**
     * Create an instance of {@link GetCards }
     * 
     */
    public GetCards createGetCards() {
        return new GetCards();
    }

    /**
     * Create an instance of {@link GetCardsResponse }
     * 
     */
    public GetCardsResponse createGetCardsResponse() {
        return new GetCardsResponse();
    }

    /**
     * Create an instance of {@link GetCardTerminals }
     * 
     */
    public GetCardTerminals createGetCardTerminals() {
        return new GetCardTerminals();
    }

    /**
     * Create an instance of {@link GetCardTerminalsResponse }
     * 
     */
    public GetCardTerminalsResponse createGetCardTerminalsResponse() {
        return new GetCardTerminalsResponse();
    }

    /**
     * Create an instance of {@link RenewSubscriptions }
     * 
     */
    public RenewSubscriptions createRenewSubscriptions() {
        return new RenewSubscriptions();
    }

    /**
     * Create an instance of {@link RenewSubscriptionsResponse.SubscribeRenewals }
     * 
     */
    public RenewSubscriptionsResponse.SubscribeRenewals createRenewSubscriptionsResponseSubscribeRenewals() {
        return new RenewSubscriptionsResponse.SubscribeRenewals();
    }

    /**
     * Create an instance of {@link Event.Message.Parameter }
     * 
     */
    public Event.Message.Parameter createEventMessageParameter() {
        return new Event.Message.Parameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EventService/v7.2", name = "SubscriptionID")
    public JAXBElement<String> createSubscriptionID(String value) {
        return new JAXBElement<String>(_SubscriptionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EventService/v7.2", name = "Subscription")
    public JAXBElement<SubscriptionType> createSubscription(SubscriptionType value) {
        return new JAXBElement<SubscriptionType>(_Subscription_QNAME, SubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EventService/v7.2", name = "TerminationTime")
    public JAXBElement<XMLGregorianCalendar> createTerminationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminationTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EventService/v7.2", name = "EventTo")
    public JAXBElement<String> createEventTo(String value) {
        return new JAXBElement<String>(_EventTo_QNAME, String.class, null, value);
    }

}
