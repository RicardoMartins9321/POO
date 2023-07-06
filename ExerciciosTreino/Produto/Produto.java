package ExerciciosTreino.Produto;

class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public boolean realizarVenda(int quantidade) {
        if (quantidadeEstoque >= quantidade) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }
}



