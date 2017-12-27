package adventofcode2017.day02;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle {

    public static int solve(final String input) {

        final String[] lines = StringUtils.split(input, "\n");
        int sum = 0;

        for (String line : lines) {
            final String[] rows = StringUtils.split(line, "\t");

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (String row : rows) {

                final Integer number = Integer.valueOf(row);

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }

            sum += max - min;

        }

        return sum;
    }

}