package adventofcode2018.day02;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day02Puzzle2Test {

    @Test
    void testExample() {
        final List<String> input = List.of("abcde",
                "fghij",
                "klmno",
                "pqrst",
                "fguij",
                "axcye",
                "wvxyz");

        Assertions.assertEquals("fgij", Day02Puzzle2.solve(input));

    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 2);
        Assertions.assertEquals("tjxmoewpdkyaihvrndfluwbzc", Day02Puzzle2.solve(input));

    }
}