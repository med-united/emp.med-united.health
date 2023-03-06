package health.medunited.emp.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import health.medunited.security.BindingProviderConfigurer;

public class AmtsServicePortProducer {

    @Inject
    TrustManager trustManager;
    
    @Inject
    HostnameVerifier hostnameVerifier;

    @Produces
    public AMTSServicePortType produce() {

        // TODO: Do service discovery
        String endpoint = "http://localhost/amtsservice";
        

        AMTSServicePortType amtsServicePortType = new AMTSService(getClass()
                .getResource("/AMTSService.wsdl"))
                .getAMTSServicePort();
        BindingProvider bp = (BindingProvider) amtsServicePortType;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
        return amtsServicePortType;
    }


}
