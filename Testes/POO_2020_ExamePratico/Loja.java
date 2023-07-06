package POO_2020_ExamePratico;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Loja {
    private String nome;
    private String mail;
    private TreeSet<Produto> produtos;

    public Loja(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
        this.produtos = new TreeSet<Produto>(Produto::compare);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Set<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(TreeSet<Produto> produtos) {
        this.produtos = produtos;
    }

    public Loja nome(String nome) {
        setNome(nome);
        return this;
    }

    public Loja mail(String mail) {
        setMail(mail);
        return this;
    }

    public Loja produtos(TreeSet<Produto> produtos) {
        setProdutos(produtos);
        return this;
    }

    public void add(Produto x) {
        produtos.add(x);
    }

    public int totalItems() {
        int x = 0;
        for (Produto y : produtos) {
            x += y.getStock();
        }
        return x;
    }

    public Produto getProdutoPelaDescricao(String string) {
        for(Produto p : this.produtos){
            if(p.getDescricao().equals(string)){
                return p;                
            }  
        }
        return null ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Loja)) {
            return false;
        }
        Loja loja = (Loja) o;
        return Objects.equals(nome, loja.nome) && Objects.equals(mail, loja.mail)
                && Objects.equals(produtos, loja.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mail, produtos);
    }

    @Override
    public String toString() {
        String desc = nome + "\n";
        desc += String.format("%10s %-30s %10s %10s\n", "C�digo", "Produto", "Em Stock", "PVP");

        for (Produto p : produtos)
            desc += String.format("%10s %-30s %10d %10.2f\n", p.getCodigo(), p.getDescricao(), p.getStock(),
                    p.getPreco());

        return desc;
    }

}
