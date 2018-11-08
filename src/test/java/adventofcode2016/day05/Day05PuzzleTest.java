package adventofcode2016.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day05PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals("18f47a30", Day05Puzzle.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals("c6697b55", Day05Puzzle.solve("ffykfhsq"));
    }

}