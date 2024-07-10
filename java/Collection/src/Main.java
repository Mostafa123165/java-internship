import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Map<Character, TreeSet<String>> words = new HashMap<>();

        TreeSet<String> wordsA = new TreeSet<>();
        wordsA.add("apple");
        wordsA.add("duck");
        wordsA.add("apricot");

        TreeSet<String> wordsB = new TreeSet<>();
        wordsB.add("cherry");
        wordsB.add("blueberry");
        wordsB.add("elephant");

        TreeSet<String> wordsC = new TreeSet<>();
        wordsC.add("cherry");
        wordsC.add("ant");
        wordsC.add("emu");
        wordsC.add("coconut");
        wordsB.add("blackberry");

        // Populate the map with dummy data
        words.put('A', wordsA);
        words.put('B', wordsB);
        words.put('C', wordsC);


        WordDictionary wordDictionary = new WordDictionary(words);

        wordDictionary.printWordsKeysAndValues();

        wordDictionary.printWordsByKey('A');

        wordDictionary.printWordsByKey('C');

    }
}