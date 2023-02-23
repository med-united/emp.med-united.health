
package de.gematik.ws._int.version.productinformation.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws._int.version.productinformation.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductInformation_QNAME = new QName("http://ws.gematik.de/int/version/ProductInformation/v1.1", "ProductInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws._int.version.productinformation.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductInformation }
     * 
     */
    public ProductInformation createProductInformation() {
        return new ProductInformation();
    }

    /**
     * Create an instance of {@link ProductVersionLocal }
     * 
     */
    public ProductVersionLocal createProductVersionLocal() {
        return new ProductVersionLocal();
    }

    /**
     * Create an instance of {@link ProductVersion }
     * 
     */
    public ProductVersion createProductVersion() {
        return new ProductVersion();
    }

    /**
     * Create an instance of {@link ProductTypeInformation }
     * 
     */
    public ProductTypeInformation createProductTypeInformation() {
        return new ProductTypeInformation();
    }

    /**
     * Create an instance of {@link ProductIdentification }
     * 
     */
    public ProductIdentification createProductIdentification() {
        return new ProductIdentification();
    }

    /**
     * Create an instance of {@link ProductMiscellaneous }
     * 
     */
    public ProductMiscellaneous createProductMiscellaneous() {
        return new ProductMiscellaneous();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/int/version/ProductInformation/v1.1", name = "ProductInformation")
    public JAXBElement<ProductInformation> createProductInformation(ProductInformation value) {
        return new JAXBElement<ProductInformation>(_ProductInformation_QNAME, ProductInformation.class, null, value);
    }

}
