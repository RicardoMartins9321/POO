package ExerciciosTreino;


public class MainContacto {
    public static void main(String[] args) {
       Agenda agenda = new Agenda();
 
       Contato contato1 = new Contato("João", "123456789", "joao@example.com");
       Contato contato2 = new Contato("Maria", "987654321", "maria@example.com");
       Contato contato3 = new Contato("Carlos", "456789123", "carlos@example.com");
 
       agenda.adicionarContato(contato1);
       agenda.adicionarContato(contato2);
       agenda.adicionarContato(contato3);
 
       agenda.listarContatos();
 
       agenda.removerContato(contato2);
 
       agenda.listarContatos();
    }
 }
