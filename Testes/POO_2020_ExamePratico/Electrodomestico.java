package POO_2020_ExamePratico;

import java.util.Objects;

public class Electrodomestico extends Produto {
    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica classe;
    private double potencia;
    public static final double IVA = 0.23;

    public Electrodomestico(String tipo, String marca, String modelo, double potencia, double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Electrodomestico(String tipo, String marca, String modelo, double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public Electrodomestico tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public Electrodomestico marca(String marca) {
        setMarca(marca);
        return this;
    }

    public Electrodomestico modelo(String modelo) {
        setModelo(modelo);
        return this;
    }

    public Electrodomestico potencia(double potencia) {
        setPotencia(potencia);
        return this;
    }

    public ClasseEnergetica getClasse() {
        return this.classe;
    }

    public void setClasse(ClasseEnergetica x) {
        this.classe = x;
    }

    @Override
    public String getDescricao() {
        return this.tipo + ":" + this.marca + "/" + this.modelo;
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPreco() + this.getPreco() * IVA;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Electrodomestico)) {
            return false;
        }
        Electrodomestico electrodomestico = (Electrodomestico) o;
        return Objects.equals(tipo, electrodomestico.tipo) && Objects.equals(marca, electrodomestico.marca)
                && Objects.equals(modelo, electrodomestico.modelo) && potencia == electrodomestico.potencia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, marca, modelo, potencia);
    }

    @Override
    public String toString() {
        return "Electrodomestico [" + this.tipo + " " + this.marca + " " + this.modelo + " " + this.classe + " " + this.potencia + " W]";
    }
    

}
