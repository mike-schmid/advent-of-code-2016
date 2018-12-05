package adventofcode2018.day01;

import helper.InputDataFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Day01Puzzle2Test {

    @Test
    void testExample1() {
        final List<String> input = List.of("+1", "-2", "+3", "+1");
        Assertions.assertEquals(2, Day01Puzzle2.solve(input));
    }

    @Test
    void testExample2() {
        final List<String> input = List.of("+1", "-1");
        Assertions.assertEquals(0, Day01Puzzle2.solve(input));
    }

    @Test
    void testExample3() {
        final List<String> input = List.of("+3", "+3", "+4", "-2", "-4");
        Assertions.assertEquals(10, Day01Puzzle2.solve(input));
    }

    @Test
    void testExample4() {
        final List<String> input = List.of("-6", "+3", "+8", "+5", "-6");
        Assertions.assertEquals(5, Day01Puzzle2.solve(input));
    }

    @Test
    void testExample5() {
        final List<String> input = List.of("+7", "+7", "-2", "-7", "-4");
        Assertions.assertEquals(14, Day01Puzzle2.solve(input));
    }

    @Test
    void testReal() {
        final List<String> input = InputDataFetcher.fetchInputLines(2018, 1);
        Assertions.assertEquals(219, Day01Puzzle2.solve(input));
    }

}