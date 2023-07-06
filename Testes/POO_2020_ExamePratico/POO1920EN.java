package POO_2020_ExamePratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

// Notas:
// N�o altere o c�digo apresentado
// Deve completar o c�digo da alinea 2
// Comentar c�digo para garantir que vai executando parcialmente

public class POO1920EN {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("Testes/POO_2012_ExamePrático/POO_1920ENPS.txt"));
		test(System.out); // executa e escreve na consola
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);

	}

	private static void alinea1(PrintStream out) {
		out.println("\nAl�nea 1) ----------------------------------\n");

		Loja loja = new Loja("ePOO -  Loja Online", "epoo@ecommerce.pt");

		Livro livro1 = new Livro("Livro 1", 15.0);
		livro1.add(new Autor("Autor 1", 2000));
		livro1.add(new Autor("Autor 2", 2000));
		livro1.add(new Autor("Autor 3", 2010));
		livro1.add(new Autor("Autor 4", 2018));
		livro1.setStock(100);
		out.println(livro1.getTitulo() + " tem " + livro1.getLista().size() + " autores");

		List<Autor> lista = Arrays.asList(new Autor("Autor X", 1945),
				new Autor("Autor Y", 1966),
				new Autor("Autor Z", 1978));

		Livro livro2 = new Livro("Livro 2", 23.0, lista);
		livro2.addStock(450);
		out.println(livro2.getTitulo() + " tem " + livro2.numeroAutores() + " autores");

		out.println("TOTAL DE PRODUTOS DO MERCADO: " + loja.totalItems());

		// tipo, marca, modelo, pot�ncia, pre�o
		Electrodomestico electr1 = new Electrodomestico("Frigor�fico", "Bosch", "XPTO", 1000, 780);
		Electrodomestico electr2 = new Electrodomestico("Fog�o", "AEG", "XYZ", 423); // tipo, marca, modelo, pre�o
		electr1.setClasse(ClasseEnergetica.A);

		//
		Telemovel tlm1 = new Telemovel("Motorola", "XWZ Model A", 560.0);
		tlm1.addNota("Melhor Compra 2019");
		tlm1.addNota("Em promo��o");

		//
		Electrodomestico tv1 = new Electrodomestico("Televisor", "LG", "MODEL X", 450);
		tv1.setClasse(ClasseEnergetica.A);
		tv1.addStock(5);

		// descri��o de um produto
		out.println("Descri��o de electr1 :" + electr1.getDescricao());
		// adicionar � Loja
		loja.add(livro1);
		loja.add(livro2);
		loja.add(electr1);
		loja.add(electr2);
		loja.add(tlm1);
		loja.add(tv1);

		//
		tlm1.addStock(2);

		out.println("AUTORES DE " + livro1.getTitulo() + ": " + livro1.autores());

		out.println("TOTAL DE PRODUTOS DO MERCADO: " + loja.totalItems());

		// vender alguns produtos
		if (!tlm1.vender(4))
			out.printf("Unidades insuficientes! S� tem %d em stock.\n", tlm1.getStock());

		if (livro2.vender(100))
			out.printf("Vendidos %d unidades de \"%s\". Passou a ter %d\n", 100, livro2.getTitulo(), livro2.getStock());

		out.println("TOTAL DE PRODUTOS DO MERCADO: " + loja.totalItems());
		out.println();

		// lista todos os produtos, com pre�os, numa tabela
		out.println(loja);

		// informa��o sobre alguns produtos
		out.println("Informa��o sobre Frigor�fico:");
		// acesso directo a um Produto dada uma string contendo tipo, nome e marca
		out.println(loja.getProdutoPelaDescricao("Frigor�fico:Bosch/XPTO"));
		out.println("Informa��o sobre Telem�vel:");
		// no caso de Telem�veis acesso apenas por marca(uppercase)/modelo
		out.println(loja.getProdutoPelaDescricao("MOTOROLA/XWZ Model A"));

	}

	private static void alinea2(PrintStream out) {
		out.println("\nAl�nea 2) ----------------------------------\n");

		Loja loja = null;
		Telemovel movel = null;
		Electrodomestico eletro = null;
		Livro livro = null;

		try {
			List<String> file = Files.readAllLines(Paths.get("epoo20.txt"));

			for (int i = 0; i < file.size(); i++) {
				String[] palavras = file.get(i).split(";");
				if (i == 0) {
					loja = new Loja(palavras[0], palavras[1]);
				} else {
					if (palavras[0].equals("TELEM")) {
						movel = new Telemovel(palavras[1], palavras[2], Double.parseDouble(palavras[3]));
						movel.setStock(Integer.parseInt(palavras[4]));
						loja.add(movel);
					}
					if (palavras[0].equals("ELECT")) {
						eletro = new Electrodomestico(palavras[1], palavras[2], palavras[3],
								Double.parseDouble(palavras[4]));
						eletro.setStock(Integer.parseInt(palavras[4]));
						eletro.setClasse(ClasseEnergetica.valueOf(palavras[5]));
						loja.add(eletro);
					}
					if (palavras[0].equals("LIVRO")) {
						livro = new Livro(palavras[1], Double.parseDouble(palavras[2]));
						for (int x = 4; i < palavras.length; x++) {
							livro.add(new Autor(palavras[x]));
						}
						loja.add(livro);
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Ficheiro nao encontrado");
		}

		out.println(loja);
	 }
	 

}
