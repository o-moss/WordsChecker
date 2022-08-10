import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    public static String text;

    public WordsChecker(String text) {
        WordsChecker.text = text;
    }

    public static boolean hasWord(String word) {
        Set<String> wordsFromText = new HashSet<>();
        Collections.addAll(wordsFromText, text.split("\\P{IsAlphabetic}+"));
        return wordsFromText.contains(word);
    }
}
