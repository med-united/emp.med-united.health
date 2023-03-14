package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.eventservice.wsdl.v7.EventService;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventServicePortType;
import health.medunited.emp.TerminalService;
import health.medunited.security.BindingProviderConfigurer;

public class EventServicePortProducer {
    
    @Inject
    TrustManager trustManager;
    @Inject
    HostnameVerifier hostnameVerifier;
    @Inject
    TerminalService terminalService;
    @Inject
    BindingProviderConfigurer bindingProviderConfigurer;
    
    @Produces
    public EventServicePortType produce() {
        EventServicePortType eventServicePortType = new EventService(getClass()
                .getResource("/EventService.wsdl"))
                .getEventServicePort();
        BindingProvider bp = (BindingProvider) eventServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, terminalService.eventServiceEndpoint());
        bindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return eventServicePortType;
    }

}
