package health.medunited.emp;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import health.medunited.security.BindingProviderConfigurer;

public class AmtsServicePort {
    private AMTSServicePortType amtsServicePort;

    public AmtsServicePort(String endpoint, TrustManager trustManager, HostnameVerifier hostnameVerifier) {
        amtsServicePort = new AMTSService(getClass()
                .getResource("/AMTSService.wsdl"))
                .getAMTSServicePort();
        BindingProvider bp = (BindingProvider) amtsServicePort;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp, trustManager, hostnameVerifier);
    }

    public AMTSServicePortType getPort() {
        return this.amtsServicePort;
    }

}
