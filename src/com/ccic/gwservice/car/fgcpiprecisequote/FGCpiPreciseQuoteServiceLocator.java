/**
 * FGCpiPreciseQuoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class FGCpiPreciseQuoteServiceLocator extends org.apache.axis.client.Service implements com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteService {

    public FGCpiPreciseQuoteServiceLocator() {
    }


    public FGCpiPreciseQuoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FGCpiPreciseQuoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FGCpiPreciseQuoteEndpoint
    private java.lang.String FGCpiPreciseQuoteEndpoint_address = "http://schemas.xmlsoap.org/soap/http";

    public java.lang.String getFGCpiPreciseQuoteEndpointAddress() {
        return FGCpiPreciseQuoteEndpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FGCpiPreciseQuoteEndpointWSDDServiceName = "FGCpiPreciseQuoteEndpoint";

    public java.lang.String getFGCpiPreciseQuoteEndpointWSDDServiceName() {
        return FGCpiPreciseQuoteEndpointWSDDServiceName;
    }

    public void setFGCpiPreciseQuoteEndpointWSDDServiceName(java.lang.String name) {
        FGCpiPreciseQuoteEndpointWSDDServiceName = name;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote getFGCpiPreciseQuoteEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FGCpiPreciseQuoteEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFGCpiPreciseQuoteEndpoint(endpoint);
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote getFGCpiPreciseQuoteEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteEndpointBindingStub _stub = new com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteEndpointBindingStub(portAddress, this);
            _stub.setPortName(getFGCpiPreciseQuoteEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFGCpiPreciseQuoteEndpointEndpointAddress(java.lang.String address) {
        FGCpiPreciseQuoteEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteEndpointBindingStub _stub = new com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteEndpointBindingStub(new java.net.URL(FGCpiPreciseQuoteEndpoint_address), this);
                _stub.setPortName(getFGCpiPreciseQuoteEndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FGCpiPreciseQuoteEndpoint".equals(inputPortName)) {
            return getFGCpiPreciseQuoteEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "FGCpiPreciseQuoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "FGCpiPreciseQuoteEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FGCpiPreciseQuoteEndpoint".equals(portName)) {
            setFGCpiPreciseQuoteEndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
