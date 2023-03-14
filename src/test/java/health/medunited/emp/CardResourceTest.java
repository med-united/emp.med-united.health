package health.medunited.emp;

import static io.restassured.RestAssured.given;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

@QuarkusTest
public class CardResourceTest {
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
  public void testGetPinStatus_wrongMandantId() {
    given()
        .when()
          .header(terminalService.headerNameMandantId(), "WRONG_ID")
          .header(terminalService.headerNameClientSystemId(), "WRONG_ID")
          .header(terminalService.headerNameWorkplaceId(), "WRONG_ID")
        .get("/card/pin-status")
        .then()
          .statusCode(500);
  }

  @Test
  public void testGetPinStatus_success() {
    given()
        .when()
        .header(terminalService.headerNameMandantId(), terminalService.mandantId())
        .header(terminalService.headerNameClientSystemId(), terminalService.clientSystemId())
        .header(terminalService.headerNameWorkplaceId(), terminalService.workplaceId())
        .get("/card/pin-status")
        .then()
        .statusCode(200);
    // Envelope.Body.GetPinStatusResponse.Status.Result=OK
    // Envelope.Body.GetPinStatusResponse.Status.PinStatus={null=DISABLED|VERIFIED|TRANSPORT_PIN|EMPTY_PIN|BLOCKED|VERIFIABLE}
  }

  @Test
  public void testEnablePin_success() {
    given()
        .when()
        .header(terminalService.headerNameMandantId(), terminalService.mandantId())
        .header(terminalService.headerNameClientSystemId(), terminalService.clientSystemId())
        .header(terminalService.headerNameWorkplaceId(), terminalService.workplaceId())
        .accept(ContentType.XML)
        .post("/card/enable-pin")
        .then()
        .statusCode(200);
    // Envelope.Body.EnablePinResponse.Status.Result=OK
    // Envelope.Body.EnablePinResponse.Status.PinResult=OK
  }

  @Test
  public void testDisablePin_success() {
    given()
        .when()
        .header(terminalService.headerNameMandantId(), terminalService.mandantId())
        .header(terminalService.headerNameClientSystemId(), terminalService.clientSystemId())
        .header(terminalService.headerNameWorkplaceId(), terminalService.workplaceId())
        .accept(ContentType.XML)
        .post("/card/disable-pin")
        .then()
        .statusCode(200);
    // Envelope.Body.DisablePinResponse.Status.Result=OK
    // Envelope.Body.DisablePinResponse.Status.PinResult=OK
  }

}