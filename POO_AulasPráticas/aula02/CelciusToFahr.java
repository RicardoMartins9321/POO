/* Escreva um programa que lê um valor real que especifica temperatura em graus Célsius, 
converte-o para graus Fahrenheit e imprime o resultado. A fórmula de conversão de graus 
Célsius (C) para graus Fahrenheit (F) é a seguinte: F = 1.8 ∗ C + 32*/

package aula02;

import java.util.Scanner;

public class CelciusToFahr {
    
    public static void main(String[] args) {
        double C, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celcius: ");
        C = sc.nextDouble();
        F = 1.8 * C + 32;
        System.out.println(C + "º Celcius is equal to " + F + "º Fahrenheit");
        
        sc.close();
    }

}
