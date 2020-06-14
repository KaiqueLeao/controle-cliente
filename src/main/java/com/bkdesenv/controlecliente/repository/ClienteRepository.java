package com.bkdesenv.controlecliente.repository;

import com.bkdesenv.controlecliente.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
