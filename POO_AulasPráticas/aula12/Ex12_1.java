package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex12_1 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner file = new Scanner(new FileReader("Exercícios Aulas POO/POO/src/aula12/words.txt"));
            file.useDelimiter("[\\p{Punct}\\s]+");
            Set<String> palavras_dif = new HashSet<>();
            int i = 0;

            while (file.hasNext()) {
                String palavra = file.next();
                palavras_dif.add(palavra);
                i++;
            }

            file.close();
            System.out.printf("Número Total de Palavras: %d \n", i);
            System.out.printf("Número de palavras diferentes: %d \n", palavras_dif.size());
            
        } catch (IOException e) {
            System.out.println("Ficheiro não existe!");
        }
    }
}
