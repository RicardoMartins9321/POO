package ExerciciosTreino;

public class MainFuncionário {
    public static void main(String[] args) {
       Funcionário funcionário1 = new Funcionário("João", "Analista", 5000.0);
       Funcionário funcionário2 = new Funcionário("Maria", "Gerente", 8000.0);
 
       FuncionárioManager manager = new FuncionárioManager();
       manager.aumentarSalário(funcionário1, 1000.0);
       manager.aumentarSalário(funcionário2, 1500.0);
 
       System.out.println("Novo salário de " + funcionário1.getNome() + ": " + funcionário1.getSalário());
       System.out.println("Novo salário de " + funcionário2.getNome() + ": " + funcionário2.getSalário());
    }
 }
