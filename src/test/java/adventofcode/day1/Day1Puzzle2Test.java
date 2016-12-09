package adventofcode.day1;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day1Puzzle2Test {

    @Test
    public void solve() throws Exception {
        List<String> list = Arrays.asList("R8", "R4", "R4", "R8");
        Assert.assertEquals(4, Day1Puzzle2.solve(list));
    }

    @Test
    public void solveReal() throws Exception {
        List<String> list = Arrays.asList("L4", "R2", "R4", "L5", "L3", "L1", "R4", "R5", "R1", "R3", "L3", "L2", "L2", "R5", "R1", "L1", "L2", "R2", "R2", "L5", "R5", "R5", "L2", "R1", "R2", "L2", "L4", "L1", "R5", "R2", "R1", "R1", "L2", "L3", "R2", "L5", "L186", "L5", "L3", "R3", "L5", "R4", "R2", "L5", "R1", "R4", "L1", "L3", "R3", "R1", "L1", "R4", "R2", "L1", "L4", "R5", "L1", "R50", "L4", "R3", "R78", "R4", "R2", "L4", "R3", "L4", "R4", "L1", "R5", "L4", "R1", "L2", "R3", "L2", "R5", "R5", "L4", "L1", "L2", "R185", "L5", "R2", "R1", "L3", "R4", "L5", "R2", "R4", "L3", "R4", "L2", "L5", "R1", "R2", "L2", "L1", "L2", "R2", "L2", "R1", "L5", "L3", "L4", "L3", "L4", "L2", "L5", "L5", "R2", "L3", "L4", "R4", "R4", "R5", "L4", "L2", "R4", "L5", "R3", "R1", "L1", "R3", "L2", "R2", "R1", "R5", "L4", "R5", "L3", "R2", "R3", "R1", "R4", "L4", "R1", "R3", "L5", "L1", "L3", "R2", "R1", "R4", "L4", "R3", "L3", "R3", "R2", "L3", "L3", "R4", "L2", "R4", "L3", "L4", "R5", "R1", "L1", "R5", "R3", "R1", "R3", "R4", "L1", "R4", "R3", "R1", "L5", "L5", "L4", "R4", "R3", "L2", "R1", "R5", "L3", "R4", "R5", "L4", "L5", "R2");
        Assert.assertEquals(152, Day1Puzzle2.solve(list));
    }

}