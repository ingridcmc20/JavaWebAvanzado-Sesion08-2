/**
 * EmployeeResourceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.tecsup.ws.client.proxy;


/**
 *  EmployeeResourceServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class EmployeeResourceServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public EmployeeResourceServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public EmployeeResourceServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getEmployee method
     * override this method for handling normal response from getEmployee operation
     */
    public void receiveResultgetEmployee(
        com.tecsup.ws.client.proxy.EmployeeResourceServiceStub.GetEmployeeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getEmployee operation
     */
    public void receiveErrorgetEmployee(java.lang.Exception e) {
    }
}
