package POO_2019_ExamePrático;

import java.util.ArrayList;
import java.util.Objects;

public class Tasquinha extends Bar {
    private int numero;
    private String nome;
    private String[] comidas;
    private ArrayList<String> pratos = new ArrayList<>();

    public Tasquinha(int numero, String nome) {
        super(numero, nome);
    }

    public Tasquinha(int numero, String nome, String[] comidas) {
        super(numero, nome);
        this.comidas = comidas;

        for (String x : comidas) {
            pratos.add(x);
        }
    }

    public String[] getComidas() {
        return this.comidas;
    }

    public void setComidas(String[] comidas) {
        this.comidas = comidas;
    }

    public Tasquinha numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Tasquinha nome(String nome) {
        setNome(nome);
        return this;
    }

    public Tasquinha comidas(String[] comidas) {
        setComidas(comidas);
        return this;
    }

    public ArrayList<String> getLista1() {
        return this.pratos;
    }

    public void addPrato(String x) {
        pratos.add(x);
    }

    public String items() {
        StringBuilder sb = new StringBuilder();
        for (String x : pratos) {
            sb.append(x + ",");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tasquinha)) {
            return false;
        }
        Tasquinha tasquinha = (Tasquinha) o;
        return numero == tasquinha.numero && Objects.equals(nome, tasquinha.nome)
                && Objects.equals(comidas, tasquinha.comidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nome, comidas);
    }

    @Override
    public String toString() {
        return getNome();
    }

}
