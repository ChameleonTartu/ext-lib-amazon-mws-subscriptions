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
 * List Subscriptions Result
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.*;

/**
 * ListSubscriptionsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListSubscriptionsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SubscriptionList" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}SubscriptionList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListSubscriptionsResult extends AbstractMwsObject {

    private SubscriptionList subscriptionList;

    /**
     * Get the value of SubscriptionList.
     *
     * @return The value of SubscriptionList.
     */
    public SubscriptionList getSubscriptionList() {
        return subscriptionList;
    }

    /**
     * Set the value of SubscriptionList.
     *
     * @param subscriptionList
     *            The new value to set.
     */
    public void setSubscriptionList(SubscriptionList subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    /**
     * Check to see if SubscriptionList is set.
     *
     * @return true if SubscriptionList is set.
     */
    public boolean isSetSubscriptionList() {
        return subscriptionList != null;
    }

    /**
     * Set the value of SubscriptionList, return this.
     *
     * @param subscriptionList
     *             The new value to set.
     * @return This instance.
     */
    public ListSubscriptionsResult withSubscriptionList(SubscriptionList subscriptionList) {
        this.subscriptionList = subscriptionList;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        subscriptionList = r.read("SubscriptionList", SubscriptionList.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SubscriptionList", subscriptionList);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "ListSubscriptionsResult",this);
    }

    /**
     * Value constructor.
     *
     * @param subscriptionList a {@link com.amazonservices.mws.subscriptions.model.SubscriptionList} object.
     */
    public ListSubscriptionsResult(SubscriptionList subscriptionList) {
        this.subscriptionList = subscriptionList;
    }    
    

    /**
     * Default constructor.
     */
    public ListSubscriptionsResult() {
        super();
    }

}
