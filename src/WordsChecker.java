import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    public static String text;
    public static Set<String> wordsFromText = new HashSet<>();

    public WordsChecker(String text) {
        WordsChecker.text = text;
        Collections.addAll(wordsFromText, text.split("\\P{IsAlphabetic}+"));
    }

    public static boolean hasWord(String word) {
        return wordsFromText.contains(word);
    }
}
