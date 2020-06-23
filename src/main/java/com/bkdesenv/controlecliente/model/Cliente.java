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
    private String name;
    private String lastName;
    private LocalDateTime birthday;
    private LocalDateTime createdDate;

}
