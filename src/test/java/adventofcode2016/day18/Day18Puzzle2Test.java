package adventofcode2016.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day18Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        final String input = ".^^^^^.^^^..^^^^^...^.^..^^^.^^....^.^...^^^...^^^^..^...^...^^.^.^.......^..^^...^.^.^^..^^^^^...^.";
        Assertions.assertEquals(19995121, Day18Puzzle2.solve(input, 400000));
    }


}