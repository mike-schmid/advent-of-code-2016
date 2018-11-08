package adventofcode2016.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mike Schmid
 */
public class Day16Puzzle2Test {

    @Test
    public void solveReal() throws Exception {
        Assertions.assertEquals("10101011110100011", Day16Puzzle2.solve("00111101111101000", 35651584));
    }

}