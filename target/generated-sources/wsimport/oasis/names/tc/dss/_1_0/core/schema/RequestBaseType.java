
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalInputs" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}InputDocuments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBaseType", propOrder = {
    "optionalInputs",
    "inputDocuments"
})
@XmlSeeAlso({
    VerifyRequest.class,
    SignRequest.class
})
public class RequestBaseType {

    @XmlElement(name = "OptionalInputs")
    protected AnyType optionalInputs;
    @XmlElement(name = "InputDocuments")
    protected InputDocuments inputDocuments;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile")
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOptionalInputs(AnyType value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the inputDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link InputDocuments }
     *     
     */
    public InputDocuments getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Sets the value of the inputDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDocuments }
     *     
     */
    public void setInputDocuments(InputDocuments value) {
        this.inputDocuments = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

}
