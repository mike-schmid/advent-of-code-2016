package adventofcode.day15;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day15Puzzle2Test {

    @Test
    public void solveReal() throws Exception {

        final String input = "Disc #1 has 17 positions; at time=0, it is at position 5.\n" +
                "Disc #2 has 19 positions; at time=0, it is at position 8.\n" +
                "Disc #3 has 7 positions; at time=0, it is at position 1.\n" +
                "Disc #4 has 13 positions; at time=0, it is at position 7.\n" +
                "Disc #5 has 5 positions; at time=0, it is at position 1.\n" +
                "Disc #6 has 3 positions; at time=0, it is at position 0.\n" +
                "Disc #6 has 11 positions; at time=0, it is at position 0.";

        Assert.assertEquals(3543984, Day15Puzzle.solve(input));

    }
}