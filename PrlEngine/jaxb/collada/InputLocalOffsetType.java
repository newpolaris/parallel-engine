//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document.
 * 			
 * 
 * <p>Java class for input_local_offset_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="input_local_offset_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="offset" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
 *       &lt;attribute name="semantic" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="source" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}urifragment_type" />
 *       &lt;attribute name="set" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "input_local_offset_type")
public class InputLocalOffsetType {

    @XmlAttribute(required = true)
    protected BigInteger offset;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String semantic;
    @XmlAttribute(required = true)
    protected String source;
    @XmlAttribute
    protected BigInteger set;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Gets the value of the semantic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemantic() {
        return semantic;
    }

    /**
     * Sets the value of the semantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemantic(String value) {
        this.semantic = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSet(BigInteger value) {
        this.set = value;
    }

}
