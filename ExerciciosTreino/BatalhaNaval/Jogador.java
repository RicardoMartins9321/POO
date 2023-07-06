package ExerciciosTreino.BatalhaNaval;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;

    public Jogador(String nome, int tamanhoTabuleiro) {
        this.nome = nome;
        tabuleiro = new Tabuleiro(tamanhoTabuleiro);
    }

    public String getNome() {
        return nome;
    }

    public boolean posicionarNavio(int linha, int coluna) {
        return tabuleiro.posicionarNavio(linha, coluna);
    }

    public boolean realizarAtaque(int linha, int coluna) {
        return tabuleiro.realizarAtaque(linha, coluna);
    }

    public boolean verificarVitoria() {
        return tabuleiro.verificarVitoria();
    }

    public void exibirTabuleiro() {
        System.out.println("Tabuleiro de " + nome + ":");
        tabuleiro.exibirTabuleiro();
    }
}
