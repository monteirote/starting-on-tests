package com.junit.jupiter;

import org.junit.jupiter.api.*;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void adicionarDados() {
        System.out.println("Dados adicionados ao banco de dados");
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterEach
    void removerDados() {
        System.out.println("Dados removidos do banco de dados");
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
