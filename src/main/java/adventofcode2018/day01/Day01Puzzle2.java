package adventofcode2018.day01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle2 {

    public static int solve(final List<String> input) {
        final Set<Integer> visitedNumbers = new HashSet<>();

        int sum = 0;
        visitedNumbers.add(0);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            final int current = Integer.parseInt(input.get(i % input.size()));
            sum += current;
            if(visitedNumbers.contains(sum)){
                return sum;
            } else {
                visitedNumbers.add(sum);
            }
        }

        return sum;
    }

}
