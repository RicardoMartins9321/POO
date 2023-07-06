package aula03;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        // do while loop only escaped when introduced a positive integer
        do {
            System.out.print("Enter a positive integer: ");
            while (!input.hasNextInt()) {
                System.out.print("Enter a positive integer: ");
                input.next();
            }
            n = input.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of all prime numbers up to " + n + " is " + sum);

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        input.close();
    }

    public static boolean isPrime(int n) {
        //any number 1 or smaller in not prime
        if (n <= 1) {
            return false;
        }
        
        // starting on the number 2 divides n to check if the rest 
        // of division equals zero, if so the number n is not prime 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
