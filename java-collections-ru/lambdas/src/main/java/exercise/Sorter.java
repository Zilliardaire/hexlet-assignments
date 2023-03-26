package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> men) {
        List<String> result = men.stream()
                .filter(x -> x.get("gender") == "male")
                .sorted((x, y) -> LocalDate.parse(x.get("birthday")).compareTo(LocalDate.parse(y.get("birthday"))))
                .map(x -> x.get("name"))
                .collect(Collectors.toList());
        return result;
    }
}
// END
