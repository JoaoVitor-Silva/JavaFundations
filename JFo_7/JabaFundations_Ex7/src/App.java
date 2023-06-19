import Entities.Cartoes;
import Entities.Jogos;
import Entities.Terminal;

public class App {
    public static void main(String[] args) throws Exception {
        Terminal terminal = new Terminal();
        Jogos Jogo = new Jogos();

        Cartoes cartao1 = new Cartoes(0);
        Cartoes cartao2 = new Cartoes(0);
        
        System.out.println(" ");
        terminal.CompraCreditos(5, cartao1);
        terminal.CompraCreditos(5, cartao2);
        
        System.out.println(" ");
        Jogo.Jogar(cartao1);
        Jogo.Jogar(cartao2);
        
        System.out.println(" ");
        terminal.TransfereCreditos(cartao1, cartao2, 5);
        
        System.out.println(" ");
        terminal.TrocaPremio(cartao2, "Ursinho de pelucia");
        
        System.out.println(" ");
        Jogo.Jogar(cartao1);
        terminal.TrocaPremio(cartao1, "Ursinho de pelucia");
    }
}
