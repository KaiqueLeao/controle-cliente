package com.bkdesenv.controlecliente.service;

import com.bkdesenv.controlecliente.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    public Cliente salvar(Cliente cliente);

}
