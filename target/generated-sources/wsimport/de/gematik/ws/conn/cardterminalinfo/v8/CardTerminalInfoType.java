
package de.gematik.ws.conn.cardterminalinfo.v8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.gematik.ws._int.version.productinformation.v1.ProductInformation;
import de.gematik.ws.conn.connectorcommon.v5.WorkplaceIds;


/**
 * Kartenterminal
 * 
 * <p>Java class for CardTerminalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTerminalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductInformation"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CtId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}WorkplaceIds"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MacAddress" type="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}mac"/&gt;
 *         &lt;element name="IPAddress" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="IPV4Address" type="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}ipv4"/&gt;
 *                   &lt;element name="IPV6Address" type="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}ipv6"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Slots" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="IS_PHYSICAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTerminalInfoType", propOrder = {
    "productInformation",
    "ctId",
    "workplaceIds",
    "name",
    "macAddress",
    "ipAddress",
    "slots",
    "isphysical",
    "connected"
})
public class CardTerminalInfoType {

    @XmlElement(name = "ProductInformation", namespace = "http://ws.gematik.de/int/version/ProductInformation/v1.1", required = true)
    protected ProductInformation productInformation;
    @XmlElement(name = "CtId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    protected String ctId;
    @XmlElement(name = "WorkplaceIds", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected WorkplaceIds workplaceIds;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "MacAddress", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String macAddress;
    @XmlElement(name = "IPAddress")
    protected CardTerminalInfoType.IPAddress ipAddress;
    @XmlElement(name = "Slots", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger slots;
    @XmlElement(name = "IS_PHYSICAL")
    protected boolean isphysical;
    @XmlElement(name = "Connected")
    protected boolean connected;

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation }
     *     
     */
    public ProductInformation getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation }
     *     
     */
    public void setProductInformation(ProductInformation value) {
        this.productInformation = value;
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
     * Gets the value of the workplaceIds property.
     * 
     * @return
     *     possible object is
     *     {@link WorkplaceIds }
     *     
     */
    public WorkplaceIds getWorkplaceIds() {
        return workplaceIds;
    }

    /**
     * Sets the value of the workplaceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkplaceIds }
     *     
     */
    public void setWorkplaceIds(WorkplaceIds value) {
        this.workplaceIds = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CardTerminalInfoType.IPAddress }
     *     
     */
    public CardTerminalInfoType.IPAddress getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTerminalInfoType.IPAddress }
     *     
     */
    public void setIPAddress(CardTerminalInfoType.IPAddress value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the slots property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlots(BigInteger value) {
        this.slots = value;
    }

    /**
     * Gets the value of the isphysical property.
     * 
     */
    public boolean isISPHYSICAL() {
        return isphysical;
    }

    /**
     * Sets the value of the isphysical property.
     * 
     */
    public void setISPHYSICAL(boolean value) {
        this.isphysical = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="IPV4Address" type="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}ipv4"/&gt;
     *         &lt;element name="IPV6Address" type="{http://ws.gematik.de/conn/CardTerminalInfo/v8.0}ipv6"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ipv4Address",
        "ipv6Address"
    })
    public static class IPAddress {

        @XmlElement(name = "IPV4Address")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ipv4Address;
        @XmlElement(name = "IPV6Address")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ipv6Address;

        /**
         * Gets the value of the ipv4Address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIPV4Address() {
            return ipv4Address;
        }

        /**
         * Sets the value of the ipv4Address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIPV4Address(String value) {
            this.ipv4Address = value;
        }

        /**
         * Gets the value of the ipv6Address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIPV6Address() {
            return ipv6Address;
        }

        /**
         * Sets the value of the ipv6Address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIPV6Address(String value) {
            this.ipv6Address = value;
        }

    }

}
