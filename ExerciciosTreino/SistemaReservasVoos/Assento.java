package ExerciciosTreino.SistemaReservasVoos;

public class Assento implements Reservavel {
    private int numeroAssento;
    private boolean reservado;

    public Assento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
        this.reservado = false;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            return true;
        }
        return false;
    }

    public boolean cancelarReserva() {
        if (reservado) {
            reservado = false;
            return true;
        }
        return false;
    }
}
