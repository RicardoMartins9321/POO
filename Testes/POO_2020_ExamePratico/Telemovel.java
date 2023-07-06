package POO_2020_ExamePratico;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Telemovel extends Produto {
    private String marca;
    private String modelo;
    private Set<String> notas;
    private static final double IVA = 0.23;

    public Telemovel(String marca, String modelo, double preco) {
        super("T", preco);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = new HashSet<>();
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Telemovel marca(String marca) {
        setMarca(marca);
        return this;
    }

    public Telemovel modelo(String modelo) {
        setModelo(modelo);
        return this;
    }

    public void addNota(String x) {
        notas.add(x);
    }

    @Override
    public String getDescricao() {
        return this.marca.toUpperCase() + "/" + this.modelo;
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPreco() + this.getPreco() * IVA;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Telemovel)) {
            return false;
        }
        Telemovel telemovel = (Telemovel) o;
        return Objects.equals(marca, telemovel.marca) && Objects.equals(modelo, telemovel.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }

    @Override
    public String toString() {
        return "Telemovel [" + this.getCodigo() + ": " + this.marca + " - " + this.modelo + " " + this.notas; 
    }
}
