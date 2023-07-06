package aula08;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras implements Purchase {
    private List<Produto> Produtos;
    private List<Integer> quantities;

    public CarrinhoDeCompras() {
        Produtos = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto Produto, int quantity) {
        int index = Produtos.indexOf(Produto);
        if (index == -1) {
            Produtos.add(Produto);
            quantities.add(quantity);
        } else {
            quantities.set(index, quantities.get(index) + quantity);
        }
    }

    @Override
    public void listarProdutos() {
        for (int i = 0; i < Produtos.size(); i++) {
            System.out.printf("%s (%d): %.2f\n", Produtos.get(i).getName(), quantities.get(i), Produtos.get(i).getPrice());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < Produtos.size(); i++) {
            total += Produtos.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }
}
