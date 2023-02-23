
package de.gematik.ws.conn.connectorcontext.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}MandantId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}ClientSystemId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}WorkplaceId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}UserId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextType", propOrder = {
    "mandantId",
    "clientSystemId",
    "workplaceId",
    "userId"
})
public class ContextType {

    @XmlElement(name = "MandantId", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String mandantId;
    @XmlElement(name = "ClientSystemId", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String clientSystemId;
    @XmlElement(name = "WorkplaceId", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String workplaceId;
    @XmlElement(name = "UserId", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0")
    protected String userId;

    /**
     * Die ID des Mandanten.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandantId() {
        return mandantId;
    }

    /**
     * Sets the value of the mandantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandantId(String value) {
        this.mandantId = value;
    }

    /**
     * Die ID des Clientsystems, von dem bzw. für das der Aufruf des Konnektors erfolgt.
     * 					Unter einem Clientsystem wird hier ein einzelnes oder eine Gruppe von Systemen verstanden,
     * 					welche im LAN des Leistungserbringers auf die Clientsystem-Schnittstelle des Konnektors zugreifen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSystemId() {
        return clientSystemId;
    }

    /**
     * Sets the value of the clientSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSystemId(String value) {
        this.clientSystemId = value;
    }

    /**
     * Die ID des Arbeitsplatzes, von dem bzw. für den der Aufruf des Konnektors erfolgt.
     * 					Bei fachlichen Aufrufen ist sie immer erforderlich.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceId() {
        return workplaceId;
    }

    /**
     * Sets the value of the workplaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceId(String value) {
        this.workplaceId = value;
    }

    /**
     * Die ID des Nutzers im Primärsystem. Ist nur dann erforderlich, falls ein HBA verwendet wird.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
