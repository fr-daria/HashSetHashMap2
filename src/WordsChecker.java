import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String text, String word) {
        String[] wrld = text.split("\\P{IsAlphabetic}+");
        for (String m : wrld) {
            Set<String> set = new HashSet<>();
            for (String st : set) {
                st = m;
                set.add(st);
            }
        }
        return text.contains(word);
    }
}
