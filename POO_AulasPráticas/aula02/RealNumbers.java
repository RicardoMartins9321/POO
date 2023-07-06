package aula02;
import java.util.Scanner;

public class RealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a set of real numbers: ");
        double firstNumber = input.nextDouble();
        double max = firstNumber;
        double min = firstNumber;
        double sum = firstNumber;
        int count = 1;

        while (input.hasNext()) {
            double number = input.nextDouble();
            if (number == firstNumber) {
                break;
            }
            max = Math.max(max, number);
            min = Math.min(min, number);
            sum += number;
            count++;
        }

        double average = sum / count;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average: " + average);
        System.out.println("Total number read: " + count);

        input.close();
    }
}
