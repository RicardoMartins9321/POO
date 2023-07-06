package ExerciciosTreino.JogoRPG;

import java.util.ArrayList;
import java.util.List;

public class Mundo {
    private List<Inimigo> inimigos;
    private List<Item> itens;

    public Mundo() {
        this.inimigos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public List<Item> getItens() {
        return itens;
    }
}
