package aula03;
import java.util.Scanner;

public class TaxesandMoney2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double amount = readPositiveMultipleOf1000(input);
        double monthlyRate = readMonthlyRate(input);
        
        // Calculate and print monthly balances
        double balance = amount;
        System.out.println("Month\tBalance");
        for (int month = 1; month <= 12; month++) {
            balance += balance * monthlyRate;
            System.out.printf("%d\t%.2f\n", month, balance);
        }

        input.close();
    }
    
    public static double readPositiveMultipleOf1000(Scanner input) {
        double value;
        do {
            System.out.print("Enter amount invested (multiple of 1000): ");
            value = input.nextDouble();
        } while (value <= 0 || value % 1000 != 0);
        return value;
    }
    
    public static double readMonthlyRate(Scanner input) {
        double rate;
        do {
            System.out.print("Enter monthly interest rate (0-5%): ");
            rate = input.nextDouble() / 100.0;
        } while (rate < 0 || rate > 0.05);
        return rate;
    }
}
