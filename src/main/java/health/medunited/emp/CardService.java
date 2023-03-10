package health.medunited.emp;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Holder;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import de.gematik.ws.conn.cardservice.wsdl.v8.CardServicePortType;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.cardservicecommon.v2.PinResultEnum;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventServicePortType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.bmp.Einwilligung;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.emp.producer.ContextTypeProducer;
import health.medunited.emp.producer.EventServicePortProducer;

@RequestScoped
public class CardService {
    private String usingPin = "AMTS-PIN";

    @Inject
    ContextType contextType;

    @Inject
    TrustManager trustManager;

    @Inject
    HostnameVerifier hostnameVerifier;

    @Inject
    AMTSServicePortType amtsServicePortType;
    
    @Inject
    EventServicePortType eventServicePortType;

    @Inject
    CardServicePortType cardServicePortType;

    @Inject
    MedikationsPlanService mpService;

    @Inject
    ConsentService consentService;

    public CardService() {
    }

    public MedikationsPlan readEmpFromCard()
            throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        
        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        String hpcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.SMC_B);
        return mpService.readMedicationsPlan(ehcHandle, hpcHandle, usingPin);
    }

    public void writeEmpToCard(MedikationsPlan medikationsPlan)
            throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage, DatatypeConfigurationException {

        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        String hpcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.SMC_B);

        try {
            Einwilligung consentR = consentService.readConsent(ehcHandle, hpcHandle);
        } catch (Exception ex) {
            Einwilligung consentW = consentService.unmarshalConsent(getClass().getResourceAsStream("/Einwilligung_2.xml"));
            consentW.setEinwilligungsdatum(DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
            consentService.writeConsent(consentW, ehcHandle, hpcHandle);
        }

        mpService.writeMedicationsPlan(medikationsPlan, ehcHandle, hpcHandle, usingPin);
    }

    public void disablePin() throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        
        Holder<Status> status = new Holder<Status>();
        Holder<PinResultEnum> pinResult = new Holder<PinResultEnum>();
        Holder<BigInteger> leftTries = new Holder<BigInteger>();

        cardServicePortType.disablePin(ContextTypeProducer.clone(contextType), ehcHandle, "MRPIN.AMTS", status, pinResult, leftTries);

        if(pinResult.value == PinResultEnum.ERROR) {
            throw new de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage("Error", status.value.getError());
        }
    }

}
