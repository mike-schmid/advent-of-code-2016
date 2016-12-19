package adventofcode.day16;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day16Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        Assert.assertEquals("10101011110100011", Day16Puzzle2.solve("00111101111101000", 35651584));
    }

}