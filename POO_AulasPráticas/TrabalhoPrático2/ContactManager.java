package P05_aula13;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;


public class ContactManager implements ContactManagerInterface {
    private ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public boolean addContact(Contact person) {
        int id = 0;

        System.out.print("Enter person name: ");
        String name = scanner.nextLine();

        System.out.print("Enter mobile phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);

        if (!validatePhoneNumber(phoneNumber)) {
            System.out.println("Invalid mobile phone number. Please try again.");
            return false;
        }

        if (!validateEmail(email)) {
            System.out.println("Invalid email address. Please try again.");
            return false;
        }

        Contact contact = new Contact(id++, name, phoneNumber, email, birthDate);
        contacts.add(contact);

        System.out.println("Contact added successfully.");
        return true;
    }

    public boolean changeContact(Contact person) {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Contact contact = findContact(id);

        if (contact == null) {
            System.out.println("Contact not found. Please try again.");
            return false;
        }

        System.out.println("Contact found:");
        System.out.println(contact);

        System.out.print("Enter new person name (leave blank to keep current value): ");
        String name = scanner.nextLine();

        if (!isBlank(name)) {
            contact.setName(name);
        }

        System.out.print("Enter new mobile phone number (leave blank to keep current value): ");
        String phoneNumber = scanner.nextLine();

        if (!isBlank(phoneNumber) && validatePhoneNumber(phoneNumber)) {
            contact.setPhoneNumber(id);
        } else if (!isBlank(phoneNumber) && !validatePhoneNumber(phoneNumber)) {
            System.out.println("Invalid mobile phone number. Value not changed.");
        }

        System.out.print("Enter new email address (leave blank to keep current value): ");
        String email = scanner.nextLine();

        if (!isBlank(email) && validateEmail(email)) {
            contact.setEmail(email);
        } else if (!isBlank(email) && !validateEmail(email)) {
            System.out.println("Invalid email address. Value not changed.");
            return false;
        }

        System.out.println("Contact updated successfully.");
        return true;
    }

    public boolean removeContact(Contact person) {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Contact contact = findContact(id);

        if (contact == null) {
            System.out.println("Contact not found. Please try again.");
            return false;
            }
            contacts.remove(contact);

            System.out.println("Contact deleted successfully.");
            return true;
        }
        
    public Contact searchContactByname(String name) {
        if (contacts.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public Contact searchContactByEmail(String email) {
        if (contacts.isEmpty()){
            System.out.println("No results found.");
        }else{
            System.out.println("Search results:");
            for (Contact contact : contacts) {
                if (contact.getEmail().equals(email)) {
                    return contact;
                }
        }
        }
        return null;
    }

    public Contact searchContactByPhoneNumber(int phoneNumber) {
        if (contacts.isEmpty()){
            System.out.println("No results found.");
        }
        else{
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber() == phoneNumber) {
                    return contact;
                }
            }
        }
        return null;
    }
    
    public void listAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contact list:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
        
    public void listContactsByName(){
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } 
        else{
            contacts.sort(Comparator.comparing(Contact::getName));

            System.out.println("Contacts sorted by name:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void listContactsByPhoneNumber(){
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } 
        else{
            contacts.sort((a, b) -> Integer.compare(b.getPhoneNumber(), a.getPhoneNumber()));

            System.out.println("Contacts sorted by Phone Number:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void listContactsByEmail(){
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } 
        else{
            contacts.sort(Comparator.comparing(Contact::getEmail));

            System.out.println("Contacts sorted by Email:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void listContactsByBirthDate(){
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contacts sorted by Birth Date:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public Contact findContact(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }
    
    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("9\\d{8}");
    }
    
    public boolean validateEmail(String email) {
        return email.matches(".+@.+\\..+");
    }    

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public void load(String filePath) {
        try {
            filePath = "Exercícios Aulas POO/POO/src/P05_aula13/contactos.txt";
            List<String> linha = Files.readAllLines(Paths.get(filePath));

            for (int i = 1; i < linha.size(); i++) {
                String[] palavras = linha.get(i).split("[\t]");
                System.out.println(palavras);
            }
            
        }catch (IOException e) {
            System.out.println("Não foi possível encontrar o ficheiro");
        }
    }

    public void save(String filePath) {
        filePath = "Exercícios Aulas POO/POO/src/P05_aula13/contactos.txt";
        try {
            PrintWriter writer = new PrintWriter("Exercícios Aulas POO/POO/src/aula12/outputFile.txt");
            for (Contact contact : contacts) {
                writer.println(contact);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Não foi possível escrever o ficheiro");
        }
    }
}


