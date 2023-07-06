import java.io.*;
import java.util.*;

public class Merger {
    public static void main(String[] args) {
        try {
            File directory = new File("a1");
            File[] files = directory.listFiles();
            PrintWriter merge = new PrintWriter(new File("merge.txt"));
            for (File file : files) {
                if (file.isDirectory()) {
                    Scanner input = new Scanner(file);
                    while (input.hasNextLine()) {
                        merge.println(input.nextLine());
                    }
                    input.close();
                }
            }
            merge.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some error has occurred while operating the merger.");
        }
    }
}
