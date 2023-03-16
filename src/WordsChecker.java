import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected Set<String> worlds;

    public WordsChecker(String text) {
        this.worlds = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String text, String word) {
       return text.contains(word);
    }
}
