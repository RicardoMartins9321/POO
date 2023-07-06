package ExerciciosTreino.JogoRPG;

public class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void atacar(Personagem alvo) {
        System.out.println(nome + " atacou " + alvo.getNome());
        // Lógica de combate aqui
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            System.out.println(nome + " foi derrotado!");
        }
    }
}
