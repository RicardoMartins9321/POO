package aula08;

public class PesadoPassageiros extends Veiculo {
    private int numQuadro;
    private double peso;
    private double numPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, int numQuadro, double peso,
            double numPassageiros) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.numPassageiros = numPassageiros;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getNumPassageiros() {
        return numPassageiros;
    }

    @Override
    public String toString() {
        return "Pesado de Passageiros" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
    }
}
