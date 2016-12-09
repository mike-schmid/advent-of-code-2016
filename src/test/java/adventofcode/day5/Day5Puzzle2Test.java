package adventofcode.day5;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day5Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals("05ace8e3", Day5Puzzle2.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals("8c35d1ab", Day5Puzzle2.solve("ffykfhsq"));
    }

}