package health.medunited.emp;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

@QuarkusTest
public class CardResourceTest {
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
  public void testDisablePin_success() {
         given()
            .when()
              .header("x-mandant-id", mandantId)
              .header("x-client-system-id", clientSystemId)
              .header("x-workplace-id", workplaceId)
              .accept(ContentType.XML)
            .post("/card/disable-pin")
            .then()
              .statusCode(200);
    }

}