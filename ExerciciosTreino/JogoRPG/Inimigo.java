package ExerciciosTreino.JogoRPG;

public class Inimigo extends Personagem{
    private int recompensaExperiencia;

    public Inimigo(String nome, int nivel, int vida, int recompensaExperiencia) {
        super(nome, nivel, vida);
        this.recompensaExperiencia = recompensaExperiencia;
    }

    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }
}
