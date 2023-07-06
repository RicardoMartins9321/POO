package ExerciciosTreino.ProgramaRedesSociais;

import java.util.ArrayList;
import java.util.List;

class Publicacao {
    private String conteudo;
    private int curtidas;
    private List<Comentario> comentarios;

    public Publicacao(String conteudo) {
        this.conteudo = conteudo;
        curtidas = 0;
        comentarios = new ArrayList<>();
    }

    public String getConteudo() {
        return conteudo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        curtidas++;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}
