package adventofcode2016.day13;

import junit.framework.Assert;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day13PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(11, Day13Puzzle.solve(Pair.of(1, 1), Pair.of(7, 4), 10));
    }

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(92, Day13Puzzle.solve(Pair.of(1, 1), Pair.of(31, 39), 1350));
    }

}