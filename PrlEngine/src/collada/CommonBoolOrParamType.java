//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for common_bool_or_param_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="common_bool_or_param_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="param" type="{http://www.collada.org/2008/03/COLLADASchema}common_param_type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_bool_or_param_type", propOrder = {
    "param",
    "bool"
})
public class CommonBoolOrParamType {

    protected CommonParamType param;
    protected Boolean bool;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link CommonParamType }
     *     
     */
    public CommonParamType getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonParamType }
     *     
     */
    public void setParam(CommonParamType value) {
        this.param = value;
    }

    /**
     * Gets the value of the bool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool() {
        return bool;
    }

    /**
     * Sets the value of the bool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool(Boolean value) {
        this.bool = value;
    }

}
