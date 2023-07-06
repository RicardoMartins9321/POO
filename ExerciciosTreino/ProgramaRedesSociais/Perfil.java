package ExerciciosTreino.ProgramaRedesSociais;

import java.util.ArrayList;
import java.util.List;

class Perfil {
    private String nome;
    private List<Amigo> amigos;
    private List<Publicacao> publicacoes;

    public Perfil(String nome) {
        this.nome = nome;
        amigos = new ArrayList<>();
        publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }
}

