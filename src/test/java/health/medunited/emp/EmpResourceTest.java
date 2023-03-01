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
    public void testHelloEndpoint_success() {
         given()
           .when()
             .header("X-Mandant-Id", "Mandant1")
             .header("X-Client-System-Id", "ClientID1")
             .header("X-Workplace-Id", "Workplace1")
             .accept(ContentType.XML)
             .get("/emp")
           .then()
              .statusCode(200);
    }

    @Test
    public void testHelloEndpoint_wrongMandantId() {
         given()
           .when()
             .header("X-Mandant-Id", "MandantX")
             .header("X-Client-System-Id", "ClientID1")
             .header("X-Workplace-Id", "Workplace1")
             .get("/emp")
           .then()
              .statusCode(500);
    }

    @BeforeAll
    public static void init(){
      RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}