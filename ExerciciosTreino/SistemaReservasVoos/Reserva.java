package ExerciciosTreino.SistemaReservasVoos;

public class Reserva {
    private String numeroVoo;
    private String nomePassageiro;
    private Assento assento;

    public Reserva(String numeroVoo, String nomePassageiro, Assento assento) {
        this.numeroVoo = numeroVoo;
        this.nomePassageiro = nomePassageiro;
        this.assento = assento;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public Assento getAssento() {
        return assento;
    }
}
