package aula07;

import java.util.Scanner;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = null;
        Date date2 = null;
        int answer, year = 0, month = 0, day = 0, increment, decrement;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    "Date Operations \n 1 - Create new date \n2 - Show current date \n3 - Increment date \n4 - Decrement date \n0 - Exit");
            answer = sc.nextInt();
            while (answer < 0 || answer > 4) {
                System.out.println("Invalid number, try again");
                answer = sc.nextInt();
            }
            if (answer == 1) {
                do {
                    System.out.print("Ano? ");
                    year = sc.nextInt();
                } while (year <= 0);
                do {
                    System.out.print("Mês? ");
                    month = sc.nextInt();
                } while (DateYMD.ValidMonth(month));
                do {
                    System.out.print("Dia? ");
                    day = sc.nextInt();
                } while (day > DateYMD.GetDays(month, year));
                date1 = new DateYMD(year, month, day);
                date2 = new DateND(year, month, day);
                System.out.println("Date created sucessfully! \n");
                System.out
                        .println("Current date: " + date1.toString() + "\n");
                System.out
                        .println("Distancia a 1/1/2000 : " + date2.toString() + "\n");
            }
            if (answer == 2) {
                if (date1 == null)
                    System.out.println("Sem data criada");
                else
                    System.out
                            .println("Data: " + date1.toString() + "\n");
                System.out
                        .println("Distancia a 1/1/2000 : " + date2.toString() + "\n");
            }
            if (answer == 3) {
                if (date1 != null && date2 != null) {
                    System.out.print("Incremento: ");
                    increment = sc.nextInt();
                    date1.Increment(increment);
                    date2.Increment(increment);
                    System.out.println("New Date: " + date1.toString() + "\n");
                    System.out
                            .println("Distancia a 1/1/2000 - " + date2.toString()
                                    + "\n");
                } else
                    System.out.println("Sem data criada");
            }
            if (answer == 4) {
                if (date1 != null && date2 != null) {
                    System.out.print("Decremento: ");
                    decrement = sc.nextInt();
                    date1.Decrement(decrement);
                    date2.Decrement(decrement);
                    System.out.println("New Date: " + date1.toString() + "\n");
                    System.out
                            .println("Distancia a 1/1/2000 - " + date2.toString()
                                    + "\n");
                } else
                    System.out.println("Sem data criada");
            }
        } while (answer != 0);
        sc.close();
    }
}
