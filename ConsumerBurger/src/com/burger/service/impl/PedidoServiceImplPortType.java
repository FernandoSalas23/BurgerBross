/**
 * PedidoServiceImplPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.burger.service.impl;

public interface PedidoServiceImplPortType extends java.rmi.Remote {
    public com.burger.model.xsd.Pedido listarPedidoPorId(java.lang.Integer id) throws java.rmi.RemoteException;
    public java.lang.String eliminarPedido(java.lang.Integer id) throws java.rmi.RemoteException;
    public java.lang.String registrarPedido(java.lang.Double totalPedido, java.lang.String nombreCliente, java.lang.String fechaPedido, java.lang.Boolean estadoPedido) throws java.rmi.RemoteException;
    public com.burger.model.xsd.Pedido[] listarPedidos() throws java.rmi.RemoteException;
    public java.lang.String actualizarPedido(java.lang.Integer id, java.lang.Double totalPedido, java.lang.String nombreCliente, java.lang.String fechaPedido, java.lang.Boolean estadoPedido) throws java.rmi.RemoteException;
}
