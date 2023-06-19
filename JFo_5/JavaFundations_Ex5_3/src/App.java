import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean close = false;

        while (close == false) {
            System.out.println("Enter the color code or 0 for close program: \n1_Red \n2_Green \n3_Yellow");
            byte colorCode = input.nextByte();

            switch (colorCode) {
                case 1:
                    System.out.println("Next Traffic Light is green");
                    break;
                case 2:
                    System.out.println("Next Traffic Light is yellow");
                    break;
                case 3:
                    System.out.println("Next Traffic Light is red");
                    break;
                case 0:
                    close = true;
                    break;
                default:
                    System.out.println("Invalid color");
                    break;
            }
        }
        input.close();
    }
}
