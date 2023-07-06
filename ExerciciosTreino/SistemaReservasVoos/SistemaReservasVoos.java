package ExerciciosTreino.SistemaReservasVoos;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservasVoos {
    private List<Voo> voos;
    private List<Reserva> reservas;

    public SistemaReservasVoos() {
        this.voos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public List<Assento> getAssentosDisponiveis(String numeroVoo) {
        for (Voo voo : voos) {
            if (voo.getNumeroVoo().equals(numeroVoo)) {
                return voo.getAssentosDisponiveis();
            }
        }
        return null;
    }

    public Reserva realizarReserva(String numeroVoo, String nomePassageiro, int numeroAssento) {
        for (Voo voo : voos) {
            if (voo.getNumeroVoo().equals(numeroVoo)) {
                List<Assento> assentosDisponiveis = voo.getAssentosDisponiveis();
                for (Assento assento : assentosDisponiveis) {
                    if (assento.getNumeroAssento() == numeroAssento) {
                        Reserva reserva = new Reserva(numeroVoo, nomePassageiro, assento);
                        reservas.add(reserva);
                        assento.reservar();
                        return reserva;
                    }
                }
            }
        }
        return null;
    }

    public boolean cancelarReserva(Reserva reserva) {
        boolean removida = reservas.remove(reserva);
        if (removida) {
            reserva.getAssento().cancelarReserva();
            return true;
        }
        return false;
    }

    public Bilhete gerarBilhete(Reserva reserva) {
        return new Bilhete(reserva.getNumeroVoo(), reserva.getNomePassageiro(), reserva.getAssento().getNumeroAssento());
    }
}
