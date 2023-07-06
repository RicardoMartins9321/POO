package aula05;
import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date(1, 1, 2000);
        int option = 0;
        
        do{
            System.out.println("1. Create new date");
            System.out.println("2. Show current date");
            System.out.println("3. Increment date");
            System.out.println("4. Decrement date");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;

                case 1:
                    System.out.print("Enter day: ");
                    int day = sc.nextInt();
                    System.out.print("Enter month: ");
                    int month = sc.nextInt();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    try {
                        date.setDate(day, month, year);
                        System.out.println("Date set to " + date);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid date");
                    }
                case 2:
                    System.out.println("Current date: " + date);
                    break;

                case 3:
                    Date.incrementDate(date);
                    System.out.println("Date incremented to " + date);
                    break;

                case 4:
                    Date.decrementDate(date);
                    System.out.println("Date decremented to " + date);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(option!=0);
        sc.close();
    }
}
