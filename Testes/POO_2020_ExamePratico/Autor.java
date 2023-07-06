package POO_2020_ExamePratico;

public class Autor implements Comparable<Autor> {
    private String nome;
    private int anoNascimento;

    public Autor(String nome, int anoNascimento) {

        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public int compare(Autor a) {
        return this.nome.compareTo(a.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + anoNascimento + "-)";
    }

    @Override
    public int compareTo(Autor o) {
        return this.anoNascimento;
    }
}
