
package de.gematik.ws.conn.eventservice.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="SubscribeRenewals"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}SubscriptionRenewal" maxOccurs="1000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "subscribeRenewals"
})
@XmlRootElement(name = "RenewSubscriptionsResponse")
public class RenewSubscriptionsResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "SubscribeRenewals", required = true)
    protected RenewSubscriptionsResponse.SubscribeRenewals subscribeRenewals;

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
     * Gets the value of the subscribeRenewals property.
     * 
     * @return
     *     possible object is
     *     {@link RenewSubscriptionsResponse.SubscribeRenewals }
     *     
     */
    public RenewSubscriptionsResponse.SubscribeRenewals getSubscribeRenewals() {
        return subscribeRenewals;
    }

    /**
     * Sets the value of the subscribeRenewals property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewSubscriptionsResponse.SubscribeRenewals }
     *     
     */
    public void setSubscribeRenewals(RenewSubscriptionsResponse.SubscribeRenewals value) {
        this.subscribeRenewals = value;
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
     *         &lt;element ref="{http://ws.gematik.de/conn/EventService/v7.2}SubscriptionRenewal" maxOccurs="1000"/&gt;
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
        "subscriptionRenewal"
    })
    public static class SubscribeRenewals {

        @XmlElement(name = "SubscriptionRenewal", required = true)
        protected List<SubscriptionRenewal> subscriptionRenewal;

        /**
         * Gets the value of the subscriptionRenewal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriptionRenewal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriptionRenewal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubscriptionRenewal }
         * 
         * 
         */
        public List<SubscriptionRenewal> getSubscriptionRenewal() {
            if (subscriptionRenewal == null) {
                subscriptionRenewal = new ArrayList<SubscriptionRenewal>();
            }
            return this.subscriptionRenewal;
        }

    }

}
