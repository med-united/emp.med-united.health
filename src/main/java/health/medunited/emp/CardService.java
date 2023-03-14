package health.medunited.emp;

import java.io.ByteArrayInputStream;
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
import de.gematik.ws.conn.amts.amtsservice.v1.ReadConsentResponse;
import de.gematik.ws.conn.amts.amtsservice.v1.WriteConsentResponse;
import de.gematik.ws.conn.amts.amtsservice.v1.WriteMPResponse;
import de.gematik.ws.conn.cardservice.v8.GetPinStatusResponse;
import de.gematik.ws.conn.cardservice.v8.PinStatusEnum;
import de.gematik.ws.conn.cardservice.wsdl.v8.CardServicePortType;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.cardservicecommon.v2.PinResponseType;
import de.gematik.ws.conn.cardservicecommon.v2.PinResultEnum;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import de.gematik.ws.conn.eventservice.wsdl.v7.EventServicePortType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.bmp.Einwilligung;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.emp.jaxrs.PinType;
import health.medunited.emp.producer.ContextTypeProducer;
import health.medunited.emp.producer.EventServicePortProducer;

@RequestScoped
public class CardService {
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
        return mpService.readMedicationsPlan(ehcHandle, hpcHandle);
    }

    public WriteMPResponse writeEmpToCard(MedikationsPlan medikationsPlan)
            throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage, DatatypeConfigurationException {

        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        String hpcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.SMC_B);

        try {
            var rcr = consentService.readConsent(ehcHandle, hpcHandle);
            Einwilligung consentR = consentService.unmarshalConsent(new ByteArrayInputStream(rcr.getConsentData()));
        } catch (Exception ex) {
            Einwilligung consentW = consentService.unmarshalConsent(getClass().getResourceAsStream("/Einwilligung_2.xml"));
            consentW.setEinwilligungsdatum(DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
            consentService.writeConsent(consentW, ehcHandle, hpcHandle);
        }

        return mpService.writeMedicationsPlan(medikationsPlan, ehcHandle, hpcHandle);
    }

    public ReadConsentResponse readConsentFromCard() throws FaultMessage{
        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        String hpcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.SMC_B);
        return consentService.readConsent(ehcHandle, hpcHandle);
    }

    public WriteConsentResponse writeConsentToCard(Einwilligung einwilligung) throws FaultMessage {
        String ehcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.EGK);
        String hpcHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, CardTypeType.SMC_B);
        return consentService.writeConsent(einwilligung, ehcHandle, hpcHandle);
    }


    public PinResponseType enablePin(CardTypeType cardTypeType, PinType pinType) throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        String cardHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, cardTypeType);
        
        Holder<Status> status = new Holder<Status>();
        Holder<PinResultEnum> pinResult = new Holder<PinResultEnum>();
        Holder<BigInteger> leftTries = new Holder<BigInteger>();

        cardServicePortType.enablePin(ContextTypeProducer.clone(contextType), cardHandle, pinType.getId(), status, pinResult, leftTries);

        if(pinResult.value == PinResultEnum.ERROR) {
            throw new de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage("Error", status.value.getError());
        }
        return createPinResponseType(status.value, pinResult.value, leftTries.value);
    }

    public PinResponseType disablePin(CardTypeType cardTypeType, PinType pinType) throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        String cardHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, cardTypeType);
        
        Holder<Status> status = new Holder<Status>();
        Holder<PinResultEnum> pinResult = new Holder<PinResultEnum>();
        Holder<BigInteger> leftTries = new Holder<BigInteger>();

        cardServicePortType.disablePin(ContextTypeProducer.clone(contextType), cardHandle, pinType.getId(), status, pinResult, leftTries);

        if(pinResult.value == PinResultEnum.ERROR) {
            throw new de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage("Error", status.value.getError());
        }
        return createPinResponseType(status.value, pinResult.value, leftTries.value);
    }

    public GetPinStatusResponse getPinStatus(CardTypeType cardTypeType, PinType pinType) throws de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        String cardHandle = EventServicePortProducer.getFirstCardHandleOfType( ContextTypeProducer.clone(contextType), eventServicePortType, cardTypeType);
        
        Holder<Status> status = new Holder<Status>();
        Holder<PinStatusEnum> pinStatus = new Holder<PinStatusEnum>();
        Holder<BigInteger> leftTries = new Holder<BigInteger>();

        cardServicePortType.getPinStatus(ContextTypeProducer.clone(contextType), cardHandle, pinType.getId(), status, pinStatus, leftTries);
        return createPinStatusResponse(status.value, pinStatus.value, leftTries.value);
    }

    private PinResponseType createPinResponseType(Status status, PinResultEnum pinResult, BigInteger leftTries){
        PinResponseType pr = new PinResponseType();
        pr.setStatus(status);
        pr.setPinResult(pinResult);
        pr.setLeftTries(leftTries);
        return pr;
    }

    private GetPinStatusResponse createPinStatusResponse(Status status, PinStatusEnum pinStatus, BigInteger leftTries){
        GetPinStatusResponse pt = new GetPinStatusResponse();
        pt.setStatus(status);
        pt.setPinStatus(pinStatus);
        pt.setLeftTries(leftTries);
        return pt;
    }

}
