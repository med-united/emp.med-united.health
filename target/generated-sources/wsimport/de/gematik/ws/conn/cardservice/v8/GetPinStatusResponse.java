
package de.gematik.ws.conn.cardservice.v8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.Status;


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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Status"/&gt;
 *         &lt;element name="PinStatus" type="{http://ws.gematik.de/conn/CardService/v8.1}PinStatusEnum" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "status",
    "pinStatus",
    "leftTries"
})
@XmlRootElement(name = "GetPinStatusResponse")
public class GetPinStatusResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "PinStatus")
    @XmlSchemaType(name = "string")
    protected PinStatusEnum pinStatus;
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
     * Gets the value of the pinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PinStatusEnum }
     *     
     */
    public PinStatusEnum getPinStatus() {
        return pinStatus;
    }

    /**
     * Sets the value of the pinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinStatusEnum }
     *     
     */
    public void setPinStatus(PinStatusEnum value) {
        this.pinStatus = value;
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
