package health.medunited.emp.jaxrs.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;


@Provider
public class EventServiceFaultMessageMapper implements ExceptionMapper<FaultMessage> {

    @Override
    public Response toResponse(FaultMessage ex) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
            .entity("An error occurred: " + ex.getMessage())
            .build();
    }
    
}

