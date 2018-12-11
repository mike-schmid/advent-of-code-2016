package adventofcode2018.day04;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day04PuzzleTest {

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 4);
        Assertions.assertEquals(60438, Day04Puzzle.solve(input));
    }
}