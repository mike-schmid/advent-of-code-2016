package adventofcode2018.day01;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day01PuzzleTest {

    @Test
    void testExample1() {
        final List<String> input = List.of("+1", "-2", "+3", "+1");
        Assertions.assertEquals(3, Day01Puzzle.solve(input));
    }

    @Test
    void testExample2() {
        final List<String> input = List.of("+1", "+1", "+1");
        Assertions.assertEquals(3, Day01Puzzle.solve(input));
    }

    @Test
    void testExample3() {
        final List<String> input = List.of("+1", "+1", "-2");
        Assertions.assertEquals(0, Day01Puzzle.solve(input));
    }

    @Test
    void testExample4() {
        final List<String> input = List.of("-1", "-2", "-3");
        Assertions.assertEquals(-6, Day01Puzzle.solve(input));
    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 1);
        Assertions.assertEquals(445, Day01Puzzle.solve(input));
    }

}