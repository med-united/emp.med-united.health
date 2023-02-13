package health.medunited.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Holder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.bmp.Einwilligung;
import health.medunited.emp.bmp.MedikationsPlan;
/*
for testing, start KoPS (Konnektorsimulator für Primärsysteme bei eHealth Experts GmbH) with 
   ./start.sh localhost 8081
check if it listens on port 80:
   netstat -an | grep 80
if it does not listen, start with:
   sudo ./start.sh localhost 8081
*/

public class MedicationsPlanWriteIT {
   MedikationsPlanService mpService;
   ConsentService consentService;
   EventServicePort eventServicePort;
   AmtsServicePort amtsServicePort;

   @BeforeEach
   void init() {
      ContextType contextType = new ContextType();
      contextType.setMandantId("Mandant1");
      contextType.setWorkplaceId("Workplace1");
      contextType.setClientSystemId("ClientID1");
      mpService = new MedikationsPlanService(contextType);
      eventServicePort = new EventServicePort("http://localhost/eventservice", contextType);
      amtsServicePort = new AmtsServicePort("http://localhost/amtsservice");
      consentService = new ConsentService(amtsServicePort.getPort(), contextType);

      System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
      System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
      System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
      System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
      System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
   }

   @Test
   public void test() throws JAXBException, UnrecoverableKeyException, NoSuchAlgorithmException, CertificateException,
         FileNotFoundException, KeyStoreException, IOException, KeyManagementException,
         de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage, FaultMessage, DatatypeConfigurationException {
     
      // CardServicePortType cardService = new CardService(getClass()
      //   .getResource("/CardService.wsdl"))
      //   .getCardServicePort();

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

         // Write Einwilligung
         Einwilligung consentW = new Einwilligung();
         consentW.setEinwilligungsdatum(
               DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
         consentW.setVersion("1.0.1");
         consentW.setVorname("Manuel");
         consentW.setNachname("Blechschmidt");
         consentW.setStrasse("Droysenstr.");
         consentW.setHausnummer("7");
         consentW.setPostleitzahl("10629");
         consentW.setOrt("Berlin");

         consentService.writeConsent(consentW, ehcHandle, hpcHandle);
      }

      MedikationsPlan mpW = mpService.unmarshalMedicationPlan(getClass().getResourceAsStream("/Medikationsplan_2.xml"));
      byte[] dataMPW = mpService.marshalMedicationPlan(mpW);

      Holder<Status> statusW = new Holder<>();
      Holder<Boolean> egkValidW = new Holder<>();
      // Write Medikationplan
      amtsServicePort.getPort()
         .writeMP(ehcHandle, hpcHandle, mpService.getContext(), dataMPW, "AMTS-PIN", statusW, egkValidW);

      Holder<Status> statusMPR = new Holder<>();
      Holder<byte[]> dataMPR = new Holder<>();
      Holder<Boolean> egkValidMPR = new Holder<>();
      Holder<Integer> egkUsageMPR = new Holder<>();
      amtsServicePort.getPort()
         .readMP(ehcHandle, hpcHandle, mpService.getContext(), "AMTS-PIN", statusMPR, dataMPR, egkValidMPR, egkUsageMPR);
    
      MedikationsPlan mpR = mpService.unmarshalMedicationPlan(new ByteArrayInputStream(dataMPR.value));
      
      assertEquals(mpW.getInstanzId(), mpR.getInstanzId());
   }

}
