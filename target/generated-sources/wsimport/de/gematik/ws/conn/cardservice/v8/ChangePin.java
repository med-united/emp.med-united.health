
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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}CardHandle"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}PinTyp"/&gt;
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
    "cardHandle",
    "pinTyp"
})
@XmlRootElement(name = "ChangePin")
public class ChangePin {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "CardHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String cardHandle;
    @XmlElement(name = "PinTyp", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    protected String pinTyp;

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
     * Gets the value of the cardHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHandle() {
        return cardHandle;
    }

    /**
     * Sets the value of the cardHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHandle(String value) {
        this.cardHandle = value;
    }

    /**
     * Gets the value of the pinTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinTyp() {
        return pinTyp;
    }

    /**
     * Sets the value of the pinTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinTyp(String value) {
        this.pinTyp = value;
    }

}
