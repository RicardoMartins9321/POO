package aula03;
import java.util.Scanner;

public class Ex3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sumPrimes = 0;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = sc.nextInt();
        } while(n <= 0);
        sc.close();
        
        for (int i = 0; i < n; i++) {
            if (isPrime(i) == true) {
                sumPrimes += n;
            } 
        }

        if (isPrime(n)) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        System.out.println("Soma de números primos até " + n + ": " + sumPrimes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
