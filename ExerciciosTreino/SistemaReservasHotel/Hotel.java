package ExerciciosTreino.SistemaReservasHotel;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Quarto> quartos;

    public Hotel() {
        quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Quarto> getQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : quartos) {
            if (!quarto.isReservado()) {
                quartosDisponiveis.add(quarto);
            }
        }
        return quartosDisponiveis;
    }

    public Reserva realizarReserva(Quarto quarto, String nomeHospede, int numeroNoites) {
        if (quarto.isReservado()) {
            System.out.println("O quarto já está reservado.");
            return null;
        } else {
            quarto.reservar();
            Reserva reserva = new Reserva(quarto, nomeHospede, numeroNoites);
            return reserva;
        }
    }

    public void cancelarReserva(Reserva reserva) {
        Quarto quarto = reserva.getQuarto();
        quarto.liberar();
        reserva.cancelar();
    }

    public Fatura gerarFatura(Reserva reserva) {
        double valorTotal = reserva.getQuarto().getPrecoDiaria() * reserva.getNumeroNoites();
        Fatura fatura = new Fatura(reserva, valorTotal);
        return fatura;
    }
}
