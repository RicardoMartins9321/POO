package ExerciciosTreino.SistemaReservasVoos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private LocalDate data;
    private List<Assento> assentos;

    public Voo(String numeroVoo, String origem, String destino, LocalDate data, int quantidadeAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.assentos = new ArrayList<>();

        for (int i = 0; i < quantidadeAssentos; i++) {
            Assento assento = new Assento(i + 1);
            assentos.add(assento);
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Assento> getAssentosDisponiveis() {
        List<Assento> assentosDisponiveis = new ArrayList<>();
        for (Assento assento : assentos) {
            if (!assento.isReservado()) {
                assentosDisponiveis.add(assento);
            }
        }
        return assentosDisponiveis;
    }
}
