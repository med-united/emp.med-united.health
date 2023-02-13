package health.medunited.emp;

import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;

public class AmtsServicePort {
    private AMTSServicePortType amtsServicePort;

    public AmtsServicePort(String endpoint) {
        amtsServicePort = new AMTSService(getClass()
                .getResource("/AMTSService.wsdl"))
                .getAMTSServicePort();
        BindingProvider bp = (BindingProvider) amtsServicePort;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        BindingProviderConfigurer.configure(bp);
    }

    public AMTSServicePortType getPort() {
        return this.amtsServicePort;
    }

}
