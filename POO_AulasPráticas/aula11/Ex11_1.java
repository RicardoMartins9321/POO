package aula11;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Ex11_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String Punct = "\\t\\n.,:'‘’;?!-*{}=+&/()[]”“\\\"\\'";
        Map<String, TreeMap<String, Integer>> col = new TreeMap<String, TreeMap<String, Integer>>();
        Scanner sc = null;
        String line, text = "";
        String[] words, filtWords;

        // Iniciar o Scanner
        try {
            sc = new Scanner(new File("Exercícios Aulas POO/POO/src/aula11/major.txt"), "UTF-8");
        } catch (IOException e) {
            err.println("Erro, o ficheiro ");
            exit(0);
        }

        // Guardar todas as palavras numa String
        while (sc.hasNextLine()) {
            line = sc.nextLine().replaceAll("\\p{Punct}", "");
            text += line + " ";
        }

        sc.close();

        words = text.toLowerCase().split(" ");
        filtWords = new String[words.length];

        int n = words3(words, filtWords);

        String prev = filtWords[0];

        for (int i = 1; i < n; i++) {
            String next = filtWords[i];
            TreeMap<String, Integer> tmp;

            if (!col.containsKey(prev)) {
                tmp = new TreeMap<String, Integer>();
                tmp.put(next, 1);
            } else {
                tmp = col.get(prev);
                if (!tmp.containsKey(next)) {
                    tmp.put(next, 1);
                } else {
                    tmp.put(next, tmp.get(next) + 1);
                }
            }
            col.put(prev, tmp);
            prev = next;
        }

        Set<String> keys = col.keySet();
        for (String s : keys) {
            out.println(s + "=" + col.get(s));
        }

    }

    public static int words3(String[] words, String[] filtWords) {
        int i = 0;
        for (String s : words) {
            if (s.length() >= 3) {
                filtWords[i] = s;
                i = i + 1;
            }
        }
        return i;
    }

}