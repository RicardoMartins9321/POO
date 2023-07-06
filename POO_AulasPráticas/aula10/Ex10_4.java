package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("Exercícios Aulas POO/POO/src/aula10/words.txt"));
        ArrayList<String> words = new ArrayList<>();
        
        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2 && word.matches("[a-zA-Z]+")) {
                words.add(word);
            }
        }
        input.close();
    
        System.out.println("Palavras com mais de 2 caracteres e compostas apenas por letras:");
        System.out.println(words);

        System.out.println("Palavras terminadas em 's':");
        for (String word : words) {
            if (word.charAt(word.length() - 1) == 's') {
                System.out.println(word);
            }
        }
    }
}
