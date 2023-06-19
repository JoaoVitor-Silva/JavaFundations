import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean close = false;

        while (close == false) {
            System.out.print("Enter the color code, or 0 for close program: ");
            double colorCode = input.nextDouble();

            if (colorCode >= 380 && colorCode < 450) {
                System.out.println("The color is violet");
            } 
            else if (colorCode >= 450 && colorCode < 495) {
                System.out.println("The color is blue");
            } 
            else if (colorCode >= 495 && colorCode < 570) {
                System.out.println("The color is green");
            } 
            else if (colorCode >= 570 && colorCode < 590) {
                System.out.println("The color is yellow");
            } 
            else if (colorCode >= 590 && colorCode < 620) {
                System.out.println("The color is orange");
            } 
            else if (colorCode >= 620 && colorCode < 750) {
                System.out.println("The color is red");
            } 
            else if (colorCode == 0){
                close = true;
            }
            else {
                System.out.println("The entered wavelength is not a part of the visible spectrum");
            }
        }
        input.close();
    }
}
