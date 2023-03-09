package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        if (sentence.length() == 0) {
            return result;
        }
        for (String word : words) {
            var value = (result.get(word) != null) ? result.get(word) : 0;
            result.put(word, value + 1);
        }
        return result;
    }
    public static String toString(Map<String, Integer> dictionary) {
        String result = "{\n";
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            result = result + "  " + entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return (dictionary.size() != 0) ? result + "}" : "{}";
    }
}
//END
