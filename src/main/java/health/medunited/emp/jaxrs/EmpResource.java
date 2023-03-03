package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.CardService;
import health.medunited.emp.bmp.MedikationsPlan;

@Path("/emp")
public class EmpResource {
    @Inject
    CardService cardService;

    @GET
    public MedikationsPlan getEMP() throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage {
        return cardService.readEmpFromCard();
    }

    @POST
    public void postEMP(MedikationsPlan medkationsPlan) throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage, DatatypeConfigurationException {
        cardService.writeEmpToCard(medkationsPlan);
    }

}
