package ExerciciosTreino.SistemaReservasEventos;

public class Reserva {
    private Evento evento;
    private Participante participante;

    public Reserva(Evento evento, Participante participante) {
        this.evento = evento;
        this.participante = participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public Participante getParticipante() {
        return participante;
    }
}
