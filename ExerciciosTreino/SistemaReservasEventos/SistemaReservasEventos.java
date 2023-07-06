package ExerciciosTreino.SistemaReservasEventos;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservasEventos {
    private List<Evento> eventos;
    private List<Reserva> reservas;
    private List<Ingresso> ingressos;

    public SistemaReservasEventos() {
        eventos = new ArrayList<>();
        reservas = new ArrayList<>();
        ingressos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> getEventosDisponiveis() {
        return eventos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public boolean realizarReserva(Evento evento, Participante participante) {
        if (evento.adicionarParticipante(participante)) {
            Reserva reserva = new Reserva(evento, participante);
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    public boolean cancelarReserva(Reserva reserva) {
        if (reservas.remove(reserva)) {
            Evento evento = reserva.getEvento();
            Participante participante = reserva.getParticipante();
            evento.removerParticipante(participante);
            return true;
        }
        return false;
    }

    public void gerarIngresso(Reserva reserva) {
        Evento evento = reserva.getEvento();
        Participante participante = reserva.getParticipante();
        String codigo = "INGRESSO-" + System.currentTimeMillis();
        Ingresso ingresso = new Ingresso(evento, participante, codigo);
        ingressos.add(ingresso);
        System.out.println("Ingresso gerado:\n" + ingresso);
    }
}
