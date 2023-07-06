package aula03;
import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int dayOfWeek = 0;
        do{
            System.out.print("Qual o ano: ");
            year = sc.nextInt();
        }while(yearIsValid(year)!=true);
        do{
            System.out.print("Qual o mês(1-12): ");
            month = sc.nextInt();
        } while(monthIsValid(month)!=true);
        do {
            System.out.println("(1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)");
            System.out.print("Qual o dia da semana: ");
            dayOfWeek = sc.nextInt();
        } while(dayWeekIsValid(dayOfWeek)!=true);
        sc.close();

        printCalendar(year, month, dayOfWeek);
    }

    public static void printCalendar(int year, int month, int dayOfWeek) {
        int days = daysInMonth(year, month);

        System.out.println("\t" + getMonthName(month) + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        // Print leading spaces for first week
        if(dayOfWeek != 7) {
            for (int i = 0; i < dayOfWeek; i++) {
                System.out.print("   ");
            }
        }

        // Print days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            if ((day + dayOfWeek) % 7 == 0) System.out.println();
        }
    }
    
    public static int daysInMonth(int year, int month) {
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        else return 31;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
        String[] names = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return names[month - 1];
    }

    public static boolean yearIsValid(int year) {
        if (year >= 0){
            return true;
        }else {
            System.out.println("Print a valid Year!");
            return false;
        }
    }

    public static boolean monthIsValid(int month) {
        if (month >= 1 || month <= 12){
            return true;
        }else {
            System.out.println("Print a valid month!");
            return false;
        }
    }

    public static boolean dayWeekIsValid(int dayOfWeek) {
        if (dayOfWeek >= 1 && dayOfWeek <= 7){
            return true;
        }else {
            System.out.println("Print a valid day of the Week!");
            return false;
        }
    } 
}

