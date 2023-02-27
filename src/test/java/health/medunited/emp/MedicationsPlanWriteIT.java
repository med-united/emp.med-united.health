package health.medunited.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.bmp.Einwilligung;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.security.FakeHostnameVerifier;
import health.medunited.security.FakeX509TrustManager;
/*
for testing, start KoPS (Konnektorsimulator für Primärsysteme bei eHealth Experts GmbH) with 
   ./start.sh localhost 8081
check if it listens on port 80:
   netstat -an | grep 80
if it does not listen, start with:
   sudo ./start.sh localhost 8081
*/
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MedicationsPlanWriteIT {
   MedikationsPlanService mpService;
   ConsentService consentService;
   EventServicePort eventServicePort;
   AmtsServicePort amtsServicePort;
   String usingPin = "AMTS-PIN";

   @BeforeEach
   void init() throws JAXBException {
      ContextType contextType = new ContextType();
      contextType.setMandantId("Mandant1");
      contextType.setWorkplaceId("Workplace1");
      contextType.setClientSystemId("ClientID1");
      TrustManager trustManager = new FakeX509TrustManager();
      HostnameVerifier hostnameVerifier = new FakeHostnameVerifier();
      eventServicePort = new EventServicePort("http://localhost/eventservice", contextType, trustManager, hostnameVerifier);
      amtsServicePort = new AmtsServicePort("http://localhost/amtsservice", trustManager, hostnameVerifier);
      consentService = new ConsentService(amtsServicePort.getPort(), contextType);
      mpService = new MedikationsPlanService(amtsServicePort.getPort(), contextType);

      System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
      System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
      System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
      System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
      System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
   }

   @Test
   public void test() throws FaultMessage, DatatypeConfigurationException, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {

      // CardServicePortType cardService = new CardService(getClass()
      // .getResource("/CardService.wsdl"))
      // .getCardServicePort();

      // BindingProvider bp = (BindingProvider) cardService;
      // bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
      // "https://10.0.0.98:443/ws/CardService");

      // configureBindingProvider(bp);

      String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);
      String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);

      try {
         Einwilligung consentR = consentService.readConsent(ehcHandle, hpcHandle);
         System.out.println("Einwillung vom: "
               + consentR.getEinwilligungsdatum() + " "
               + consentR.getVorname() + " "
               + consentR.getNachname());

      } catch (Exception ex) {
         System.out.println("Error during reading Consent. Writing Consent");
         ex.printStackTrace();

         Einwilligung consentW = consentService.unmarshalConsent(getClass().getResourceAsStream("/Einwilligung_2.xml"));
         consentW.setEinwilligungsdatum(DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
         consentService.writeConsent(consentW, ehcHandle, hpcHandle);
      }

      MedikationsPlan mpW = mpService.unmarshalMedicationPlan(getClass().getResourceAsStream("/Medikationsplan_2.xml"));
      mpService.writeMedicationsPlan(mpW, ehcHandle, hpcHandle, usingPin);

      MedikationsPlan mpR = mpService.readMedicationsPlan(ehcHandle, hpcHandle, usingPin);

      assertEquals(mpW.getInstanzId(), mpR.getInstanzId());
   }

}
