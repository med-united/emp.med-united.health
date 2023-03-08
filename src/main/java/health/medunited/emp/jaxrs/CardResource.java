package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.CardService;

@Path("/card")
public class CardResource {
    @Inject
    CardService cardService;

    @POST
    @Path("/disable-pin")
    public void disablePin() throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        cardService.disablePin();
    }

}
