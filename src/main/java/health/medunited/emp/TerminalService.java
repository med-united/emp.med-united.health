package health.medunited.emp;

@io.smallrye.config.ConfigMapping(prefix = "terminal")
public interface TerminalService {
    String host();
    String amtsService();
    String eventService();
    String cardService();
    String mandantId();
    String clientSystemId();
    String workplaceId();
    String keystoreFile();
    String keystorePassword();
  
    default String amtsServiceEndpoint(){
        return host()+amtsService();
    }

    default String eventServiceEndpoint(){
        return host()+eventService();
    }

    default String cardServiceEndpoint(){
        return host()+cardService();
    }
    
}
