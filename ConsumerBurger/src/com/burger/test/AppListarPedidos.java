package com.burger.test;

import com.burger.model.xsd.Pedido;
import com.burger.service.impl.PedidoServiceImplPortType;
import com.burger.service.impl.PedidoServiceImplPortTypeProxy;

public class AppListarPedidos {

    public static void main(String[] args) {
        
        PedidoServiceImplPortType service = new PedidoServiceImplPortTypeProxy("http://localhost:8080/Burgers/services/PedidoServiceImpl");
        
        System.out.println("Lista de Pedidos");
        System.out.println("===================");
        
        try {
            Pedido[] lista = service.listarPedidos();
            for (Pedido pedido : lista) {
                System.out.println("Pedido: " + pedido.getNombreCliente());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
