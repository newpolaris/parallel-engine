//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for link_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="link_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
 *           &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="attachment_full">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                       &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
 *                       &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
 *                     &lt;/choice>
 *                     &lt;element name="link" type="{http://www.collada.org/2008/03/COLLADASchema}link_type"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="attachment_start">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
 *                     &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
 *                   &lt;/choice>
 *                   &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="attachment_end">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
 *                     &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
 *                   &lt;/choice>
 *                   &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" type="{http://www.collada.org/2008/03/COLLADASchema}sid_type" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link_type", propOrder = {
    "rotatesAndTranslates",
    "attachmentFullsAndAttachmentStartsAndAttachmentEnds"
})
public class LinkType {

    @XmlElements({
        @XmlElement(name = "translate", type = TranslateType.class),
        @XmlElement(name = "rotate", type = RotateType.class)
    })
    protected List<Object> rotatesAndTranslates;
    @XmlElements({
        @XmlElement(name = "attachment_end", type = LinkType.AttachmentEnd.class),
        @XmlElement(name = "attachment_start", type = LinkType.AttachmentStart.class),
        @XmlElement(name = "attachment_full", type = LinkType.AttachmentFull.class)
    })
    protected List<Object> attachmentFullsAndAttachmentStartsAndAttachmentEnds;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sid;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the rotatesAndTranslates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rotatesAndTranslates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRotatesAndTranslates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslateType }
     * {@link RotateType }
     * 
     * 
     */
    public List<Object> getRotatesAndTranslates() {
        if (rotatesAndTranslates == null) {
            rotatesAndTranslates = new ArrayList<Object>();
        }
        return this.rotatesAndTranslates;
    }

    /**
     * Gets the value of the attachmentFullsAndAttachmentStartsAndAttachmentEnds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentFullsAndAttachmentStartsAndAttachmentEnds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentFullsAndAttachmentStartsAndAttachmentEnds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkType.AttachmentEnd }
     * {@link LinkType.AttachmentStart }
     * {@link LinkType.AttachmentFull }
     * 
     * 
     */
    public List<Object> getAttachmentFullsAndAttachmentStartsAndAttachmentEnds() {
        if (attachmentFullsAndAttachmentStartsAndAttachmentEnds == null) {
            attachmentFullsAndAttachmentStartsAndAttachmentEnds = new ArrayList<Object>();
        }
        return this.attachmentFullsAndAttachmentStartsAndAttachmentEnds;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
     *         &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
     *       &lt;/choice>
     *       &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rotatesAndTranslates"
    })
    public static class AttachmentEnd {

        @XmlElements({
            @XmlElement(name = "translate", type = TranslateType.class),
            @XmlElement(name = "rotate", type = RotateType.class)
        })
        protected List<Object> rotatesAndTranslates;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String joint;

        /**
         * Gets the value of the rotatesAndTranslates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rotatesAndTranslates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRotatesAndTranslates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TranslateType }
         * {@link RotateType }
         * 
         * 
         */
        public List<Object> getRotatesAndTranslates() {
            if (rotatesAndTranslates == null) {
                rotatesAndTranslates = new ArrayList<Object>();
            }
            return this.rotatesAndTranslates;
        }

        /**
         * Gets the value of the joint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJoint() {
            return joint;
        }

        /**
         * Sets the value of the joint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJoint(String value) {
            this.joint = value;
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
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
     *           &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
     *         &lt;/choice>
     *         &lt;element name="link" type="{http://www.collada.org/2008/03/COLLADASchema}link_type"/>
     *       &lt;/sequence>
     *       &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rotatesAndTranslates",
        "link"
    })
    public static class AttachmentFull {

        @XmlElements({
            @XmlElement(name = "translate", type = TranslateType.class),
            @XmlElement(name = "rotate", type = RotateType.class)
        })
        protected List<Object> rotatesAndTranslates;
        @XmlElement(required = true)
        protected LinkType link;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String joint;

        /**
         * Gets the value of the rotatesAndTranslates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rotatesAndTranslates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRotatesAndTranslates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TranslateType }
         * {@link RotateType }
         * 
         * 
         */
        public List<Object> getRotatesAndTranslates() {
            if (rotatesAndTranslates == null) {
                rotatesAndTranslates = new ArrayList<Object>();
            }
            return this.rotatesAndTranslates;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link LinkType }
         *     
         */
        public LinkType getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link LinkType }
         *     
         */
        public void setLink(LinkType value) {
            this.link = value;
        }

        /**
         * Gets the value of the joint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJoint() {
            return joint;
        }

        /**
         * Sets the value of the joint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJoint(String value) {
            this.joint = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="rotate" type="{http://www.collada.org/2008/03/COLLADASchema}rotate_type"/>
     *         &lt;element name="translate" type="{http://www.collada.org/2008/03/COLLADASchema}translate_type"/>
     *       &lt;/choice>
     *       &lt;attribute name="joint" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rotatesAndTranslates"
    })
    public static class AttachmentStart {

        @XmlElements({
            @XmlElement(name = "rotate", type = RotateType.class),
            @XmlElement(name = "translate", type = TranslateType.class)
        })
        protected List<Object> rotatesAndTranslates;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String joint;

        /**
         * Gets the value of the rotatesAndTranslates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rotatesAndTranslates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRotatesAndTranslates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RotateType }
         * {@link TranslateType }
         * 
         * 
         */
        public List<Object> getRotatesAndTranslates() {
            if (rotatesAndTranslates == null) {
                rotatesAndTranslates = new ArrayList<Object>();
            }
            return this.rotatesAndTranslates;
        }

        /**
         * Gets the value of the joint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJoint() {
            return joint;
        }

        /**
         * Sets the value of the joint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJoint(String value) {
            this.joint = value;
        }

    }

}
