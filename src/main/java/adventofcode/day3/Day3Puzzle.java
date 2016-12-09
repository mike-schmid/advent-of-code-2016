package adventofcode.day3;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day3Puzzle {

    public static long solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        return lines.stream()
                .map(StringUtils::split)
                .map(Day3Puzzle::toSortedIntArray)
                .filter(ints -> ints[0] + ints[1] > ints[2])
                .count();
    }

    private static int[] toSortedIntArray(final String[] stringArray) {
        final int[] intArray = {
                Integer.valueOf(stringArray[0]),
                Integer.valueOf(stringArray[1]),
                Integer.valueOf(stringArray[2]),
        };

        Arrays.sort(intArray);
        return intArray;
    }
}


