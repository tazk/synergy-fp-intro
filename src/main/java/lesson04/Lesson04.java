package lesson04;

import java.util.List;
import java.util.function.Function;
import function.Function2;

/**
 * Basic: Filter
 */
public class Lesson04 {

    /**
     * getShortMessages takes a list of objects with '.message'
     * properties and returns another list of messages that are less
     * than < 15 characters long.
     * The function should return a list containing the messages
     * themselves, without their containing object.
     */
    public static final Function2<Function<String, Boolean>, List<String>, List<String>>
        filter = (f, xs) -> {
        throw new NoSuchMethodError("filter");
    };

}
