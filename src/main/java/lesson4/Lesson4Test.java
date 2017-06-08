package lesson4;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import static lesson4.Lesson4.getShortMessages;

public class Lesson4Test {

    @Test
    public void testFilter() {
        final List<String> input = Arrays.asList(
            "Tempor quis esse consequat sunt ea eiusmod.",
            "Id culpa ad proident ad nulla laborum incididunt.",
            "Ullamco in ea et ad anim anim ullamco est.",
            "Est ut irure nisi.",
            "12345678901234567890"
        );
        final List<String> output = getShortMessages.apply(input);
        final List<String> expected = Arrays.asList(
            "Est ut irure nisi.",
            "12345678901234567890"
        );
        Assert.assertEquals(expected, output);
    };

}
