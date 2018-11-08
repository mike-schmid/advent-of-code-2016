package adventofcode2016.day13;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day13Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals(124, Day13Puzzle2.solve(Pair.of(1, 1), 50, 1350));
    }

}