package aula04;
import java.util.Scanner;

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car2[] cars) {
        System.out.println("Carros registados:");
        for (int i=0; i<cars.length; i++) {
            System.out.printf("%s, %d, kms: %d\n", cars[i].make + " " + cars[i].model, cars[i].year, cars[i].kms);
        }
    System.out.println();
}
}
