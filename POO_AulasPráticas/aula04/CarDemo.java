package aula04;
import java.util.Scanner;
import java.util.regex.Pattern;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

    @Override
    public String toString() {
        return make + " " + model + ", " + year + ", kms: " + kms;
    }
}

public class CarDemo {
    private static final Pattern CAR_DATA_PATTERN = Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)* [0-9]{4} [0-9]+$");
    private static final Pattern TRIP_PATTERN = Pattern.compile("^[0-9]+:[0-9]+$");

    static Scanner sc = new Scanner(System.in);

    static boolean isValidCarData(String carData) {
        return CAR_DATA_PATTERN.matcher(carData).matches();
    }

    static boolean isValidTrip(String trip) {
        return TRIP_PATTERN.matcher(trip).matches();
    }

    static Car[] registerCars() {
        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter car data (make, model, year, kilometers): ");
            String carData = sc.nextLine();

            if (carData.isEmpty()) {
                break;
            }

            if (!isValidCarData(carData)) {
                System.out.println("Badly formatted data. Try again.");
                i--;
                continue;
            }

            String[] carDataParts = carData.split(" ");
            String make = carDataParts[0];
            String model = carDataParts[1];
            int year = Integer.parseInt(carDataParts[2]);
            int kms = Integer.parseInt(carDataParts[3]);
            cars[i] = new Car(make, model, year, kms);
        }

        return cars;
    }

    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados:");

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.printf("%s %s, %d, kms: %d\n", cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
            }
        }
        
        System.out.println("\n");
    }

    static void logTrip(Car[] cars, int carIndex, int distance) {
        cars[carIndex].drive(distance);
    }

    public static void main(String[] args) {
        Car[] cars = registerCars();
        listCars(cars);

        while (true) {
            System.out.print("Log a trip in the format \"car:distance\": ");
            String trip = sc.nextLine();

            if (trip.isEmpty()) {
                break;
            }

            if (!isValidTrip(trip)) {
                System.out.println("Badly formatted data. Try again.");
                continue;
            }

            String[] tripParts = trip.split(":");
            int carIndex = Integer.parseInt(tripParts[0]);
            int distance = Integer.parseInt(tripParts[1]);
            if (carIndex < 0 || carIndex >= cars.length || cars[carIndex] == null) {
                System.out.println("Invalid car index. Try again.");
                continue;
            }

            logTrip(cars, carIndex, distance);
        }

        listCars(cars);

        sc.close();
    }
}
