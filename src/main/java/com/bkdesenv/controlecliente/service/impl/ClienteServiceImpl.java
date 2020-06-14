package com.bkdesenv.controlecliente.service.impl;

import com.bkdesenv.controlecliente.model.Cliente;
import com.bkdesenv.controlecliente.repository.ClienteRepository;
import com.bkdesenv.controlecliente.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
