package adventofcode2016.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day12PuzzleTest {

    @Test
    public void solve() throws Exception {
        final String input = "cpy 41 a\n" +
                "inc a\n" +
                "inc a\n" +
                "dec a\n" +
                "jnz a 2\n" +
                "dec a";

        Assertions.assertEquals(42, Day12Puzzle.solve(input));
    }

    @Test
    public void solveReal() throws Exception {
        final String input =
                "cpy 1 a\n" +
                "cpy 1 b\n" +
                "cpy 26 d\n" +
                "jnz c 2\n" +
                "jnz 1 5\n" +
                "cpy 7 c\n" +
                "inc d\n" +
                "dec c\n" +
                "jnz c -2\n" +
                "cpy a c\n" +
                "inc a\n" +
                "dec b\n" +
                "jnz b -2\n" +
                "cpy c b\n" +
                "dec d\n" +
                "jnz d -6\n" +
                "cpy 18 c\n" +
                "cpy 11 d\n" +
                "inc a\n" +
                "dec d\n" +
                "jnz d -2\n" +
                "dec c\n" +
                "jnz c -5";

        Assertions.assertEquals(318009, Day12Puzzle.solve(input));
    }

}