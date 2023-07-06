package aula04;
import java.util.Scanner;


public class Ex4_3 {

    static Scanner sc = new Scanner(System.in);
    
    static void listCars(Car2[] cars) {
        System.out.println("Carros registados:");
        for (int i=0; i<cars.length; i++) {
            System.out.printf("%s, %d, kms: %d\n", cars[i].make + " " + cars[i].model, cars[i].year, cars[i].kms);
        }
    System.out.println();
    }

    public static void main(String[] args) {

        Car2[] cars = new Car2[3];
        cars[0] = new Car2("Renault", "Megane Sport Tourer", 2015, 35356);
        cars[1] = new Car2("Toyota", "Camry", 2010, 32456);
        cars[2] = new Car2("Mercedes", "Vito", 2008, 273891);
    
            listCars(cars);
    
            // Adicionar 10 viagens geradas aleatoriamente
            for (int i=0; i<10; i++) {
                int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
                int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
                System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
                
                cars[j].drive(kms); // adiciona a viagem ao carro j
            }
    
            listCars(cars);
    
            sc.close();
    
        }
}
