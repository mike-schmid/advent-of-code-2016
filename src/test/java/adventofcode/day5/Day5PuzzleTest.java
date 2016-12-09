package adventofcode.day5;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day5PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals("18f47a30", Day5Puzzle.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals("c6697b55", Day5Puzzle.solve("ffykfhsq"));
    }

}