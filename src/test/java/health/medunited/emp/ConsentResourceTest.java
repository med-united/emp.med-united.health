package health.medunited.emp;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

@QuarkusTest
public class ConsentResourceTest {
  @Inject
  TerminalService terminalService;

  @BeforeAll
  public static void init() {
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
          .header(terminalService.headerNameMandantId(), terminalService.mandantId())
          .header(terminalService.headerNameClientSystemId(), terminalService.clientSystemId())
          .header(terminalService.headerNameWorkplaceId(), terminalService.workplaceId())
          .accept(ContentType.XML)
        .get("/consent")
        .then()
          .statusCode(200);
  }

  @Test
  public void testWrite_success() throws IOException {
    given()
        .when()
          .header(terminalService.headerNameMandantId(), terminalService.mandantId())
          .header(terminalService.headerNameClientSystemId(), terminalService.clientSystemId())
          .header(terminalService.headerNameWorkplaceId(), terminalService.workplaceId())
          .accept(ContentType.XML)
          .contentType(ContentType.XML)
          .body(
            new String(getClass().getResourceAsStream("/Einwilligung_2.xml").readAllBytes(), StandardCharsets.UTF_8))
        .post("/consent")
        .then()
          .statusCode(204);
  }

}