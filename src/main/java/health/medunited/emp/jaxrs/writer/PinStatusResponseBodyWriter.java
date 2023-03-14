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

import de.gematik.ws.conn.cardservice.v8.GetPinStatusResponse;

@Provider
public class PinStatusResponseBodyWriter implements MessageBodyWriter<GetPinStatusResponse> {
    private static Logger log = Logger.getLogger(PinStatusResponseBodyWriter.class.getName());
    static JAXBContext prtJaxbContext;

    static {
        try {
            prtJaxbContext = JAXBContext.newInstance(GetPinStatusResponse.class);
        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Could not init JAXBContext", e);
        }
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type.isAssignableFrom(GetPinStatusResponse.class) 
            && (mediaType.isCompatible(MediaType.APPLICATION_XML_TYPE) || mediaType.isCompatible(MediaType.APPLICATION_OCTET_STREAM_TYPE));
    }

    @Override
    public void writeTo(GetPinStatusResponse t, Class<?> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
            throws IOException, WebApplicationException {
        Marshaller prtMarshaller;
        try {
            prtMarshaller = prtJaxbContext.createMarshaller();
            prtMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
            prtMarshaller.marshal(t, entityStream);
        } catch (JAXBException e) {
            throw new WebApplicationException(e);
        }
    }

}
