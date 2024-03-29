package health.medunited.emp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.ws.Holder;

import de.gematik.ws.conn.amts.amtsservice.v1.AMTSServicePortType;
import de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage;
import de.gematik.ws.conn.amts.amtsservice.v1.WriteMPResponse;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import health.medunited.emp.bmp.MedikationsPlan;
import health.medunited.emp.jaxrs.PinType;
import health.medunited.emp.producer.ContextTypeProducer;

@RequestScoped
public class MedikationsPlanService {
    @Inject
    AMTSServicePortType amtsServicePort;
    @Inject
    ContextType context;
    private static JAXBContext mpJaxbContext;

    private static Logger log = Logger.getLogger(MedikationsPlanService.class.getName());

    static {
        try {
            mpJaxbContext = JAXBContext.newInstance(MedikationsPlan.class);
        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Could not init JAXBContext", e);
        }
    }

    public MedikationsPlanService() {
    }

    public MedikationsPlan unmarshalMedicationPlan(InputStream xmlInputStream) throws JAXBException {
        return (MedikationsPlan) mpJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
    }

    private byte[] marshalMedicationPlan(MedikationsPlan mp) throws PropertyException, JAXBException {
        ByteArrayOutputStream dataMP = new ByteArrayOutputStream();
        Marshaller mpMarshaller;
        mpMarshaller = mpJaxbContext.createMarshaller();
        mpMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
        mpMarshaller.marshal(mp, dataMP);
        return dataMP.toByteArray();
    }

    public WriteMPResponse writeMedicationsPlan(MedikationsPlan medicationsPlan, String ehcHandle, String hpcHandle) throws FaultMessage, PropertyException, JAXBException {
        Holder<Status> status = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        byte[] data = marshalMedicationPlan(medicationsPlan);
        amtsServicePort.writeMP(ehcHandle, hpcHandle, ContextTypeProducer.clone(context), data, PinType.AMTS_PIN.getId(), status, egkValid);

        var wmpr = new WriteMPResponse();
        wmpr.setStatus(status.value);
        wmpr.setEGKValid(egkValid.value);
        return wmpr;
    }

    public MedikationsPlan readMedicationsPlan(String ehcHandle, String hpcHandle) throws FaultMessage, JAXBException {  
        byte[] empBytes = readMedicationsPlanAsBytes(ehcHandle, hpcHandle);   
        return unmarshalMedicationPlan(new ByteArrayInputStream(empBytes));
    }

    private byte[] readMedicationsPlanAsBytes(String ehcHandle, String hpcHandle) throws FaultMessage{
        Holder<Status> status = new Holder<>();
        Holder<byte[]> data = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        Holder<Integer> egkUsage = new Holder<>();
        amtsServicePort.readMP(ehcHandle, hpcHandle, ContextTypeProducer.clone(context), PinType.AMTS_PIN.getId(), status, data, egkValid, egkUsage);
        return data.value;
    }
}
