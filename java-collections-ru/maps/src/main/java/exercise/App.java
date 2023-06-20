package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {

        Map<String, Integer> sentanceMap = new HashMap();
        if (sentence.isEmpty()) {
            return sentanceMap;
        }
        String[] words = sentence.split(" ");
        for (var word : words) {
            if (sentanceMap.containsKey(word)) {
                int count = sentanceMap.get(word);
                sentanceMap.put(word, count + 1);
            } else {
                sentanceMap.put(word, 1);
            }
        }
        return sentanceMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        if (wordsMap.isEmpty()) {
            return "{}";
        }
        StringBuilder dictionary = new StringBuilder("{");
        for (Map.Entry<String, Integer> wordMap : wordsMap.entrySet()) {
            if (!wordMap.getKey().isEmpty()) {
                dictionary.append("\n  ").append(wordMap.getKey()).append(": ").append(wordMap.getValue());
            }
        }
        dictionary.append("\n}");
        return dictionary.toString();
    }
}
//END
