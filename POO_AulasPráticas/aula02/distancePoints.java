package aula02;
import java.util.Scanner;

public class distancePoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of point p1: ");
        int x1 = input.nextInt();
        
        System.out.print("Enter the y-coordinate of point p1: ");
        int y1 = input.nextInt();
        
        System.out.print("Enter the x-coordinate of point p2: ");
        int x2 = input.nextInt();
        
        System.out.print("Enter the y-coordinate of point p2: ");
        int y2 = input.nextInt();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between points p1 and p2 is: " + distance);

        input.close();
    }
}
