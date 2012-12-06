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
 * <p>Java class for With_Clause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="With_Clause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_limited_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="limited" type="{}Limited"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="has_private_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="private" type="{}Private"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clause_names_ql" type="{}Name_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "With_Clause", propOrder = {
    "sloc",
    "hasLimitedQ",
    "hasPrivateQ",
    "clauseNamesQl"
})
public class WithClause {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_limited_q", required = true)
    protected WithClause.HasLimitedQ hasLimitedQ;
    @XmlElement(name = "has_private_q", required = true)
    protected WithClause.HasPrivateQ hasPrivateQ;
    @XmlElement(name = "clause_names_ql", required = true)
    protected NameList clauseNamesQl;

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
     * Gets the value of the hasLimitedQ property.
     * 
     * @return
     *     possible object is
     *     {@link WithClause.HasLimitedQ }
     *     
     */
    public WithClause.HasLimitedQ getHasLimitedQ() {
        return hasLimitedQ;
    }

    /**
     * Sets the value of the hasLimitedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithClause.HasLimitedQ }
     *     
     */
    public void setHasLimitedQ(WithClause.HasLimitedQ value) {
        this.hasLimitedQ = value;
    }

    /**
     * Gets the value of the hasPrivateQ property.
     * 
     * @return
     *     possible object is
     *     {@link WithClause.HasPrivateQ }
     *     
     */
    public WithClause.HasPrivateQ getHasPrivateQ() {
        return hasPrivateQ;
    }

    /**
     * Sets the value of the hasPrivateQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithClause.HasPrivateQ }
     *     
     */
    public void setHasPrivateQ(WithClause.HasPrivateQ value) {
        this.hasPrivateQ = value;
    }

    /**
     * Gets the value of the clauseNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link NameList }
     *     
     */
    public NameList getClauseNamesQl() {
        return clauseNamesQl;
    }

    /**
     * Sets the value of the clauseNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameList }
     *     
     */
    public void setClauseNamesQl(NameList value) {
        this.clauseNamesQl = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="limited" type="{}Limited"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "limited",
        "notAnElement"
    })
    public static class HasLimitedQ {

        protected Limited limited;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the limited property.
         * 
         * @return
         *     possible object is
         *     {@link Limited }
         *     
         */
        public Limited getLimited() {
            return limited;
        }

        /**
         * Sets the value of the limited property.
         * 
         * @param value
         *     allowed object is
         *     {@link Limited }
         *     
         */
        public void setLimited(Limited value) {
            this.limited = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="private" type="{}Private"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "_private",
        "notAnElement"
    })
    public static class HasPrivateQ {

        @XmlElement(name = "private")
        protected Private _private;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the private property.
         * 
         * @return
         *     possible object is
         *     {@link Private }
         *     
         */
        public Private getPrivate() {
            return _private;
        }

        /**
         * Sets the value of the private property.
         * 
         * @param value
         *     allowed object is
         *     {@link Private }
         *     
         */
        public void setPrivate(Private value) {
            this._private = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }

}
