package aula07.Utils;
import java.util.Scanner;


public class UserInput {
    public static double ValidarDoubleComIntervalo(String text, double min, double max) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        do{
            System.out.print("Enter a number bigger than "+min+" and smaller than "+max+": ");
            number = input.nextInt();
        }while(max <= number || number <= min);

        if(min <= number && number <= max){
            System.out.println("Congratulations! The number you gave was inside the interval");
        }
        else{
            System.out.println("Wrong! The number you gave was outside the interval");
        }
        input.close();

        return number;
    }

    public static boolean isPrime(int n) {
        //any number 1 or smaller in not prime
        if (n <= 1) {
            return false;
        }
        
        // starting on the number 2 divides n to check if the rest 
        // of division equals zero, if so the number n is not prime 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateFinalGrade(double theoretical, double practical) {
        if (theoretical < 7.0 || practical < 7.0) {
            return 66;
        }
        double finalGrade = 0.4 * theoretical + 0.6 * practical;
        return Math.round(finalGrade);
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
    
    public static String getMonthName(int month) {
        String[] names = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return names[month - 1];
    }

    public static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean containsLowercaseLettersOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i)) && s.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String removeExtraSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
