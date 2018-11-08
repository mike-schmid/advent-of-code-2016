package adventofcode2016.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day19PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals(3, Day19Puzzle.solve(5));
    }

    @Test
    @Disabled
    public void solveReal() throws Exception {
        Assertions.assertEquals(3, Day19Puzzle.solve(3014387));
    }

}