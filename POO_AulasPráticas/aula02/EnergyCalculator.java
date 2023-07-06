/* Escreva um programa que calcule a energia necessária para aquecer a água desde uma 
temperatura inicial até uma temperatura final. O programa deve ler a quantidade de água M 
(em quilogramas), e as temperaturas inicial e final da água (em graus Celsius). A fórmula para 
calcular a energia Q (em Joules) é dada por: 
Q = M * (finalTemperature - initialTemperature) * 4184*/

package aula02;
import java.util.Scanner;

public class EnergyCalculator {

    public static void main(String[] args) {
        double Q, M, finalTemp, initialTemp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água(kg): ");
        M = sc.nextDouble();
        
        System.out.print("Temperatura inicial(Celcius): ");
        initialTemp = sc.nextDouble();

        System.out.print("Temperatura final(Celcius): ");
        finalTemp = sc.nextDouble();

        Q = M * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed to change the temperature is " + Q + "Joules");
        sc.close();
    }

}
