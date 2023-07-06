package aula08;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Alimento> composicao = new ArrayList<Alimento>();
    private DiaSemana dia;

    public Prato(String nm) {
        nome = nm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Alimento> getComposicao() {
        return composicao;
    }

    public void setComposicao(ArrayList<Alimento> composicao) {
        this.composicao = composicao;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        if (dia != null) {
            return String.format("Prato %s, composto por %d Ingredientes, dia %s", nome, composicao.size(), dia);
        } else {
            return String.format("Prato %s, composto por %d Ingredientes", nome, composicao.size());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((composicao == null) ? 0 : composicao.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (composicao == null) {
            if (other.composicao != null)
                return false;
        } else if (!composicao.equals(other.composicao))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public boolean addIngrediente(Alimento c) {
        composicao.add(c);
        return true;
    }

}
