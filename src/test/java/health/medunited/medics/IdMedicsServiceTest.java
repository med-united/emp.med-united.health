package health.medunited.medics;

import java.io.IOException;

import javax.inject.Inject;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@Disabled
public class IdMedicsServiceTest {

    @Inject
    IdMedicsService idMedicsService;

    @Test
    public void uploadMedicationPlanToMedics() throws IOException, SAXException, ParserConfigurationException {
        idMedicsService.login();
        // idMedicsService.addMedicationPlan(new String(getClass().getResourceAsStream("/Medikationsplan_2.xml").readAllBytes()), "");
        idMedicsService.logoff();
    }

    
    @Test
    public void listMedicationPlanFromMedics() throws IOException, SAXException, ParserConfigurationException {
        idMedicsService.login();
        String document = idMedicsService.listDocuments("10199096");
        System.out.println(document);
        idMedicsService.logoff();
    }

    @Test
    public void getMedicationPlanFromMedics() throws IOException, SAXException, ParserConfigurationException {
        idMedicsService.login();
        String document = idMedicsService.getDocument("94795");
        System.out.println(document);
        idMedicsService.logoff();
    }
}
