package ExerciciosTreino.SistemaReservasHotel;

public class Quarto {
    private int numero;
    private double precoDiaria;
    private boolean reservado;

    public Quarto(int numero, double precoDiaria) {
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        reservado = true;
    }

    public void liberar() {
        reservado = false;
    }
}
