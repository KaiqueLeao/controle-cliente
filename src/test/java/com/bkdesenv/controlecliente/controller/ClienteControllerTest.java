package com.bkdesenv.controlecliente.controller;

import com.bkdesenv.controlecliente.builders.ClienteBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class ClienteControllerTest {

    @MockBean
    private ClienteController clienteController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private MvcResult mvcResult;

    @Test
    public void deveTestarCadastroDoCliente() throws Exception {
        RequestBuilder requestBuilder = post("/api/cliente/salvar")
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(ClienteBuilder.umCliente().agora()))
                .contentType(MediaType.APPLICATION_JSON);

        mvcResult = mockMvc
                .perform(requestBuilder)
                .andExpect(status().isCreated())
                .andReturn();
    }

}
