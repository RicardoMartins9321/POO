package aula02;
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of leg A: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of leg B: ");
        double b = input.nextDouble();
        
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid input: sides must be positive numbers.");
            System.exit(0);
        }

        double c = Math.sqrt(a*a + b*b);
        double angle = Math.toDegrees(Math.atan(b/a));

        System.out.printf("Hypotenuse: %.2f\n", c);
        System.out.printf("Angle between side A and hypotenuse: %.2f degrees\n", angle);        
        input.close();
    }
}
