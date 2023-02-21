package health.medunited.emp;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class EmpResourceTest {

    @Test
    public void testHelloEndpoint() {
         given()
           .when()
             .header("X-Mandant-Id", "Mandant1")
             .header("X-Client-System-Id", "ClientID1")
             .header("X-Workplace-Id", "Workplace1")
             .get("/emp")
           .then()
              .statusCode(200);
    }

}