package POO_2019_ExamePrático;

import java.util.ArrayList;
import java.util.Objects;

public class Mercado {
    private String nome;
    private String local;
    private ArrayList<Bar> estabelecimentos = new ArrayList<>();
    private ArrayList<String> nomes = new ArrayList<>();

    public Mercado(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Mercado nome(String nome) {
        setNome(nome);
        return this;
    }

    public Mercado local(String local) {
        setLocal(local);
        return this;
    }

    public void add(Bar x) {
        estabelecimentos.add(x);
    }

    public int totalItems() {
        return estabelecimentos.size();
    }

    public ArrayList<String> tendas() {
        for (Bar x : estabelecimentos) {
            nomes.add(x.toString());
        }
        return nomes;
    }

    public ArrayList<String> getAllItems() {
        ArrayList<String> cena = new ArrayList<>();
        for (Bar x : estabelecimentos) {
            cena.add(x.items());
        }
        return cena;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mercado)) {
            return false;
        }
        Mercado mercado = (Mercado) o;
        return Objects.equals(nome, mercado.nome) && Objects.equals(local, mercado.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, local);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", local='" + getLocal() + "'" +
                "}";
    }

}
