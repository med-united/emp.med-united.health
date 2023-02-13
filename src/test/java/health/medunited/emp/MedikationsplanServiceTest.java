package health.medunited.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSService;
import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
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

public class MedikationsplanServiceTest {
   MedikationsPlanService mpService;
   EventServicePort eventServicePort;

   @BeforeEach
   void init() {
      ContextType contextType = new ContextType();
      contextType.setMandantId("Mandant1");
      contextType.setWorkplaceId("Workplace1");
      contextType.setClientSystemId("ClientID1");
      mpService = new MedikationsPlanService(contextType);
      eventServicePort = new EventServicePort("http://localhost/eventservice", contextType);

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

      String hpcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.SMC_B);
      String ehcHandle = eventServicePort.getFirstCardHandleOfType(CardTypeType.EGK);

      AMTSServicePortType aMTSServicePort = new AMTSService(getClass().getResource("/AMTSService.wsdl"))
            .getAMTSServicePort();

      BindingProvider bp2 = (BindingProvider) aMTSServicePort;
      bp2.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://localhost/amtsservice");

      configureBindingProvider(bp2);

      JAXBContext consentJaxbContext = JAXBContext.newInstance(Einwilligung.class);

      try {
         Holder<Status> statusCR = new Holder<>();
         Holder<Boolean> egkValidCR = new Holder<>();
         Holder<byte[]> dataCR = new Holder<>();

         aMTSServicePort.readConsent(ehcHandle, hpcHandle, mpService.getContext(), statusCR, dataCR, egkValidCR);

         Einwilligung consentFromCard = (Einwilligung) consentJaxbContext
            .createUnmarshaller()
            .unmarshal(new ByteArrayInputStream(dataCR.value));

         System.out.println("Einwillung vom: "
            + consentFromCard.getEinwilligungsdatum() + " "
            + consentFromCard.getVorname() + " " 
            + consentFromCard.getNachname());

      } catch (Exception ex) {
         System.out.println("Error during reading Consent. Writing Consent");
         ex.printStackTrace();

         Holder<Status> statusCW = new Holder<>();
         Holder<Boolean> egkValidCW = new Holder<>();

         // Write Einwilligung
         Einwilligung consent = new Einwilligung();
         consent.setEinwilligungsdatum(
               DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
         consent.setVersion("1.0.1");
         consent.setVorname("Manuel");
         consent.setNachname("Blechschmidt");
         consent.setStrasse("Droysenstr.");
         consent.setHausnummer("7");
         consent.setPostleitzahl("10629");
         consent.setOrt("Berlin");

         ByteArrayOutputStream dataCW = new ByteArrayOutputStream();
         Marshaller marshaller = consentJaxbContext.createMarshaller();

         marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
         marshaller.marshal(consent, dataCW);
         aMTSServicePort.writeConsent(ehcHandle, hpcHandle, mpService.getContext(), dataCW.toByteArray(), statusCW, egkValidCW);
      }

      MedikationsPlan mpW = mpService.unmarshalMedicationPlan(getClass().getResourceAsStream("/Medikationsplan_2.xml"));
      byte[] dataMPW =  mpService.marshalMedicationPlan(mpW);

      Holder<Status> statusW = new Holder<>();
      Holder<Boolean> egkValidW = new Holder<>();
      // Write Medikationplan
      aMTSServicePort.writeMP(ehcHandle, hpcHandle, mpService.getContext(), dataMPW, "AMTS-PIN", statusW, egkValidW);

      Holder<Status> statusMPR = new Holder<>();
      Holder<byte[]> dataMPR = new Holder<>();
      Holder<Boolean> egkValidMPR = new Holder<>();
      Holder<Integer> egkUsageMPR = new Holder<>();
      aMTSServicePort.readMP(ehcHandle, hpcHandle, mpService.getContext(), "AMTS-PIN", statusMPR, dataMPR, egkValidMPR, egkUsageMPR);
    
      MedikationsPlan mpR = mpService.unmarshalMedicationPlan(new ByteArrayInputStream(dataMPR.value));
      
      assertEquals(mpW.getInstanzId(), mpR.getInstanzId());
   }

   private void configureBindingProvider(BindingProvider bindingProvider)
         throws NoSuchAlgorithmException, 
                CertificateException, 
                FileNotFoundException, 
                IOException,
                UnrecoverableKeyException, 
                KeyStoreException, 
                KeyManagementException {
      SSLContext sslContext = SSLContext.getInstance("TLS");

      if (sslContext != null) {
         sslContext.init(null, new TrustManager[] { new FakeX509TrustManager() }, null);
         bindingProvider.getRequestContext()
            .put("com.sun.xml.ws.transport.https.client.SSLSocketFactory",
                  sslContext.getSocketFactory());
      }
      bindingProvider.getRequestContext()
         .put("com.sun.xml.ws.transport.https.client.hostname.verifier",
               new FakeHostnameVerifier());
   }

}
