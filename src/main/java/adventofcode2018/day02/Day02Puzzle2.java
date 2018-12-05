package adventofcode2018.day02;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle2 {

    public static String solve(final List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                final int diffIndex = getDiffIndex(input.get(i), input.get(j));
                if (diffIndex >= 0) {
                    return new StringBuilder(input.get(i)).deleteCharAt(diffIndex).toString();
                }
            }
        }

        return "No solution found...";
    }

    /*
     * Returns the index of a diff if there is exactly one diff (otherwise returns -1*)
     */
    private static int getDiffIndex(String str1, String str2) {

        int diffIndex = -1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (diffIndex != -1) { // we found 2 diffs
                    return -1;
                } else {
                    diffIndex = i;
                }
            }
        }

        return diffIndex;
    }

}
