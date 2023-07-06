package aula02;
import java.util.Scanner;

public class hourMinSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the time
        System.out.print("Enter the time in seconds: ");
        int timeSeconds = input.nextInt();
        
        int h = timeSeconds/3600;
        int m = (timeSeconds%3600)/60;
        int s = timeSeconds%60;

        System.out.printf("The time inserted is  %02d:%02d:%02d", h, m, s);

        input.close();
    }
}
