package health.medunited.emp;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.v7.GetCards;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventService;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventServicePortType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;

public class EventServicePort {
    private EventServicePortType eventServicePort;
    private ContextType context;

    public EventServicePort(String endpoint, ContextType context) {
        this.context = context;
        eventServicePort = new EventService(getClass()
                .getResource("/EventService.wsdl"))
                .getEventServicePort();
        BindingProvider bp = (BindingProvider) eventServicePort;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        configureBindingProvider(bp);
    }

    private void configureBindingProvider(BindingProvider bindingProvider) {
        SSLContext sslContext;
        try {
            sslContext = SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Unable to load SSLcontext TLS", e);
        }

        if (sslContext != null) {
            try {
                sslContext.init(null, new TrustManager[] { new FakeX509TrustManager() }, null);
            } catch (KeyManagementException e) {
                throw new IllegalStateException("Unable to configure TrustManager", e);
            }
            bindingProvider.getRequestContext()
                    .put("com.sun.xml.ws.transport.https.client.SSLSocketFactory",
                            sslContext.getSocketFactory());
        }
        bindingProvider.getRequestContext()
                .put("com.sun.xml.ws.transport.https.client.hostname.verifier",
                        new FakeHostnameVerifier());
    }

    public String getFirstCardHandleOfType(CardTypeType type) throws FaultMessage {
        GetCards parameter = new GetCards();
        parameter.setContext(context);
        parameter.setCardType(type);

        return this.eventServicePort
                .getCards(parameter)
                .getCards()
                .getCard()
                .get(0)
                .getCardHandle();
     }

}
