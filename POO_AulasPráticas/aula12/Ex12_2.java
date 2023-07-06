package aula12;

import java.io.*;
import java.util.*;

public class Ex12_2 {

    public static void main(String[] args) {
        String filePath = "Exercícios Aulas POO/POO/src/aula12/A_cidade_e_as_serras.txt";
        String outputFilePath = "Exercícios Aulas POO/POO/src/aula12/outputFile.txt";
        processFile(filePath, outputFilePath);
    }

    public static void processFile(String filePath, String outputFilePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^\\p{L}]+"); // Use non-letter characters as delimiters

            Map<Character, Map<String, Integer>> wordMap = new TreeMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                if (word.length() >= 3) {
                    char initial = word.charAt(0);
                    Map<String, Integer> initialMap = wordMap.getOrDefault(initial, new TreeMap<>());
                    int count = initialMap.getOrDefault(word, 0);
                    initialMap.put(word, count + 1);
                    wordMap.put(initial, initialMap);
                }
            }

            scanner.close();

            writeOutputFile(outputFilePath, wordMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeOutputFile(String filePath, Map<Character, Map<String, Integer>> wordMap) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<Character, Map<String, Integer>> entry : wordMap.entrySet()) {
                char initial = entry.getKey();
                Map<String, Integer> initialMap = entry.getValue();
                writer.write(initial + ": ");
                for (Map.Entry<String, Integer> wordEntry : initialMap.entrySet()) {
                    String word = wordEntry.getKey();
                    int count = wordEntry.getValue();
                    writer.write(word + ", " + count + "; ");
                }
                writer.newLine();
                writer.newLine();
            }
        }
    }
}

