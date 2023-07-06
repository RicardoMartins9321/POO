package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ex10_2 {

    public static void main(String[] args) {
        SortedMap<String, List<String>> termosSignificados = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar termo e significado");
            System.out.println("2 - Alterar significado de um termo");
            System.out.println("3 - Remover termo e significados");
            System.out.println("4 - Listar termos e significados");
            System.out.println("5 - Listar termos");
            System.out.println("6 - Listar significados");
            System.out.println("7 - Selecionar aleatoriamente um significado");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o termo:");
                    String termo = sc.nextLine();
                    System.out.println("Insira o significado:");
                    String significado = sc.nextLine();

                    if (!termosSignificados.containsKey(termo)) {
                        termosSignificados.put(termo, new ArrayList<>());
                    }
                    termosSignificados.get(termo).add(significado);
                    System.out.println("Termo e significado adicionados com sucesso!");
                    break;
                case 2:
                    System.out.println("Insira o termo cujo significado deseja alterar:");
                    termo = sc.nextLine();
                    if (termosSignificados.containsKey(termo)) {
                        List<String> significados = termosSignificados.get(termo);
                        System.out.println("Selecione o índice do significado que deseja alterar:");
                        for (int i = 0; i < significados.size(); i++) {
                            System.out.println(i + " - " + significados.get(i));
                        }
                        int indice = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Insira o novo significado:");
                        significado = sc.nextLine();
                        significados.set(indice, significado);
                        System.out.println("Significado alterado com sucesso!");
                    } else {
                        System.out.println("Termo não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Insira o termo que deseja remover:");
                    termo = sc.nextLine();
                    if (termosSignificados.containsKey(termo)) {
                        termosSignificados.remove(termo);
                        System.out.println("Termo removido com sucesso!");
                    } else {
                        System.out.println("Termo não encontrado!");
                    }
                    break;
                case 4:
                    for (String t : termosSignificados.keySet()) {
                        List<String> s = termosSignificados.get(t);
                        System.out.println(t + ": " + s);
                    }
                    break;
                case 5:
                    for (String t : termosSignificados.keySet()) {
                        System.out.println(t);
                    }
                    break;
                case 6:
                    for (List<String> s : termosSignificados.values()) {
                        for (String s2 : s) {
                            System.out.println(s2);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Insira o termo para selecionar aleatoriamente um significado:");
                    termo = sc.nextLine();
                    if (termosSignificados.containsKey(termo)) {
                        List<String> significados = termosSignificados.get(termo);
                        int randomIndex = (int) (Math.random() * significados.size());
                        String significadoSelecionado = significados.get(randomIndex);
                        System.out.println("Significado aleatório do termo " + termo + ": " + significadoSelecionado);
                    } else {
                        System.out.println("Termo não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                }
            }
        sc.close();
    }
}
                    
