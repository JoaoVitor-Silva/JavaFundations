package Entities;

public class CategoriaDePremios {
    private String Nome;
    private int ValorTickets;
    private int Quantidade;

    public CategoriaDePremios() {
    }

    public CategoriaDePremios(String nome, int valorTickets, int quantidade) {
        Nome = nome;
        ValorTickets = valorTickets;
        Quantidade = quantidade;
    }

    public String GetNome() {
        return Nome;
    }

    public int GetValorTickets() {
        return ValorTickets;
    }

    public int GetQuantidade() {
        return Quantidade;
    }

    public void SetNome(String nome) {
        Nome = nome;
    }

    public void SetValorTickets(int valorTickets) {
        ValorTickets = valorTickets;
    }

    public void SetQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}