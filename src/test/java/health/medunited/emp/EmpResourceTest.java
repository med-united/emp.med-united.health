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
public class EmpResourceTest {

    @Test
    public void testEmpEndpoint_success() {
         given()
           .when()
             .header("x-mandant-id", "Mandant1")
             .header("x-client-system-id", "ClientID1")
             .header("x-workplace-id", "Workplace1")
             .accept(ContentType.XML)
             .get("/emp")
           .then()
              .statusCode(200);
    }

    @Test
    public void testEmpEndpoint_wrongMandantId() {
         given()
           .when()
           .header("x-mandant-id", "WRONG_ID")
           .header("x-client-system-id", "ClientID1")
           .header("x-workplace-id", "Workplace1")
             .get("/emp")
           .then()
              .statusCode(500);
    }

    @BeforeAll
    public static void init(){
      RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}