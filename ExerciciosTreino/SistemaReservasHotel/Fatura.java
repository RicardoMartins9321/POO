package ExerciciosTreino.SistemaReservasHotel;

public class Fatura {
    private Reserva reserva;
    private double valorTotal;

    public Fatura(Reserva reserva, double valorTotal) {
        this.reserva = reserva;
        this.valorTotal = valorTotal;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
