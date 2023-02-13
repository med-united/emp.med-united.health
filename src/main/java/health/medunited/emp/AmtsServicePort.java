package health.medunited.emp;

import javax.xml.ws.BindingProvider;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;

public class AmtsServicePort {
    private AMTSServicePortType amtsServicePort;
    private ContextType context;

    public AmtsServicePort(String endpoint, ContextType context) {
        this.context = context;
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
