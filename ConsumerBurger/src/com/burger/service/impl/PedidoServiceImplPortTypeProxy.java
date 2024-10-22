package com.burger.service.impl;

public class PedidoServiceImplPortTypeProxy implements com.burger.service.impl.PedidoServiceImplPortType {
  private String _endpoint = null;
  private com.burger.service.impl.PedidoServiceImplPortType pedidoServiceImplPortType = null;
  
  public PedidoServiceImplPortTypeProxy() {
    _initPedidoServiceImplPortTypeProxy();
  }
  
  public PedidoServiceImplPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPedidoServiceImplPortTypeProxy();
  }
  
  private void _initPedidoServiceImplPortTypeProxy() {
    try {
      pedidoServiceImplPortType = (new com.burger.service.impl.PedidoServiceImplLocator()).getPedidoServiceImplHttpSoap11Endpoint();
      if (pedidoServiceImplPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pedidoServiceImplPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pedidoServiceImplPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pedidoServiceImplPortType != null)
      ((javax.xml.rpc.Stub)pedidoServiceImplPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.burger.service.impl.PedidoServiceImplPortType getPedidoServiceImplPortType() {
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType;
  }
  
  public com.burger.model.xsd.Pedido listarPedidoPorId(java.lang.Integer id) throws java.rmi.RemoteException{
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType.listarPedidoPorId(id);
  }
  
  public java.lang.String eliminarPedido(java.lang.Integer id) throws java.rmi.RemoteException{
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType.eliminarPedido(id);
  }
  
  public java.lang.String registrarPedido(java.lang.Double totalPedido, java.lang.String nombreCliente, java.lang.String fechaPedido, java.lang.Boolean estadoPedido) throws java.rmi.RemoteException{
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType.registrarPedido(totalPedido, nombreCliente, fechaPedido, estadoPedido);
  }
  
  public com.burger.model.xsd.Pedido[] listarPedidos() throws java.rmi.RemoteException{
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType.listarPedidos();
  }
  
  public java.lang.String actualizarPedido(java.lang.Integer id, java.lang.Double totalPedido, java.lang.String nombreCliente, java.lang.String fechaPedido, java.lang.Boolean estadoPedido) throws java.rmi.RemoteException{
    if (pedidoServiceImplPortType == null)
      _initPedidoServiceImplPortTypeProxy();
    return pedidoServiceImplPortType.actualizarPedido(id, totalPedido, nombreCliente, fechaPedido, estadoPedido);
  }
  
  
}