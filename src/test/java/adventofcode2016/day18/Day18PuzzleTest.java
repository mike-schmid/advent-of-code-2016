package adventofcode2016.day18;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class Day18PuzzleTest {


    @Test
    public void solve() throws Exception {
        final String input = "..^^.";
        Assert.assertEquals(6, Day18Puzzle.solve(input, 3));
    }

    @Test
    public void solve2() throws Exception {
        final String input = ".^^.^.^^^^";
        Assert.assertEquals(38, Day18Puzzle.solve(input, 10));
    }

    @Test
    public void solveReal() throws Exception {
        final String input = ".^^^^^.^^^..^^^^^...^.^..^^^.^^....^.^...^^^...^^^^..^...^...^^.^.^.......^..^^...^.^.^^..^^^^^...^.";
        Assert.assertEquals(1956, Day18Puzzle.solve(input, 40));
    }

}