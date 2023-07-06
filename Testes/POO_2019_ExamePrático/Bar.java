package POO_2019_ExamePrático;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bar {
    private int numero;
    private String nome;
    private List<Bebida> bebidas = new ArrayList<>();

    public Bar(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Bar(int numero, String nome, List<Bebida> bebidas) {
        this.numero = numero;
        this.nome = nome;
        this.bebidas = bebidas;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bar numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Bar nome(String nome) {
        setNome(nome);
        return this;
    }

    public void add(Bebida x) {
        bebidas.add(x);
    }

    public List<Bebida> getLista() {
        return this.bebidas;
    }

    public int totalProdutos() {
        return bebidas.size();
    }

    public String items() {
        StringBuilder sb = new StringBuilder();
        for (Bebida x : bebidas) {
            sb.append(x.toString() + ",");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bar)) {
            return false;
        }
        Bar bar = (Bar) o;
        return numero == bar.numero && Objects.equals(nome, bar.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nome);
    }

    @Override
    public String toString() {
        return getNome();
    }

}
