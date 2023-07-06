package ExerciciosTreino.GerenciamentoProjetos;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<String> membros;

    public Equipe() {
        membros = new ArrayList<>();
    }

    public void adicionarMembro(String membro) {
        membros.add(membro);
    }

    public void removerMembro(String membro) {
        membros.remove(membro);
    }

    public List<String> getMembros() {
        return membros;
    }
}
