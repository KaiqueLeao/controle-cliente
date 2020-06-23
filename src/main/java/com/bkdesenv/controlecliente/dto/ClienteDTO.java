package com.bkdesenv.controlecliente.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClienteDTO {

    private String cpf;
    private String nome;
    private String sobreNome;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataCadastro;

}
