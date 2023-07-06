package ExerciciosTreino.BatalhaNaval;

public class MainNavioBattleShip {
    public static void main(String[] args) {
        int tamanhoTabuleiro = 5;
        Jogador jogador1 = new Jogador("Jogador 1", tamanhoTabuleiro);
        Jogador jogador2 = new Jogador("Jogador 2", tamanhoTabuleiro);

        // Posicionar navios dos jogadores
        jogador1.posicionarNavio(0, 0);
        jogador1.posicionarNavio(1, 1);
        jogador1.posicionarNavio(2, 2);

        jogador2.posicionarNavio(3, 3);
        jogador2.posicionarNavio(4, 4);

        // Iniciar o jogo
        boolean jogoEmAndamento = true;
        Jogador jogadorAtual = jogador1;

        while (jogoEmAndamento) {
            System.out.println("Turno de " + jogadorAtual.getNome());
            jogadorAtual.exibirTabuleiro();

            // Simulação de entrada do jogador para atacar
            int linhaAtaque = 0;
            int colunaAtaque = 0;

            boolean ataqueValido = jogadorAtual.realizarAtaque(linhaAtaque, colunaAtaque);

            if (ataqueValido) {
                System.out.println("Ataque bem-sucedido!");
                jogadorAtual.exibirTabuleiro();

                if (jogadorAtual.verificarVitoria()) {
                    System.out.println(jogadorAtual.getNome() + " venceu o jogo!");
                    jogoEmAndamento = false;
                }
            } else {
                System.out.println("Ataque inválido. Tente novamente.");
            }

            // Alternar para o próximo jogador
            jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
        }
    }
}
