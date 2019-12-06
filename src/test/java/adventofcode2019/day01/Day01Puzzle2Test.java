package adventofcode2019.day01;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day01Puzzle2Test {

    @Test
    void testExample() {
        final List<String> input = List.of("14", "1969");
        Assertions.assertEquals(968, Day01Puzzle2.solve(input));
    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2019, 1);
        Assertions.assertEquals(4995942, Day01Puzzle2.solve(input));
    }

}