package ExerciciosTreino.SistemaReservasEventos;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String local;
    private int capacidade;
    private List<Participante> participantes;

    public Evento(String nome, String local, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public boolean adicionarParticipante(Participante participante) {
        if (participantes.size() < capacidade) {
            participantes.add(participante);
            return true;
        }
        return false;
    }

    public boolean removerParticipante(Participante participante) {
        return participantes.remove(participante);
    }
}
