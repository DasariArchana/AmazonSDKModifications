//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.27 at 11:07:45 AM IST 
//


package com.amazonservices.mws.products.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;


/**
 * <p>Java class for LanguageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ns2:LanguageType", propOrder = {
    "language"
})
public class LanguageType extends AbstractMwsObject{

    @XmlElement(name = "ns2:Language")
    protected List<LanguageType.Language> language;

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType.Language }
     * 
     * 
     */
    public List<LanguageType.Language> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageType.Language>();
        }
        return this.language;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ns2:name",
        "ns2:type",
        "ns2:audioFormat"
    })
    public static class Language extends AbstractMwsObject{

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "AudioFormat")
        protected String audioFormat;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the audioFormat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudioFormat() {
            return audioFormat;
        }

        /**
         * Sets the value of the audioFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudioFormat(String value) {
            this.audioFormat = value;
        }
        
        @Override
       	public void readFragmentFrom(MwsReader r) {
       		name = r.read("ns2:Name", String.class);
       		type = r.read("ns2:Type", String.class);
       		audioFormat = r.read("ns2:AudioFormat", String.class);
       	}

       	@Override
       	public void writeFragmentTo(MwsWriter w) {
       		w.write("Name", name);
            w.write("Type", type);
            w.write("AudioFormat", audioFormat);
       	}

		@Override
		public void writeTo(MwsWriter w) {
			w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Language",this);
			
		}

    }


	@Override
	public void readFragmentFrom(MwsReader r) {
		language = r.readList("ns2:Language", Language.class);
		
	}

	@Override
	public void writeFragmentTo(MwsWriter w) {
		 w.writeList("Language", language);
	}

	@Override
	public void writeTo(MwsWriter w) {
		w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "LanguageType", this);
		
	}

	public LanguageType() {
		super();
	}
	
}