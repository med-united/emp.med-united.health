
package de.gematik.ws.conn.eventservice.v7;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CtId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}SlotId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CardType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mandant-wide" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "ctId",
    "slotId",
    "cardType"
})
@XmlRootElement(name = "GetCards")
public class GetCards {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "CtId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0")
    protected String ctId;
    @XmlElement(name = "SlotId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger slotId;
    @XmlElement(name = "CardType", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0")
    @XmlSchemaType(name = "string")
    protected CardTypeType cardType;
    @XmlAttribute(name = "mandant-wide")
    protected Boolean mandantWide;

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
     * Gets the value of the ctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtId() {
        return ctId;
    }

    /**
     * Sets the value of the ctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtId(String value) {
        this.ctId = value;
    }

    /**
     * Gets the value of the slotId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlotId() {
        return slotId;
    }

    /**
     * Sets the value of the slotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlotId(BigInteger value) {
        this.slotId = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeType }
     *     
     */
    public CardTypeType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeType }
     *     
     */
    public void setCardType(CardTypeType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the mandantWide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMandantWide() {
        if (mandantWide == null) {
            return false;
        } else {
            return mandantWide;
        }
    }

    /**
     * Sets the value of the mandantWide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandantWide(Boolean value) {
        this.mandantWide = value;
    }

}
