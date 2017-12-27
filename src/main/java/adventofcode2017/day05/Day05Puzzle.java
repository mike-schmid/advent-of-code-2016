package adventofcode2017.day05;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle {

    public static int solve(final String input) {

        final List<Integer> instructions = convertToIntList(input);

        int steps = 0;
        int currentPos = 0;

        while (currentPos >= 0 && currentPos < instructions.size()){
            final Integer currentInstruction = instructions.get(currentPos);

            instructions.set(currentPos, currentInstruction + 1);
            currentPos += currentInstruction;

            steps++;

        }

        return steps;
    }

    private static List<Integer> convertToIntList(final String input) {
        return Arrays.stream(StringUtils.split(input, "\n"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }


}
