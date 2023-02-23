
package de.gematik.ws.conn.amts.amtsservice.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AMTSService", targetNamespace = "http://ws.gematik.de/conn/amts/AMTSService/v1.0", wsdlLocation = "file:/home/ruszki/Documents/med-united/emp-backend/src/main/wsdl/conn/amtss/AMTSService.wsdl")
public class AMTSService
    extends Service
{

    private final static URL AMTSSERVICE_WSDL_LOCATION;
    private final static WebServiceException AMTSSERVICE_EXCEPTION;
    private final static QName AMTSSERVICE_QNAME = new QName("http://ws.gematik.de/conn/amts/AMTSService/v1.0", "AMTSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/ruszki/Documents/med-united/emp-backend/src/main/wsdl/conn/amtss/AMTSService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AMTSSERVICE_WSDL_LOCATION = url;
        AMTSSERVICE_EXCEPTION = e;
    }

    public AMTSService() {
        super(__getWsdlLocation(), AMTSSERVICE_QNAME);
    }

    public AMTSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AMTSSERVICE_QNAME, features);
    }

    public AMTSService(URL wsdlLocation) {
        super(wsdlLocation, AMTSSERVICE_QNAME);
    }

    public AMTSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AMTSSERVICE_QNAME, features);
    }

    public AMTSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AMTSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AMTSServicePortType
     */
    @WebEndpoint(name = "AMTSServicePort")
    public AMTSServicePortType getAMTSServicePort() {
        return super.getPort(new QName("http://ws.gematik.de/conn/amts/AMTSService/v1.0", "AMTSServicePort"), AMTSServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AMTSServicePortType
     */
    @WebEndpoint(name = "AMTSServicePort")
    public AMTSServicePortType getAMTSServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gematik.de/conn/amts/AMTSService/v1.0", "AMTSServicePort"), AMTSServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AMTSSERVICE_EXCEPTION!= null) {
            throw AMTSSERVICE_EXCEPTION;
        }
        return AMTSSERVICE_WSDL_LOCATION;
    }

}
