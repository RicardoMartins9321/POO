import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ContactManager implements ContactManagerInterface {

    private Set<Contact> contacts;
    private final String filePath;

    public ContactManager(String filePath) {
        this.filePath = filePath;
        this.contacts = new HashSet<>();
        load(filePath);
    }

    @Override
    public void load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 5) {
                    String name = data[0];
                    int phoneNumber = Integer.parseInt(data[1]);
                    String email = data[2];
                    LocalDate birthDate = LocalDate.parse(data[3]);
                    Contact contact = new Contact(name, phoneNumber, email, birthDate);
                    addContact(contact);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading contacts file: " + e.getMessage());
        }
    }

    @Override
    public void save(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Contact contact : contacts) {
                writer.write(contact.getName() + ";" + contact.getPhoneNumber() + ";" + contact.getEmail() + ";"
                        + contact.getBirthDate() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing contacts file: " + e.getMessage());
        }
    }

    @Override
    public boolean validateEmail(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^\\d{9}$";
        return Pattern.matches(phoneNumberRegex, String.valueOf(phoneNumber));
    }

    @Override
    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }
        return contacts.add(contact);
    }

    @Override
    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    @Override
    public Contact searchContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact searchContactByEmail(String email) {
        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact searchContactByPhoneNumber(int phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void listAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void listContactsByName() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByName'");
    }

    @Override
    public void listContactsByPhoneNumber() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByPhoneNumber'");
    }

    @Override
    public void listContactsByBirthDate() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByBirthDate'");
    }

    @Override
    public void listContactsByEmail() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByEmail'");
    }

}
