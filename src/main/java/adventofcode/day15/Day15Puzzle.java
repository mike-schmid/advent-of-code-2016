package adventofcode.day15;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Mike Schmid
 */
public class Day15Puzzle {

    public static int solve(final String input) {
        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        final Map<Integer, Integer> discs = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < lines.size(); i++) {
            final String line = lines.get(i);

            final int positions = Integer.valueOf(StringUtils.substringBetween(line, "has ", " positions"));
            int currentPosition = Integer.valueOf(StringUtils.substringBetween(line, "position ", "."));

            currentPosition = (currentPosition + i ) % positions;

            discs.put(positions, currentPosition);
        }


        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            for (Map.Entry<Integer, Integer> entry : discs.entrySet()) {
                entry.setValue((entry.getValue() + 1) % entry.getKey());
            }

            if(allDiscsAligned(discs)){
               return i;
            }

        }

        return -1; // no solution

    }

    private static boolean allDiscsAligned(Map<Integer, Integer> discs) {
        return discs.values().stream().noneMatch(i -> i != 0);
    }
}
