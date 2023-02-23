
package de.gematik.ws.conn.connectorcommon.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.gematik.ws.tel.error.v2.Error;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Result"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/tel/error/v2.0}Error" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "error"
})
@XmlRootElement(name = "Status")
public class Status {

    @XmlElement(name = "Result", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String result;
    @XmlElement(name = "Error", namespace = "http://ws.gematik.de/tel/error/v2.0")
    protected Error error;

    /**
     * 
     * 							Beschreibt den Ausführunggstatus der
     * 							gesamten Operation. Mögliche Werte sind in
     * 							der Enumeration ResultEnum angegeben.
     * 							Allerdings können pro Operation weitere
     * 							Werte definiert werden.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
