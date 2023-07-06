package aula03;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montanteInicial = -1;
        double juros = -1;
        
        while ((montanteInicial <= 0 || montanteInicial%1000 != 0) || (juros>0.05 || juros<0)) {
            System.out.print("Escreva o montante(múltiplo de 1000): ");
            montanteInicial = sc.nextDouble();
            System.out.print("Escreva os juros(0-5%): ");
            juros = sc.nextDouble() / 100;
        }
        sc.close();

        // Calculate and print monthly balances
        System.out.println("Month\tBalance");
        double montanteMensal = montanteInicial;
        for (int i = 0; i < 12; i++) {
            montanteMensal += montanteMensal*juros;
            System.out.printf("%d\t%.2f\n", i+1, montanteMensal);
        }
    }
}
