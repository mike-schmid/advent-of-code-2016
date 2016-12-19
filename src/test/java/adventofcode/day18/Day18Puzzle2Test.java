package adventofcode.day18;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day18Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        final String input = ".^^^^^.^^^..^^^^^...^.^..^^^.^^....^.^...^^^...^^^^..^...^...^^.^.^.......^..^^...^.^.^^..^^^^^...^.";
        Assert.assertEquals(19995121, Day18Puzzle2.solve(input, 400000));
    }


}