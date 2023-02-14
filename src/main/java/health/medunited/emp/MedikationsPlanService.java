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
import health.medunited.emp.bmp.MedikationsPlan;

public class MedikationsPlanService {
    private AMTSServicePortType amtsServicePort;
    private ContextType context;
    private JAXBContext mpJaxbContext;

    public MedikationsPlanService(AMTSServicePortType amtsServicePort, ContextType context) {
        this.amtsServicePort = amtsServicePort;
        this.context = context;
        try {
            mpJaxbContext = JAXBContext.newInstance(MedikationsPlan.class);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to load MedikationsPlan", e);
        }
    }

    public MedikationsPlan unmarshalMedicationPlan(InputStream xmlInputStream) {
        try {
            return (MedikationsPlan) mpJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to unmarshal XML into MedikationsPlan", e);
        }
    }

    private byte[] marshalMedicationPlan(MedikationsPlan mp) {
        ByteArrayOutputStream dataMP = new ByteArrayOutputStream();
        Marshaller mpMarshaller;
        try {
            mpMarshaller = mpJaxbContext.createMarshaller();
            mpMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
            mpMarshaller.marshal(mp, dataMP);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to create Marshaller for MedikationsPlan", e);
        }
        return dataMP.toByteArray();
    }

    public void writeMedicationsPlan(MedikationsPlan medicationsPlan, String ehcHandle, String hpcHandle, String usingPin) {
        Holder<Status> status = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        byte[] data = marshalMedicationPlan(medicationsPlan);
        try {
            amtsServicePort.writeMP(ehcHandle, hpcHandle, this.context, data, usingPin, status, egkValid);
        } catch (FaultMessage e) {
            throw new IllegalStateException("Unable to write MedicationsPlan to Card", e);
        }
    }

    public String readMedicationsPlanAsTextXml(String ehcHandle, String hpcHandle, String usingPin) {
        byte[] empBytes = readMedicationsPlanAsBytes(ehcHandle, hpcHandle, usingPin);   
        return new String(empBytes);
    }

    public MedikationsPlan readMedicationsPlan(String ehcHandle, String hpcHandle, String usingPin) {  
        byte[] empBytes = readMedicationsPlanAsBytes(ehcHandle, hpcHandle, usingPin);   
        return unmarshalMedicationPlan(new ByteArrayInputStream(empBytes));
    }

    private byte[] readMedicationsPlanAsBytes(String ehcHandle, String hpcHandle, String usingPin){
        Holder<Status> status = new Holder<>();
        Holder<byte[]> data = new Holder<>();
        Holder<Boolean> egkValid = new Holder<>();
        Holder<Integer> egkUsage = new Holder<>();
        try {
            amtsServicePort
               .readMP(ehcHandle, hpcHandle, this.context, usingPin, status, data, egkValid, egkUsage);
        } catch (FaultMessage e) {
            throw new IllegalStateException("Unable to read MedicationsPlan from Card", e);
        }
        return data.value;
    }
}
