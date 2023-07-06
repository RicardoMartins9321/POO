package POO_2022_ExamePratico;

public class Client implements Comparable<Client> {
    private String nome;
    private String loc;
    public Client(String nome, String loc) {
        this.nome = nome;
        this.loc = loc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((loc == null) ? 0 : loc.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (loc == null) {
            if (other.loc != null)
                return false;
        } else if (!loc.equals(other.loc))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return  nome + " [" + loc + "]";
    }
    @Override
    public int compareTo(Client other) {
        return this.loc.compareTo(other.loc);
    }
    
}
