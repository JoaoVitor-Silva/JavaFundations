package Entities;

import java.util.Random;

public class Jogos {
    private int ValorJogo;
    private Random GerarQuantidadeTickets = new Random();

    public Jogos() {
    }

    public Jogos(int valorJogo) {
        ValorJogo = valorJogo;
    }

    public int GetValorJogo() {
        return ValorJogo;
    }

    public void SetValorJogo(int valor) {
        ValorJogo = valor;
    }

    public void Jogar(Cartoes cartao) {

        if (cartao.GetSaldoAtual() >= ValorJogo) {
            cartao.SetSaldo(cartao.GetSaldoAtual() - ValorJogo);

            int ticketsGerados = GerarQuantidadeTickets.nextInt(10);
            cartao.SetSaldoTickets(cartao.GetSaldoTickets() + ticketsGerados);

            System.out.println("Numero cartão: " + cartao.GetIdCartao() +
                    "\nVocê ganhou " + ticketsGerados + " tickets" +
                    "\nSeu saldo atual de tickets é " + cartao.GetSaldoTickets());
        } else {
            System.out.println("Saldo para jogar insuficiente.");
        }
    }
}
