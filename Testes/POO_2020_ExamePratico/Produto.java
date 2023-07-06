package POO_2020_ExamePratico;

import java.util.Objects;

public abstract class Produto implements PVP {
    private String codigo;
    private int quantidade;
    private double preco;
    private static int codigo_atual = 1000;

    public Produto(String inicio, double preco) {
        this.codigo = inicio + Integer.toString(codigo_atual);
        codigo_atual += 2;
        this.preco = preco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return this.quantidade;
    }

    public void setStock(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Produto quantidade(int quantidade) {
        setStock(quantidade);
        return this;
    }

    public Produto preco(double preco) {
        setPreco(preco);
        return this;
    }

    public void addStock(int x) {
        quantidade += x;
    }

    public int compare(Produto p) {
        return this.codigo.compareTo(p.codigo);
    }

    public int compareDescs(Produto p) {
        return this.getDescricao().compareTo(p.getDescricao());
    }

    public boolean vender(int x) {
        boolean controlo = true;
        int stock = this.getStock();

        if (stock - x < 0) {
            controlo = false;
        }
        setStock(stock - x);
        return controlo;
    }

    public abstract String getDescricao();

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo) && quantidade == produto.quantidade && preco == produto.preco;
    }
}
