package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] littleImage) {

        if (littleImage.length == 0) {
            return littleImage;
        }
/*
        //First method

        String[][] largeImage = new String[2 * littleImage.length][2 * littleImage[0].length];
        int strNum = 0;
        int symNum = 0;

        for (var str : littleImage) {
            for (var sym : str) {
                largeImage[strNum][symNum] = sym;
                largeImage[strNum + 1][symNum] = sym;
                largeImage[strNum][symNum + 1] = sym;
                largeImage[strNum + 1][symNum + 1] = sym;
                symNum += 2;
            }
            symNum = 0;
            strNum += 2;
        }

        return largeImage;

        //  --------------------------------------------------------------------
*/
        //Second method

        String[][] result = Arrays.stream(littleImage)
                .flatMap(i -> {
                    ArrayList<String> arr = new ArrayList<>();
                    arr.addAll(Arrays.asList(i).stream()
                            .flatMap(y -> Stream.of(y, y))
                            .collect(Collectors.toList()));
                    String[] el = new String[arr.size()];

                    return Stream.of(arr.toArray(el), arr.toArray(el));
                })
                .toArray(String[][]::new);

        return result;
    }
}
// END
