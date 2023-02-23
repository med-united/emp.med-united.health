
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}HpcHandle"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}SmcHandle"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "hpcHandle",
    "smcHandle"
})
@XmlRootElement(name = "AuthorizeSmc")
public class AuthorizeSmc {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "HpcHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String hpcHandle;
    @XmlElement(name = "SmcHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String smcHandle;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

    /**
     * Gets the value of the hpcHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpcHandle() {
        return hpcHandle;
    }

    /**
     * Sets the value of the hpcHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpcHandle(String value) {
        this.hpcHandle = value;
    }

    /**
     * Gets the value of the smcHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmcHandle() {
        return smcHandle;
    }

    /**
     * Sets the value of the smcHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmcHandle(String value) {
        this.smcHandle = value;
    }

}
