
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductVersionLocal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductVersionLocal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HWVersion" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}HWVersion"/&gt;
 *         &lt;element name="FWVersion" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}FWVersion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVersionLocal", propOrder = {
    "hwVersion",
    "fwVersion"
})
public class ProductVersionLocal {

    @XmlElement(name = "HWVersion", required = true)
    protected String hwVersion;
    @XmlElement(name = "FWVersion", required = true)
    protected String fwVersion;

    /**
     * Gets the value of the hwVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHWVersion() {
        return hwVersion;
    }

    /**
     * Sets the value of the hwVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHWVersion(String value) {
        this.hwVersion = value;
    }

    /**
     * Gets the value of the fwVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWVersion() {
        return fwVersion;
    }

    /**
     * Sets the value of the fwVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWVersion(String value) {
        this.fwVersion = value;
    }

}
