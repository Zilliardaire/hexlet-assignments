package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String setOfSymbols, String word) {
        ArrayList<Character> setSymbols = new ArrayList<Character>();
        for (char i : setOfSymbols.toLowerCase().toCharArray()) {
            setSymbols.add(i);
        }
        for (char n : word.toLowerCase().toCharArray()) {
            if (!setSymbols.contains(n)) {
                return false;
            }
            setSymbols.remove(Character.valueOf(n));
        }
        return true;
    }
}
//END
