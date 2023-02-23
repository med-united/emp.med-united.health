
package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AudienceRestrictionCondition"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}DoNotCacheCondition"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Condition"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionsType", propOrder = {
    "audienceRestrictionConditionOrDoNotCacheConditionOrCondition"
})
public class ConditionsType {

    @XmlElements({
        @XmlElement(name = "AudienceRestrictionCondition", type = AudienceRestrictionConditionType.class),
        @XmlElement(name = "DoNotCacheCondition", type = DoNotCacheConditionType.class),
        @XmlElement(name = "Condition")
    })
    protected List<ConditionAbstractType> audienceRestrictionConditionOrDoNotCacheConditionOrCondition;
    @XmlAttribute(name = "NotBefore")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notBefore;
    @XmlAttribute(name = "NotOnOrAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notOnOrAfter;

    /**
     * Gets the value of the audienceRestrictionConditionOrDoNotCacheConditionOrCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRestrictionConditionOrDoNotCacheConditionOrCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRestrictionConditionOrDoNotCacheConditionOrCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceRestrictionConditionType }
     * {@link DoNotCacheConditionType }
     * {@link ConditionAbstractType }
     * 
     * 
     */
    public List<ConditionAbstractType> getAudienceRestrictionConditionOrDoNotCacheConditionOrCondition() {
        if (audienceRestrictionConditionOrDoNotCacheConditionOrCondition == null) {
            audienceRestrictionConditionOrDoNotCacheConditionOrCondition = new ArrayList<ConditionAbstractType>();
        }
        return this.audienceRestrictionConditionOrDoNotCacheConditionOrCondition;
    }

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotBefore(XMLGregorianCalendar value) {
        this.notBefore = value;
    }

    /**
     * Gets the value of the notOnOrAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotOnOrAfter() {
        return notOnOrAfter;
    }

    /**
     * Sets the value of the notOnOrAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotOnOrAfter(XMLGregorianCalendar value) {
        this.notOnOrAfter = value;
    }

}
