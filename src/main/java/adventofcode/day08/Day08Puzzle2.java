package adventofcode.day08;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mike Schmid
 */
public class Day08Puzzle2 {

    public static String solve(final String input, final int width, final int height) {
        final List<String> strings = Day08Puzzle.calculateRotations(input, width, height);

        return strings.stream()
                .collect(Collectors.joining("\n"));

    }


}