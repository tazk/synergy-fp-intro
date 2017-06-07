package lesson1;


import org.junit.Assert;
import org.junit.Test;

import static lesson1.Lesson01.concatenator;
import static lesson1.Lesson01.upperCaser;

public class Lesson01Test {
    @Test
    public void testUpperCaser() {
        Assert.assertEquals(upperCaser.apply(""), "");
        Assert.assertEquals(upperCaser.apply("abc"), "ABC");
        Assert.assertEquals(upperCaser(""), "");
        Assert.assertEquals(upperCaser("abc"), "ABC");
    }

    @Test
    public void testConcatenation() {
        Assert.assertEquals(concatenator.apply("", 3), "");
        Assert.assertEquals(concatenator.apply("abc", 3), "abcabcabc");
    }
}
