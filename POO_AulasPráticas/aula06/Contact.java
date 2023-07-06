package aula06;

public class Contact{
    private int id;
    private Pessoa pessoa;
    private String mobilePhone;
    private String email;

    public Contact(int id, Pessoa pessoa, String mobilePhone, String email) {
        this.id = id;
        this.pessoa = pessoa;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id:" + id +
                ", person:" + pessoa +
                ", mobilePhone:'" + mobilePhone + '\'' +
                ", email:'" + email + '\'' +
                '}';
    }
}

