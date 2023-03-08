package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.cardservice.wsdl.v8.CardService;
import de.gematik.ws.conn.cardservice.wsdl.v8.CardServicePortType;
import health.medunited.security.BindingProviderConfigurer;

public class CardServicePortProducer {

    @Inject
    TrustManager trustManager;
    
    @Inject
    HostnameVerifier hostnameVerifier;

    @Produces
    public CardServicePortType produce() {

        // TODO: Do service discovery
        String endpoint = "http://localhost/cardservice"; //"https://172.18.70.242:443/ws/CardService";
        
        CardServicePortType cardServicePortType = new CardService(getClass()
                .getResource("/CardService.wsdl"))
                .getCardServicePort();
        BindingProvider bp = (BindingProvider) cardServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return cardServicePortType;
    }


}
