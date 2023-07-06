package aula03;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // Read input values
        Scanner input = new Scanner(System.in);
        
        int month, year, startDay;
        do {
            System.out.print("Enter a month (1-12): ");
            month = input.nextInt();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Enter a year: ");
            year = input.nextInt();
        } while (year <= 0);
        
        do{
            System.out.print("Enter day of the week (1=Monday, 7=Sunday): ");
            startDay = input.nextInt();
        } while (startDay < 1 || startDay > 7);
        
        // Print calendar
        printCalendar(month, year, startDay);

        input.close();
    }
    
    public static void printCalendar(int month, int year, int startDay) {
        // Calculate number of days in the month
        int daysInMonth = getDaysInMonth(month, year);
        
        // Print month and year
        System.out.println("  " + getMonthName(month) + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        
        // Print leading spaces for first week
        if(startDay != 7) {
            for (int i = 0; i < startDay; i++) {
                System.out.print("   ");
            }
        }
        
        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Print final newline if necessary
        if ((startDay + daysInMonth) % 7 != 0) {
            System.out.println();
        }
    }
    
    public static int getDaysInMonth(int month, int year) {
        int days;
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }
        return days;
    }
    
    public static String getMonthName(int month) {
        String[] names = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return names[month - 1];
    }
}
