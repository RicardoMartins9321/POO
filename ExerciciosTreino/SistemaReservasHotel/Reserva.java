package ExerciciosTreino.SistemaReservasHotel;

public class Reserva {
    private Quarto quarto;
    private String nomeHospede;
    private int numeroNoites;
    private boolean cancelada;

    public Reserva(Quarto quarto, String nomeHospede, int numeroNoites) {
        this.quarto = quarto;
        this.nomeHospede = nomeHospede;
        this.numeroNoites = numeroNoites;
        this.cancelada = false;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void cancelar() {
        cancelada = true;
    }
}
