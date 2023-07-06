package ExerciciosTreino.Produto;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private List<Produto> produtos;
    private double valorTotal;

    public Venda(int id) {
        this.id = id;
        produtos = new ArrayList<>();
        valorTotal = 0.0;
    }

    public int getId() {
        return id;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
