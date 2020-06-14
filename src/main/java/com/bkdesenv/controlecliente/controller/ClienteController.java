package com.bkdesenv.controlecliente.controller;

import com.bkdesenv.controlecliente.dto.ClienteDTO;
import com.bkdesenv.controlecliente.mapper.ClienteMapper;
import com.bkdesenv.controlecliente.model.Cliente;
import com.bkdesenv.controlecliente.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    ClienteController(ClienteService clienteService, ClienteMapper clienteMapper){
        this.clienteService = clienteService;
        this.clienteMapper = clienteMapper;
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody ClienteDTO clienteDto){
        return clienteService.salvar(clienteMapper.clienteDtoToCliente(clienteDto));
    }

}
