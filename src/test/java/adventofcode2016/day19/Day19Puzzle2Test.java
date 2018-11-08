package adventofcode2016.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day19Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals(2, Day19Puzzle2.solve(5));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals(1420064, Day19Puzzle2.solve(3014387));
    }

}