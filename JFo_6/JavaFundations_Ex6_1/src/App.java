import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        short PIN = 1234;
        short pinInput;
        do{
            System.out.print("Informe o pin para acessar sua conta bancaria: ");
            pinInput = input.nextShort();
        }
        while(pinInput != PIN);

        System.out.println("Agora você tem acesso a sua conta.");

    }
}
