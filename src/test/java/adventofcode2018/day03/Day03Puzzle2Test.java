package adventofcode2018.day03;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day03Puzzle2Test {

    @Test
    void testExample() {
        final List<String> input = List.of("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2");
        Assertions.assertEquals(3, Day03Puzzle2.solve(input));
    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 3);
        Assertions.assertEquals(445, Day03Puzzle2.solve(input));
    }
}