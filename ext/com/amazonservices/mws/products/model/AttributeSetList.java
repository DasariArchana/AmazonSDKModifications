/*******************************************************************************
 * Copyright 2009-2017 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Attribute Set List
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.amazonservices.mws.products.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * AttributeSetList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AttributeSetList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;any/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="AttributeSetList", propOrder={
    "ns2:ItemAttributes"
})
@XmlRootElement(name = "AttributeSetList")
public class AttributeSetList extends AbstractMwsObject {

	@XmlElement(name="ns2:ItemAttributes")
    private List<ItemAttributesType> itemAttributes;
    
	@XmlElement(name="ns2:lang")
    private String lang;

    public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
     * Get the value of Any.
     *
     * @return The value of Any.
     */
    public List<ItemAttributesType> getItemAttributes() {
        if (itemAttributes==null) {
            itemAttributes = new ArrayList<ItemAttributesType>();
        }
        return itemAttributes;
    }

    /**
     * Set the value of ItemAttributesType.
     *
     * @param ItemAttributesType
     *            The new value to set.
     */
    public void setItemAttributes(List<ItemAttributesType> ItemAttributesType) {
        this.itemAttributes = ItemAttributesType;
    }

    /**
     * Clear ItemAttributesType.
     */
    public void unsetItemAttributes() {
        this.itemAttributes = null;
    }

    /**
     * Check to see if ItemAttributesType is set.
     *
     * @return true if ItemAttributesType is set.
     */
    public boolean isSetItemAttributes() {
        return itemAttributes != null && !itemAttributes.isEmpty();
    }

    /**
     * Add values for ItemAttributesType, return this.
     *
     * @param itemAttributes
     *             New values to add.
     *
     * @return This instance.
     */
    public AttributeSetList withItemAttributesType(ItemAttributesType... values) {
        List<ItemAttributesType> list = getItemAttributes();
        for (ItemAttributesType value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void readFragmentFrom(MwsReader r) {
        itemAttributes = r.readList("ns2:ItemAttributes", ItemAttributesType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ItemAttributes", itemAttributes);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "AttributeSetList",this);
    }


    /** Default constructor. */
    public AttributeSetList() {
        super();
    }

}
