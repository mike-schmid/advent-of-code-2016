package adventofcode2019.day01;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle {

    public static int solve(final List<String> input) {
        return input.stream()
                .mapToInt(Integer::parseInt)
                .map(i -> i / 3 - 2)
                .sum();
    }

}
