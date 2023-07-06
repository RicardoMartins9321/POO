package aula02;
import java.util.Scanner;

public class MediumVelocity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the speed and distance of the first leg of the journey
        System.out.print("Enter the speed of the first leg in km/h: ");
        double v1 = input.nextDouble();
        System.out.print("Enter the distance of the first leg in km: ");
        double d1 = input.nextDouble();

        // Prompt user for the speed and distance of the second leg of the journey
        System.out.print("Enter the speed of the second leg in km/h: ");
        double v2 = input.nextDouble();
        System.out.print("Enter the distance of the second leg in km: ");
        double d2 = input.nextDouble();

        if(v1<0 || d1<0 || v2<0 || d2<0) {
            System.out.println("Must introduce positive values!");
        }
        else{
            // Calculate the total distance and total time taken for the journey
            double totalDistance = d1 + d2;
            double totalTime = (d1 / v1) + (d2 / v2);

            // Calculate the average speed
            double averageSpeed = totalDistance / totalTime;

            System.out.printf("The average speed is %.2f km/h", averageSpeed);
        }
        
        input.close();
    }
}
