package health.medunited.emp;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

@QuarkusTest
public class EmpResourceTest {
  String mandantId = "Mandant1"; //"CC-stat"
  String clientSystemId = "ClientID1"; //"ClinicCentre"
  String workplaceId = "Workplace1"; //"IT-Abteilung"

  @BeforeAll
  public static void init(){
    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

    System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
  }

  @Test
  public void testRead_success() {
         given()
           .when()
             .header("x-mandant-id", mandantId)
             .header("x-client-system-id", clientSystemId)
             .header("x-workplace-id", workplaceId)
             .accept(ContentType.XML)
             .get("/emp")
           .then()
              .statusCode(200);
    }

    @Test
    public void testWrite_success() throws IOException {
      given()
        .when()
          .header("x-mandant-id", mandantId)
          .header("x-client-system-id", clientSystemId)
          .header("x-workplace-id", workplaceId)
          .accept(ContentType.XML)
          .contentType(ContentType.XML)
          .body(new String(getClass().getResourceAsStream("/Medikationsplan_2.xml").readAllBytes(), StandardCharsets.UTF_8))
          .post("/emp")
        .then()
          .statusCode(204);
    }

    @Test
    public void testRead_wrongMandantId() {
         given()
           .when()
             .header("x-mandant-id", "WRONG_ID")
             .header("x-client-system-id", clientSystemId)
             .header("x-workplace-id", workplaceId)
             .get("/emp")
           .then()
              .statusCode(500);
    }
}