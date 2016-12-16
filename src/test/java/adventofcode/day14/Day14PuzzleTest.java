package adventofcode.day14;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day14PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(22728, Day14Puzzle.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(15168, Day14Puzzle.solve("qzyelonm"));
    }

}