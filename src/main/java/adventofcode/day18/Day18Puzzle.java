package adventofcode.day18;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day18Puzzle {

    private static final List<String> TRAPS = Arrays.asList("^^.", ".^^", "^..", "..^");

    public static int solve(final String input, final int rows) {

        StringBuilder result = new StringBuilder(input);
        result.append("\n");

        String currentRow = "." + input + ".";

        for (int i = rows; i > 1; i--) {

            final StringBuilder sb = new StringBuilder(currentRow.length());

            for (int j = 1; j < currentRow.length() - 1; j++) {

                final String pattern = StringUtils.substring(currentRow, j - 1, j + 2);
                final String newChar = TRAPS.contains(pattern) ? "^" : ".";
                sb.append(newChar);

            }

            result.append(sb).append("\n");
            currentRow = "." + sb.toString() + ".";
        }

        return StringUtils.countMatches(result.toString(), '.');
    }

}
