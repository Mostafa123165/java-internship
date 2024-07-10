import java.util.*;

public class WordDictionary {
    private Map<Character, TreeSet<String>> words;

    public WordDictionary(Map<Character, TreeSet<String>> words) {
        this.words = words;
    }

    public void printWordsKeysAndValues() {
        for (Map.Entry<Character,TreeSet<String>> word : words.entrySet()) {
            System.out.println("The Character is: " + word.getKey() + " And corresponding words: ");
            word.getValue().forEach(System.out::println);
        }
    }
    public void printWordsByKey(Character key) {
        System.out.println("The Character is: " + key + " And corresponding words: ");
        words.get(key).forEach(System.out::println);
    }

    public Map<Character, TreeSet<String>> getWords() {
        return words;
    }

    public void setWords(Map<Character, TreeSet<String>> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "WordDictionary{" +
                "words=" + words +
                '}';
    }
}
