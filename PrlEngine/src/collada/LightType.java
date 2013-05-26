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
 * 			The light element declares a light source that illuminates the scene.
 * 			Light sources have many different properties and radiate light in many different patterns and 
 * 			frequencies.
 * 			
 * 
 * <p>Java class for light_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="light_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;element name="technique_common">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ambient">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="directional">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="point">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
 *                             &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="spot">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
 *                             &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="falloff_angle" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                             &lt;element name="falloff_exponent" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "light_type", propOrder = {
    "asset",
    "techniqueCommon",
    "techniques",
    "extras"
})
public class LightType {

    protected AssetType asset;
    @XmlElement(name = "technique_common", required = true)
    protected LightType.TechniqueCommon techniqueCommon;
    @XmlElement(name = "technique")
    protected List<TechniqueType> techniques;
    @XmlElement(name = "extra")
    protected List<ExtraType> extras;
    @XmlAttribute
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
     * Gets the value of the techniqueCommon property.
     * 
     * @return
     *     possible object is
     *     {@link LightType.TechniqueCommon }
     *     
     */
    public LightType.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    /**
     * Sets the value of the techniqueCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightType.TechniqueCommon }
     *     
     */
    public void setTechniqueCommon(LightType.TechniqueCommon value) {
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
     *         &lt;element name="ambient">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="directional">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="point">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
     *                   &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="spot">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
     *                   &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="falloff_angle" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                   &lt;element name="falloff_exponent" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "spot",
        "point",
        "directional",
        "ambient"
    })
    public static class TechniqueCommon {

        protected LightType.TechniqueCommon.Spot spot;
        protected LightType.TechniqueCommon.Point point;
        protected LightType.TechniqueCommon.Directional directional;
        protected LightType.TechniqueCommon.Ambient ambient;

        /**
         * Gets the value of the spot property.
         * 
         * @return
         *     possible object is
         *     {@link LightType.TechniqueCommon.Spot }
         *     
         */
        public LightType.TechniqueCommon.Spot getSpot() {
            return spot;
        }

        /**
         * Sets the value of the spot property.
         * 
         * @param value
         *     allowed object is
         *     {@link LightType.TechniqueCommon.Spot }
         *     
         */
        public void setSpot(LightType.TechniqueCommon.Spot value) {
            this.spot = value;
        }

        /**
         * Gets the value of the point property.
         * 
         * @return
         *     possible object is
         *     {@link LightType.TechniqueCommon.Point }
         *     
         */
        public LightType.TechniqueCommon.Point getPoint() {
            return point;
        }

        /**
         * Sets the value of the point property.
         * 
         * @param value
         *     allowed object is
         *     {@link LightType.TechniqueCommon.Point }
         *     
         */
        public void setPoint(LightType.TechniqueCommon.Point value) {
            this.point = value;
        }

        /**
         * Gets the value of the directional property.
         * 
         * @return
         *     possible object is
         *     {@link LightType.TechniqueCommon.Directional }
         *     
         */
        public LightType.TechniqueCommon.Directional getDirectional() {
            return directional;
        }

        /**
         * Sets the value of the directional property.
         * 
         * @param value
         *     allowed object is
         *     {@link LightType.TechniqueCommon.Directional }
         *     
         */
        public void setDirectional(LightType.TechniqueCommon.Directional value) {
            this.directional = value;
        }

        /**
         * Gets the value of the ambient property.
         * 
         * @return
         *     possible object is
         *     {@link LightType.TechniqueCommon.Ambient }
         *     
         */
        public LightType.TechniqueCommon.Ambient getAmbient() {
            return ambient;
        }

        /**
         * Sets the value of the ambient property.
         * 
         * @param value
         *     allowed object is
         *     {@link LightType.TechniqueCommon.Ambient }
         *     
         */
        public void setAmbient(LightType.TechniqueCommon.Ambient value) {
            this.ambient = value;
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
         *         &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
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
            "color"
        })
        public static class Ambient {

            @XmlElement(required = true)
            protected TargetableFloat3Type color;

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public TargetableFloat3Type getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public void setColor(TargetableFloat3Type value) {
                this.color = value;
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
         *         &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
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
            "color"
        })
        public static class Directional {

            @XmlElement(required = true)
            protected TargetableFloat3Type color;

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public TargetableFloat3Type getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public void setColor(TargetableFloat3Type value) {
                this.color = value;
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
         *         &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
         *         &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
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
            "color",
            "constantAttenuation",
            "linearAttenuation",
            "quadraticAttenuation"
        })
        public static class Point {

            @XmlElement(required = true)
            protected TargetableFloat3Type color;
            @XmlElement(name = "constant_attenuation", defaultValue = "1.0")
            protected TargetableFloatType constantAttenuation;
            @XmlElement(name = "linear_attenuation", defaultValue = "0.0")
            protected TargetableFloatType linearAttenuation;
            @XmlElement(name = "quadratic_attenuation", defaultValue = "0.0")
            protected TargetableFloatType quadraticAttenuation;

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public TargetableFloat3Type getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public void setColor(TargetableFloat3Type value) {
                this.color = value;
            }

            /**
             * Gets the value of the constantAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getConstantAttenuation() {
                return constantAttenuation;
            }

            /**
             * Sets the value of the constantAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setConstantAttenuation(TargetableFloatType value) {
                this.constantAttenuation = value;
            }

            /**
             * Gets the value of the linearAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getLinearAttenuation() {
                return linearAttenuation;
            }

            /**
             * Sets the value of the linearAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setLinearAttenuation(TargetableFloatType value) {
                this.linearAttenuation = value;
            }

            /**
             * Gets the value of the quadraticAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getQuadraticAttenuation() {
                return quadraticAttenuation;
            }

            /**
             * Sets the value of the quadraticAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setQuadraticAttenuation(TargetableFloatType value) {
                this.quadraticAttenuation = value;
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
         *         &lt;element name="color" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float3_type"/>
         *         &lt;element name="constant_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="linear_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="falloff_angle" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *         &lt;element name="falloff_exponent" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
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
            "color",
            "constantAttenuation",
            "linearAttenuation",
            "quadraticAttenuation",
            "falloffAngle",
            "falloffExponent"
        })
        public static class Spot {

            @XmlElement(required = true)
            protected TargetableFloat3Type color;
            @XmlElement(name = "constant_attenuation", defaultValue = "1.0")
            protected TargetableFloatType constantAttenuation;
            @XmlElement(name = "linear_attenuation", defaultValue = "0.0")
            protected TargetableFloatType linearAttenuation;
            @XmlElement(name = "quadratic_attenuation", defaultValue = "0.0")
            protected TargetableFloatType quadraticAttenuation;
            @XmlElement(name = "falloff_angle", defaultValue = "180.0")
            protected TargetableFloatType falloffAngle;
            @XmlElement(name = "falloff_exponent", defaultValue = "0.0")
            protected TargetableFloatType falloffExponent;

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public TargetableFloat3Type getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3Type }
             *     
             */
            public void setColor(TargetableFloat3Type value) {
                this.color = value;
            }

            /**
             * Gets the value of the constantAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getConstantAttenuation() {
                return constantAttenuation;
            }

            /**
             * Sets the value of the constantAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setConstantAttenuation(TargetableFloatType value) {
                this.constantAttenuation = value;
            }

            /**
             * Gets the value of the linearAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getLinearAttenuation() {
                return linearAttenuation;
            }

            /**
             * Sets the value of the linearAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setLinearAttenuation(TargetableFloatType value) {
                this.linearAttenuation = value;
            }

            /**
             * Gets the value of the quadraticAttenuation property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getQuadraticAttenuation() {
                return quadraticAttenuation;
            }

            /**
             * Sets the value of the quadraticAttenuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setQuadraticAttenuation(TargetableFloatType value) {
                this.quadraticAttenuation = value;
            }

            /**
             * Gets the value of the falloffAngle property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getFalloffAngle() {
                return falloffAngle;
            }

            /**
             * Sets the value of the falloffAngle property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setFalloffAngle(TargetableFloatType value) {
                this.falloffAngle = value;
            }

            /**
             * Gets the value of the falloffExponent property.
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloatType }
             *     
             */
            public TargetableFloatType getFalloffExponent() {
                return falloffExponent;
            }

            /**
             * Sets the value of the falloffExponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloatType }
             *     
             */
            public void setFalloffExponent(TargetableFloatType value) {
                this.falloffExponent = value;
            }

        }

    }

}
