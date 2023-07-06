package P05_aula13;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;
import P05_aula13.ContactManager;


public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Scanner file = new Scanner(new FileReader("Exercícios Aulas POO/POO/src/P05_aula13/contactos.txt"));
            file.useDelimiter("[\\p{Punct}\\s]+");
            Set<String> contactosSet = new HashSet<>();
            int i = 0;

            while (file.hasNext()) {
                String palavra = file.next();
                contactosSet.add(palavra);
                i++;
            }

            file.close();
            System.out.printf("Número de contactos diferentes: %d \n", contactosSet.size());
            System.out.printf("Contactos: %d \n", contactosSet);
            
        } catch (IOException e) {
            System.out.println("Ficheiro não existe!");
        }

        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar contacto");
            System.out.println("2. Modificar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto por nome");
            System.out.println("5. Procurar contacto por telemovel");
            System.out.println("6. Procurar contacto por email");
            System.out.println("7. Listar contactos");
            System.out.println("8. Listar contactos ordenados por nome");
            System.out.println("9. Listar contactos ordenados por telemóvel");
            System.out.println("10. Listar contactos ordenados por e-mail");
            System.out.println("11. Listar contactos ordenados por data de nascimento");
            System.out.println("0. Exit");
            System.out.print("Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    //contactManager.addContact(scanner);
                    break;
                case 2:
                    //contactManager.changeContact(Contact person);
                    break;
                case 3:
                    //contactManager.removeContact(Contact person);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    contactManager.searchContactByname(name);
                    break;
                case 5:
                    System.out.print("Enter Phone number: ");
                    int phoneNumber = scanner.nextInt();
                    contactManager.searchContactByPhoneNumber(phoneNumber);
                    break;
                case 6:
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactManager.searchContactByEmail(email);
                    break;
                case 7:
                    contactManager.listAllContacts();
                    break;
                case 8:
                    contactManager.listContactsByName();
                    break;
                case 9:
                    contactManager.listContactsByPhoneNumber();
                    break;
                case 10:
                    contactManager.listContactsByEmail();
                    break;
                case 11:
                    contactManager.listContactsByBirthDate();
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
