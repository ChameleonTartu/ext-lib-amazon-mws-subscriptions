/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Destination List
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * DestinationList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DestinationList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="member" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}Destination" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DestinationList extends AbstractMwsObject {

    private List<Destination> member;

    /**
     * Get the value of member.
     *
     * @return The value of member.
     */
    public List<Destination> getMember() {
        if (member==null) {
            member = new ArrayList<Destination>();
        }
        return member;
    }

    /**
     * Set the value of member.
     *
     * @param member
     *            The new value to set.
     */
    public void setMember(List<Destination> member) {
        this.member = member;
    }

    /**
     * Clear member.
     */
    public void unsetMember() {
        this.member = null;
    }

    /**
     * Check to see if member is set.
     *
     * @return true if member is set.
     */
    public boolean isSetMember() {
        return member != null && !member.isEmpty();
    }

    /**
     * Add values for member, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonservices.mws.subscriptions.model.Destination} object.
     */
    public DestinationList withMember(Destination... values) {
        List<Destination> list = getMember();
        for (Destination value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        member = r.readList("member", Destination.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("member", member);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "DestinationList",this);
    }

    /**
     * Value constructor.
     *
     * @param member a {@link java.util.List} object.
     */
    public DestinationList(List<Destination> member) {
        this.member = member;
    }    
    

    /**
     * Default constructor.
     */
    public DestinationList() {
        super();
    }

}
