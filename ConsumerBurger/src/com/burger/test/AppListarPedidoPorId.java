package com.burger.test;

import com.burger.model.xsd.Pedido;
import com.burger.service.impl.PedidoServiceImplPortType;
import com.burger.service.impl.PedidoServiceImplPortTypeProxy;

public class AppListarPedidoPorId {

    public static void main(String[] args) {
        
        PedidoServiceImplPortType service = new PedidoServiceImplPortTypeProxy("http://localhost:8080/Burgers/services/PedidoServiceImpl");
        
        System.out.println("Lista de Pedidos por Id");
        System.out.println("=========================");
        
        try {
            Pedido pedido = service.listarPedidoPorId(2);
            System.out.println("Pedido: " + pedido.getNombreCliente());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
