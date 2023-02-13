package health.medunited.emp;

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

public class EventServicePort {
    private EventServicePortType eventServicePortType;
    private ContextType context;

    public EventServicePort(String endpoint, ContextType context, TrustManager trustManager, HostnameVerifier hostnameVerifier) {
        this.context = context;
        eventServicePortType = new EventService(getClass()
                .getResource("/EventService.wsdl"))
                .getEventServicePort();
        BindingProvider bp = (BindingProvider) eventServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
    }

    public String getFirstCardHandleOfType(CardTypeType cardType) throws FaultMessage {
        GetCards parameter = new GetCards();
        parameter.setContext(this.context);
        parameter.setCardType(cardType);

        return this.eventServicePortType
                .getCards(parameter)
                .getCards()
                .getCard()
                .get(0)
                .getCardHandle();
     }

}
