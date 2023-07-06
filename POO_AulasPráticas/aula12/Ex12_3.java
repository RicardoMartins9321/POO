package aula12;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Ex12_3 {
    public static void main(String[] args) throws IOException {
        try {
            ArrayList<Movie> lista_filmes = new ArrayList<>();
            List<String> linha = Files.readAllLines(Paths.get("Exercícios Aulas POO/POO/src/aula12/movies.txt"));
            HashSet<String> genero = new HashSet<>();

            // a)
            for (int i = 1; i < linha.size(); i++) {
                String[] palavras = linha.get(i).split("[\t]");
                lista_filmes.add(
                        new Movie(palavras[0], Double.parseDouble(palavras[1]), palavras[2], palavras[3],
                                Integer.parseInt(palavras[4])));
                genero.add(palavras[3]);
            }
            // b)
            Collections.sort(lista_filmes, Comparator.comparing(Movie::getName));

            System.out.println("Movies sorted by name:");
            for (Movie movie : lista_filmes) {
                System.out.println(movie);
            }

            lista_filmes.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
            System.out.println("\n");
            System.out.println("Ordered by score descending");
            printLista(lista_filmes);

            lista_filmes.sort((a, b) -> Integer.compare(a.getTime(), b.getTime()));
            System.out.println("\n");
            System.out.println("Ordered by time ascending");
            printLista(lista_filmes);

            // c)
            System.out.println("\n");
            System.out.println("Genres");
            for (String g : genero){
                int i = 0;
                for (Movie m : lista_filmes) {
                    if (m.getGenre().equals(g)) {
                        i++;
                    }
                }
                System.out.println(g + " : " + i);
            }


            // d)
            try {
                PrintWriter writer = new PrintWriter("Exercícios Aulas POO/POO/src/aula12/myselection.txt");
                for (Movie m : lista_filmes) {
                    if (m.getScore() > 60.0 && m.getGenre().equals("comedy")) {
                        writer.println(m);
                    }
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Não foi possível escrever o ficheiro");
            }

        } catch (IOException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }

    public static void printLista(ArrayList<Movie> lista) {
        for (Movie x : lista) {
            System.out.println(x);
        }
    }
}
