package health.medunited.emp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.gematik.ws.conn.connectorcontext.v2.ContextType;

@Path("/emp")
public class EmpResource {
    @Inject
    ContextType contextType;

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getEMP() {
        return CardService.readEmpFromCard(contextType);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postEMP(String medkationsPlan) {
        return CardService.writeEmpToCard(contextType, medkationsPlan);
    }

}
