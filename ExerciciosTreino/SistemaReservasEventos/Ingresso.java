package ExerciciosTreino.SistemaReservasEventos;

public class Ingresso {
    private Evento evento;
    private Participante participante;
    private String codigo;

    public Ingresso(Evento evento, Participante participante, String codigo) {
        this.evento = evento;
        this.participante = participante;
        this.codigo = codigo;
    }

    public Evento getEvento() {
        return evento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public String getCodigo() {
        return codigo;
    }
}
