package adventofcode.day14;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day14Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(22551, Day14Puzzle2.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(20864, Day14Puzzle2.solve("qzyelonm"));
    }

}