package health.medunited.emp.jaxrs.reader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import health.medunited.emp.bmp.MedikationsPlan;

@Provider
public class MedikationsPlanMessageBodyReader implements MessageBodyReader<MedikationsPlan> {
    private static Logger log = Logger.getLogger(MedikationsPlanMessageBodyReader.class.getName());
    static JAXBContext mpJaxbContext;

    static {
        try {
            mpJaxbContext = JAXBContext.newInstance(MedikationsPlan.class);
        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Could not init JAXBContext", e);
        }
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type.isAssignableFrom(MedikationsPlan.class) && mediaType.equals(MediaType.APPLICATION_XML);
    }

    @Override
    public MedikationsPlan readFrom(Class<MedikationsPlan> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
            throws IOException, WebApplicationException {
        try {
            return unmarshalMedicationPlan(entityStream);
        } catch (JAXBException e) {
            throw new WebApplicationException(e);
        }
    }

    public MedikationsPlan unmarshalMedicationPlan(InputStream xmlInputStream) throws JAXBException {
        return (MedikationsPlan) mpJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
    }

}
