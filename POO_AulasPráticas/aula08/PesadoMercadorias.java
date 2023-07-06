package aula08;

public class PesadoMercadorias extends Veiculo {
    private int numQuadro;
    private double peso;
    private double cargaMaxima;

    public PesadoMercadorias(String matricula, String marca, String modelo, int cilindrada, int numQuadro, double peso,
            double cargaMaxima) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String toString() {
        return "Pesado de Mercadorias" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
    }
}
