package adventofcode2018.day02;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day02PuzzleTest {

    @Test
    void testExample() {
        final List<String> input = List.of("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab");
        Assertions.assertEquals(12, Day02Puzzle.solve(input));
    }

    @Test
    void testReal() {
        Assertions.assertEquals(7872, Day02Puzzle.solve(InputDataFetcher.fetchInputLines(2018,2)));
    }

}