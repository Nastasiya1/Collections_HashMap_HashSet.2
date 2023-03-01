import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> words = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        return words.contains(word);
    }
}