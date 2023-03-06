package health.medunited.emp.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import de.gematik.ws.conn.eventservice.wsdl.v7.FaultMessage;
import health.medunited.emp.ConsentService;
import health.medunited.emp.bmp.Einwilligung;

@Path("/consent")
public class ConsentResource {
    @Inject
    ConsentService consentService;


    @POST
    public void post(Einwilligung einwilligung) throws FaultMessage, JAXBException, de.gematik.ws.conn.amts.amtsservice.v1.FaultMessage, DatatypeConfigurationException {
        consentService.writeConsent(einwilligung, null, null);
    }

}
