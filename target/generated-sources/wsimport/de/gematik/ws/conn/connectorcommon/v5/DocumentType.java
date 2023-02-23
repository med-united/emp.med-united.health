
package de.gematik.ws.conn.connectorcommon.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.Base64Data;
import oasis.names.tc.dss._1_0.core.schema.DocumentBaseType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Base64XML" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Data"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "base64XML",
    "base64Data"
})
public class DocumentType
    extends DocumentBaseType
{

    @XmlElement(name = "Base64XML")
    protected byte[] base64XML;
    @XmlElement(name = "Base64Data", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected Base64Data base64Data;

    /**
     * Gets the value of the base64XML property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64XML() {
        return base64XML;
    }

    /**
     * Sets the value of the base64XML property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64XML(byte[] value) {
        this.base64XML = value;
    }

    /**
     * Gets the value of the base64Data property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Data }
     *     
     */
    public Base64Data getBase64Data() {
        return base64Data;
    }

    /**
     * Sets the value of the base64Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Data }
     *     
     */
    public void setBase64Data(Base64Data value) {
        this.base64Data = value;
    }

}
