package POO_2021_ExamePrático;

import java.util.*;

public class AgenciaTuristica {
    private String nome, endereco;
    private Set<Atividade> atividades = new HashSet<>();

    public AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void add(Atividade a) {
        this.atividades.add(a);
    }

    public int totalItems() {
        int i = 0;
        for(Atividade a : atividades) {
            i += a.locais().size();
        }
        return i;
    }

    public Set<Atividade> atividades() {
        return atividades;
    }

    public Collection<String> getAllItems() {
        Collection<String> col = new TreeSet<>();
        for(Atividade a : atividades) for(String l : a.locais()) col.add(l);
        return col;
    }

    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}

    public void setNome(String nome) {this.nome = nome;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int n = 1;
        for(Atividade a : atividades) {
            sb.append(a.toString());
            if(n < atividades.size()) sb.append(", ");
            n++;
        }
        String s = sb.toString();
        return "Agencia Turistica " + this.getNome() + "\n" + "\tAtividades: [" + s + "]";
    }
}
