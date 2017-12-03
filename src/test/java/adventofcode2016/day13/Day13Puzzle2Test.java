package adventofcode2016.day13;

import junit.framework.Assert;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day13Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals(124, Day13Puzzle2.solve(Pair.of(1, 1), 50, 1350));
    }

}