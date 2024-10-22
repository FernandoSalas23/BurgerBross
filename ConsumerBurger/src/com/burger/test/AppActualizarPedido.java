package com.burger.test;

import com.burger.service.impl.PedidoServiceImplPortType;
import com.burger.service.impl.PedidoServiceImplPortTypeProxy;

public class AppActualizarPedido {

    public static void main(String[] args) {
        
        PedidoServiceImplPortType service = new PedidoServiceImplPortTypeProxy(
                "http://localhost:8080/Burgers/services/PedidoServiceImpl");

        System.out.println("Actualizar Pedidos");
        System.out.println("=======================");
        
        try {
            String resultado = service.actualizarPedido(1, 50.0, "Juan Peroz", "2024-10-16 20:44:26", false);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
