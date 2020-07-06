package com.bkdesenv.controlecliente.builders;

import com.bkdesenv.controlecliente.model.Cliente;

import java.time.LocalDateTime;

public class ClienteBuilder {

    private ClienteBuilder(){}

    private Cliente cliente;

    public static ClienteBuilder umCliente(){
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        clienteBuilder.cliente = new Cliente();
        clienteBuilder.cliente.setName("Kaique");
        clienteBuilder.cliente.setLastName("Leão");
        clienteBuilder.cliente.setCpf("3551552487");
        clienteBuilder.cliente.setBirthday(LocalDateTime.now());
        return clienteBuilder;
    }

    public Cliente agora(){
        return cliente;
    }

}
