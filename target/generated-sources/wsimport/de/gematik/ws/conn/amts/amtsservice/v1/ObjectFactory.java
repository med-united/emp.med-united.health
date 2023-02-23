
package de.gematik.ws.conn.amts.amtsservice.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.amts.amtsservice.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.amts.amtsservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadMP }
     * 
     */
    public ReadMP createReadMP() {
        return new ReadMP();
    }

    /**
     * Create an instance of {@link ReadMPResponse }
     * 
     */
    public ReadMPResponse createReadMPResponse() {
        return new ReadMPResponse();
    }

    /**
     * Create an instance of {@link WriteMP }
     * 
     */
    public WriteMP createWriteMP() {
        return new WriteMP();
    }

    /**
     * Create an instance of {@link WriteMPResponse }
     * 
     */
    public WriteMPResponse createWriteMPResponse() {
        return new WriteMPResponse();
    }

    /**
     * Create an instance of {@link ReadConsent }
     * 
     */
    public ReadConsent createReadConsent() {
        return new ReadConsent();
    }

    /**
     * Create an instance of {@link ReadConsentResponse }
     * 
     */
    public ReadConsentResponse createReadConsentResponse() {
        return new ReadConsentResponse();
    }

    /**
     * Create an instance of {@link WriteConsent }
     * 
     */
    public WriteConsent createWriteConsent() {
        return new WriteConsent();
    }

    /**
     * Create an instance of {@link WriteConsentResponse }
     * 
     */
    public WriteConsentResponse createWriteConsentResponse() {
        return new WriteConsentResponse();
    }

    /**
     * Create an instance of {@link DeleteConsent }
     * 
     */
    public DeleteConsent createDeleteConsent() {
        return new DeleteConsent();
    }

    /**
     * Create an instance of {@link DeleteConsentResponse }
     * 
     */
    public DeleteConsentResponse createDeleteConsentResponse() {
        return new DeleteConsentResponse();
    }

}
