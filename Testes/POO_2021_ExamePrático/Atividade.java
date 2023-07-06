package POO_2021_ExamePrático;

public abstract class Atividade implements PontosdeInteresse {
    private int id;
    private String nome;

    public Atividade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {return id;}
    public String getNome() {return nome;}
    
    public void setId(int id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}

    @Override
    public String toString() {
        return "Atividade [num=" + this.getId() + ", nome=" + this.getNome() + "]";
    }
}
