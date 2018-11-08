package adventofcode2016.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day15PuzzleTest {

    @Test
    public void solve() throws Exception {
        final String input = "Disc #1 has 5 positions; at time=0, it is at position 4.\n" +
                "Disc #2 has 2 positions; at time=0, it is at position 1.";

        Assertions.assertEquals(5, Day15Puzzle.solve(input));
    }

    @Test
    public void solveReal() throws Exception {
        final String input = "Disc #1 has 17 positions; at time=0, it is at position 5.\n" +
                "Disc #2 has 19 positions; at time=0, it is at position 8.\n" +
                "Disc #3 has 7 positions; at time=0, it is at position 1.\n" +
                "Disc #4 has 13 positions; at time=0, it is at position 7.\n" +
                "Disc #5 has 5 positions; at time=0, it is at position 1.\n" +
                "Disc #6 has 3 positions; at time=0, it is at position 0.";

        Assertions.assertEquals(16824, Day15Puzzle.solve(input));
    }

}