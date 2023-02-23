
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="UnsignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/&gt;
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
    "signedProperties",
    "unsignedProperties"
})
@XmlRootElement(name = "Properties")
public class Properties {

    @XmlElement(name = "SignedProperties")
    protected PropertiesType signedProperties;
    @XmlElement(name = "UnsignedProperties")
    protected PropertiesType unsignedProperties;

    /**
     * Gets the value of the signedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getSignedProperties() {
        return signedProperties;
    }

    /**
     * Sets the value of the signedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setSignedProperties(PropertiesType value) {
        this.signedProperties = value;
    }

    /**
     * Gets the value of the unsignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Sets the value of the unsignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setUnsignedProperties(PropertiesType value) {
        this.unsignedProperties = value;
    }

}
