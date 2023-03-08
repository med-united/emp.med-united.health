package health.medunited.emp.producer;

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
        contextType.setMandantId(httpServletRequest.getHeader("x-mandant-id"));
        contextType.setClientSystemId(httpServletRequest.getHeader("x-client-system-id"));
        contextType.setWorkplaceId(httpServletRequest.getHeader("x-workplace-id"));
        contextType.setUserId(httpServletRequest.getHeader("x-user-id"));
        return contextType;
    }

    public static ContextType clone(ContextType context){
        ContextType contextType = new ContextType();
        contextType.setClientSystemId(context.getClientSystemId());
        contextType.setMandantId(context.getMandantId());
        contextType.setWorkplaceId(context.getWorkplaceId());
        contextType.setUserId(context.getUserId());
        return contextType;
    }
}