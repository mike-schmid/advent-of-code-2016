package adventofcode2019.day01;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle2 {

    public static int solve(final List<String> input) {
        return input.stream()
                .mapToInt(Integer::parseInt)
                .map(Day01Puzzle2::calculateFuel)
                .sum();
    }


    private static int calculateFuel(final int mass) {
        int fuel = mass / 3 - 2;

        if (fuel <= 0) {
            return 0;
        }

        return fuel + calculateFuel(fuel);

    }


}
