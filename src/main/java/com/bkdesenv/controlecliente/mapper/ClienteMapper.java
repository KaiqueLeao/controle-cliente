package com.bkdesenv.controlecliente.mapper;

import com.bkdesenv.controlecliente.dto.ClienteDTO;
import com.bkdesenv.controlecliente.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente clienteDtoToCliente(ClienteDTO clienteDTO);
}
