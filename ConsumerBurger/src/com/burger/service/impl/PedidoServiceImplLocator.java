/**
 * PedidoServiceImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.burger.service.impl;

public class PedidoServiceImplLocator extends org.apache.axis.client.Service implements com.burger.service.impl.PedidoServiceImpl {

    public PedidoServiceImplLocator() {
    }


    public PedidoServiceImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PedidoServiceImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PedidoServiceImplHttpSoap11Endpoint
    private java.lang.String PedidoServiceImplHttpSoap11Endpoint_address = "http://localhost:8080/Burgers/services/PedidoServiceImpl.PedidoServiceImplHttpSoap11Endpoint/";

    public java.lang.String getPedidoServiceImplHttpSoap11EndpointAddress() {
        return PedidoServiceImplHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PedidoServiceImplHttpSoap11EndpointWSDDServiceName = "PedidoServiceImplHttpSoap11Endpoint";

    public java.lang.String getPedidoServiceImplHttpSoap11EndpointWSDDServiceName() {
        return PedidoServiceImplHttpSoap11EndpointWSDDServiceName;
    }

    public void setPedidoServiceImplHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        PedidoServiceImplHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.burger.service.impl.PedidoServiceImplPortType getPedidoServiceImplHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PedidoServiceImplHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPedidoServiceImplHttpSoap11Endpoint(endpoint);
    }

    public com.burger.service.impl.PedidoServiceImplPortType getPedidoServiceImplHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.burger.service.impl.PedidoServiceImplSoap11BindingStub _stub = new com.burger.service.impl.PedidoServiceImplSoap11BindingStub(portAddress, this);
            _stub.setPortName(getPedidoServiceImplHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPedidoServiceImplHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        PedidoServiceImplHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.burger.service.impl.PedidoServiceImplPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.burger.service.impl.PedidoServiceImplSoap11BindingStub _stub = new com.burger.service.impl.PedidoServiceImplSoap11BindingStub(new java.net.URL(PedidoServiceImplHttpSoap11Endpoint_address), this);
                _stub.setPortName(getPedidoServiceImplHttpSoap11EndpointWSDDServiceName());
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
        if ("PedidoServiceImplHttpSoap11Endpoint".equals(inputPortName)) {
            return getPedidoServiceImplHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.burger.com", "PedidoServiceImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.burger.com", "PedidoServiceImplHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PedidoServiceImplHttpSoap11Endpoint".equals(portName)) {
            setPedidoServiceImplHttpSoap11EndpointEndpointAddress(address);
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
