
package de.gematik.ws.conn.connectorcontext.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.connectorcontext.v2 package. 
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

    private final static QName _Context_QNAME = new QName("http://ws.gematik.de/conn/ConnectorContext/v2.0", "Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.connectorcontext.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContextType }
     * 
     */
    public ContextType createContextType() {
        return new ContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContextType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", name = "Context")
    public JAXBElement<ContextType> createContext(ContextType value) {
        return new JAXBElement<ContextType>(_Context_QNAME, ContextType.class, null, value);
    }

}
