package aula03;
import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma String: ");
        String string = sc.nextLine();
        sc.close();

        System.out.println("Número de digitos da frase: " + countDigits(string));

        System.out.println("Número de espaços da frase: " +countSpaces(string));

        System.out.println("Frase usa somente minusculas: " + lowerCaseOnly(string));

        System.out.println("Só um espaço entre palavras: " + singleSpace(string));

        System.out.println("Frase é um palíndromo: " + isPalindrome(string));
    }

    public static int countDigits(String string) {
        int digits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }

    public static int countSpaces(String string) {
        int spaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }

    public static boolean lowerCaseOnly(String string) {
        String stringLower = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != stringLower.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String singleSpace(String string) {
        return string.replaceAll("( )+", " ");
    }

    public static boolean isPalindrome(String string) {
        if (string.length() < 3) return false;

        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString += string.charAt(i);
        }
        return string.equalsIgnoreCase(newString);
    }
    
}
