package adventofcode2018.day04;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day04Puzzle2Test {

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 4);
        Assertions.assertEquals(47989, Day04Puzzle2.solve(input));
    }
}