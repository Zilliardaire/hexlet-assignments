package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> listOfBooks, Map<String, String> filterObject) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> entry : listOfBooks) {
            Map<String, String> buffer = new HashMap<>();
            buffer.putAll(entry);
            buffer.putAll(filterObject);
            if (buffer.equals(entry)) {
                result.add(entry);
            }
        }
        return result;
    }
}
//END
