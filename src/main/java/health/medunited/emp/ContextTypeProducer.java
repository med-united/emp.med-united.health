package health.medunited.emp;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import de.gematik.ws.conn.connectorcontext.v2.ContextType;

public class ContextTypeProducer {
    
    @Inject
    HttpServletRequest httpServletRequest;
    
    @RequestScoped
    public ContextType produce() {
        ContextType contextType = new ContextType();
        contextType.setMandantId(httpServletRequest.getHeader("X-Mandant-Id"));
        contextType.setClientSystemId(httpServletRequest.getHeader("X-Client-System-Id"));
        contextType.setWorkplaceId(httpServletRequest.getHeader("X-Workplace-Id"));
        return contextType;
    }
}