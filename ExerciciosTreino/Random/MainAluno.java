package ExerciciosTreino;

public class MainAluno {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno("João", "2021001", 8.5);
       Aluno aluno2 = new Aluno("Maria", "2021002", 6.0);
 
       AlunoManager manager = new AlunoManager();
       manager.verificarAprovacao(aluno1);
       manager.verificarAprovacao(aluno2);
    }
 }
