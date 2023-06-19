import java.util.Random;

public class ComputeMethods {
    public double fToC(double degreesF){
        return (degreesF - 32) / 1.8;
    }
    
    public double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int roll(){
        Random rnd = new Random();
        return rnd.nextInt(6) + rnd.nextInt(6);
    }
}
