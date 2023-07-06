package aula06;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert contact");
            System.out.println("2. Change contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Search contact");
            System.out.println("5. List contacts");
            System.out.println("0. Exit");
            System.out.print("Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    Contact2.insertContact(scanner);
                    break;
                case 2:
                    Contact2.changeContact(scanner);
                    break;
                case 3:
                    Contact2.deleteContact(scanner);
                    break;
                case 4:
                    Contact2.searchContact(scanner);
                    break;
                case 5:
                    Contact2.listContacts();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
