package health.medunited.emp;

import java.io.ByteArrayInputStream;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.security.FakeHostnameVerifier;
import health.medunited.security.FakeX509TrustManager;

public class CardService {
    private static String usingPin = "AMTS-PIN";
    private static String eventEndpoint = "http://localhost/eventservice";
    private static String amtsEndpoint = "http://localhost/amtsservice";
    private static TrustManager trustManager = new FakeX509TrustManager();
    private static HostnameVerifier hostnameVerifier = new FakeHostnameVerifier();

    public static String readEmpFromCard(ContextType contextType) {
        contextType = ContextTypeProducer.clone(contextType);
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        try {
            String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
            String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
            return mpService.readMedicationsPlanAsTextXml(ehcHandle, hpcHandle, usingPin);
        } catch (de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage e) {
            return "Endpoint: Unable to read MedicationsPlan from Card\n" + e.getMessage();
        }
    }

    public static String writeEmpToCard(ContextType contextType, String medikationsPlanXML) {
        contextType = ContextTypeProducer.clone(contextType);
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        MedikationsPlan medikationsPlan = mpService.unmarshalMedicationPlan(new ByteArrayInputStream(medikationsPlanXML.getBytes()));
        try {
            String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
            String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
            mpService.writeMedicationsPlan(medikationsPlan, ehcHandle, hpcHandle, usingPin);
            return "OK";
        } catch (de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage e) {
            return "Endpoint: Unable to write MedicationsPlan from Card";
        }
    }

}
