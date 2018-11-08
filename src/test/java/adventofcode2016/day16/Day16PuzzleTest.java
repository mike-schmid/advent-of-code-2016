package adventofcode2016.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day16PuzzleTest {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals("01100", Day16Puzzle.solve("10000", 20));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals("10011010010010010", Day16Puzzle.solve("00111101111101000", 272));
    }

}