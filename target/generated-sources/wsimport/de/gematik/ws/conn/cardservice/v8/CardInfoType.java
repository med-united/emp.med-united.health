
package de.gematik.ws.conn.cardservice.v8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;


/**
 * <p>Java class for CardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}CardHandle"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CardType"/&gt;
 *         &lt;element name="CardVersion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COSVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType"/&gt;
 *                   &lt;element name="ObjectSystemVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType"/&gt;
 *                   &lt;element name="CardPTPersVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="DataStructureVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="LoggingVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="ATRVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="GDOVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="KeyInfoVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}Iccsn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CtId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}SlotId"/&gt;
 *         &lt;element name="InsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardService/v8.1}CardHolderName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardService/v8.1}Kvnr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardService/v8.1}CertificateExpirationDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoType", propOrder = {
    "cardHandle",
    "cardType",
    "cardVersion",
    "iccsn",
    "ctId",
    "slotId",
    "insertTime",
    "cardHolderName",
    "kvnr",
    "certificateExpirationDate"
})
@XmlSeeAlso({
    CardInfoErrType.class
})
public class CardInfoType {

    @XmlElement(name = "CardHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String cardHandle;
    @XmlElement(name = "CardType", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    @XmlSchemaType(name = "string")
    protected CardTypeType cardType;
    @XmlElement(name = "CardVersion")
    protected CardInfoType.CardVersion cardVersion;
    @XmlElement(name = "Iccsn", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0")
    protected String iccsn;
    @XmlElement(name = "CtId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    protected String ctId;
    @XmlElement(name = "SlotId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger slotId;
    @XmlElement(name = "InsertTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertTime;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "Kvnr")
    protected String kvnr;
    @XmlElement(name = "CertificateExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificateExpirationDate;

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
     * Gets the value of the cardVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType.CardVersion }
     *     
     */
    public CardInfoType.CardVersion getCardVersion() {
        return cardVersion;
    }

    /**
     * Sets the value of the cardVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType.CardVersion }
     *     
     */
    public void setCardVersion(CardInfoType.CardVersion value) {
        this.cardVersion = value;
    }

    /**
     * Gets the value of the iccsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccsn() {
        return iccsn;
    }

    /**
     * Sets the value of the iccsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccsn(String value) {
        this.iccsn = value;
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
     * Gets the value of the insertTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertTime() {
        return insertTime;
    }

    /**
     * Sets the value of the insertTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertTime(XMLGregorianCalendar value) {
        this.insertTime = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the kvnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvnr() {
        return kvnr;
    }

    /**
     * Sets the value of the kvnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvnr(String value) {
        this.kvnr = value;
    }

    /**
     * Gets the value of the certificateExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    /**
     * Sets the value of the certificateExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateExpirationDate(XMLGregorianCalendar value) {
        this.certificateExpirationDate = value;
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
     *         &lt;element name="COSVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType"/&gt;
     *         &lt;element name="ObjectSystemVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType"/&gt;
     *         &lt;element name="CardPTPersVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
     *         &lt;element name="DataStructureVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
     *         &lt;element name="LoggingVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
     *         &lt;element name="ATRVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
     *         &lt;element name="GDOVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
     *         &lt;element name="KeyInfoVersion" type="{http://ws.gematik.de/conn/CardService/v8.1}VersionInfoType" minOccurs="0"/&gt;
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
        "cosVersion",
        "objectSystemVersion",
        "cardPTPersVersion",
        "dataStructureVersion",
        "loggingVersion",
        "atrVersion",
        "gdoVersion",
        "keyInfoVersion"
    })
    public static class CardVersion {

        @XmlElement(name = "COSVersion", required = true)
        protected VersionInfoType cosVersion;
        @XmlElement(name = "ObjectSystemVersion", required = true)
        protected VersionInfoType objectSystemVersion;
        @XmlElement(name = "CardPTPersVersion")
        protected VersionInfoType cardPTPersVersion;
        @XmlElement(name = "DataStructureVersion")
        protected VersionInfoType dataStructureVersion;
        @XmlElement(name = "LoggingVersion")
        protected VersionInfoType loggingVersion;
        @XmlElement(name = "ATRVersion")
        protected VersionInfoType atrVersion;
        @XmlElement(name = "GDOVersion")
        protected VersionInfoType gdoVersion;
        @XmlElement(name = "KeyInfoVersion")
        protected VersionInfoType keyInfoVersion;

        /**
         * Gets the value of the cosVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getCOSVersion() {
            return cosVersion;
        }

        /**
         * Sets the value of the cosVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setCOSVersion(VersionInfoType value) {
            this.cosVersion = value;
        }

        /**
         * Gets the value of the objectSystemVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getObjectSystemVersion() {
            return objectSystemVersion;
        }

        /**
         * Sets the value of the objectSystemVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setObjectSystemVersion(VersionInfoType value) {
            this.objectSystemVersion = value;
        }

        /**
         * Gets the value of the cardPTPersVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getCardPTPersVersion() {
            return cardPTPersVersion;
        }

        /**
         * Sets the value of the cardPTPersVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setCardPTPersVersion(VersionInfoType value) {
            this.cardPTPersVersion = value;
        }

        /**
         * Gets the value of the dataStructureVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getDataStructureVersion() {
            return dataStructureVersion;
        }

        /**
         * Sets the value of the dataStructureVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setDataStructureVersion(VersionInfoType value) {
            this.dataStructureVersion = value;
        }

        /**
         * Gets the value of the loggingVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getLoggingVersion() {
            return loggingVersion;
        }

        /**
         * Sets the value of the loggingVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setLoggingVersion(VersionInfoType value) {
            this.loggingVersion = value;
        }

        /**
         * Gets the value of the atrVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getATRVersion() {
            return atrVersion;
        }

        /**
         * Sets the value of the atrVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setATRVersion(VersionInfoType value) {
            this.atrVersion = value;
        }

        /**
         * Gets the value of the gdoVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getGDOVersion() {
            return gdoVersion;
        }

        /**
         * Sets the value of the gdoVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setGDOVersion(VersionInfoType value) {
            this.gdoVersion = value;
        }

        /**
         * Gets the value of the keyInfoVersion property.
         * 
         * @return
         *     possible object is
         *     {@link VersionInfoType }
         *     
         */
        public VersionInfoType getKeyInfoVersion() {
            return keyInfoVersion;
        }

        /**
         * Sets the value of the keyInfoVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersionInfoType }
         *     
         */
        public void setKeyInfoVersion(VersionInfoType value) {
            this.keyInfoVersion = value;
        }

    }

}
