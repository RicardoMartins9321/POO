package aula03;
import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma String: ");
        String string = sc.nextLine();
        sc.close();

        String stringMinusculas = string.toLowerCase();
        char lastChar = string.charAt(string.length()-1);
        String first3Chars = string.substring(0,3);

        System.out.println(stringMinusculas);

        System.out.println(lastChar);

        System.out.println(first3Chars);

        System.out.println(string.equals("index"));

        System.out.println(string.equalsIgnoreCase("index"));

        System.out.println(string.indexOf("a"));

        System.out.println(string.isEmpty());

        System.out.println(string.toUpperCase());

        System.out.println(string.trim());
        
        System.out.println(string.replace("a", "o"));
    }
}
