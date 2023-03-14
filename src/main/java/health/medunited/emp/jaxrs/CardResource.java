package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import de.gematik.ws.conn.cardservice.v8.GetPinStatusResponse;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.cardservicecommon.v2.PinResponseType;
import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.CardService;

@Path("/card")
public class CardResource {
    @Inject
    CardService cardService;

    @GET
    @Path("/pin-status")
    public GetPinStatusResponse getStatus() throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage{
        // insert eGK card with [Kartentyp=eGK G2.1] into the terminal
        return cardService.getPinStatus(CardTypeType.EGK, PinType.MRPIN_AMTS);
    }

    @POST
    @Path("/enable-pin")
    public PinResponseType enablePin() throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        // insert eGK card with [Kartentyp=eGK G2.1] into the terminal
        return cardService.enablePin(CardTypeType.EGK, PinType.MRPIN_AMTS);
    }

    @POST
    @Path("/disable-pin")
    public PinResponseType disablePin() throws FaultMessage, de.gematik.ws.conn.cardservice.wsdl.v8.FaultMessage {
        // insert eGK card with [Kartentyp=eGK G2.1] into the terminal
        return cardService.disablePin(CardTypeType.EGK, PinType.MRPIN_AMTS);
    }

}
