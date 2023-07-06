package ExerciciosTreino.GerenciamentoProjetos;

import java.util.List;

public class Relatorio {
    public void gerarRelatorio(Projeto projeto) {
        System.out.println("Relatório de Status do Projeto:");
        System.out.println(projeto);

        System.out.println("Membros da Equipe:");
        List<String> membrosEquipe = projeto.getMembrosEquipe();
        for (String membro : membrosEquipe) {
            System.out.println(membro);
        }

        System.out.println("Tarefas:");
        List<Tarefa> tarefas = projeto.getTarefas();
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println("Tarefa #" + (i + 1) + ":");
            System.out.println(tarefa);
        }
    }
}
