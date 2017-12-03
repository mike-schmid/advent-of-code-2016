package adventofcode2016.day21;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day21Puzzle2 {

    public static String solve(final String commands, String input) {

        // TODO: find a more elegant solution then just brute force... I could not get my head around how to inverse the "rotate based on position of letter x" command. Brute force is fast enough for input length 8. So fts
        final List<String> permutations = permutate(input);
        for (String permutation : permutations) {
            if (StringUtils.equals(input, Day21Puzzle.solve(commands, permutation))) {
                return permutation;
            }
        }

        return "no Solution";
    }

    private static List<String> permutate(String str) {
        final List<String> permutations = new ArrayList<>((int) (long) CombinatoricsUtils.factorial(str.length()));
        permutate("", str, permutations);
        return permutations;
    }

    private static void permutate(String prefix, String str, List<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutate(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }


}
