package ExerciciosTreino;

class Funcionário {
    private String nome;
    private String cargo;
    private double salário;
 
    public Funcionário(String nome, String cargo, double salário) {
       this.nome = nome;
       this.cargo = cargo;
       this.salário = salário;
    }
 
    public String getNome() {
       return nome;
    }
 
    public String getCargo() {
       return cargo;
    }
 
    public double getSalário() {
       return salário;
    }
 
    public void setSalário(double salário) {
       this.salário = salário;
    }
 }
 
 class FuncionárioManager {
    public void aumentarSalário(Funcionário funcionário, double aumento) {
       double novoSalário = funcionário.getSalário() + aumento;
       funcionário.setSalário(novoSalário);
       System.out.println("O salário de " + funcionário.getNome() + " foi aumentado para " + novoSalário);
    }
 }
 