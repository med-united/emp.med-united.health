package health.medunited.emp;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

    @Test
    public void testHelloGreetingEndpoint() {
        given()
          .when().get("/hello/greeting/RESTEasy")
          .then()
             .statusCode(200)
             .body(is("Greetings RESTEasy"));
    }

}