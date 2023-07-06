package aula01;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the month and year from the user
        int month, year;
        do {
            System.out.print("Enter a month (1-12): ");
            month = input.nextInt();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Enter a year: ");
            year = input.nextInt();
        } while (year <= 0);

        // Calculate the number of days in the month
        int days;
        switch (month) {
            case 2:
                days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        // Print the result
        System.out.printf("There are %d days in %d/%d\n", days, month, year);
        
        input.close();
    }
    
}
