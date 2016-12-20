package adventofcode.day19;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day19PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(3, Day19Puzzle.solve(5));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(3, Day19Puzzle.solve(3014387));
    }

}