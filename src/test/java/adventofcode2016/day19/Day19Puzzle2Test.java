package adventofcode2016.day19;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day19Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(2, Day19Puzzle2.solve(5));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(1420064, Day19Puzzle2.solve(3014387));
    }

}