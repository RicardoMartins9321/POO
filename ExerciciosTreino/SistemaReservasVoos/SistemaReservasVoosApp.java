package ExerciciosTreino.SistemaReservasVoos;

import java.time.LocalDate;
import java.util.List;

public class SistemaReservasVoosApp {
    public static void main(String[] args) {
        SistemaReservasVoos sistema = new SistemaReservasVoos();

        // Adicionar voos
        Voo voo1 = new Voo("001", "São Paulo", "Rio de Janeiro", LocalDate.of(2023, 5, 1), 100);
        Voo voo2 = new Voo("002", "Rio de Janeiro", "São Paulo", LocalDate.of(2023, 5, 1), 100);
        sistema.adicionarVoo(voo1);
        sistema.adicionarVoo(voo2);

        // Consultar assentos disponíveis
        List<Assento> assentosDisponiveisVoo1 = sistema.getAssentosDisponiveis("001");
        if (assentosDisponiveisVoo1 != null) {
            System.out.println("Assentos disponíveis no voo 001:");
            for (Assento assento : assentosDisponiveisVoo1) {
                System.out.println("Assento " + assento.getNumeroAssento());
            }
        }

        // Realizar reserva
        Reserva reserva1 = sistema.realizarReserva("001", "João", 1);
        if (reserva1 != null) {
            System.out.println("Reserva realizada: " + reserva1.getNumeroVoo() + " - " + reserva1.getNomePassageiro());
        }

        // Cancelar reserva
        boolean cancelada = sistema.cancelarReserva(reserva1);
        if (cancelada) {
            System.out.println("Reserva cancelada: " + reserva1.getNumeroVoo() + " - " + reserva1.getNomePassageiro());
        }

        // Gerar bilhete
        Bilhete bilhete = sistema.gerarBilhete(reserva1);
        System.out.println("Bilhete gerado: " + bilhete);

        // Consultar todos os voos
        List<Voo> voos = sistema.getVoos();
        System.out.println("Lista de voos:");
        for (Voo voo : voos) {
            System.out.println("Voo " + voo.getNumeroVoo() + ": " + voo.getOrigem() + " - " + voo.getDestino());
        }
    }
}
