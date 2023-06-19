import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a number: ");
        int multNumber = input.nextInt();

        input.close();

        for(int multiplicador = 1; multiplicador <= 12 ; multiplicador++){
            int result = multNumber * multiplicador;
            System.out.println(multNumber + "x" + multiplicador + "=" + result);
        }
    }
}
