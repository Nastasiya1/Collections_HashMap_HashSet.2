import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> words;

    public WordsChecker(String text) {
        this.text = text;
        this.words = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}