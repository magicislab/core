//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Defining_Expanded_Name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Defining_Expanded_Name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="defining_prefix_q" type="{}Name_Class"/>
 *         &lt;element name="defining_selector_q" type="{}Defining_Name_Class"/>
 *       &lt;/sequence>
 *       &lt;attribute name="def_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="def" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Defining_Expanded_Name", propOrder = {
    "sloc",
    "definingPrefixQ",
    "definingSelectorQ"
})
public class DefiningExpandedName {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "defining_prefix_q", required = true)
    protected NameClass definingPrefixQ;
    @XmlElement(name = "defining_selector_q", required = true)
    protected DefiningNameClass definingSelectorQ;
    @XmlAttribute(name = "def_name", required = true)
    protected String defName;
    @XmlAttribute(name = "def", required = true)
    protected String def;
    @XmlAttribute(name = "type", required = true)
    protected String type;

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
     * Gets the value of the definingPrefixQ property.
     * 
     * @return
     *     possible object is
     *     {@link NameClass }
     *     
     */
    public NameClass getDefiningPrefixQ() {
        return definingPrefixQ;
    }

    /**
     * Sets the value of the definingPrefixQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameClass }
     *     
     */
    public void setDefiningPrefixQ(NameClass value) {
        this.definingPrefixQ = value;
    }

    /**
     * Gets the value of the definingSelectorQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameClass }
     *     
     */
    public DefiningNameClass getDefiningSelectorQ() {
        return definingSelectorQ;
    }

    /**
     * Sets the value of the definingSelectorQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameClass }
     *     
     */
    public void setDefiningSelectorQ(DefiningNameClass value) {
        this.definingSelectorQ = value;
    }

    /**
     * Gets the value of the defName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefName() {
        return defName;
    }

    /**
     * Sets the value of the defName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefName(String value) {
        this.defName = value;
    }

    /**
     * Gets the value of the def property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDef() {
        return def;
    }

    /**
     * Sets the value of the def property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDef(String value) {
        this.def = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
