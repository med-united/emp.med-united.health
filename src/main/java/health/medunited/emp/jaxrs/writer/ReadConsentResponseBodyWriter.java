package health.medunited.emp.jaxrs.writer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.gematik.ws.conn.amts.amtsservice.v1.ReadConsentResponse;


@Provider
public class ReadConsentResponseBodyWriter implements MessageBodyWriter<ReadConsentResponse> {
    private static Logger log = Logger.getLogger(ReadConsentResponseBodyWriter.class.getName());
    static JAXBContext mpJaxbContext;

    static {
        try {
            mpJaxbContext = JAXBContext.newInstance(ReadConsentResponse.class);
        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Could not init JAXBContext", e);
        }
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type.isAssignableFrom(ReadConsentResponse.class) 
            && (mediaType.isCompatible(MediaType.APPLICATION_XML_TYPE) || mediaType.isCompatible(MediaType.APPLICATION_OCTET_STREAM_TYPE));
    }

    @Override
    public void writeTo(ReadConsentResponse t, Class<?> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
            throws IOException, WebApplicationException {
        Marshaller mpMarshaller;
        try {
            mpMarshaller = mpJaxbContext.createMarshaller();
            mpMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
            mpMarshaller.marshal(t, entityStream);
        } catch (JAXBException e) {
            throw new WebApplicationException(e);
        }
    }

}
