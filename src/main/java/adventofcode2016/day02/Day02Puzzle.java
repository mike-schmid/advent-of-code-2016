package adventofcode2016.day02;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle {

    private static final Map<Character, Set<Integer>> ALLOWED_MOVES = new HashMap<>();
    private static final Map<Character, Integer> OFFSETS = new HashMap<>();

    static {
        ALLOWED_MOVES.put('U', new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9)));
        ALLOWED_MOVES.put('D', new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        ALLOWED_MOVES.put('L', new HashSet<>(Arrays.asList(2, 5, 8, 3, 6, 9)));
        ALLOWED_MOVES.put('R', new HashSet<>(Arrays.asList(1, 4, 7, 2, 5, 8)));

        OFFSETS.put('U', -3);
        OFFSETS.put('D', +3);
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
                    currentPos = currentPos + OFFSETS.get(direction);
                }
            }
            result.append(currentPos);
        }

        return result.toString();
    }

}
