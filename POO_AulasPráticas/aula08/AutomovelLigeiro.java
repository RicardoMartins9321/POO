package aula08;

public class AutomovelLigeiro extends Veiculo {
    private int numQuadro;
    private int capBagageira;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int cilindrada, int numQuadro,
            int capBagageira) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.capBagageira = capBagageira;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public int getCapBagageira() {
        return capBagageira;
    }

    @Override
    public String toString() {
        return "Automóvel Ligeiro" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
    }
}
