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
 * <p>Java class for Formal_Unconstrained_Array_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Formal_Unconstrained_Array_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="index_subtype_definitions_ql" type="{}Expression_List"/>
 *         &lt;element name="array_component_definition_q" type="{}Element_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Formal_Unconstrained_Array_Definition", propOrder = {
    "sloc",
    "indexSubtypeDefinitionsQl",
    "arrayComponentDefinitionQ"
})
public class FormalUnconstrainedArrayDefinition {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "index_subtype_definitions_ql", required = true)
    protected ExpressionList indexSubtypeDefinitionsQl;
    @XmlElement(name = "array_component_definition_q", required = true)
    protected ElementClass arrayComponentDefinitionQ;

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
     * Gets the value of the indexSubtypeDefinitionsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getIndexSubtypeDefinitionsQl() {
        return indexSubtypeDefinitionsQl;
    }

    /**
     * Sets the value of the indexSubtypeDefinitionsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setIndexSubtypeDefinitionsQl(ExpressionList value) {
        this.indexSubtypeDefinitionsQl = value;
    }

    /**
     * Gets the value of the arrayComponentDefinitionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getArrayComponentDefinitionQ() {
        return arrayComponentDefinitionQ;
    }

    /**
     * Sets the value of the arrayComponentDefinitionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setArrayComponentDefinitionQ(ElementClass value) {
        this.arrayComponentDefinitionQ = value;
    }

}
