
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}SubscriptionID"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}TerminationTime"/&gt;
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
    "subscriptionID",
    "terminationTime"
})
@XmlRootElement(name = "SubscribeResponse")
public class SubscribeResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "SubscriptionID", required = true)
    protected String subscriptionID;
    @XmlElement(name = "TerminationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;

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
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the terminationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationTime() {
        return terminationTime;
    }

    /**
     * Sets the value of the terminationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

}
