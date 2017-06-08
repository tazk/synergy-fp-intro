package lesson2;

import java.util.function.Function;
import org.junit.Assert;
import org.junit.Test;

import static lesson1.Lesson1.upperCaser;
import static lesson2.Lesson2.hooray;
import static lesson2.Lesson2.repeat;
import static lesson2.Lesson2.replicateConcat;

public class Lesson2Test {
    @Test
    public void testConcat() {
        final Function<String, String> stringFunction = replicateConcat.apply(upperCaser, 3);

        Assert.assertEquals(stringFunction.apply(""), "");
        Assert.assertEquals(stringFunction.apply("abc"), "ABCABCABC");
        Assert.assertEquals(stringFunction.apply("Hooray!"), "HOORAY!HOORAY!HOORAY!");
    }

    @Test
    public void testRepeat() throws Exception {
        Assert.assertEquals(repeat.apply(hooray, 3).apply(null), null); // Is it really testConcat????
    }
}
