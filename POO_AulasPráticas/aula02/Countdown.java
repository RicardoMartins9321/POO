package aula02;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        input.close();

        for (int i = n; i >= 0; i--) {
            if (i % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
