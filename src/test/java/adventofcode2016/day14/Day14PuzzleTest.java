package adventofcode2016.day14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day14PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals(22728, Day14Puzzle.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals(15168, Day14Puzzle.solve("qzyelonm"));
    }

}