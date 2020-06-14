package com.bkdesenv.controlecliente.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Cliente {

    @Id
    private String cpf;
    private String nome;
    private String sobreNome;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataCadastro;

}
