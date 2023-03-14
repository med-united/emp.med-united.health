package health.medunited.emp;

@io.smallrye.config.ConfigMapping(prefix = "terminal")
public interface TerminalService {
    String host();
    String amtsService();
    String eventService();
    String cardService();
    String mandantId();
    String clientSystemId();
    String userId();
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

    default String headerNameMandantId(){
        return "x-mandant-id";
    }

    default String headerNameClientSystemId(){
        return "x-client-system-id";
    }

    default String headerNameWorkplaceId(){
        return "x-workplace-id";
    }

    default String headerNameUserId(){
        return "x-user-id";
    }
    
}
