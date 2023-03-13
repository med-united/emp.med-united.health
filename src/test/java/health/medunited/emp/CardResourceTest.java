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
  public static void init(){
    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

    System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
  }

  @Test
  public void testEnablePin_success() {
         // insert eGK card with [Kartentyp=eGK G2.1] into the terminal
         given()
            .when()
              .header("x-mandant-id", terminalService.mandantId())
              .header("x-client-system-id", terminalService.clientSystemId())
              .header("x-workplace-id", terminalService.workplaceId())
              .accept(ContentType.XML)
            .post("/card/enable-pin")
            .then()
              .statusCode(204);
              // Envelope.Body.DisablePinResponse.Status.Result=OK
              // Envelope.Body.DisablePinResponse.Status.PinResult=OK
    }

  @Test
  public void testDisablePin_success() {
         // insert eGK card with [Kartentyp=eGK G2.1] into the terminal
         given()
            .when()
              .header("x-mandant-id", terminalService.mandantId())
              .header("x-client-system-id", terminalService.clientSystemId())
              .header("x-workplace-id", terminalService.workplaceId())
              .accept(ContentType.XML)
            .post("/card/disable-pin")
            .then()
              .statusCode(204);
              // Envelope.Body.DisablePinResponse.Status.Result=OK
              // Envelope.Body.DisablePinResponse.Status.PinResult=OK
    }

}