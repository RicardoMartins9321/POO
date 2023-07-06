package ExerciciosTreino.SistemaReservasEventos;

public class MainEventos {
    public static void main(String[] args) {
        SistemaReservasEventos sistema = new SistemaReservasEventos();

        // Criação de eventos
        Evento evento1 = new Evento("Conferência A", "Local A", 100);
        Evento evento2 = new Evento("Palestra B", "Local B", 50);
        Evento evento3 = new Evento("Workshop C", "Local C", 20);

        // Adição de eventos ao sistema
        sistema.adicionarEvento(evento1);
        sistema.adicionarEvento(evento2);
        sistema.adicionarEvento(evento3);

        // Realização de reservas
        Participante participante1 = new Participante("João", "joao@email.com");
        Participante participante2 = new Participante("Maria", "maria@email.com");

        sistema.realizarReserva(evento1, participante1);
        sistema.realizarReserva(evento1, participante2);
        sistema.realizarReserva(evento2, participante1);

        // Cancelamento de uma reserva
        Reserva reserva = sistema.getReservas().get(0);
        sistema.cancelarReserva(reserva);

        // Geração de ingresso
        sistema.gerarIngresso(sistema.getReservas().get(1));
    }
}
