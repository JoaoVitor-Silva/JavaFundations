import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();
        
        input.close();

        String[] worlds = name.split(" ");

        System.out.println(worlds[1] + ", " + name.substring(0, 1));
    }
}
