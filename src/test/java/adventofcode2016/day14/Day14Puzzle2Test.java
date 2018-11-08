package adventofcode2016.day14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day14Puzzle2Test {

    @Test
    public void solve() throws Exception {
        Assertions.assertEquals(22551, Day14Puzzle2.solve("abc"));
    }

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals(20864, Day14Puzzle2.solve("qzyelonm"));
    }

}