package adventofcode2018.day05;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day05PuzzleTest {

    @Test
    void testExample() {
        final String input = "dabAcCaCBAcCcaDA";
        Assertions.assertEquals(10, Day05Puzzle.solve(input));
    }

    @Test
    void testReal() {
        final String input = InputDataFetcher.fetchInput(2018, 5);
        Assertions.assertEquals(10598, Day05Puzzle.solve(input));
    }
}