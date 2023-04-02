package exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String configFile) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(configFile.split("\n")));

        String result = arrList.stream()
                .filter((el) -> el.startsWith("environment"))
                .map(i -> i.substring(13, i.length() - 1).split(","))
        //        .peek(i -> System.out.println(Arrays.deepToString(i)))
                .flatMap(i -> Stream.of(i))
                .filter(i -> i.startsWith("X_FORWARDED_"))
                .map(i -> i.substring(12))
                .collect(Collectors.joining(","));

        return result;
    }
}
//END
