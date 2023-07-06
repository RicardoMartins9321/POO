package POO_2021_ExamePrático;

import java.util.*;

public class Gastronomia extends Atividade {
    private List<Restaurante> restaurantes = new ArrayList<>();

    public Gastronomia(int id, String nome) {
        super(id, nome);
    }

    public Gastronomia(int id, String nome, List<Restaurante> restaurantes) {
        super(id, nome);
        this.restaurantes = restaurantes;
    }

    @Override
    public Collection<String> locais() {
        Collection<String> col = new ArrayList<>();
        for(Restaurante r : restaurantes) col.add(r.toString());
        return col;
    }

    public void add(Restaurante r) {
        restaurantes.add(r);
    }
    
    public int totalRestaurantes() {
        return restaurantes.size();
    }

    public List<Restaurante> getLista() {return restaurantes;}
}
