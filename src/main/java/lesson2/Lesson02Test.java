package lesson2;

import java.util.function.Function;
import org.junit.Assert;
import org.junit.Test;

import static lesson1.Lesson01.upperCaser;
import static lesson2.Lesson02.concat;
import static lesson2.Lesson02.hooray;
import static lesson2.Lesson02.repeat;

public class Lesson02Test {
    @Test
    public void testConcat() {
        Function<String, String> stringFunction = concat.apply(upperCaser, 3);

        Assert.assertEquals(stringFunction.apply(""), "");
        Assert.assertEquals(stringFunction.apply("abc"), "ABCABCABC");
        Assert.assertEquals(stringFunction.apply("Hooray!"), "HOORAY!HOORAY!HOORAY!");
    }

    @Test
    public void testRepeat() throws Exception {
        Assert.assertEquals(repeat.apply(hooray, 3).apply(null), null); // Is it really testConcat????
    }
}
