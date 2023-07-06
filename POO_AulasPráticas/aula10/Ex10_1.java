package aula10;


public class Ex10_1 {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarTermo("branco", "Que tem a cor da neve.");
        dicionario.adicionarTermo("preto", "Que tem a cor do carvão.");
        dicionario.adicionarTermo("verde", "Que tem a cor da relva.");
        dicionario.adicionarTermo("amarelo", "Que tem a cor do sol.");
        dicionario.adicionarTermo("azul", "Que tem a cor do céu.");

        System.out.println("Dicionário completo:");
        System.out.println(dicionario);

        System.out.println("Termos:");
        System.out.println(dicionario.toStringTermos());

        System.out.println("Significados:");
        System.out.println(dicionario.toStringSignificados());

        dicionario.alterarTermo("branco", "Que tem a cor da neve ou da cal.");

        System.out.println("Dicionário após alteração:");
        System.out.println(dicionario);

        dicionario.removerTermo("verde");

        System.out.println("Dicionário após remoção:");
        System.out.println(dicionario);
    }

}