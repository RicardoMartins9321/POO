package aula08;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private String local;
    ArrayList<Prato> lista = new ArrayList<Prato>();

    // Construtor
    public Ementa(String nome, String local) {
        super();
        this.nome = nome;
        this.local = local;
    }

    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Prato> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prato> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");

        for (Prato p : lista) {
            sb.append(p.toString() + "\n");
        }

        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lista == null) ? 0 : lista.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
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
        Ementa other = (Ementa) obj;
        if (lista == null) {
            if (other.lista != null)
                return false;
        } else if (!lista.equals(other.lista))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public void addPrato(Prato p, DiaSemana d) {
        lista.add(p);
        p.setDia(d);
    }
}
