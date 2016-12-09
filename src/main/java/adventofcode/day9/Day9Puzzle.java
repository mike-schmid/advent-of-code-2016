package adventofcode.day9;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
public class Day9Puzzle {

    public static long solve(final String input) {
        return StringUtils.length(decompress(input));
    }

    public static String decompress(String input) {

        final StringBuilder result = new StringBuilder();

        while (StringUtils.isNotEmpty(input)) {
            if (StringUtils.startsWith(input, "(")) {

                final Integer length = Integer.valueOf(StringUtils.substringBetween(input, "(", "x"));
                final Integer times = Integer.valueOf(StringUtils.substringBetween(input, "x", ")"));
                input = StringUtils.substringAfter(input, ")");

                final String repeatingPart = StringUtils.left(input, length);
                for (Integer i = 0; i < times; i++) {
                    result.append(repeatingPart);
                }
                input = StringUtils.removeStart(input, repeatingPart);


            } else {
                final String characters = StringUtils.substringBefore(input, "(");
                result.append(characters);
                input = StringUtils.removeStart(input, characters);
            }
        }


        return result.toString();
    }

}