package ExerciciosTreino.Produto;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private List<Venda> vendas;

    public Relatorio() {
        vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Vendas:");
        for (Venda venda : vendas) {
            System.out.println("ID da Venda: " + venda.getId());
            System.out.println("Produtos Vendidos:");
            for (Produto produto : venda.getProdutos()) {
                System.out.println("  - " + produto.getNome());
            }
            System.out.println("Valor Total: R$" + venda.getValorTotal());
            System.out.println("-----------------------");
        }
    }
}
