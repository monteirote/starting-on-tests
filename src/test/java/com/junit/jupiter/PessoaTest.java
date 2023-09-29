package com.junit.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class PessoaTest {


    @Test
    void isCalculandoIdadeCorretamente() {
        Pessoa p1 = new Pessoa("Vinicius", LocalDateTime.of(2000, 1, 1 , 10, 0));
        assertEquals(23, p1.calcIdade());
    }
    @Test
    void isMaiorDeIdade() {
        Pessoa p1 = new Pessoa("Vinicius", LocalDateTime.of(2000, 1, 1 , 10, 0));
        assertTrue(p1.isMaiorDeIdade());

        Pessoa p2 = new Pessoa("Vinicius", LocalDateTime.now());
        assertFalse(p2.isMaiorDeIdade());
    }

    @Test
    void validarLancamentos() {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(array1, array2);
    }

    @Test
    void validarPessoa() {
        Pessoa p1 = null;
        Assertions.assertNull(p1);

        p1 = new Pessoa("Vinicius", LocalDateTime.now());
        Assertions.assertNotNull(p1);
    }

    @Test
    void isNameCorreto() {
        Pessoa p1 = new Pessoa("Vinicius", LocalDateTime.now());
        assertEquals("Vinicius", p1.getNome());
    }



}
