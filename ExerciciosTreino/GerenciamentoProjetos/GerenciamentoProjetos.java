package ExerciciosTreino.GerenciamentoProjetos;

import java.time.LocalDate;

public class GerenciamentoProjetos {
    public static void main(String[] args) {
        // Criação de um projeto
        Projeto projeto = new Projeto("Projeto A", LocalDate.now(), LocalDate.now().plusMonths(6));

        // Adição de membros na equipe
        projeto.adicionarMembroEquipe("Membro 1");
        projeto.adicionarMembroEquipe("Membro 2");
        projeto.adicionarMembroEquipe("Membro 3");

        // Adição de tarefas
        projeto.adicionarTarefa("Tarefa 1", LocalDate.now().plusWeeks(1));
        projeto.adicionarTarefa("Tarefa 2", LocalDate.now().plusWeeks(2));
        projeto.adicionarTarefa("Tarefa 3", LocalDate.now().plusWeeks(3));

        // Marcar uma tarefa como concluída
        projeto.marcarTarefaConcluida(1);

        // Geração do relatório de status
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(projeto);
    }
}
