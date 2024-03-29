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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			A self contained description of a shader effect.
 * 			
 * 
 * <p>Java class for effect_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="effect_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;element name="annotate" type="{http://www.collada.org/2008/03/COLLADASchema}fx_annotate_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newparam" type="{http://www.collada.org/2008/03/COLLADASchema}fx_newparam_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.collada.org/2008/03/COLLADASchema}fx_profile_group" maxOccurs="unbounded"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "effect_type", propOrder = {
    "asset",
    "annotates",
    "newparams",
    "profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S",
    "extras"
})
public class EffectType {

    protected AssetType asset;
    @XmlElement(name = "annotate")
    protected List<FxAnnotateType> annotates;
    @XmlElement(name = "newparam")
    protected List<FxNewparamType> newparams;
    @XmlElements({
        @XmlElement(name = "profile_GLES2", type = ProfileGles2Type.class),
        @XmlElement(name = "profile_CG", type = ProfileCgType.class),
        @XmlElement(name = "profile_COMMON", type = ProfileCommonType.class),
        @XmlElement(name = "profile_BRIDGE", type = ProfileBridgeType.class),
        @XmlElement(name = "profile_GLES", type = ProfileGlesType.class),
        @XmlElement(name = "profile_GLSL", type = ProfileGlslType.class)
    })
    protected List<Object> profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S;
    @XmlElement(name = "extra")
    protected List<ExtraType> extras;
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
     * Gets the value of the annotates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxAnnotateType }
     * 
     * 
     */
    public List<FxAnnotateType> getAnnotates() {
        if (annotates == null) {
            annotates = new ArrayList<FxAnnotateType>();
        }
        return this.annotates;
    }

    /**
     * Gets the value of the newparams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newparams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewparams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxNewparamType }
     * 
     * 
     */
    public List<FxNewparamType> getNewparams() {
        if (newparams == null) {
            newparams = new ArrayList<FxNewparamType>();
        }
        return this.newparams;
    }

    /**
     * Gets the value of the profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileCOMMONsAndProfileBRIDGEsAndProfileGLES2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileGles2Type }
     * {@link ProfileCgType }
     * {@link ProfileCommonType }
     * {@link ProfileBridgeType }
     * {@link ProfileGlesType }
     * {@link ProfileGlslType }
     * 
     * 
     */
    public List<Object> getProfileCOMMONsAndProfileBRIDGEsAndProfileGLES2s() {
        if (profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S == null) {
            profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S = new ArrayList<Object>();
        }
        return this.profileCOMMONsAndProfileBRIDGEsAndProfileGLES2S;
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

}
