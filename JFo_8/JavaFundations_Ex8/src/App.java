import java.util.Scanner;

import Entities.PartidaDeFutebol;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        PartidaDeFutebol partidaDeFutebol = new PartidaDeFutebol(4);

        for (int index = 0; index < partidaDeFutebol.GetNumeroEquipes(); index++ ){
            System.out.print("Nome do time " + (index + 1) + ": ");
            String nomeTime = input.nextLine();
            partidaDeFutebol.AdicionarEquipe(index, nomeTime);
        }

        while(!partidaDeFutebol.FimDaTemporada()){
            System.out.print("Informe a temperatura: ");
            int temperatura = input.nextInt();
            input.nextLine();

            partidaDeFutebol.Jogar(temperatura);
        }

        System.out.println("Estatisticas dos times na temporada: ");
        partidaDeFutebol.printEstatisticasEquipe();
        System.out.println("Estatisticas dos jogos: ");
        partidaDeFutebol.printEstatisticasJogo();

        input.close();
    }
}
