package POO_2019_ExamePrático;

import java.util.Objects;

public class Bebida {
    private String nome;
    private double alcool;

    public Bebida(String nome, double alcool) {
        this.nome = nome;
        this.alcool = alcool;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAlcool() {
        return this.alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }

    public Bebida nome(String nome) {
        setNome(nome);
        return this;
    }

    public Bebida alcool(double alcool) {
        setAlcool(alcool);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bebida)) {
            return false;
        }
        Bebida bebida = (Bebida) o;
        return Objects.equals(nome, bebida.nome) && alcool == bebida.alcool;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alcool);
    }

    @Override
    public String toString() {
        return getNome();
    }

}
