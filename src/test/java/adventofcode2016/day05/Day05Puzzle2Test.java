package adventofcode2016.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals("05ace8e3", Day05Puzzle2.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals("8c35d1ab", Day05Puzzle2.solve("ffykfhsq"));
    }

}