package adventofcode2016.day01;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day01PuzzleTest {

    @Test
    public void solve1() throws Exception {
        final List<String> list = Arrays.asList("R2", "L3");
        Assert.assertEquals(5, Day01Puzzle.solve(list));
    }

    @Test
    public void solve2() throws Exception {
        final List<String> list = Arrays.asList("R2", "R2","R2");
        Assert.assertEquals(2, Day01Puzzle.solve(list));
    }

    @Test
    public void solve3() throws Exception {
        final List<String> list = Arrays.asList("R5", "L5","R5","R3");
        Assert.assertEquals(12, Day01Puzzle.solve(list));
    }

    @Test
    public void solveReal() throws Exception {
        List<String> list = Arrays.asList("L4", "R2", "R4", "L5", "L3", "L1", "R4", "R5", "R1", "R3", "L3", "L2", "L2", "R5", "R1", "L1", "L2", "R2", "R2", "L5", "R5", "R5", "L2", "R1", "R2", "L2", "L4", "L1", "R5", "R2", "R1", "R1", "L2", "L3", "R2", "L5", "L186", "L5", "L3", "R3", "L5", "R4", "R2", "L5", "R1", "R4", "L1", "L3", "R3", "R1", "L1", "R4", "R2", "L1", "L4", "R5", "L1", "R50", "L4", "R3", "R78", "R4", "R2", "L4", "R3", "L4", "R4", "L1", "R5", "L4", "R1", "L2", "R3", "L2", "R5", "R5", "L4", "L1", "L2", "R185", "L5", "R2", "R1", "L3", "R4", "L5", "R2", "R4", "L3", "R4", "L2", "L5", "R1", "R2", "L2", "L1", "L2", "R2", "L2", "R1", "L5", "L3", "L4", "L3", "L4", "L2", "L5", "L5", "R2", "L3", "L4", "R4", "R4", "R5", "L4", "L2", "R4", "L5", "R3", "R1", "L1", "R3", "L2", "R2", "R1", "R5", "L4", "R5", "L3", "R2", "R3", "R1", "R4", "L4", "R1", "R3", "L5", "L1", "L3", "R2", "R1", "R4", "L4", "R3", "L3", "R3", "R2", "L3", "L3", "R4", "L2", "R4", "L3", "L4", "R5", "R1", "L1", "R5", "R3", "R1", "R3", "R4", "L1", "R4", "R3", "R1", "L5", "L5", "L4", "R4", "R3", "L2", "R1", "R5", "L3", "R4", "R5", "L4", "L5", "R2");
        Assert.assertEquals(353, Day01Puzzle.solve(list));
    }

}