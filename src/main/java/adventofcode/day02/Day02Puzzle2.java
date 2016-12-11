package adventofcode.day02;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle2 {

    private static final Map<Character, Set<Integer>> ALLOWED_MOVES = new HashMap<>();
    private static final Map<Character, Integer> OFFSETS = new HashMap<>();

    static {
        ALLOWED_MOVES.put('U', new HashSet<>(Arrays.asList(3, 6, 7, 8, 10, 11, 12, 13)));
        ALLOWED_MOVES.put('D', new HashSet<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 11)));
        ALLOWED_MOVES.put('L', new HashSet<>(Arrays.asList(6, 3, 7, 11, 4, 8, 12, 9)));
        ALLOWED_MOVES.put('R', new HashSet<>(Arrays.asList(8, 3, 7, 11, 2, 6, 10, 5)));

        OFFSETS.put('U', -4);
        OFFSETS.put('D', +4);
        OFFSETS.put('L', -1);
        OFFSETS.put('R', +1);
    }

    public static String solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));
        final StringBuilder result = new StringBuilder(5);
        int currentPos = 5;

        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                final char direction = line.charAt(i);
                if (ALLOWED_MOVES.get(direction).contains(currentPos)) {
                    currentPos = getNewPos(direction, currentPos);
                }
            }

            if (currentPos < 10) {
                result.append(currentPos);
            } else {
                result.append((char) (currentPos + 55)); // ASCII 'A' is 65
            }

        }

        return result.toString();
    }

    private static int getNewPos(char direction, int currentPos) {
        if (direction == 'U' && (currentPos == 3 || currentPos == 13)) {
            return currentPos - 2;
        }
        if (direction == 'D' && (currentPos == 11 || currentPos == 1)) {
            return currentPos + 2;
        }
        if (direction == 'L' && (currentPos == 6 || currentPos == 9)) {
            return currentPos - 1;
        }
        if (direction == 'R' && (currentPos == 8 || currentPos == 5)) {
            return currentPos + 1;
        }

        return currentPos + OFFSETS.get(direction);
    }

}
