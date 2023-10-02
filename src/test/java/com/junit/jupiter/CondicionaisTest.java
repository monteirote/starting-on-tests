package com.junit.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSomenteNoUserRoot() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void validarApenasNoMacOS() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
