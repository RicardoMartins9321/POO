package POO_2020_ExamePratico;

import java.util.Objects;

public class Documentario extends Produto {
    private String titulo;
    private int ano;
    private int duracao;
    private static final double IVA = 0.23;

    public Documentario(String titulo, int ano, int duracao, double preco) {
        super("D", preco);
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Documentario titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Documentario ano(int ano) {
        setAno(ano);
        return this;
    }

    public Documentario duracao(int duracao) {
        setDuracao(duracao);
        return this;
    }

    @Override
    public String getDescricao() {
        return this.titulo;
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPreco() + this.getPreco() * IVA;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Documentario)) {
            return false;
        }
        Documentario documentario = (Documentario) o;
        return Objects.equals(titulo, documentario.titulo) && ano == documentario.ano
                && duracao == documentario.duracao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, ano, duracao);
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", ano='" + getAno() + "'" +
                ", duracao='" + getDuracao() + "'" +
                "}";
    }

}
