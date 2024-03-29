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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The source element declares a data repository that provides values according to the semantics of an 
 * 			input element that refers to it.
 * 			
 * 
 * <p>Java class for source_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="source_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="token_array" type="{http://www.collada.org/2008/03/COLLADASchema}token_array_type"/>
 *           &lt;element name="IDREF_array" type="{http://www.collada.org/2008/03/COLLADASchema}idref_array_type"/>
 *           &lt;element name="Name_array" type="{http://www.collada.org/2008/03/COLLADASchema}name_array_type"/>
 *           &lt;element name="bool_array" type="{http://www.collada.org/2008/03/COLLADASchema}bool_array_type"/>
 *           &lt;element name="float_array" type="{http://www.collada.org/2008/03/COLLADASchema}float_array_type"/>
 *           &lt;element name="int_array" type="{http://www.collada.org/2008/03/COLLADASchema}int_array_type"/>
 *           &lt;element name="SIDREF_array" type="{http://www.collada.org/2008/03/COLLADASchema}sidref_array_type"/>
 *         &lt;/choice>
 *         &lt;element name="technique_common" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accessor" type="{http://www.collada.org/2008/03/COLLADASchema}accessor_type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "source_type", propOrder = {
    "asset",
    "sidrefArray",
    "intArray",
    "floatArray",
    "boolArray",
    "nameArray",
    "idrefArray",
    "tokenArray",
    "techniqueCommon",
    "techniques"
})
public class SourceType {

    protected AssetType asset;
    @XmlElement(name = "SIDREF_array")
    protected SidrefArrayType sidrefArray;
    @XmlElement(name = "int_array")
    protected IntArrayType intArray;
    @XmlElement(name = "float_array")
    protected FloatArrayType floatArray;
    @XmlElement(name = "bool_array")
    protected BoolArrayType boolArray;
    @XmlElement(name = "Name_array")
    protected NameArrayType nameArray;
    @XmlElement(name = "IDREF_array")
    protected IdrefArrayType idrefArray;
    @XmlElement(name = "token_array")
    protected TokenArrayType tokenArray;
    @XmlElement(name = "technique_common")
    protected SourceType.TechniqueCommon techniqueCommon;
    @XmlElement(name = "technique")
    protected List<TechniqueType> techniques;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAsset(AssetType value) {
        this.asset = value;
    }

    /**
     * Gets the value of the sidrefArray property.
     * 
     * @return
     *     possible object is
     *     {@link SidrefArrayType }
     *     
     */
    public SidrefArrayType getSIDREFArray() {
        return sidrefArray;
    }

    /**
     * Sets the value of the sidrefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidrefArrayType }
     *     
     */
    public void setSIDREFArray(SidrefArrayType value) {
        this.sidrefArray = value;
    }

    /**
     * Gets the value of the intArray property.
     * 
     * @return
     *     possible object is
     *     {@link IntArrayType }
     *     
     */
    public IntArrayType getIntArray() {
        return intArray;
    }

    /**
     * Sets the value of the intArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntArrayType }
     *     
     */
    public void setIntArray(IntArrayType value) {
        this.intArray = value;
    }

    /**
     * Gets the value of the floatArray property.
     * 
     * @return
     *     possible object is
     *     {@link FloatArrayType }
     *     
     */
    public FloatArrayType getFloatArray() {
        return floatArray;
    }

    /**
     * Sets the value of the floatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatArrayType }
     *     
     */
    public void setFloatArray(FloatArrayType value) {
        this.floatArray = value;
    }

    /**
     * Gets the value of the boolArray property.
     * 
     * @return
     *     possible object is
     *     {@link BoolArrayType }
     *     
     */
    public BoolArrayType getBoolArray() {
        return boolArray;
    }

    /**
     * Sets the value of the boolArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolArrayType }
     *     
     */
    public void setBoolArray(BoolArrayType value) {
        this.boolArray = value;
    }

    /**
     * Gets the value of the nameArray property.
     * 
     * @return
     *     possible object is
     *     {@link NameArrayType }
     *     
     */
    public NameArrayType getNameArray() {
        return nameArray;
    }

    /**
     * Sets the value of the nameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameArrayType }
     *     
     */
    public void setNameArray(NameArrayType value) {
        this.nameArray = value;
    }

    /**
     * Gets the value of the idrefArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdrefArrayType }
     *     
     */
    public IdrefArrayType getIDREFArray() {
        return idrefArray;
    }

    /**
     * Sets the value of the idrefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdrefArrayType }
     *     
     */
    public void setIDREFArray(IdrefArrayType value) {
        this.idrefArray = value;
    }

    /**
     * Gets the value of the tokenArray property.
     * 
     * @return
     *     possible object is
     *     {@link TokenArrayType }
     *     
     */
    public TokenArrayType getTokenArray() {
        return tokenArray;
    }

    /**
     * Sets the value of the tokenArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenArrayType }
     *     
     */
    public void setTokenArray(TokenArrayType value) {
        this.tokenArray = value;
    }

    /**
     * Gets the value of the techniqueCommon property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType.TechniqueCommon }
     *     
     */
    public SourceType.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    /**
     * Sets the value of the techniqueCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.TechniqueCommon }
     *     
     */
    public void setTechniqueCommon(SourceType.TechniqueCommon value) {
        this.techniqueCommon = value;
    }

    /**
     * Gets the value of the techniques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techniques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechniques().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechniqueType }
     * 
     * 
     */
    public List<TechniqueType> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<TechniqueType>();
        }
        return this.techniques;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *       &lt;sequence>
     *         &lt;element name="accessor" type="{http://www.collada.org/2008/03/COLLADASchema}accessor_type"/>
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
        "accessor"
    })
    public static class TechniqueCommon {

        @XmlElement(required = true)
        protected AccessorType accessor;

        /**
         * Gets the value of the accessor property.
         * 
         * @return
         *     possible object is
         *     {@link AccessorType }
         *     
         */
        public AccessorType getAccessor() {
            return accessor;
        }

        /**
         * Sets the value of the accessor property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessorType }
         *     
         */
        public void setAccessor(AccessorType value) {
            this.accessor = value;
        }

    }

}
