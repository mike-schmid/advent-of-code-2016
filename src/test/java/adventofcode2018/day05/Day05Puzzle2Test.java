package adventofcode2018.day05;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day05Puzzle2Test {

    @Test
    void testExample() {
        final String input = "dabAcCaCBAcCcaDA";
        Assertions.assertEquals(4, Day05Puzzle2.solve(input));
    }

    @Test
    void testReal() {
        final String input = InputDataFetcher.fetchInput(2018, 5);
        Assertions.assertEquals(5312, Day05Puzzle2.solve(input));
    }
}