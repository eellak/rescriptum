/**
 * OKMAuth_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.openkm.ws.endpoint;

public class OKMAuth_ServiceLocator extends org.apache.axis.client.Service implements com.openkm.ws.endpoint.OKMAuth_Service {

    public OKMAuth_ServiceLocator() {
    }


    public OKMAuth_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OKMAuth_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OKMAuthPort
    private java.lang.String OKMAuthPort_address = "http://localhost:8080/OpenKM/services/OKMAuth";

    public java.lang.String getOKMAuthPortAddress() {
        return OKMAuthPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OKMAuthPortWSDDServiceName = "OKMAuthPort";

    public java.lang.String getOKMAuthPortWSDDServiceName() {
        return OKMAuthPortWSDDServiceName;
    }

    public void setOKMAuthPortWSDDServiceName(java.lang.String name) {
        OKMAuthPortWSDDServiceName = name;
    }

    public com.openkm.ws.endpoint.OKMAuth_PortType getOKMAuthPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OKMAuthPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOKMAuthPort(endpoint);
    }

    public com.openkm.ws.endpoint.OKMAuth_PortType getOKMAuthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.openkm.ws.endpoint.OKMAuthSoapBindingStub _stub = new com.openkm.ws.endpoint.OKMAuthSoapBindingStub(portAddress, this);
            _stub.setPortName(getOKMAuthPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOKMAuthPortEndpointAddress(java.lang.String address) {
        OKMAuthPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.openkm.ws.endpoint.OKMAuth_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.openkm.ws.endpoint.OKMAuthSoapBindingStub _stub = new com.openkm.ws.endpoint.OKMAuthSoapBindingStub(new java.net.URL(OKMAuthPort_address), this);
                _stub.setPortName(getOKMAuthPortWSDDServiceName());
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
        if ("OKMAuthPort".equals(inputPortName)) {
            return getOKMAuthPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.openkm.com", "OKMAuth");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.openkm.com", "OKMAuthPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OKMAuthPort".equals(portName)) {
            setOKMAuthPortEndpointAddress(address);
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
