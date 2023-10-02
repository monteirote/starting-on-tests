package com.junit.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EscolhendoOrdemTest {
    @Order(2)
    @Test
    void validarFluxoB() {
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validarFluxoC() {
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validarFluxoA() {
        Assertions.assertTrue(true);
    }
    @Order(4)
    @Test
    void validarFluxoD() {
        Assertions.assertTrue(true);
    }
}

// OU usando @TestMethodOrder(MehodOrderer.DisplayName.class) OU
//
//@TestMethodOrder(MehodOrderer.MethodName.class)
//public class EscolhendoOrdemTest {
//    @Order(2)
//    @Test
//    void validarFluxoB() {
//        Assertions.assertTrue(true);
//    }
//    @Order(3)
//    @Test
//    void validarFluxoC() {
//        Assertions.assertTrue(true);
//    }
//    @Order(1)
//    @Test
//    void validarFluxoA() {
//        Assertions.assertTrue(true);
//    }
//    @Order(4)
//    @Test
//    void validarFluxoD() {
//        Assertions.assertTrue(true);
//    }
//}
