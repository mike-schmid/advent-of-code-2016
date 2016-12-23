package adventofcode.day21;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day21Puzzle {

    public static String solve(final String commands, String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(commands, '\n'));

        for (String line : lines) {

            if (StringUtils.startsWith(line, "swap position ")) {

                final int x = Integer.valueOf(StringUtils.substringBetween(line, "swap position ", " with"));
                final int y = Integer.valueOf(StringUtils.substringAfterLast(line, "with position "));

                input = CommandUtils.swapPositionXWithY(input, x, y);
                continue;
            }

            if (StringUtils.startsWith(line, "swap letter ")) {

                final String x = StringUtils.substringBetween(line, "swap letter ", " with");
                final String y = StringUtils.substringAfterLast(line, "with letter ");

                input = CommandUtils.swapLetters(input, x, y);
                continue;
            }

            if (StringUtils.startsWith(line, "rotate right")) {
                final Integer steps = Integer.valueOf(StringUtils.substringBetween(line, "right ", " step"));
                input = CommandUtils.rotateRight(input, steps);
                continue;
            }

            if (StringUtils.startsWith(line, "rotate left")) {
                final Integer steps = Integer.valueOf(StringUtils.substringBetween(line, "left ", " step"));
                input = CommandUtils.rotateLeft(input, steps);
                continue;
            }

            if (StringUtils.startsWith(line, "rotate based on position of letter ")) {
                final String character = StringUtils.substringAfterLast(line, "letter ");
                input = CommandUtils.rotateStringBasedOn(input, character);
                continue;
            }

            if (StringUtils.startsWith(line, "reverse positions")) {
                final int from = Integer.valueOf(StringUtils.substringBetween(line, "positions ", " through"));
                final int to = Integer.valueOf(StringUtils.substringAfterLast(line, "through "));
                input = CommandUtils.reverse(input, from, to);
                continue;
            }

            if (StringUtils.startsWith(line, "move position")) {
                final int from = Integer.valueOf(StringUtils.substringBetween(line, "position ", " to"));
                final int to = Integer.valueOf(StringUtils.substringAfterLast(line, "position "));
                input = CommandUtils.move(input, from, to);
            }

        }

        return input;

    }


}
