package lesson1;

import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;
import function.Function2;

/**
 * Hello world
 */
public class Lesson1 {

    /**
     * TODO: Write a function that takes an input string and returns it uppercased.
     */
    public static final Function<String, String> upperCaser = String::toUpperCase;

    /**
     * TODO: Write a function that takes a string and number and returns concatenated string
     */
    public static final Function2<String, Integer, String> concatenator = (str, n) -> {
        StringBuilder ret = new StringBuilder();
        for (Integer i = 0; i < n; i++) {
            ret.append(str);
        }
        return ret.toString();
    };

    /**
     * The same, but it is essentially a method
     */
    public static String upperCaser(String str) {
        return upperCaser.apply(str);
    }
}