package ExerciciosTreino;


public class MainContaBancária {
    public static void main(String[] args) {
       ContaBancária conta1 = new ContaBancária("123456", "João", 1000.0);
       ContaPoupança conta2 = new ContaPoupança("789012", "Maria", 2000.0, 0.05);
 
       conta1.depositar(500.0);
       conta1.sacar(200.0);
 
       conta2.depositar(1000.0);
       conta2.sacar(300.0);
       conta2.calcularRendimento();
    }
 }
