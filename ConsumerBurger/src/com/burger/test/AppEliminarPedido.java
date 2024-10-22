package com.burger.test;

import com.burger.service.impl.PedidoServiceImplPortType;
import com.burger.service.impl.PedidoServiceImplPortTypeProxy;

public class AppEliminarPedido {

    public static void main(String[] args) {
        
        PedidoServiceImplPortType service = new PedidoServiceImplPortTypeProxy(
                "http://localhost:8080/Burgers/services/PedidoServiceImpl");

        System.out.println("Eliminar Pedidos");
        System.out.println("==================");
        
        try {
            String resultado = service.eliminarPedido(2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
