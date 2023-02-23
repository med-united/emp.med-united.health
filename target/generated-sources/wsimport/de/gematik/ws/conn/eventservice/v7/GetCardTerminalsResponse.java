
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.cardterminalinfo.v8.CardTerminals;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}CardTerminals"/&gt;
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
    "cardTerminals"
})
@XmlRootElement(name = "GetCardTerminalsResponse")
public class GetCardTerminalsResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "CardTerminals", namespace = "http://ws.gematik.de/conn/CardTerminalInfo/v8.0", required = true)
    protected CardTerminals cardTerminals;

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
     * Gets the value of the cardTerminals property.
     * 
     * @return
     *     possible object is
     *     {@link CardTerminals }
     *     
     */
    public CardTerminals getCardTerminals() {
        return cardTerminals;
    }

    /**
     * Sets the value of the cardTerminals property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTerminals }
     *     
     */
    public void setCardTerminals(CardTerminals value) {
        this.cardTerminals = value;
    }

}
