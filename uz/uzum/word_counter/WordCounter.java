package uz.uzum.word_counter;

import java.util.*;

public class WordCounter {
    private final String input;

    public WordCounter(String input) {
        this.input = input;
    }

    public Map<String, Integer> countWords(String str) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = str.toLowerCase().split("[\\s.,;!?]+");

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        return frequency;
    }

    public void print() {
        Map<String, Integer> frequency = countWords(input);

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.printf("%s совпадений, слово: %s.\n", entry.getValue(), entry.getKey());
                break;
            }
        }
    }
}
