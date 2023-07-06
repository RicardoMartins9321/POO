package aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex10_3 {
    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, List<Integer>> occurrences = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            List<Integer> indexes = occurrences.getOrDefault(c, new ArrayList<>());
            indexes.add(i);
            occurrences.put(c, indexes);
        }

        System.out.println(occurrences);
    }

}
