//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aspect_Specification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aspect_Specification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="aspect_mark_q" type="{}Element_Class"/>
 *         &lt;element name="aspect_definition_q" type="{}Element_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aspect_Specification", propOrder = {
    "sloc",
    "aspectMarkQ",
    "aspectDefinitionQ"
})
public class AspectSpecification {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "aspect_mark_q", required = true)
    protected ElementClass aspectMarkQ;
    @XmlElement(name = "aspect_definition_q", required = true)
    protected ElementClass aspectDefinitionQ;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the aspectMarkQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getAspectMarkQ() {
        return aspectMarkQ;
    }

    /**
     * Sets the value of the aspectMarkQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setAspectMarkQ(ElementClass value) {
        this.aspectMarkQ = value;
    }

    /**
     * Gets the value of the aspectDefinitionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getAspectDefinitionQ() {
        return aspectDefinitionQ;
    }

    /**
     * Sets the value of the aspectDefinitionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setAspectDefinitionQ(ElementClass value) {
        this.aspectDefinitionQ = value;
    }

}
