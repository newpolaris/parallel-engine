//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for axis_constraint_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="axis_constraint_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axis" type="{http://www.collada.org/2008/03/COLLADASchema}axis_type"/>
 *         &lt;element name="limits" type="{http://www.collada.org/2008/03/COLLADASchema}joint_limits_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" type="{http://www.collada.org/2008/03/COLLADASchema}sid_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "axis_constraint_type", propOrder = {
    "axis",
    "limits"
})
public class AxisConstraintType {

    @XmlElement(required = true)
    protected AxisType axis;
    protected JointLimitsType limits;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sid;

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link AxisType }
     *     
     */
    public AxisType getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisType }
     *     
     */
    public void setAxis(AxisType value) {
        this.axis = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link JointLimitsType }
     *     
     */
    public JointLimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointLimitsType }
     *     
     */
    public void setLimits(JointLimitsType value) {
        this.limits = value;
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

}
