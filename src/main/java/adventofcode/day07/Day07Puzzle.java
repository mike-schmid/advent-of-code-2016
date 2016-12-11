package adventofcode.day07;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Mike Schmid
 */
public class Day07Puzzle {

    private static final Pattern NEGATIVE_PATTERN = Pattern.compile("\\[([a-z]*)\\]");
    private static final Pattern POSITIVE_PATTERN = Pattern.compile("([a-z]*)");

    public static long solve(final List<String> input) {

        return input.stream()
                .filter(Day07Puzzle::isTlsSupported)
                .count();

    }

    public static boolean isTlsSupported(final String input) {

        final Matcher m = NEGATIVE_PATTERN.matcher(input);
        while (m.find()) {
            if (isABBA(m.group(1))) {
                return false;
            }
        }

        final Matcher m2 = POSITIVE_PATTERN.matcher(input);
        while (m2.find()) {
            if (isABBA(m2.group(1))) {
                return true;
            }
        }

        return false;

    }

    private static boolean isABBA(final String input) {

        for (int i = 0; i < input.length() - 3; i++) {
            final String quadruple = StringUtils.substring(input, i, i + 4);
            if (quadruple.charAt(0) == quadruple.charAt(3) &&
                    quadruple.charAt(1) == quadruple.charAt(2) &&
                    quadruple.charAt(0) != quadruple.charAt(1)) {
                return true;
            }
        }

        return false;
    }

}