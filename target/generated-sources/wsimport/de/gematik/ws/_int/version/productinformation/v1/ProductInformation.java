
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ProductTypeInformation" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductTypeInformation"/&gt;
 *         &lt;element name="ProductIdentification" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductIdentification"/&gt;
 *         &lt;element name="ProductMiscellaneous" type="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductMiscellaneous"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformation", propOrder = {
    "informationDate",
    "productTypeInformation",
    "productIdentification",
    "productMiscellaneous"
})
public class ProductInformation {

    @XmlElement(name = "InformationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar informationDate;
    @XmlElement(name = "ProductTypeInformation", required = true)
    protected ProductTypeInformation productTypeInformation;
    @XmlElement(name = "ProductIdentification", required = true)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductMiscellaneous", required = true)
    protected ProductMiscellaneous productMiscellaneous;

    /**
     * Gets the value of the informationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInformationDate() {
        return informationDate;
    }

    /**
     * Sets the value of the informationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInformationDate(XMLGregorianCalendar value) {
        this.informationDate = value;
    }

    /**
     * Gets the value of the productTypeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeInformation }
     *     
     */
    public ProductTypeInformation getProductTypeInformation() {
        return productTypeInformation;
    }

    /**
     * Sets the value of the productTypeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeInformation }
     *     
     */
    public void setProductTypeInformation(ProductTypeInformation value) {
        this.productTypeInformation = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productMiscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMiscellaneous }
     *     
     */
    public ProductMiscellaneous getProductMiscellaneous() {
        return productMiscellaneous;
    }

    /**
     * Sets the value of the productMiscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMiscellaneous }
     *     
     */
    public void setProductMiscellaneous(ProductMiscellaneous value) {
        this.productMiscellaneous = value;
    }

}
