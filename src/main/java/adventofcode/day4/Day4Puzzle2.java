package adventofcode.day4;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mike Schmid
 */
public class Day4Puzzle2 {

    private static final String CHARS = "abcdefghijklmnopqrstuvwxyz";

    public static long solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        for (String line : lines) {

            final String word = StringUtils.replaceChars(StringUtils.substringBeforeLast(line, "-"), "-", " ");
            final int roomId = Integer.valueOf(StringUtils.substringBeforeLast(StringUtils.substringAfterLast(line, "-"), "["));

            final String hash = word.chars()
                    .mapToObj(i -> (char) i)
                    .map(c -> shift(c, roomId))
                    .collect(Collectors.joining());

            if (StringUtils.containsIgnoreCase(hash, "northpole")) {
                return roomId;
            }

        }

        return 0;
    }

    private static String shift(final char character, final int offset) {
        if (StringUtils.contains(CHARS, character)) {
            return String.valueOf(CHARS.charAt((CHARS.indexOf(character) + offset) % CHARS.length()));
        }
        return String.valueOf(character);
    }
}


