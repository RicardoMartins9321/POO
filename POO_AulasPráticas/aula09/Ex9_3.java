package aula09;

import java.util.Scanner;

public class Ex9_3 {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void addPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("\nAdding a new plane to the fleet...");

        System.out.print("Enter the plane ID: ");
        String id = scanner.next();

        System.out.print("Enter the plane manufactuer: ");
        String manufacturer = scanner.next();

        System.out.print("Enter the plane model: ");
        String model = scanner.next();

        System.out.print("Enter the plane year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the max number of passengers: ");
        int maxPassengers = scanner.nextInt();

        System.out.print("Enter the plane max speed (in km/h): ");
        int maxSpeed = scanner.nextInt();

        System.out.println("Select the plane type:");
        System.out.println("1. (Commercial): ");
        System.out.println("2. (Military): ");
        int typeChoice = scanner.nextInt();

        if (typeChoice == 1) {
            System.out.print("Enter the number of passengers: ");
            int numCrew = scanner.nextInt();

            CommercialPlane plane = new CommercialPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, numCrew);
            planeManager.addPlane(plane);

            System.out.println("Commercial plane added successfully!");
        } else if (typeChoice == 2) {
            System.out.print("Enter the plane ammunition: ");
            int ammunition = scanner.nextInt();

            MilitaryPlane plane = new MilitaryPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, ammunition);
            planeManager.addPlane(plane);

            System.out.println("Military plane added successfully!");
        } else {
            System.out.println("Invalid choice. Plane not added.");
        }
    }

    public static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("\nRemoving a plane from the fleet...");

        System.out.print("Enter the plane ID: ");
        String id = scanner.next();

        Plane removedPlane = planeManager.removePlane(id);

        if (removedPlane != null) {
            System.out.println("Plane " + id + " removed successfully.");
            } else {
            System.out.println("Plane " + id + " not found in the fleet.");
            }
        }

    public static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("\nSearching for a plane...");
    
        System.out.print("Enter the plane ID: ");
        String id = scanner.next();
    
        Plane searchedPlane = planeManager.searchPlane(id);
    
        if (searchedPlane != null) {
            System.out.println("Plane found:\n" + searchedPlane);
        } else {
            System.out.println("Plane " + id + " not found in the fleet.");
        }
    }
    
    public static void printAllPlanes(PlaneManager planeManager) {
        System.out.println("\nPrinting information on all planes in the fleet:");
        
        planeManager.printAllPlanes();
    }
    
    public static void printCommercialPlanes(PlaneManager planeManager) {
        System.out.println("\nPrinting list of all commercial planes in the fleet:");
    
        for (CommercialPlane commercialPlane : planeManager.getCommercialPlanes()) {
            System.out.println(commercialPlane);
        }
    }
    
    public static void printMilitaryPlanes(PlaneManager planeManager) {
        System.out.println("\nPrinting list of all military planes in the fleet:");
    
        for (MilitaryPlane militaryPlane : planeManager.getMilitaryPlanes()) {
            System.out.println(militaryPlane);
        }
    }
    
    public static void printFastestPlane(PlaneManager planeManager) {
        Plane fastestPlane = planeManager.getFastestPlane();
        System.out.println(fastestPlane);
        if (fastestPlane != null) {
            System.out.println("\nPrinting information on the fastest plane in the fleet:");
            System.out.println(fastestPlane);
        } else {
            System.out.println("There are no planes in the fleet.");
        }
    }
}
