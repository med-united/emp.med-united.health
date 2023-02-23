
package de.gematik.ws.conn.cardterminalinfo.v8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.cardterminalinfo.v8 package. 
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

    private final static QName _CardTerminal_QNAME = new QName("http://ws.gematik.de/conn/CardTerminalInfo/v8.0", "CardTerminal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.cardterminalinfo.v8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardTerminalInfoType }
     * 
     */
    public CardTerminalInfoType createCardTerminalInfoType() {
        return new CardTerminalInfoType();
    }

    /**
     * Create an instance of {@link CardTerminals }
     * 
     */
    public CardTerminals createCardTerminals() {
        return new CardTerminals();
    }

    /**
     * Create an instance of {@link CardTerminalInfoType.IPAddress }
     * 
     */
    public CardTerminalInfoType.IPAddress createCardTerminalInfoTypeIPAddress() {
        return new CardTerminalInfoType.IPAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTerminalInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTerminalInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardTerminalInfo/v8.0", name = "CardTerminal")
    public JAXBElement<CardTerminalInfoType> createCardTerminal(CardTerminalInfoType value) {
        return new JAXBElement<CardTerminalInfoType>(_CardTerminal_QNAME, CardTerminalInfoType.class, null, value);
    }

}
