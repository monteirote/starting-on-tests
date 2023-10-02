package com.junit.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    private Conta contaOrigem;
    private Conta contaDestino;

    @BeforeEach
    void iniciarContas() {
        contaOrigem = new Conta("1235", 0);
        contaDestino = new Conta("1231", 100);
    }
    @Test
    void validarExcecaoQuandoValorIncorreto() {
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1);
        });
    }

    @Test
    void validarTrasnferenciaComValorCorreto() {
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
