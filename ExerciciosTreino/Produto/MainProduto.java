package ExerciciosTreino.Produto;

import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        ProdutoManager estoqueManager = new ProdutoManager();

        // Cadastrando produtos
        Produto p1 = new Produto(1, "Camiseta", 29.90, 10);
        Produto p2 = new Produto(2, "Calça", 79.90, 5);
        Produto p3 = new Produto(3, "Tênis", 149.90, 8);

        estoqueManager.cadastrarProduto(p1);
        estoqueManager.cadastrarProduto(p2);
        estoqueManager.cadastrarProduto(p3);

        // Realizando vendas
        List<Produto> venda1 = new ArrayList<>();
        venda1.add(p1);
        venda1.add(p3);

        List<Produto> venda2 = new ArrayList<>();
        venda2.add(p2);

        estoqueManager.realizarVenda(venda1);
        estoqueManager.realizarVenda(venda2);

        // Atualizando estoque
        estoqueManager.atualizarEstoque(1, -2);
        estoqueManager.atualizarEstoque(2, -1);

        // Gerando relatório
        estoqueManager.gerarRelatorio();
    }
 }
