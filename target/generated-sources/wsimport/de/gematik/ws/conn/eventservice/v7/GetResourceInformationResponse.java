
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.cardservice.v8.CardInfoType;
import de.gematik.ws.conn.cardterminalinfo.v8.CardTerminalInfoType;
import de.gematik.ws.conn.connectorcommon.v5.Connector;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/CardService/v8.1}Card" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}CardTerminal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Connector" minOccurs="0"/&gt;
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
    "card",
    "cardTerminal",
    "connector"
})
@XmlRootElement(name = "GetResourceInformationResponse")
public class GetResourceInformationResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "Card", namespace = "http://ws.gematik.de/conn/CardService/v8.1")
    protected CardInfoType card;
    @XmlElement(name = "CardTerminal", namespace = "http://ws.gematik.de/conn/CardTerminalInfo/v8.0")
    protected CardTerminalInfoType cardTerminal;
    @XmlElement(name = "Connector", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0")
    protected Connector connector;

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
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCard(CardInfoType value) {
        this.card = value;
    }

    /**
     * Gets the value of the cardTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link CardTerminalInfoType }
     *     
     */
    public CardTerminalInfoType getCardTerminal() {
        return cardTerminal;
    }

    /**
     * Sets the value of the cardTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTerminalInfoType }
     *     
     */
    public void setCardTerminal(CardTerminalInfoType value) {
        this.cardTerminal = value;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link Connector }
     *     
     */
    public Connector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connector }
     *     
     */
    public void setConnector(Connector value) {
        this.connector = value;
    }

}
