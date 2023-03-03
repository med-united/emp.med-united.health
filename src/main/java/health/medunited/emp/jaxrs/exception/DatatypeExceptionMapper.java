package health.medunited.emp.jaxrs.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.xml.datatype.DatatypeConfigurationException;

@Provider
public class DatatypeExceptionMapper implements ExceptionMapper<DatatypeConfigurationException> {

    @Override
    public Response toResponse(DatatypeConfigurationException ex) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("An error occurred: " + ex.getMessage())
                .build();
    }

}