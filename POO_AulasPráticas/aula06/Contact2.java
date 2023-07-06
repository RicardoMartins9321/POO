package aula06;

import java.util.ArrayList;
import java.util.Scanner;

import aula05.DateYMD;

public class Contact2 {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static int nextId = 1;


    public static void insertContact(Scanner scanner) {
        System.out.print("Enter person name: ");
        String name = scanner.nextLine();

        System.out.print("Enter mobile phone number: ");
        String mobilePhone = scanner.nextLine();

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the Month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the cc number: ");
        int cc = scanner.nextInt();

        if (!isValidMobilePhone(mobilePhone)) {
            System.out.println("Invalid mobile phone number. Please try again.");
            return;
        }

        if (!isValidEmail(email)) {
            System.out.println("Invalid email address. Please try again.");
            return;
        }

        if(!DateYMD.valid(day, month, year)) {
            System.out.println("Invalid Date. Please try again.");
            return;
        }

        if(cc < 0) {
            System.out.println("Invalid cc. Please try again.");
            return;
        }

        Contact contact = new Contact(nextId++, new Pessoa(name, cc, new DateYMD(day, month, year)), mobilePhone, email);
        contacts.add(contact);

        System.out.println("Contact added successfully.");
    }

    public static void changeContact(Scanner scanner) {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Contact contact = findContact(id);

        if (contact == null) {
            System.out.println("Contact not found. Please try again.");
            return;
        }

        System.out.println("Contact found:");
        System.out.println(contact);

        System.out.print("Enter new person name (leave blank to keep current value): ");
        String name = scanner.nextLine();

        if (!isBlank(name)) {
            contact.setPessoa(new Pessoa(name));
        }

        System.out.print("Enter new mobile phone number (leave blank to keep current value): ");
        String mobilePhone = scanner.nextLine();

        if (!isBlank(mobilePhone) && isValidMobilePhone(mobilePhone)) {
            contact.setMobilePhone(mobilePhone);
        } else if (!isBlank(mobilePhone) && !isValidMobilePhone(mobilePhone)) {
            System.out.println("Invalid mobile phone number. Value not changed.");
        }

        System.out.print("Enter new email address (leave blank to keep current value): ");
        String email = scanner.nextLine();

        if (!isBlank(email) && isValidEmail(email)) {
            contact.setEmail(email);
        } else if (!isBlank(email) && !isValidEmail(email)) {
            System.out.println("Invalid email address. Value not changed.");
        }

        System.out.println("Contact updated successfully.");
    }

    public static void deleteContact(Scanner scanner) {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Contact contact = findContact(id);

        if (contact == null) {
            System.out.println("Contact not found. Please try again.");
            return;
            }
            contacts.remove(contact);

            System.out.println("Contact deleted successfully.");
        }
        
    public static void searchContact(Scanner scanner) {
        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine();
    
        ArrayList<Contact> searchResults = new ArrayList<>();
    
        for (Contact contact : contacts) {
            if (contact.getPessoa().getnome().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    contact.getMobilePhone().contains(searchTerm) ||
                    contact.getEmail().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResults.add(contact);
            }
        }
    
        if (searchResults.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            for (Contact contact : searchResults) {
                System.out.println(contact);
            }
        }
    }
    
    public static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contact list:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    
    public static Contact findContact(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }
    
    public static boolean isValidMobilePhone(String mobilePhone) {
        return mobilePhone.matches("9\\d{8}");
    }
    
    public static boolean isValidEmail(String email) {
        return email.matches(".+@.+\\..+");
    }    

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}

