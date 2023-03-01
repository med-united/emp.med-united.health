package health.medunited.emp;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBException;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.bmp.MedikationsPlan;

@Dependent
public class CardService {
    private String usingPin = "AMTS-PIN";
    private String eventEndpoint = "http://localhost/eventservice";
    private String amtsEndpoint = "http://localhost/amtsservice";

    @Inject
    ContextType contextType;

    @Inject
    TrustManager trustManager;

    @Inject
    HostnameVerifier hostnameVerifier;

    public CardService(){}

    public MedikationsPlan readEmpFromCard() throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        contextType = ContextTypeProducer.clone(contextType);
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
        String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
        return mpService.readMedicationsPlan(ehcHandle, hpcHandle, usingPin);
    }

    public void writeEmpToCard(MedikationsPlan medikationsPlan) throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        contextType = ContextTypeProducer.clone(contextType);
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        // MedikationsPlan medikationsPlan = mpService.unmarshalMedicationPlan(new ByteArrayInputStream(medikationsPlanXML.getBytes()));
        String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
        String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
        mpService.writeMedicationsPlan(medikationsPlan, ehcHandle, hpcHandle, usingPin);
    }

}
