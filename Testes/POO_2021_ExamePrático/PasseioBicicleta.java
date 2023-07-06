package POO_2021_ExamePrático;

import java.util.*;

public class PasseioBicicleta extends Atividade {
    Set<String> locais = new HashSet<>();

    public PasseioBicicleta(int id, String nome) {
        super(id, nome);
    }

    public PasseioBicicleta(int id, String nome, String[] locais) {
        super(id, nome);
        for(String s : locais) this.locais.add(s);
    }

    public Collection<String> locais() {
        Collection<String> col = new ArrayList<>();
        for(String l : locais) col.add(l);
        return col;
    }

    public void addLocal(String l) {
        this.locais.add(l);
    }

    public Set<String> getLista() {return locais;}
}
