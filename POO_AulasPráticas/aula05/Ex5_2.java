package aula05;
import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int dayOfWeek = 0;
        do{
            System.out.print("Qual o ano: ");
            year = sc.nextInt();
        }while(CalendarV2.yearIsValid(year)!=true);
        do{
            System.out.print("Qual o mês(1-12): ");
            month = sc.nextInt();
        } while(CalendarV2.monthIsValid(month)!=true);
        do {
            System.out.println("(1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)");
            System.out.print("Qual o dia da semana: ");
            dayOfWeek = sc.nextInt();
        } while(CalendarV2.dayWeekIsValid(dayOfWeek)!=true);
        sc.close();

        CalendarV2.printCalendarMonth(year, month, dayOfWeek);
    }

}
