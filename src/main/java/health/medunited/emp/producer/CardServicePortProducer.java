package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.cardservice.wsdl.v8.CardService;
import de.gematik.ws.conn.cardservice.wsdl.v8.CardServicePortType;
import health.medunited.emp.TerminalService;
import health.medunited.security.BindingProviderConfigurer;

public class CardServicePortProducer {

    @Inject
    TrustManager trustManager;
    
    @Inject
    HostnameVerifier hostnameVerifier;

    @Inject
    TerminalService terminalService;
    @Inject
    BindingProviderConfigurer bindingProviderConfigurer;

    @Produces
    public CardServicePortType produce() {

        CardServicePortType cardServicePortType = new CardService(getClass()
                .getResource("/CardService.wsdl"))
                .getCardServicePort();
        BindingProvider bp = (BindingProvider) cardServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, terminalService.cardServiceEndpoint());
        bindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return cardServicePortType;
    }


}
