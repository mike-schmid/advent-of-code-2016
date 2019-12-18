package adventofcode2019.day02;

import helper.InputDataFetcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day02PuzzleTest {

    @Test
    void testExample1() {
        final List<String> input = splitString("1,0,0,0,99");
        Assertions.assertEquals(2, Day02Puzzle.solve(input));
    }

    @Test
    void testExample2() {
        final List<String> input = splitString("2,3,0,3,99");
        Assertions.assertEquals(2, Day02Puzzle.solve(input));
    }

    @Test
    void testExample3() {
        final List<String> input = splitString("2,4,4,5,99,0");
        Assertions.assertEquals(2, Day02Puzzle.solve(input));
    }

    @Test
    void testExample4() {
        final List<String> input = splitString("1,1,1,4,99,5,6,0,99");
        Assertions.assertEquals(30, Day02Puzzle.solve(input));
    }

    @Test
    void testReal() {
        final String input = InputDataFetcher.fetchInput(2019, 2);
        List<String> inputList = splitString(input);
        inputList.set(1, "12");
        inputList.set(2, "2");
        Assertions.assertEquals(3716250, Day02Puzzle.solve(inputList));
    }


    private List<String> splitString(final String string) {
        return Arrays.asList(StringUtils.split(string, ","));
    }

}