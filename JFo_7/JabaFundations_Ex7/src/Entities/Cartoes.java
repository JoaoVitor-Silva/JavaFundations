package Entities;

import java.util.Random;

public class Cartoes {
    private int IdCartao;
    private int SaldoTickets;
    private int SaldoAtual;
    Random IdRandomNumber = new Random();

    public Cartoes(int saldoAtual) {
        IdCartao = IdRandomNumber.nextInt(1000);
        SaldoAtual = saldoAtual;
    }

    public int GetIdCartao() {
        return IdCartao;
    }

    public int GetSaldoTickets() {
        return SaldoTickets;
    }

    public int GetSaldoAtual() {
        return SaldoAtual;
    }

    public void SetSaldoTickets(int valor) {
        SaldoTickets = valor;
    }

    public void SetSaldo(int valor) {
        SaldoAtual = valor;
    }
}