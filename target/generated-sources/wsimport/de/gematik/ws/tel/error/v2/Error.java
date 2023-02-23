
package de.gematik.ws.tel.error.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Trace" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Instance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LogReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CompType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Detail" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "messageID",
    "timestamp",
    "trace"
})
@XmlRootElement(name = "Error")
public class Error {

    @XmlElement(name = "MessageID", required = true, defaultValue = "")
    protected String messageID;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Trace", required = true)
    protected List<Error.Trace> trace;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
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

    /**
     * Gets the value of the trace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error.Trace }
     * 
     * 
     */
    public List<Error.Trace> getTrace() {
        if (trace == null) {
            trace = new ArrayList<Error.Trace>();
        }
        return this.trace;
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
     *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Instance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LogReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CompType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Detail" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "eventID",
        "instance",
        "logReference",
        "compType",
        "code",
        "severity",
        "errorType",
        "errorText",
        "detail"
    })
    public static class Trace {

        @XmlElement(name = "EventID", required = true, defaultValue = "")
        protected String eventID;
        @XmlElement(name = "Instance", required = true, defaultValue = "")
        protected String instance;
        @XmlElement(name = "LogReference", required = true, defaultValue = "")
        protected String logReference;
        @XmlElement(name = "CompType", required = true)
        protected String compType;
        @XmlElement(name = "Code", required = true)
        protected BigInteger code;
        @XmlElement(name = "Severity", required = true)
        protected String severity;
        @XmlElement(name = "ErrorType", required = true)
        protected String errorType;
        @XmlElement(name = "ErrorText", required = true)
        protected String errorText;
        @XmlElement(name = "Detail")
        protected Error.Trace.Detail detail;

        /**
         * Gets the value of the eventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventID() {
            return eventID;
        }

        /**
         * Sets the value of the eventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventID(String value) {
            this.eventID = value;
        }

        /**
         * Gets the value of the instance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstance() {
            return instance;
        }

        /**
         * Sets the value of the instance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstance(String value) {
            this.instance = value;
        }

        /**
         * Gets the value of the logReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogReference() {
            return logReference;
        }

        /**
         * Sets the value of the logReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogReference(String value) {
            this.logReference = value;
        }

        /**
         * Gets the value of the compType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompType() {
            return compType;
        }

        /**
         * Sets the value of the compType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompType(String value) {
            this.compType = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCode(BigInteger value) {
            this.code = value;
        }

        /**
         * Gets the value of the severity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeverity() {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeverity(String value) {
            this.severity = value;
        }

        /**
         * Gets the value of the errorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorType() {
            return errorType;
        }

        /**
         * Sets the value of the errorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorType(String value) {
            this.errorType = value;
        }

        /**
         * Gets the value of the errorText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorText() {
            return errorText;
        }

        /**
         * Sets the value of the errorText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorText(String value) {
            this.errorText = value;
        }

        /**
         * Gets the value of the detail property.
         * 
         * @return
         *     possible object is
         *     {@link Error.Trace.Detail }
         *     
         */
        public Error.Trace.Detail getDetail() {
            return detail;
        }

        /**
         * Sets the value of the detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link Error.Trace.Detail }
         *     
         */
        public void setDetail(Error.Trace.Detail value) {
            this.detail = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Detail {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Encoding")
            protected String encoding;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the encoding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncoding() {
                return encoding;
            }

            /**
             * Sets the value of the encoding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncoding(String value) {
                this.encoding = value;
            }

        }

    }

}
