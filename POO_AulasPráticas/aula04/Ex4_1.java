package aula04;
import java.util.Scanner;

public class Ex4_1 {

    public static void main (String[] args) {
        int option;
        int index = 0;
        Object[] shapes = new Object[50];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Geometry Menu:");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Rectangle");
            System.out.println("3. Create Triangle");
            System.out.println("4. List shapes");
            System.out.println("5. Compare shapes");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Raio: ");
                    double raio = sc.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    shapes[index] = circulo;
                    index++;
                    System.out.println("Circulo criado\n");
                    break;

                case 2:
                    System.out.print("Comprimento: ");
                    double comprimento = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, altura);

                    shapes[index] = retangulo;
                    index++;
                    System.out.println("Retangulo criado\n");
                    break;

                case 3:
                    System.out.print("lado1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("lado2: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("lado3: ");
                    double lado3 = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

                    shapes[index] = triangulo;
                    index++;
                    System.out.println("Triangulo criado\n");
                    break;

                case 4:
                    for (Object shape: shapes) {
                        if (shape != null) System.out.println(shape);
                    }
                    break;

                case 5:
                    System.out.print("Index1: ");
                    int index1 = sc.nextInt();
                    System.out.print("Index2: ");
                    int index2 = sc.nextInt();
                    if (shapes[index1].equals(shapes[index2])) {
                        System.out.println("The shapes are equal");
                    }else{
                        System.out.println("The shapes are not equal");
                    }

                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while(option != 0);

        sc.close();
    }
}
