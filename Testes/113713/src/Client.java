import java.util.Objects;

public class Client {
    private int numContribuinte;
    private String name;
    private ClientType type;

    public Client(int numContribuinte, String name, ClientType type) {
        this.numContribuinte = numContribuinte;
        this.name = name;
        this.type = type;
    }

    public int getNumContribuinte() {
        return numContribuinte;
    }

    public ClientType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return numContribuinte == client.numContribuinte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numContribuinte);
    }

    @Override
    public String toString() {
        return String.format("%s [%s: %d]", this.name, this.type, this.numContribuinte);
    }
}
