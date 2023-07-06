package ExerciciosTreino;

class ContaBancária {
    private String númeroConta;
    private String titular;
    private double saldo;
 
    public ContaBancária(String númeroConta, String titular, double saldo) {
       this.númeroConta = númeroConta;
       this.titular = titular;
       this.saldo = saldo;
    }
 
    public void depositar(double valor) {
       saldo += valor;
       System.out.println("Depósito de " + valor + " realizado na conta " + númeroConta);
    }
 
    public void sacar(double valor) {
       if (valor <= saldo) {
          saldo -= valor;
          System.out.println("Saque de " + valor + " realizado na conta " + númeroConta);
       } else {
          System.out.println("Saldo insuficiente na conta " + númeroConta);
       }
    }
 
    public double getSaldo() {
       return saldo;
    }
 }
 
 class ContaPoupança extends ContaBancária {
    private double taxaJuros;
 
    public ContaPoupança(String númeroConta, String titular, double saldo, double taxaJuros) {
       super(númeroConta, titular, saldo);
       this.taxaJuros = taxaJuros;
    }
 
    public double calcularRendimento() {
       double rendimento = getSaldo() * taxaJuros;
       System.out.println("Rendimento mensal da conta " + getNúmeroConta() + ": " + rendimento);
       return rendimento;
    }
 }
 

 
