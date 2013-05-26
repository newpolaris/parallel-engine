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
 * 			The sampler element declares an N-dimensional function used for animation. Animation function curves 
 * 			are represented by 1-D sampler elements in COLLADA. The sampler defines sampling points and how to 
 * 			interpolate between them.
 * 			
 * 
 * <p>Java class for sampler_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampler_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="pre_behavior" type="{http://www.collada.org/2008/03/COLLADASchema}sampler_behavior_enum" />
 *       &lt;attribute name="post_behavior" type="{http://www.collada.org/2008/03/COLLADASchema}sampler_behavior_enum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampler_type", propOrder = {
    "inputs"
})
public class SamplerType {

    @XmlElement(name = "input", required = true)
    protected List<InputLocalType> inputs;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "pre_behavior")
    protected SamplerBehaviorEnum preBehavior;
    @XmlAttribute(name = "post_behavior")
    protected SamplerBehaviorEnum postBehavior;

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
     * Gets the value of the preBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link SamplerBehaviorEnum }
     *     
     */
    public SamplerBehaviorEnum getPreBehavior() {
        return preBehavior;
    }

    /**
     * Sets the value of the preBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplerBehaviorEnum }
     *     
     */
    public void setPreBehavior(SamplerBehaviorEnum value) {
        this.preBehavior = value;
    }

    /**
     * Gets the value of the postBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link SamplerBehaviorEnum }
     *     
     */
    public SamplerBehaviorEnum getPostBehavior() {
        return postBehavior;
    }

    /**
     * Sets the value of the postBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplerBehaviorEnum }
     *     
     */
    public void setPostBehavior(SamplerBehaviorEnum value) {
        this.postBehavior = value;
    }

}