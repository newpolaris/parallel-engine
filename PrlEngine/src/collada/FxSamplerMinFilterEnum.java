//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 07:33:59 PM PDT 
//


package collada;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fx_sampler_min_filter_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fx_sampler_min_filter_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="NEAREST"/>
 *     &lt;enumeration value="LINEAR"/>
 *     &lt;enumeration value="ANISOTROPIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_sampler_min_filter_enum")
@XmlEnum
public enum FxSamplerMinFilterEnum {

    NEAREST,
    LINEAR,
    ANISOTROPIC;

    public String value() {
        return name();
    }

    public static FxSamplerMinFilterEnum fromValue(String v) {
        return valueOf(v);
    }

}
