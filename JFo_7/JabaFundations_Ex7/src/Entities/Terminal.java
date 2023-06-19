package Entities;

import java.util.ArrayList;
import java.util.List;

public class Terminal {

    private List<CategoriaDePremios> Premios = new ArrayList<>() {
        {
            add(new CategoriaDePremios("Ursinho de pelucia", 10, 10));
            add(new CategoriaDePremios("Carrinho de brinquedo", 8, 30));
            add(new CategoriaDePremios("Arma de água", 5, 15));
        }
    };

    public void GetPremios() {
        for (CategoriaDePremios categoriaDePremios : Premios) {
            System.out.println(categoriaDePremios.GetNome());
        }
    }

    public void CompraCreditos(int dolar, Cartoes cartao) {
        int valorRecarga = dolar * 2;
        cartao.SetSaldo(cartao.GetSaldoAtual() + valorRecarga);

        System.out.println("Cartão" +
                "\nSaldo: " + cartao.GetSaldoAtual() +
                "\nTickets: " + cartao.GetSaldoTickets() + "\n");
    }

    public void VerificaSaldoCartao(Cartoes cartao) {
        System.out.println(cartao.GetIdCartao() +
                "\n" +
                cartao.GetSaldoAtual());
    }

    public void TransfereCreditos(Cartoes cartao1, Cartoes cartao2, int valorTrasnferencia) {

        if (cartao1.GetSaldoAtual() < valorTrasnferencia) {
            System.out.println("Não foi possivel realizar a transferencia.");
        } else {
            cartao2.SetSaldo(cartao2.GetSaldoAtual() + valorTrasnferencia);
            cartao1.SetSaldo(cartao1.GetSaldoAtual() - valorTrasnferencia);

            System.out.println("Cartão 1" +
                    "\nSaldo: " + cartao1.GetSaldoAtual() +
                    "\nTickets: " + cartao1.GetSaldoTickets() + "\n");

            System.out.println("Cartão 2" +
                    "\nSaldo: " + cartao2.GetSaldoAtual() +
                    "\nTickets: " + cartao2.GetSaldoTickets() + "\n");
        }
    }

    public void TrocaPremio(Cartoes cartao, String nomePremio) {

        boolean statusTroca = false;
        byte Tenativas = 0;

        for (CategoriaDePremios categoriaDePremios : Premios) {
            if (nomePremio == categoriaDePremios.GetNome()) {
                if (cartao.GetSaldoTickets() >= categoriaDePremios.GetValorTickets()) {

                    cartao.SetSaldoTickets(cartao.GetSaldoAtual() - categoriaDePremios.GetValorTickets());
                    categoriaDePremios.SetQuantidade(categoriaDePremios.GetQuantidade() - 1);

                    System.out.println("Parabens você ganhou um " + categoriaDePremios.GetNome() +
                            "\nQuantidade restante: " + categoriaDePremios.GetQuantidade());
                    statusTroca = true;
                } else {
                    System.out.println("Quantidade de tickets insuficiente.");
                }
            } else {
                Tenativas++;
            }
        }
        if (statusTroca == false && Tenativas == 3) {
            System.out.println("Não possuimos esse premio.");
        }
    }
}
