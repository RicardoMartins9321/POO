package POO_2020_ExamePratico;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Livro extends Produto {
    private String titulo;
    private Set<Autor> autores;
    private static final double IVA = 0.06;

    public Livro(String titulo, double preco) {
        super("L", preco);
        this.titulo = titulo;
        this.autores = new TreeSet<Autor>();

    }

    public Livro(String titulo, double preco, List<Autor> lista) {
        super("L", preco);
        this.titulo = titulo;
        this.autores = new TreeSet<>(Autor::compare);

        for (Autor x : lista) {
            this.autores.add(x);
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getAutores() {
        return this.autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public Livro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Livro autores(Set<Autor> autores) {
        setAutores(autores);
        return this;
    }

    public void add(Autor x) {
        autores.add(x);
    }

    public Set<Autor> getLista() {
        return autores;
    }

    public int numeroAutores() {
        return autores.size();
    }

    public Set<Autor> autores() {
        return autores;
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPreco() + this.getPreco() * IVA;
    }

    @Override
    public String getDescricao() {
        return this.titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autores, livro.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autores);
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", autores='" + getAutores() + "'" +
                "}";
    }

}
