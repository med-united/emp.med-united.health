package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.CardService;
import health.medunited.emp.bmp.Einwilligung;

@Path("/consent")
public class ConsentResource {
    @Inject
    CardService cardService;

    @GET
    public Einwilligung getConsent() throws FaultMessage  {
        return cardService.readConsentFromCard();
    }

    @POST
    public void post(Einwilligung consent) throws FaultMessage {
        cardService.writeConsentToCard(consent);
    }

}
