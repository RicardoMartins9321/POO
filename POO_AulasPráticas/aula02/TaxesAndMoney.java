/*Um fundo de investimento fornece uma taxa de juros mensal fixa, que acumula com o saldo 
anterior do investimento (juros rendem juros). Escreva um programa em Java que peça ao 
utilizador o montante investido e a taxa de juro mensal. Indique o valor total ao final de 3 
meses. (Por exemplo, para um investimento de 5000 euros e uma taxa de 1% o montante ao fim de 3 
meses será de 5151.505 euros). */

package aula02;

import java.util.Scanner;

public class TaxesAndMoney {
    public static void main(String[] args) {
        double investiment, tax;
        Scanner sc = new Scanner(System.in);

        System.out.print("Investiment made: ");
        investiment = sc.nextDouble();
        
        System.out.print("Taxes apllied: ");
        tax = sc.nextDouble();

        for (int i = 0; i < 3; i++) {
            investiment = investiment + investiment * tax/100;
        }
        
        System.out.printf("The final Value ater 3 months is %.2f",investiment);

        sc.close();
    }
}
