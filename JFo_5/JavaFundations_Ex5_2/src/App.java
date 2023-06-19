import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean close = false;

        while(close == false){
            System.out.println("Enter the color code or 0 for close program: \n1_Red \n2_Green \n3_Yellow");
            byte colorCode = input.nextByte();
            
            if(colorCode == 1){
                System.out.println("Next Traffic Light is green");
            }
            else if(colorCode == 2)
            {
                System.out.println("Next Traffic Light is yellow");
            }
            else if(colorCode == 3){
                System.out.println("Next Traffic Light is red");
            }
            else if(colorCode == 0){
                close = true;
            }
            else {
                System.out.println("Invalid color");
            }
        }
        input.close();
    }
}
