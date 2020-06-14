package com.bkdesenv.controlecliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bkdesenv.controlecliente")
@EnableJpaRepositories
public class ControleClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleClienteApplication.class, args);
	}

}
