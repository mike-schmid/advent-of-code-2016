package adventofcode2017.day04;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mike Schmid
 */
public class Day04Puzzle {

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
            if (usedWords.contains(word)) {
                return false;
            } else {
                usedWords.add(word);
            }
        }

        return true;
    }

}