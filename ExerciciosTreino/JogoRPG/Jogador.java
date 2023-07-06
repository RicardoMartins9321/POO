package ExerciciosTreino.JogoRPG;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem{
    private int experiencia;
    private List<Item> inventario;

    public Jogador(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.experiencia = 0;
        this.inventario = new ArrayList<>();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void ganharExperiencia(int quantidade) {
        experiencia += quantidade;
        // Lógica de evolução de nível aqui
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    public void usarItem(Item item) {
        // Lógica de uso de item aqui
    }

    public void atacar(Inimigo inimigo) {
        System.out.println("inimigo atacado");
    }
}
