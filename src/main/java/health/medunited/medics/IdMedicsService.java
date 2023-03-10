package health.medunited.medics;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@RequestScoped
public class IdMedicsService {
    
    @ConfigProperty(name = "medics.developer.license")
    String medicsDeveloperLicense;
    @ConfigProperty(name = "medics.pwd")
    String medicsPwd;
    @ConfigProperty(name = "medics.axis2.url")
    String medicsAxis2Url;
    @ConfigProperty(name = "medics.NAME")
    String medicsNAME;
    @ConfigProperty(name = "medics.COMPUTER")
    String medicsCOMPUTER;

    Client client;

    String sessionId;

    @PostConstruct
    public void init() {
        client = ClientBuilder.newClient();
    }

    public void login() throws SAXException, IOException, ParserConfigurationException {
        String response = client.target(medicsAxis2Url).path("idlogikrest")
            .queryParam("serviceName", "user.Login")
            .queryParam("NAME", medicsNAME)
            .queryParam("COMPUTER", medicsCOMPUTER)
            .queryParam("LICENCE", medicsDeveloperLicense+"|"+medicsPwd).request().get(String.class);
        String userLoginXml = new String(response.getBytes());
        
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().parse(new ByteArrayInputStream(userLoginXml.getBytes()));
        sessionId = document.getDocumentElement().getChildNodes().item(0).getChildNodes().item(2).getChildNodes().item(0).getAttributes().getNamedItem("Value").getTextContent();
    }
    
    public String listDocuments(String caseId) {
        Response response = client.target(medicsAxis2Url).path("idlogikrest")
        .queryParam("serviceName", "med.ListDocuments")
        .queryParam("SESSION_ID", sessionId)
        // .queryParam("DOCUMENT_KIND", 5)
        .queryParam("CASE_ID", caseId)
        .request().get();
        if(response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new WebApplicationException("Could not list documents from id medics.");
        }
        return response.readEntity(String.class);
    }

    public String getDocument(String documentId) {
        Response response = client.target(medicsAxis2Url).path("idlogikrest")
        .queryParam("serviceName", "med.GetDocument")
        .queryParam("SESSION_ID", sessionId)
        .queryParam("ID", documentId)
        .request().get();
        if(response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new WebApplicationException("Could not get document from id medics.");
        }
        return response.readEntity(String.class);
    }

    public void addMedicationPlan(String medicationPlan, String caseId) {
        Response response = client.target(medicsAxis2Url).path("idlogikrest")
            .queryParam("serviceName", "med.AddDocument")
            .queryParam("SESSION_ID", sessionId)
            .queryParam("MODE", 0)
            .queryParam("CONTENT", medicationPlan)
            .queryParam("DOCUMENT_KIND", 5)
            .queryParam("CASE_ID", caseId)
            .queryParam("CREATED_BY", medicsNAME)
            .queryParam("SOURCE", "TRANSPORT")
            .request().get();
        if(response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new WebApplicationException("Could not create document in id medics.");
        }
    }

    public void logoff() {
        Response response = client.target(medicsAxis2Url).path("idlogikrest")
            .queryParam("serviceName", "User.Logoff")
            .queryParam("SESSION_ID", sessionId).request().get();
        if(response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new WebApplicationException("Could not logoff.");
        }
    }
}
