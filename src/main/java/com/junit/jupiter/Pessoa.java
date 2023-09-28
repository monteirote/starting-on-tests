package com.junit.jupiter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private final String nome;

    private final LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime data) {
        this.nome = nome;
        this.nascimento = data;
    }

    public int calcIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean isMaiorDeIdade() {
        return calcIdade() >= 18;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }
}
