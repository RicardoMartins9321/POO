package aula02;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) throws Exception {
        double km, miles;
        Scanner sc = new Scanner(System.in);   

        System.out.print("Escreva a distância em km: "); 
        km = sc.nextDouble();   

        miles = km / 1.609;

        System.out.println("A distância em milhas é: " + miles);

        sc.close(); 
    }
}
