package health.medunited.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {
    
    @Test
    void testGreeting(){
        GreetingService gs = new GreetingService();

        assertEquals("Greetings RestEasy", gs.greeting("RestEasy"));
    }
}
