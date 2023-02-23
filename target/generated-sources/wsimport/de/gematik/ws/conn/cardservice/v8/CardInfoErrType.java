
package de.gematik.ws.conn.cardservice.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.tel.error.v2.Error;


/**
 * <p>Java class for CardInfoErrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoErrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gematik.de/conn/CardService/v8.1}CardInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/tel/error/v2.0}Error" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoErrType", propOrder = {
    "error"
})
public class CardInfoErrType
    extends CardInfoType
{

    @XmlElement(name = "Error", namespace = "http://ws.gematik.de/tel/error/v2.0")
    protected Error error;

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
