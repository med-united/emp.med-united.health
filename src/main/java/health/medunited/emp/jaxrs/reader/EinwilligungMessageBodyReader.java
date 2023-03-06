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

import health.medunited.emp.bmp.Einwilligung;

@Provider
public class EinwilligungMessageBodyReader implements MessageBodyReader<Einwilligung> {
    private static Logger log = Logger.getLogger(EinwilligungMessageBodyReader.class.getName());
    static JAXBContext mpJaxbContext;

    static {
        try {
            mpJaxbContext = JAXBContext.newInstance(Einwilligung.class);
        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Could not init JAXBContext", e);
        }
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type.isAssignableFrom(Einwilligung.class) && mediaType.isCompatible(MediaType.APPLICATION_XML_TYPE);
    }

    @Override
    public Einwilligung readFrom(Class<Einwilligung> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
            throws IOException, WebApplicationException {
        try {
            return unmarshalMedicationPlan(entityStream);
        } catch (JAXBException e) {
            throw new WebApplicationException(e);
        }
    }

    public Einwilligung unmarshalMedicationPlan(InputStream xmlInputStream) throws JAXBException {
        return (Einwilligung) mpJaxbContext.createUnmarshaller().unmarshal(xmlInputStream);
    }

}
