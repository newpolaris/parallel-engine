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
 *      Describes a parabola in 3D space. A parabola is defined     by its focal length (i.e. the distance between its focus     and its apex) and is positioned in space with a     coordinate system where: - the origin is     the apex of the parabola, - the "X Axis"     defines the axis of symmetry; the parabola is on the     positive side of this axis, - the origin, "X     Direction" and "Y Direction" define the     plane of the parabola. This coordinate system is the     local coordinate system of the parabola. The "main     Direction" of this coordinate system is a vector     normal to the plane of the parabola. The axis, of which     the origin and unit vector are respectively the origin     and "main Direction" of the local coordinate     system, is termed the "Axis" or "main     Axis" of the parabola. The "main     Direction" of the local coordinate system gives an     explicit orientation to the parabola, determining the     direction in which the parameter increases along the     parabola. The Geom_Parabola parabola is parameterized as     follows: P(U) = O + U*U/(4.*F)*XDir + U*YDir where: - P     is the point of parameter U, - O, XDir and YDir are     respectively the origin, "X <br>     Direction" and "Y Direction" of its local     coordinate system, - F is the focal length of the     parabola. The parameter of the parabola is therefore its     Y coordinate in the local coordinate system, with the     "X <br> Axis" of the local coordinate     system defining the origin of the parameter. The     parameter range is ] -infinite, +infinite [.    
 * 
 * <p>Java class for parabola_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parabola_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="focal" type="{http://www.collada.org/2008/03/COLLADASchema}float_type"/>
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
@XmlType(name = "parabola_type", propOrder = {
    "focal",
    "extras"
})
public class ParabolaType {

    protected double focal;
    @XmlElement(name = "extra")
    protected List<ExtraType> extras;

    /**
     * Gets the value of the focal property.
     * 
     */
    public double getFocal() {
        return focal;
    }

    /**
     * Sets the value of the focal property.
     * 
     */
    public void setFocal(double value) {
        this.focal = value;
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
