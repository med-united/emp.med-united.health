
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductTypeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductType" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductType"/&gt;
 *         &lt;element name="ProductTypeVersion" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductTypeVersion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeInformation", propOrder = {
    "productType",
    "productTypeVersion"
})
public class ProductTypeInformation {

    @XmlElement(name = "ProductType", required = true)
    protected String productType;
    @XmlElement(name = "ProductTypeVersion", required = true)
    protected String productTypeVersion;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productTypeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeVersion() {
        return productTypeVersion;
    }

    /**
     * Sets the value of the productTypeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeVersion(String value) {
        this.productTypeVersion = value;
    }

}
