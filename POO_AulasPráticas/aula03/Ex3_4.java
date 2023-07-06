package aula03;
import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students in class: ");
        int numStudents = sc.nextInt();
        sc.close();

        System.out.println("NotaT\tNotaP\tPauta");
        for (int i=0; i < numStudents; i++) {
            double notaT = Math.floor(Math.random() * 20) + 1;
            double notaP = Math.floor(Math.random() * 20) + 1;
            System.out.printf("%.1f\t%.1f\t%.0f\n", notaT, notaP, calculateGrade(notaP, notaT));
        }

    }

    public static double calculateGrade(double notaP, double notaT) {
        if (notaP < 7.0 || notaT < 7.0) {
            return 66;
        }
        else {
            return 0.4*notaT + 0.6*notaP;
        }
    }
}
