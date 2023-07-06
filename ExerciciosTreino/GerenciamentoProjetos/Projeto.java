package ExerciciosTreino.GerenciamentoProjetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Equipe equipe;
    private List<Tarefa> tarefas;

    public Projeto(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.equipe = new Equipe();
        this.tarefas = new ArrayList<>();
    }

    public void adicionarMembroEquipe(String membro) {
        equipe.adicionarMembro(membro);
    }

    public void removerMembroEquipe(String membro) {
        equipe.removerMembro(membro);
    }

    public List<String> getMembrosEquipe() {
        return equipe.getMembros();
    }

    public void adicionarTarefa(String descricao, LocalDate prazo) {
        Tarefa tarefa = new Tarefa(descricao, prazo);
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void marcarTarefaConcluida(int index) {
        if (index >= 0 && index < tarefas.size()) {
            Tarefa tarefa = tarefas.get(index);
            tarefa.marcarConcluida();
        }
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + ", Data de Início: " + dataInicio + ", Data de Fim: " + dataFim;
    }
}
