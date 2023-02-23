
package de.gematik.ws.conn.connectorcommon.v5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.connectorcommon.v5 package. 
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

    private final static QName _CardHandle_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "CardHandle");
    private final static QName _Result_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "Result");
    private final static QName _HpcHandle_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "HpcHandle");
    private final static QName _SmcHandle_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "SmcHandle");
    private final static QName _EhcHandle_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "EhcHandle");
    private final static QName _WorkplaceId_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "WorkplaceId");
    private final static QName _MandantId_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "MandantId");
    private final static QName _ClientSystemId_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "ClientSystemId");
    private final static QName _UserId_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "UserId");
    private final static QName _Document_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "Document");
    private final static QName _XmlSchema_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "XmlSchema");
    private final static QName _XslStylesheet_QNAME = new QName("http://ws.gematik.de/conn/ConnectorCommon/v5.0", "XslStylesheet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.connectorcommon.v5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Connector }
     * 
     */
    public Connector createConnector() {
        return new Connector();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link WorkplaceIds }
     * 
     */
    public WorkplaceIds createWorkplaceIds() {
        return new WorkplaceIds();
    }

    /**
     * Create an instance of {@link Connector.VPNTIStatus }
     * 
     */
    public Connector.VPNTIStatus createConnectorVPNTIStatus() {
        return new Connector.VPNTIStatus();
    }

    /**
     * Create an instance of {@link Connector.VPNSISStatus }
     * 
     */
    public Connector.VPNSISStatus createConnectorVPNSISStatus() {
        return new Connector.VPNSISStatus();
    }

    /**
     * Create an instance of {@link OperatingState }
     * 
     */
    public OperatingState createOperatingState() {
        return new OperatingState();
    }

    /**
     * Create an instance of {@link ErrorState }
     * 
     */
    public ErrorState createErrorState() {
        return new ErrorState();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "CardHandle")
    public JAXBElement<String> createCardHandle(String value) {
        return new JAXBElement<String>(_CardHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "Result")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResult(String value) {
        return new JAXBElement<String>(_Result_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "HpcHandle")
    public JAXBElement<String> createHpcHandle(String value) {
        return new JAXBElement<String>(_HpcHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "SmcHandle")
    public JAXBElement<String> createSmcHandle(String value) {
        return new JAXBElement<String>(_SmcHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "EhcHandle")
    public JAXBElement<String> createEhcHandle(String value) {
        return new JAXBElement<String>(_EhcHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "WorkplaceId")
    public JAXBElement<String> createWorkplaceId(String value) {
        return new JAXBElement<String>(_WorkplaceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "MandantId")
    public JAXBElement<String> createMandantId(String value) {
        return new JAXBElement<String>(_MandantId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "ClientSystemId")
    public JAXBElement<String> createClientSystemId(String value) {
        return new JAXBElement<String>(_ClientSystemId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "Document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "XmlSchema")
    public JAXBElement<AttachmentType> createXmlSchema(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_XmlSchema_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", name = "XslStylesheet")
    public JAXBElement<AttachmentType> createXslStylesheet(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_XslStylesheet_QNAME, AttachmentType.class, null, value);
    }

}
