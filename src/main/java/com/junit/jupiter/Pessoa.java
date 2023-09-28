package com.junit.jupiter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;

    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime data) {
        this.nome = nome;
        this.nascimento = data;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean isMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
