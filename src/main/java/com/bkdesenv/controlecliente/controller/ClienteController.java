package com.bkdesenv.controlecliente.controller;

import com.bkdesenv.controlecliente.dto.ClienteDTO;
import com.bkdesenv.controlecliente.model.Cliente;
import com.bkdesenv.controlecliente.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private ClienteService clienteService;

    ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody ClienteDTO cliente){
        return new ResponseEntity<Cliente>(clienteService.salvar(cliente), HttpStatus.CREATED);
    }

}
