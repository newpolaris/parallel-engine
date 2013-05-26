//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			The skin element contains vertex and primitive information sufficient to describe blend-weight skinning.
 * 			
 * 
 * <p>Java class for skin_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skin_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bind_shape_matrix" type="{http://www.collada.org/2008/03/COLLADASchema}float4x4_type" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.collada.org/2008/03/COLLADASchema}source_type" maxOccurs="unbounded" minOccurs="3"/>
 *         &lt;element name="joints">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_type" maxOccurs="unbounded" minOccurs="2"/>
 *                   &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vertex_weights">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_offset_type" maxOccurs="unbounded" minOccurs="2"/>
 *                   &lt;element name="vcount" type="{http://www.collada.org/2008/03/COLLADASchema}list_of_uints_type" minOccurs="0"/>
 *                   &lt;element name="v" type="{http://www.collada.org/2008/03/COLLADASchema}list_of_ints_type" minOccurs="0"/>
 *                   &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skin_type", propOrder = {
    "bindShapeMatrix",
    "sources",
    "joints",
    "vertexWeights",
    "extras"
})
public class SkinType {

    @XmlList
    @XmlElement(name = "bind_shape_matrix", type = Double.class)
    protected List<Double> bindShapeMatrix;
    @XmlElement(name = "source", required = true)
    protected List<SourceType> sources;
    @XmlElement(required = true)
    protected SkinType.Joints joints;
    @XmlElement(name = "vertex_weights", required = true)
    protected SkinType.VertexWeights vertexWeights;
    @XmlElement(name = "extra")
    protected List<ExtraType> extras;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceAttr;

    /**
     * Gets the value of the bindShapeMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindShapeMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindShapeMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBindShapeMatrix() {
        if (bindShapeMatrix == null) {
            bindShapeMatrix = new ArrayList<Double>();
        }
        return this.bindShapeMatrix;
    }

    /**
     * Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSources() {
        if (sources == null) {
            sources = new ArrayList<SourceType>();
        }
        return this.sources;
    }

    /**
     * Gets the value of the joints property.
     * 
     * @return
     *     possible object is
     *     {@link SkinType.Joints }
     *     
     */
    public SkinType.Joints getJoints() {
        return joints;
    }

    /**
     * Sets the value of the joints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkinType.Joints }
     *     
     */
    public void setJoints(SkinType.Joints value) {
        this.joints = value;
    }

    /**
     * Gets the value of the vertexWeights property.
     * 
     * @return
     *     possible object is
     *     {@link SkinType.VertexWeights }
     *     
     */
    public SkinType.VertexWeights getVertexWeights() {
        return vertexWeights;
    }

    /**
     * Sets the value of the vertexWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkinType.VertexWeights }
     *     
     */
    public void setVertexWeights(SkinType.VertexWeights value) {
        this.vertexWeights = value;
    }

    /**
     * Gets the value of the extras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraType }
     * 
     * 
     */
    public List<ExtraType> getExtras() {
        if (extras == null) {
            extras = new ArrayList<ExtraType>();
        }
        return this.extras;
    }

    /**
     * Gets the value of the sourceAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAttr() {
        return sourceAttr;
    }

    /**
     * Sets the value of the sourceAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAttr(String value) {
        this.sourceAttr = value;
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
     *         &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_type" maxOccurs="unbounded" minOccurs="2"/>
     *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputs",
        "extras"
    })
    public static class Joints {

        @XmlElement(name = "input", required = true)
        protected List<InputLocalType> inputs;
        @XmlElement(name = "extra")
        protected List<ExtraType> extras;

        /**
         * Gets the value of the inputs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInputs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InputLocalType }
         * 
         * 
         */
        public List<InputLocalType> getInputs() {
            if (inputs == null) {
                inputs = new ArrayList<InputLocalType>();
            }
            return this.inputs;
        }

        /**
         * Gets the value of the extras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtraType }
         * 
         * 
         */
        public List<ExtraType> getExtras() {
            if (extras == null) {
                extras = new ArrayList<ExtraType>();
            }
            return this.extras;
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
     *         &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_offset_type" maxOccurs="unbounded" minOccurs="2"/>
     *         &lt;element name="vcount" type="{http://www.collada.org/2008/03/COLLADASchema}list_of_uints_type" minOccurs="0"/>
     *         &lt;element name="v" type="{http://www.collada.org/2008/03/COLLADASchema}list_of_ints_type" minOccurs="0"/>
     *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="count" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputs",
        "vcount",
        "v",
        "extras"
    })
    public static class VertexWeights {

        @XmlElement(name = "input", required = true)
        protected List<InputLocalOffsetType> inputs;
        @XmlList
        protected List<BigInteger> vcount;
        @XmlList
        @XmlElement(type = Long.class)
        protected List<Long> v;
        @XmlElement(name = "extra")
        protected List<ExtraType> extras;
        @XmlAttribute(required = true)
        protected BigInteger count;

        /**
         * Gets the value of the inputs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInputs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InputLocalOffsetType }
         * 
         * 
         */
        public List<InputLocalOffsetType> getInputs() {
            if (inputs == null) {
                inputs = new ArrayList<InputLocalOffsetType>();
            }
            return this.inputs;
        }

        /**
         * Gets the value of the vcount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vcount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVcount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getVcount() {
            if (vcount == null) {
                vcount = new ArrayList<BigInteger>();
            }
            return this.vcount;
        }

        /**
         * Gets the value of the v property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the v property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getV().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getV() {
            if (v == null) {
                v = new ArrayList<Long>();
            }
            return this.v;
        }

        /**
         * Gets the value of the extras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtraType }
         * 
         * 
         */
        public List<ExtraType> getExtras() {
            if (extras == null) {
                extras = new ArrayList<ExtraType>();
            }
            return this.extras;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

    }

}
