package adventofcode.day21;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class CommandUtilsTest {

    @Test
    public void move() throws Exception {
        final String testInput = "abcdef";

        Assert.assertEquals("bacdef", CommandUtils.move(testInput, 0, 1));
        Assert.assertEquals("acbdef", CommandUtils.move(testInput, 1, 2));
        Assert.assertEquals("abcdfe", CommandUtils.move(testInput, 4, 5));
    }

    @Test
    public void reverse() throws Exception {
        final String testInput = "abcdef";

        Assert.assertEquals("fedcba", CommandUtils.reverse(testInput, 0, 6));
        Assert.assertEquals("afedcb", CommandUtils.reverse(testInput, 1, 5));
        Assert.assertEquals("bacdef", CommandUtils.reverse(testInput, 0, 1));
        Assert.assertEquals("abcdef", CommandUtils.reverse(testInput, 5, 6));
        Assert.assertEquals("cbadef", CommandUtils.reverse(testInput, 0, 2));


        Assert.assertEquals("abcde", CommandUtils.reverse("edcba", 0, 4));

    }

    @Test
    public void rotateStringBasedOn() throws Exception {
        final String testInput = "abcdef";

        Assert.assertEquals("fabcde", CommandUtils.rotateStringBasedOn(testInput, "a"));
        Assert.assertEquals("efabcd", CommandUtils.rotateStringBasedOn(testInput, "b"));
        Assert.assertEquals("defabc", CommandUtils.rotateStringBasedOn(testInput, "c"));
        Assert.assertEquals("cdefab", CommandUtils.rotateStringBasedOn(testInput, "d"));

        Assert.assertEquals("abcdef", CommandUtils.rotateStringBasedOn(testInput, "e"));
        Assert.assertEquals("fabcde", CommandUtils.rotateStringBasedOn(testInput, "f"));

    }

    @Test
    public void rotateRight() throws Exception {
        final String testInput = "asdf";

        Assert.assertEquals("asdf", CommandUtils.rotateRight(testInput, 0));
        Assert.assertEquals("fasd", CommandUtils.rotateRight(testInput, 1));
        Assert.assertEquals("dfas", CommandUtils.rotateRight(testInput, 2));
        Assert.assertEquals("sdfa", CommandUtils.rotateRight(testInput, 3));

    }

    @Test
    public void rotateLeft() throws Exception {
        final String testInput = "asdf";

        Assert.assertEquals("asdf", CommandUtils.rotateLeft(testInput, 0));
        Assert.assertEquals("sdfa", CommandUtils.rotateLeft(testInput, 1));
        Assert.assertEquals("dfas", CommandUtils.rotateLeft(testInput, 2));
        Assert.assertEquals("fasd", CommandUtils.rotateLeft(testInput, 3));

    }

    @Test
    public void swapPositionXWithY() throws Exception {
        final String testInput = "asdf";

        Assert.assertEquals("dsaf", CommandUtils.swapPositionXWithY(testInput, 0, 2));
        Assert.assertEquals("fsda", CommandUtils.swapPositionXWithY(testInput, 0, 3));
    }

}