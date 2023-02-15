package health.medunited.emp;

import java.io.ByteArrayInputStream;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.security.FakeHostnameVerifier;
import health.medunited.security.FakeX509TrustManager;

@Path("/emp")
public class EmpResource {

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getEMP() {
        ContextType contextType = new ContextType();
        contextType.setMandantId("Mandant1");
        contextType.setWorkplaceId("Workplace1");
        contextType.setClientSystemId("ClientID1");

        return readEmpFromCard(
            contextType,
            "AMTS-PIN",
            "http://localhost/eventservice",
            "http://localhost/amtsservice",
            new FakeX509TrustManager(),
            new FakeHostnameVerifier());
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postEMP(String medkationsPlan) {
        return writeEmpToCard(
            medkationsPlan,
            getContext(),
            "AMTS-PIN",
            "http://localhost/eventservice",
            "http://localhost/amtsservice",
            new FakeX509TrustManager(),
            new FakeHostnameVerifier());
    }

    private ContextType getContext(){
        ContextType context = new ContextType();
        context.setMandantId("Mandant1");
        context.setWorkplaceId("Workplace1");
        context.setClientSystemId("ClientID1");
        return context;
    }

    private String readEmpFromCard(ContextType contextType, String usingPin, String eventEndpoint, String amtsEndpoint, TrustManager trustManager, HostnameVerifier hostnameVerifier ) {
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        try {
            String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
            String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
            return mpService.readMedicationsPlanAsTextXml(ehcHandle, hpcHandle, usingPin);
        } catch (de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage e) {
            return "Unable to read MedicationsPlan from Card";
        }
    }

    private String writeEmpToCard(String medikationsPlanXML, ContextType contextType, String usingPin, String eventEndpoint, String amtsEndpoint, TrustManager trustManager, HostnameVerifier hostnameVerifier ) {
        EventServicePort eventServicePort = new EventServicePort(eventEndpoint, contextType, trustManager, hostnameVerifier);
        AmtsServicePort amtsServicePort = new AmtsServicePort(amtsEndpoint, trustManager, hostnameVerifier);
        MedikationsPlanService mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);
        MedikationsPlan medikationsPlan = 
            mpService.unmarshalMedicationPlan(new ByteArrayInputStream(medikationsPlanXML.getBytes()));
        try {
            String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
            String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
            mpService.writeMedicationsPlan(medikationsPlan, ehcHandle, hpcHandle, usingPin);
            return "OK";
        } catch (de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage e) {
            return "Unable to read MedicationsPlan from Card";
        }
    }

}
