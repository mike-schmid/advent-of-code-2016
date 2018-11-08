package adventofcode2016.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class CommandUtilsTest {

    @Test
    public void move() throws Exception {
        final String testInput = "abcdef";

        Assertions.assertEquals("bacdef", CommandUtils.move(testInput, 0, 1));
        Assertions.assertEquals("acbdef", CommandUtils.move(testInput, 1, 2));
        Assertions.assertEquals("abcdfe", CommandUtils.move(testInput, 4, 5));
    }

    @Test
    public void reverse() throws Exception {
        final String testInput = "abcdef";

        Assertions.assertEquals("fedcba", CommandUtils.reverse(testInput, 0, 6));
        Assertions.assertEquals("afedcb", CommandUtils.reverse(testInput, 1, 5));
        Assertions.assertEquals("bacdef", CommandUtils.reverse(testInput, 0, 1));
        Assertions.assertEquals("abcdef", CommandUtils.reverse(testInput, 5, 6));
        Assertions.assertEquals("cbadef", CommandUtils.reverse(testInput, 0, 2));


        Assertions.assertEquals("abcde", CommandUtils.reverse("edcba", 0, 4));

    }

    @Test
    public void rotateStringBasedOn() throws Exception {
        final String testInput = "abcdef";

        Assertions.assertEquals("fabcde", CommandUtils.rotateStringBasedOn(testInput, "a"));
        Assertions.assertEquals("efabcd", CommandUtils.rotateStringBasedOn(testInput, "b"));
        Assertions.assertEquals("defabc", CommandUtils.rotateStringBasedOn(testInput, "c"));
        Assertions.assertEquals("cdefab", CommandUtils.rotateStringBasedOn(testInput, "d"));

        Assertions.assertEquals("abcdef", CommandUtils.rotateStringBasedOn(testInput, "e"));
        Assertions.assertEquals("fabcde", CommandUtils.rotateStringBasedOn(testInput, "f"));

    }

    @Test
    public void rotateRight() throws Exception {
        final String testInput = "asdf";

        Assertions.assertEquals("asdf", CommandUtils.rotateRight(testInput, 0));
        Assertions.assertEquals("fasd", CommandUtils.rotateRight(testInput, 1));
        Assertions.assertEquals("dfas", CommandUtils.rotateRight(testInput, 2));
        Assertions.assertEquals("sdfa", CommandUtils.rotateRight(testInput, 3));

    }

    @Test
    public void rotateLeft() throws Exception {
        final String testInput = "asdf";

        Assertions.assertEquals("asdf", CommandUtils.rotateLeft(testInput, 0));
        Assertions.assertEquals("sdfa", CommandUtils.rotateLeft(testInput, 1));
        Assertions.assertEquals("dfas", CommandUtils.rotateLeft(testInput, 2));
        Assertions.assertEquals("fasd", CommandUtils.rotateLeft(testInput, 3));

    }

    @Test
    public void swapPositionXWithY() throws Exception {
        final String testInput = "asdf";

        Assertions.assertEquals("dsaf", CommandUtils.swapPositionXWithY(testInput, 0, 2));
        Assertions.assertEquals("fsda", CommandUtils.swapPositionXWithY(testInput, 0, 3));
    }

}