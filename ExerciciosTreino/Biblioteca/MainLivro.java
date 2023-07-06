package ExerciciosTreino.Biblioteca;


public class MainLivro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro(1, "Livro 1", "Autor 1");
        biblioteca.cadastrarLivro(2, "Livro 2", "Autor 2");
        biblioteca.cadastrarLivro(3, "Livro 3", "Autor 3");

        biblioteca.cadastrarUsuario(1, "Usuário 1");
        biblioteca.cadastrarUsuario(2, "Usuário 2");

        biblioteca.consultarLivrosDisponiveis();

        biblioteca.emprestarLivro(1, 1);
        biblioteca.emprestarLivro(2, 1);

        biblioteca.consultarLivrosDisponiveis();

        biblioteca.devolverLivro(1, 1);

        biblioteca.consultarLivrosDisponiveis();
    }
}
