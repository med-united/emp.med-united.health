
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductVendorID" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductVendorID"/&gt;
 *         &lt;element name="ProductCode" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductCode"/&gt;
 *         &lt;element name="ProductVersion" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductVersion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentification", propOrder = {
    "productVendorID",
    "productCode",
    "productVersion"
})
public class ProductIdentification {

    @XmlElement(name = "ProductVendorID", required = true)
    protected String productVendorID;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "ProductVersion", required = true)
    protected ProductVersion productVersion;

    /**
     * Gets the value of the productVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVendorID() {
        return productVendorID;
    }

    /**
     * Sets the value of the productVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVendorID(String value) {
        this.productVendorID = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersion }
     *     
     */
    public ProductVersion getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersion }
     *     
     */
    public void setProductVersion(ProductVersion value) {
        this.productVersion = value;
    }

}
