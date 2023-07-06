package ExerciciosTreino.JogoRPG;

public class RPGGame {
    public static void main(String[] args) {
        // Criação do mundo do jogo
        Mundo mundo = new Mundo();

        // Criação dos inimigos
        Inimigo inimigo1 = new Inimigo("Goblin", 1, 10, 5);
        Inimigo inimigo2 = new Inimigo("Orc", 2, 20, 10);

        // Adição dos inimigos ao mundo
        mundo.adicionarInimigo(inimigo1);
        mundo.adicionarInimigo(inimigo2);

        // Criação dos itens
        Item item1 = new Item("Espada");
        Item item2 = new Item("Poção de Cura");

        // Adição dos itens ao mundo
        mundo.adicionarItem(item1);
        mundo.adicionarItem(item2);

        // Criação do jogador
        Jogador jogador = new Jogador("Herói", 1, 100);

        // Ação do jogador no mundo
        Inimigo inimigo = mundo.getInimigos().get(0);
        jogador.atacar(inimigo);
        inimigo.receberDano(20);

        Item item = mundo.getItens().get(1);
        jogador.adicionarItem(item);

        System.out.println(jogador.getNome() + " ganhou " + inimigo.getRecompensaExperiencia() + " de experiência.");

        // ...
        // Resto do código do jogo aqui
    }
}
