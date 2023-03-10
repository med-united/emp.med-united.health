package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import health.medunited.emp.TerminalService;
import health.medunited.security.BindingProviderConfigurer;

public class AmtsServicePortProducer {

    @Inject
    TrustManager trustManager;
    
    @Inject
    HostnameVerifier hostnameVerifier;

    @Inject
    TerminalService terminalService;
    @Inject
    BindingProviderConfigurer bindingProviderConfigurer;

    @Produces
    public AMTSServicePortType produce() {      
        AMTSServicePortType amtsServicePortType = new AMTSService(getClass()
                .getResource("/AMTSService.wsdl"))
                .getAMTSServicePort();
        BindingProvider bp = (BindingProvider) amtsServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, terminalService.amtsServiceEndpoint());
        bindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return amtsServicePortType;
    }


}
