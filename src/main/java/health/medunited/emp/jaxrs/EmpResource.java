package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.CardService;

@Path("/emp")
public class EmpResource {
    @Inject
    CardService cardService;

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getEMP() throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        return cardService.readEmpFromCard();
    }

    @POST
    public void postEMP(String medkationsPlan) throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        cardService.writeEmpToCard(medkationsPlan);
    }

}
