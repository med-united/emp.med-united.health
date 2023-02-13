package health.medunited.emp;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import health.medunited.emp.bmp.MedikationsPlan;

public class MedikationsPlanService {
    private JAXBContext mpJaxbContext;
    private ContextType context;

    public MedikationsPlanService(ContextType context) {
        this.context = context;
        try {
            mpJaxbContext = JAXBContext.newInstance(MedikationsPlan.class);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to load MedikationsPlan", e);
        }
    }

    public ContextType getContext() {
        return this.context;
    }

    public MedikationsPlan unmarshalMedicationPlan(InputStream xmlInputStream) {
        try {
            return (MedikationsPlan) mpJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
        } catch (JAXBException e) {
            throw new IllegalStateException("Unable to unmarshal XML into MedikationsPlan", e);
        }
    }

    public byte[] marshalMedicationPlan(MedikationsPlan mp) {
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

}
