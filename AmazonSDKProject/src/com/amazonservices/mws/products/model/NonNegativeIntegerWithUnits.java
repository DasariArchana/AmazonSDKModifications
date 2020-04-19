package com.amazonservices.mws.products.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;


/**
 * <p>Java class for NonNegativeIntegerWithUnits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonNegativeIntegerWithUnits">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *       &lt;attribute name="Units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonNegativeIntegerWithUnits", propOrder = {
    "value"
})
public class NonNegativeIntegerWithUnits extends AbstractMwsObject{

    public NonNegativeIntegerWithUnits() {
		super();
	}

	@XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer value;
    @XmlAttribute(name = "Units", required = true)
    protected String units;

    @Override
   	public void readFragmentFrom(MwsReader r) {
    	units = r.readAttribute("Units", String.class);
		value = r.readValue(Integer.class);
   	}

   	@Override
   	public void writeFragmentTo(MwsWriter w) {
   		w.write("value", value);
        w.write("Units", units);

   	}

	@Override
   	public void writeTo(MwsWriter w) {
   		w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "NonNegativeIntegerWithUnits", this);
   	}
	
    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}