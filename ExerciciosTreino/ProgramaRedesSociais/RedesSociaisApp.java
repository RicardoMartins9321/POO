package ExerciciosTreino.ProgramaRedesSociais;

import java.util.List;

public class RedesSociaisApp {
    public static void main(String[] args) {
        // Criando perfis
        Perfil perfil1 = new Perfil("Alice");
        Perfil perfil2 = new Perfil("Bob");

        // Adicionando amigos
        Amigo amigo1 = new Amigo("Carol");
        Amigo amigo2 = new Amigo("Dave");

        perfil1.adicionarAmigo(amigo1);
        perfil1.adicionarAmigo(amigo2);

        // Criando publicações
        Publicacao publicacao1 = new Publicacao("Primeira publicação!");
        Publicacao publicacao2 = new Publicacao("Segunda publicação!");

        // Adicionando curtidas e comentários às publicações
        publicacao1.curtir();
        publicacao1.curtir();
        publicacao1.curtir();

        Comentario comentario1 = new Comentario("Ótima publicação!");
        Comentario comentario2 = new Comentario("Parabéns!");

        publicacao1.adicionarComentario(comentario1);
        publicacao1.adicionarComentario(comentario2);

        // Adicionando publicações aos perfis
        perfil1.adicionarPublicacao(publicacao1);
        perfil2.adicionarPublicacao(publicacao2);

        // Obtendo as publicações de um perfil
        List<Publicacao> publicacoesPerfil1 = perfil1.getPublicacoes();
        for (Publicacao publicacao : publicacoesPerfil1) {
            System.out.println("Conteúdo: " + publicacao.getConteudo());
            System.out.println("Curtidas: " + publicacao.getCurtidas());

            List<Comentario> comentarios = publicacao.getComentarios();
            for (Comentario comentario : comentarios) {
                System.out.println("Comentário: " + comentario.getConteudo());
            }

            System.out.println();
        }
    }
}
