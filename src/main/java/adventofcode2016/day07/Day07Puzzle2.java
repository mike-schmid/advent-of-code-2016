package adventofcode2016.day07;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Mike Schmid
 */
public class Day07Puzzle2 {

    private static final Pattern BRACKETS_PATTERN = Pattern.compile("\\[([a-z]*)\\]");

    public static long solve(final List<String> input) {

        return input.parallelStream() //TODO: parallelism worth it? probably not....
                .filter(Day07Puzzle2::isSslSupported)
                .count();
    }

    public static boolean isSslSupported(final String input) {

        final Set<String> inBrackets = new HashSet<>();
        final Matcher m = BRACKETS_PATTERN.matcher(input);

        while (m.find()) {
            inBrackets.addAll(getABATriples(m.group(1)));
        }

        final String newInput = StringUtils.replacePattern(input, BRACKETS_PATTERN.pattern(), "-");

        return getABATriples(newInput).stream()
                .map(s -> StringUtils.substring(s, 1) + s.charAt(1))
                .anyMatch(inBrackets::contains);
    }

    private static Set<String> getABATriples(final String input) {

        final Set<String> abas = new HashSet<>();

        for (int i = 0; i < input.length() - 2; i++) {
            final String triple = StringUtils.substring(input, i, i + 3);
            if (triple.charAt(0) != triple.charAt(1) &&
                    triple.charAt(0) == triple.charAt(2)) {
                abas.add(triple);
            }
        }

        return abas;
    }

}