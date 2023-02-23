
package de.gematik.ws.conn.eventservice.wsdl.v7;

import javax.xml.ws.WebFault;
import de.gematik.ws.tel.error.v2.Error;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Error", targetNamespace = "http://ws.gematik.de/tel/error/v2.0")
public class FaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Error faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public FaultMessage(String message, Error faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public FaultMessage(String message, Error faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: de.gematik.ws.tel.error.v2.Error
     */
    public Error getFaultInfo() {
        return faultInfo;
    }

}
