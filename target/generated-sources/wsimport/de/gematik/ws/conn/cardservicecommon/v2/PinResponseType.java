
package de.gematik.ws.conn.cardservicecommon.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.Status;


/**
 * <p>Java class for PinResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Status"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}PinResult"/&gt;
 *         &lt;element name="LeftTries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinResponseType", propOrder = {
    "status",
    "pinResult",
    "leftTries"
})
public class PinResponseType {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "PinResult", required = true)
    @XmlSchemaType(name = "string")
    protected PinResultEnum pinResult;
    @XmlElement(name = "LeftTries")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger leftTries;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the pinResult property.
     * 
     * @return
     *     possible object is
     *     {@link PinResultEnum }
     *     
     */
    public PinResultEnum getPinResult() {
        return pinResult;
    }

    /**
     * Sets the value of the pinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinResultEnum }
     *     
     */
    public void setPinResult(PinResultEnum value) {
        this.pinResult = value;
    }

    /**
     * Gets the value of the leftTries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeftTries() {
        return leftTries;
    }

    /**
     * Sets the value of the leftTries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeftTries(BigInteger value) {
        this.leftTries = value;
    }

}
