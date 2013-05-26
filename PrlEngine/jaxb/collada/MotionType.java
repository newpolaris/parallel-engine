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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motion_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motion_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instance_articulated_system" type="{http://www.collada.org/2008/03/COLLADASchema}instance_articulated_system_type"/>
 *         &lt;element name="technique_common" type="{http://www.collada.org/2008/03/COLLADASchema}motion_technique_type"/>
 *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "motion_type", propOrder = {
    "instanceArticulatedSystem",
    "techniqueCommon",
    "techniques",
    "extras"
})
public class MotionType {

    @XmlElement(name = "instance_articulated_system", required = true)
    protected InstanceArticulatedSystemType instanceArticulatedSystem;
    @XmlElement(name = "technique_common", required = true)
    protected MotionTechniqueType techniqueCommon;
    @XmlElement(name = "technique")
    protected List<TechniqueType> techniques;
    @XmlElement(name = "extra")
    protected List<ExtraType> extras;

    /**
     * Gets the value of the instanceArticulatedSystem property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceArticulatedSystemType }
     *     
     */
    public InstanceArticulatedSystemType getInstanceArticulatedSystem() {
        return instanceArticulatedSystem;
    }

    /**
     * Sets the value of the instanceArticulatedSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceArticulatedSystemType }
     *     
     */
    public void setInstanceArticulatedSystem(InstanceArticulatedSystemType value) {
        this.instanceArticulatedSystem = value;
    }

    /**
     * Gets the value of the techniqueCommon property.
     * 
     * @return
     *     possible object is
     *     {@link MotionTechniqueType }
     *     
     */
    public MotionTechniqueType getTechniqueCommon() {
        return techniqueCommon;
    }

    /**
     * Sets the value of the techniqueCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionTechniqueType }
     *     
     */
    public void setTechniqueCommon(MotionTechniqueType value) {
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

}