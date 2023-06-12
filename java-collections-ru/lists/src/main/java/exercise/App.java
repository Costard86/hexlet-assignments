package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String anysimbols, String word) {
        anysimbols = anysimbols.toLowerCase();
        word = word.toLowerCase();

        if (anysimbols.length() < word.length()) {
            return false;
        }
        List<Character> letters = new ArrayList<>();
        for (char symbol : anysimbols.toCharArray()) {
            letters.add(symbol);
        }
        for (char wordToChar : word.toCharArray()) {
            if (!letters.contains(wordToChar)) {
                return false;
            } else {
                letters.remove((Character)wordToChar);
            }
        }
        return true;
    }
}
//END
