package aula08;

public class Taxi extends AutomovelLigeiro {
    private int numLicenca;

    public Taxi(String matricula, String marca, String modelo, int cilindrada, int numQuadro, int capBagageira,
            int numLicenca) {
        super(matricula, marca, modelo, cilindrada, numQuadro, capBagageira);
        this.numLicenca = numLicenca;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    @Override
    public String toString() {
        return "Táxi" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: "
                + this.getModelo();
    }
}
