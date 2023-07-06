package aula03;
import java.util.Scanner;

public class GradesProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        // creates the table with 3 columns and as many rows as there are students
        double[][] grades = new double[numStudents][2];

        System.out.println("NotaT\tNotaP\tPauta");

        for (int i = 0; i < numStudents; i++) {
            double theoretical = Math.round(Math.random() * 200) / 10.0;
            double practical = Math.round(Math.random() * 200) / 10.0;
            double finalGrade = calculateFinalGrade(theoretical, practical);

            grades[i][0] = theoretical;
            grades[i][1] = practical;
            // if finalGrade is 66 show 66 if not show the calculatedfinalGrade
            int status = (finalGrade == 66) ? 66 : (int) finalGrade;

            // \t outputs a tab space ; %n outputs a line break
            System.out.printf("%.1f\t%.1f\t%s%n",theoretical, practical, status);
        }

        input.close();
    }

    public static double calculateFinalGrade(double theoretical, double practical) {
        if (theoretical < 7.0 || practical < 7.0) {
            return 66;
        }
        double finalGrade = 0.4 * theoretical + 0.6 * practical;
        return Math.round(finalGrade);
    }
}
