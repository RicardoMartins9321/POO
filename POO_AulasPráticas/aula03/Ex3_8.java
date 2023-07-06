package aula03;
import java.util.Scanner;

public class Ex3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma String: ");
        String string = sc.nextLine();
        sc.close();

        System.out.println("Acrónimo: " + buildAcronym(string));
    }

    public static String buildAcronym(String string) {
        String acronym = "";
        String[] words = string.split(" ");
        for (String word : words) {
            if (word.length() >= 3) acronym += word.charAt(0);
        }
        return acronym.toUpperCase();
    }
}
