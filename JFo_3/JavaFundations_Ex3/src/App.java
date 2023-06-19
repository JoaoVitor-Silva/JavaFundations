import javax.swing.JOptionPane;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String name = input.nextLine();

        System.out.println("Qual o item que deseja comprar? ");
        String item = input.nextLine();

        System.out.println("Qual seria a quantidade");
        int quantidade = input.nextInt();

        System.out.println("Valor do item: ");
        double valor = input.nextDouble();

        System.out.println("Nome do atendente: ");
        String Atendente = input.nextLine();
        
        System.out.println("Que dia isso aconteceu? ");
        String Respota = input.nextLine();
s
        //int calcINT =  
        //double calcDOUBLE = valor * quantidade;
        input.close();
    }
}
