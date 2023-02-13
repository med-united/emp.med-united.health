package health.medunited.emp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.Holder;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import health.medunited.emp.bmp.Einwilligung;

public class ConsentService {
    private AMTSServicePortType amtsServicePort;
    private ContextType context;
    private JAXBContext consentJaxbContext;

    public ConsentService(AMTSServicePortType amtsServicePort, ContextType context) {
        this.amtsServicePort = amtsServicePort;
        this.context = context;
        try {
            consentJaxbContext = JAXBContext.newInstance(Einwilligung.class);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to load Consent", e);
        }
    }

    public Einwilligung unmarshalConsent(InputStream xmlInputStream) {
        try {
            return (Einwilligung) consentJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to unmarshal XML into Consent", e);
        }
    }

    private byte[] marshalConsent(Einwilligung consent) {
        ByteArrayOutputStream dataConsent = new ByteArrayOutputStream();
        Marshaller consentMarshaller;
        try {
            consentMarshaller = consentJaxbContext.createMarshaller();
            consentMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
            consentMarshaller.marshal(consent, dataConsent);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to create Marshaller for Consent ", e);
        }
        return dataConsent.toByteArray();
    }

    public Einwilligung readConsent(String ehcHandle, String hpcHandle) {
        Holder<Status> status = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        Holder<byte[]> data = new Holder<>();

        try {
            amtsServicePort.readConsent(ehcHandle, hpcHandle, this.context, status, data, egkValid);
        } catch (de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage e) {
            throw new IllegalStateException("Unable to read Consent from Card", e);
        }

        return unmarshalConsent(new ByteArrayInputStream(data.value));
    }

    public void writeConsent(Einwilligung consent, String ehcHandle, String hpcHandle) {
        Holder<Status> status = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        byte[] data = marshalConsent(consent);
        try {
            amtsServicePort.writeConsent(ehcHandle, hpcHandle, this.context, data, status, egkValid);
        } catch (FaultMessage e) {
            throw new IllegalStateException("Unable to write Consent to Card", e);
        }
    }
}
