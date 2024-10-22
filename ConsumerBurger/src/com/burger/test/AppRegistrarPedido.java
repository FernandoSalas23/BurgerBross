package com.burger.test;

import com.burger.service.impl.PedidoServiceImplPortType;
import com.burger.service.impl.PedidoServiceImplPortTypeProxy;

public class AppRegistrarPedido {
    
    public static void main(String[] args) {

        PedidoServiceImplPortType service = new PedidoServiceImplPortTypeProxy(
                "http://localhost:8080/Burgers/services/PedidoServiceImpl");
        
        System.out.println("Registro de Pedidos");
        System.out.println("====================");
        
        try {
            String resultado = service.registrarPedido(30.0, "Carlos Perez", "2024-10-16 20:44:26", true);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
