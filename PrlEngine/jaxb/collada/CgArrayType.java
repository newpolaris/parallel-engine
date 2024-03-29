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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Creates a parameter of a one-dimensional array type.
 * 			
 * 
 * <p>Java class for cg_array_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cg_array_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.collada.org/2008/03/COLLADASchema}cg_param_group" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="resizable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cg_array_type", propOrder = {
    "boolsAndBool2SAndBool3S"
})
public class CgArrayType {

    @XmlElementRefs({
        @XmlElementRef(name = "fixed3x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float2x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half3x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float4x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "array", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed2x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool4x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool2x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float2x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "enum", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float3x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half2x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool3x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "string", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int3x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half4x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed4x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int3x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed2x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed2x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half4x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool4x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half2x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float4x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed4x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool2x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float4x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half4x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed3x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int4x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float2x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed3x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "sampler1D", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool2x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int4x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool3x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed4x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float3x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed4x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "sampler2D", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int2x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half2x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int4x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int2x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half3x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool4x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int2x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int2x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool2x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int4x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "samplerCUBE", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half4x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half2x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "sampler3D", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float2x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "samplerRECT", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float3x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "usertype", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool3x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int3x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "int3x4", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed3x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed2x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float4x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "float3x3", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool4x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "samplerDEPTH", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half3x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "half3x1", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "fixed", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "bool3x2", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> boolsAndBool2SAndBool3S;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlAttribute
    protected Boolean resizable;

    /**
     * Gets the value of the boolsAndBool2SAndBool3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boolsAndBool2SAndBool3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoolsAndBool2sAndBool3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CgArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSampler1DType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSampler2DType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSamplerCUBEType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSampler3DType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSamplerRECTType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CgUserType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FxSamplerDEPTHType }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBoolsAndBool2sAndBool3s() {
        if (boolsAndBool2SAndBool3S == null) {
            boolsAndBool2SAndBool3S = new ArrayList<JAXBElement<?>>();
        }
        return this.boolsAndBool2SAndBool3S;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the resizable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResizable() {
        if (resizable == null) {
            return false;
        } else {
            return resizable;
        }
    }

    /**
     * Sets the value of the resizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResizable(Boolean value) {
        this.resizable = value;
    }

}
