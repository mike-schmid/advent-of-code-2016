package adventofcode2017.day04;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mike Schmid
 */
public class Day04Puzzle2 {

    public static int solve(final String input) {

        final String[] lines = StringUtils.split(input, "\n");

        int validLines = 0;

        for (String line : lines) {
            if (isValidLine(line)) {
                validLines++;
            }
        }

        return validLines;
    }

    private static boolean isValidLine(String line) {
        final Set<String> usedWords = new HashSet<>();

        final String[] words = StringUtils.split(line);
        for (String word : words) {
            final Set<String> permutations = permutation(word);

            for (String permutation : permutations) {
                if (usedWords.contains(permutation)) {
                    return false;
                } else {
                    usedWords.add(permutation);
                }
            }

        }

        return true;
    }

    private static Set<String> permutation(final String str) {
        final Set<String> result = new HashSet<>();
        permutation(result, StringUtils.EMPTY, str);
        return result;
    }

    private static void permutation(final Set<String> result, final String prefix, final String str) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(result, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

}