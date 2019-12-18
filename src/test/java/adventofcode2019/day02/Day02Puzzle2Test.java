package adventofcode2019.day02;

import helper.InputDataFetcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day02Puzzle2Test {

    @Test
    void testReal() {
        final String input = InputDataFetcher.fetchInput(2019, 2);
        Assertions.assertEquals(6472, Day02Puzzle2.solve(splitString(input), 19690720));
    }

    private List<String> splitString(final String string) {
        return Arrays.asList(StringUtils.split(string, ","));
    }


}