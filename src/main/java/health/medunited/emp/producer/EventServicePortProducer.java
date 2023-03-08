package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.v7.GetCards;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventService;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventServicePortType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.security.BindingProviderConfigurer;

public class EventServicePortProducer {
    
    @Inject
    TrustManager trustManager;
    @Inject
    HostnameVerifier hostnameVerifier;
    
    @Produces
    public EventServicePortType produce() {
        String endpoint = "http://localhost/eventservice"; 
        EventServicePortType eventServicePortType = new EventService(getClass()
                .getResource("/EventService.wsdl"))
                .getEventServicePort();
        BindingProvider bp = (BindingProvider) eventServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return eventServicePortType;
    }

    public static String getFirstCardHandleOfType(ContextType contextType, EventServicePortType eventServicePortType, CardTypeType cardType) throws FaultMessage {
        GetCards parameter = new GetCards();
        parameter.setContext(contextType);
        parameter.setCardType(cardType);
        try{
            return eventServicePortType
            .getCards(parameter)
            .getCards()
            .getCard()
            .get(0)
            .getCardHandle();
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(String.format("There is no card of type %s in the reader!", cardType.name()), e);
        }

     }

}
