package lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import function.Function2;

/**
 * Basic: Map
 */
public class Lesson03 {
    /**
     * TODO implement this using standard for loop
     */
    public static final Function2<Function<Integer, Integer>, List<Integer>, List<Integer>>
        map = (f, xs) -> {
        final List<Integer> result = new ArrayList<>();
        final int n = xs.size();
        for (int i = 0; i < n; i++) {
            // ...
        }
        throw new NoSuchMethodError("mapLoop");
    };

    public static final Function<Integer, Integer>
        doubleIt = x -> x * 2;

    public static final Function2<Function<Integer, Integer>, List<Integer>, List<Integer>>
        doubleAll = (f, xs) -> {
        throw new NoSuchMethodError("doubleAllLoop");
    };
}
