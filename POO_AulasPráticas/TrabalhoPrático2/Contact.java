package P05_aula13;

import java.time.LocalDate;

public class Contact {
    private int id;
    private String name;
    private int phoneNumber;
    private String phoneNumber2;
    private String email;
    private LocalDate birthDate;

    public Contact(int id, String name, int phoneNumber, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Contact(int id, String name, String phoneNumber2, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.phoneNumber2 = phoneNumber2;
        this.email = email;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id:" + id +
                ", name:" + name +
                ", phoneNumber:'" + phoneNumber + '\'' +
                ", email:'" + email + '\'' +
                ", birthDate:" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}


