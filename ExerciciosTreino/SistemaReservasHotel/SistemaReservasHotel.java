package ExerciciosTreino.SistemaReservasHotel;

import java.util.List;

public class SistemaReservasHotel {
    public static void main(String[] args) {
        // Criando o hotel
        Hotel hotel = new Hotel();

        // Adicionando quartos ao hotel
        hotel.adicionarQuarto(new Quarto(101, 100.0));
        hotel.adicionarQuarto(new Quarto(102, 120.0));
        hotel.adicionarQuarto(new Quarto(103, 150.0));

        // Consultando quartos disponíveis
        List<Quarto> quartosDisponiveis = hotel.getQuartosDisponiveis();
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartosDisponiveis) {
            System.out.println("Número: " + quarto.getNumero() + " - Preço diária: " + quarto.getPrecoDiaria());
        }

        // Realizando uma reserva
        Quarto quartoReservado = quartosDisponiveis.get(0);
        Reserva reserva = hotel.realizarReserva(quartoReservado, "João", 3);
        if (reserva != null) {
            System.out.println("Reserva realizada com sucesso.");
        }

        // Cancelando a reserva
        hotel.cancelarReserva(reserva);
        if (reserva.isCancelada()) {
            System.out.println("Reserva cancelada.");
        }

        // Gerando uma fatura
        Fatura fatura = hotel.gerarFatura(reserva);
        System.out.println("Fatura - Valor total: " + fatura.getValorTotal());
    }
}
