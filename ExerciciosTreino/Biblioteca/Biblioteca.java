package ExerciciosTreino.Biblioteca;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(int id, String titulo, String autor) {
        Livro livro = new Livro(id, titulo, autor);
        livros.add(livro);
    }

    public void cadastrarUsuario(int id, String nome) {
        Usuario usuario = new Usuario(id, nome);
        usuarios.add(usuario);
    }

    public void emprestarLivro(int livroId, int usuarioId) {
        Livro livro = buscarLivro(livroId);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro != null && usuario != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(emprestimo);
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não encontrado ou não disponível para empréstimo.");
        }
    }

    public void devolverLivro(int livroId, int usuarioId) {
        Livro livro = buscarLivro(livroId);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro != null && usuario != null) {
            Emprestimo emprestimo = buscarEmprestimo(livro, usuario);
            if (emprestimo != null) {
                livro.setDisponivel(true);
                emprestimos.remove(emprestimo);
                System.out.println("Livro devolvido com sucesso.");
            } else {
                System.out.println("Livro não encontrado ou não emprestado para este usuário.");
            }
        } else {
            System.out.println("Livro não encontrado ou usuário não encontrado.");
        }
    }

    public void consultarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("ID: " + livro.getId());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println();
            }
        }
    }

    private Livro buscarLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private Emprestimo buscarEmprestimo(Livro livro, Usuario usuario) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro() == livro && emprestimo.getUsuario() == usuario) {
                return emprestimo;
            }
        }
        return null;
    }
}
