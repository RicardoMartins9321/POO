package aula08;

public interface Purchase {
    void adicionarProduto(Produto Produto, int quantity);
    void listarProdutos();
    double calcularTotal();
}
