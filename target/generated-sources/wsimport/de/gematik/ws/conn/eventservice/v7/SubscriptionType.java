
package de.gematik.ws.conn.eventservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}SubscriptionID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}TerminationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}EventTo"/&gt;
 *         &lt;element name="Topic" type="{http://ws.gematik.de/conn/EventService/v7.2}TopicType"/&gt;
 *         &lt;element name="Filter" type="{http://ws.gematik.de/conn/EventService/v7.2}FilterType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionType", propOrder = {
    "subscriptionID",
    "terminationTime",
    "eventTo",
    "topic",
    "filter"
})
public class SubscriptionType {

    @XmlElement(name = "SubscriptionID")
    protected String subscriptionID;
    @XmlElement(name = "TerminationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;
    @XmlElement(name = "EventTo", required = true)
    protected String eventTo;
    @XmlElement(name = "Topic", required = true)
    protected String topic;
    @XmlElement(name = "Filter")
    protected String filter;

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

    /**
     * Gets the value of the eventTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTo() {
        return eventTo;
    }

    /**
     * Sets the value of the eventTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTo(String value) {
        this.eventTo = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

}
