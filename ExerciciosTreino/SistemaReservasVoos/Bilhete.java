package ExerciciosTreino.SistemaReservasVoos;

public class Bilhete {
    private String numeroVoo;
    private String nomePassageiro;
    private int numeroAssento;

    public Bilhete(String numeroVoo, String nomePassageiro, int numeroAssento) {
        this.numeroVoo = numeroVoo;
        this.nomePassageiro = nomePassageiro;
        this.numeroAssento = numeroAssento;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    @Override
    public String toString() {
        return "Bilhete: " +
                "Voo: " + numeroVoo +
                ", Passageiro: " + nomePassageiro +
                ", Assento: " + numeroAssento;
    }
}
