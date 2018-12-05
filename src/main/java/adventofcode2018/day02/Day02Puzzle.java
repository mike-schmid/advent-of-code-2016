package adventofcode2018.day02;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle {

    public static int solve(final List<String> input) {
        final Pair<Integer, Integer> ocurrences = input.stream()
                .map(Day02Puzzle::occurrences)
                .reduce(Pair.of(0, 0), Day02Puzzle::mergePairs);

        return ocurrences.getLeft() * ocurrences.getRight();
    }

    private static Pair<Integer, Integer> mergePairs(Pair<Integer, Integer> a, Pair<Integer, Integer> b) {
        final int newLeft = a.getLeft() + b.getLeft();
        final int newRight = a.getRight() + b.getRight();

        return Pair.of(newLeft, newRight);
    }

    private static Pair<Integer, Integer> occurrences(final String text) {

        final char[] chars = text.toCharArray();
        int leftFound = 0;
        int rightFound = 0;

        for (char aChar : chars) {
            final int matches = StringUtils.countMatches(text, aChar);
            if (matches == 2) {
                leftFound = 1;
            } else if (matches == 3) {
                rightFound = 1;
            }
            if (leftFound + rightFound == 2) {
                break;
            }
        }

        return Pair.of(leftFound, rightFound);
    }

}
