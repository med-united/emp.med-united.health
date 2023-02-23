
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMiscellaneous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMiscellaneous"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductVendorName" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductVendorName"/&gt;
 *         &lt;element name="ProductName" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMiscellaneous", propOrder = {
    "productVendorName",
    "productName"
})
public class ProductMiscellaneous {

    @XmlElement(name = "ProductVendorName", required = true)
    protected String productVendorName;
    @XmlElement(name = "ProductName", required = true)
    protected String productName;

    /**
     * Gets the value of the productVendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVendorName() {
        return productVendorName;
    }

    /**
     * Sets the value of the productVendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVendorName(String value) {
        this.productVendorName = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
