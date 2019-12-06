package adventofcode2019.day01;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day01PuzzleTest {

    @Test
    void testExample() {
        final List<String> input = List.of("12", "14", "1969", "100756");
        Assertions.assertEquals(34241, Day01Puzzle.solve(input));
    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2019, 1);
        Assertions.assertEquals(3332538, Day01Puzzle.solve(input));
    }


}