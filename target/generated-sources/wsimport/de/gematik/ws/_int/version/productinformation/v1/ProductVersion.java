
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Local" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductVersionLocal"/&gt;
 *         &lt;element name="Central" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductVersionCentral"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVersion", propOrder = {
    "local",
    "central"
})
public class ProductVersion {

    @XmlElement(name = "Local")
    protected ProductVersionLocal local;
    @XmlElement(name = "Central")
    protected String central;

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersionLocal }
     *     
     */
    public ProductVersionLocal getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersionLocal }
     *     
     */
    public void setLocal(ProductVersionLocal value) {
        this.local = value;
    }

    /**
     * Gets the value of the central property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentral() {
        return central;
    }

    /**
     * Sets the value of the central property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentral(String value) {
        this.central = value;
    }

}
