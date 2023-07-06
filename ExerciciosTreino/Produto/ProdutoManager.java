package ExerciciosTreino.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoManager {
    private List<Produto> estoque;
    private Relatorio relatorio;
    private int proximoIdVenda;

    public ProdutoManager() {
        estoque = new ArrayList<>();
        relatorio = new Relatorio();
        proximoIdVenda = 1;
    }

    public void cadastrarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void realizarVenda(List<Produto> produtos) {
        Venda venda = new Venda(proximoIdVenda);
        proximoIdVenda++;

        for (Produto produto : produtos) {
            if (produto.realizarVenda(1)) {
                venda.adicionarProduto(produto);
            }
        }

        relatorio.adicionarVenda(venda);
    }

    public void atualizarEstoque(int id, int quantidade) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                produto.atualizarEstoque(quantidade);
                break;
            }
        }
    }

    public void gerarRelatorio() {
        relatorio.exibirRelatorio();
    }
}
