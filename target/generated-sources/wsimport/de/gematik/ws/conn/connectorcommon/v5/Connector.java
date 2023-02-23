
package de.gematik.ws.conn.connectorcommon.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="VPNTIStatus"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ConnectionStatus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;enumeration value="Online"/&gt;
 *                         &lt;enumeration value="Offline"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VPNSISStatus"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ConnectionStatus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;enumeration value="Online"/&gt;
 *                         &lt;enumeration value="Offline"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}OperatingState"/&gt;
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
    "vpntiStatus",
    "vpnsisStatus",
    "operatingState"
})
@XmlRootElement(name = "Connector")
public class Connector {

    @XmlElement(name = "VPNTIStatus", required = true)
    protected Connector.VPNTIStatus vpntiStatus;
    @XmlElement(name = "VPNSISStatus", required = true)
    protected Connector.VPNSISStatus vpnsisStatus;
    @XmlElement(name = "OperatingState", required = true)
    protected OperatingState operatingState;

    /**
     * Gets the value of the vpntiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Connector.VPNTIStatus }
     *     
     */
    public Connector.VPNTIStatus getVPNTIStatus() {
        return vpntiStatus;
    }

    /**
     * Sets the value of the vpntiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connector.VPNTIStatus }
     *     
     */
    public void setVPNTIStatus(Connector.VPNTIStatus value) {
        this.vpntiStatus = value;
    }

    /**
     * Gets the value of the vpnsisStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Connector.VPNSISStatus }
     *     
     */
    public Connector.VPNSISStatus getVPNSISStatus() {
        return vpnsisStatus;
    }

    /**
     * Sets the value of the vpnsisStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connector.VPNSISStatus }
     *     
     */
    public void setVPNSISStatus(Connector.VPNSISStatus value) {
        this.vpnsisStatus = value;
    }

    /**
     * Gets the value of the operatingState property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingState }
     *     
     */
    public OperatingState getOperatingState() {
        return operatingState;
    }

    /**
     * Sets the value of the operatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingState }
     *     
     */
    public void setOperatingState(OperatingState value) {
        this.operatingState = value;
    }


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
     *         &lt;element name="ConnectionStatus"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;enumeration value="Online"/&gt;
     *               &lt;enumeration value="Offline"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        "connectionStatus",
        "timestamp"
    })
    public static class VPNSISStatus {

        @XmlElement(name = "ConnectionStatus", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String connectionStatus;
        @XmlElement(name = "Timestamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;

        /**
         * Gets the value of the connectionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionStatus() {
            return connectionStatus;
        }

        /**
         * Sets the value of the connectionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectionStatus(String value) {
            this.connectionStatus = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

    }


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
     *         &lt;element name="ConnectionStatus"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;enumeration value="Online"/&gt;
     *               &lt;enumeration value="Offline"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        "connectionStatus",
        "timestamp"
    })
    public static class VPNTIStatus {

        @XmlElement(name = "ConnectionStatus", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String connectionStatus;
        @XmlElement(name = "Timestamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;

        /**
         * Gets the value of the connectionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionStatus() {
            return connectionStatus;
        }

        /**
         * Sets the value of the connectionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectionStatus(String value) {
            this.connectionStatus = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

    }

}
