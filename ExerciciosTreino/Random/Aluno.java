package ExerciciosTreino;

class Aluno {
    private String nome;
    private String matricula;
    private double media;
 
    public Aluno(String nome, String matricula, double media) {
       this.nome = nome;
       this.matricula = matricula;
       this.media = media;
    }
 
    public String getNome() {
       return nome;
    }
 
    public String getMatricula() {
       return matricula;
    }
 
    public double getMedia() {
       return media;
    }
 }
 
 class AlunoManager {
    public void verificarAprovacao(Aluno aluno) {
       if (aluno.getMedia() >= 7.0) {
          System.out.println(aluno.getNome() + " está aprovado!");
       } else {
          System.out.println(aluno.getNome() + " está reprovado!");
       }
    }
 }
 
 
 
