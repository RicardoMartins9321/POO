package ExerciciosTreino;

import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;
    private String email;
 
    public Contato(String nome, String telefone, String email) {
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
    }
 
    public String getNome() {
       return nome;
    }
 
    public String getTelefone() {
       return telefone;
    }
 
    public String getEmail() {
       return email;
    }
 }
 
 class Agenda {
    private List<Contato> contatos;
 
    public Agenda() {
       contatos = new ArrayList<>();
    }
 
    public void adicionarContato(Contato contato) {
       contatos.add(contato);
       System.out.println("Contato adicionado: " + contato.getNome());
    }
 
    public void removerContato(Contato contato) {
       contatos.remove(contato);
       System.out.println("Contato removido: " + contato.getNome());
    }
 
    public void listarContatos() {
       System.out.println("Lista de contatos:");
       for (Contato contato : contatos) {
          System.out.println("Nome: " + contato.getNome());
          System.out.println("Telefone: " + contato.getTelefone());
          System.out.println("Email: " + contato.getEmail());
          System.out.println();
       }
    }
 }
 
 
