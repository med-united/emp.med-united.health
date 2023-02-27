package health.medunited.emp.jaxrs.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBException;

@Provider
public class JAXBExceptionMapper implements ExceptionMapper<JAXBException> {

    @Override
    public Response toResponse(JAXBException ex) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
            .entity("An error occurred: " + ex.getMessage())
            .build();
    }
    
}
