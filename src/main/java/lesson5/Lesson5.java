package lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import function.Function2;

/**
 * Recursion!
 */
public class Lesson5 {

    public static final Function2<Function<String, Boolean>, List<String>, List<String>>
        filter = Lesson5::filterRecursive;

    public static final Function2<Function<Integer, Integer>, List<Integer>, List<Integer>>
        map = Lesson5::mapRecursive;

    /**
     * TODO: implement this mapRecursive function using recursion.
     * HINT: build the result from mappedHead and mappedTail
     *       since java List API is mutating, we need to use for loop
     */
    private static <T, U> List<U> mapRecursive(Function<T, U> f, List<T> xs) {
        if (xs.isEmpty()) {
            return Collections.emptyList();
        } else {
            final int n = xs.size();
            final List<T> tail = xs.subList(1, n);
            final U mappedHead = f.apply(xs.get(0));
            final List<U> mappedTail = mapRecursive(f, tail);
            final List<U> result = new ArrayList<>(n);
            result.add(mappedHead);
            result.addAll(mappedTail);
            return result;
            // ???
            // throw new NoSuchMethodError("mapRecursive");
        }
    }

    /**
     * TODO: implement this filterRecursive function using recursion.
     * HINT: build the result from filtered, head and filteredTail
     *       since java List API is mutating, we need to use for loop
     */
    private static <T> List<T> filterRecursive(Function<T, Boolean> f, List<T> xs) {
        if (xs.isEmpty()) {
            return Collections.emptyList();
        } else {
            final int n = xs.size();
            final List<T> tail = xs.subList(1, n);
            final T head = xs.get(0);
            final Boolean filtered = f.apply(head);
            final List<T> filteredTail = filterRecursive(f, tail);
            final List<T> result = new ArrayList<>(n);
            if (filtered) {
                result.add(head);
            }
            result.addAll(filteredTail);
            return result;
            // TODO
            // throw new NoSuchMethodError("filterRecursive");
        }
    }
}
