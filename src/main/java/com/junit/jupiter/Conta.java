package com.junit.jupiter;

public class Conta {

    private String numeroConta;

    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void lancaCredito(int valor) {
        this.saldo += valor;
    }

    public void lancaDebito(int valor) {
        this.saldo -= valor;
    }
}
