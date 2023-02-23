
package de.gematik.ws.conn.amts.amtsservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MPData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="EGKValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EGKUsage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "mpData",
    "egkValid",
    "egkUsage"
})
@XmlRootElement(name = "ReadMPResponse")
public class ReadMPResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "MPData", required = true)
    protected byte[] mpData;
    @XmlElement(name = "EGKValid")
    protected boolean egkValid;
    @XmlElement(name = "EGKUsage")
    protected int egkUsage;

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
     * Gets the value of the mpData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMPData() {
        return mpData;
    }

    /**
     * Sets the value of the mpData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMPData(byte[] value) {
        this.mpData = value;
    }

    /**
     * Gets the value of the egkValid property.
     * 
     */
    public boolean isEGKValid() {
        return egkValid;
    }

    /**
     * Sets the value of the egkValid property.
     * 
     */
    public void setEGKValid(boolean value) {
        this.egkValid = value;
    }

    /**
     * Gets the value of the egkUsage property.
     * 
     */
    public int getEGKUsage() {
        return egkUsage;
    }

    /**
     * Sets the value of the egkUsage property.
     * 
     */
    public void setEGKUsage(int value) {
        this.egkUsage = value;
    }

}
