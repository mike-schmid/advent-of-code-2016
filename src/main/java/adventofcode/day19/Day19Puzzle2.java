package adventofcode.day19;

import java.util.ArrayDeque;

/**
 * @author Mike Schmid
 */
public class Day19Puzzle2 {

    public static int solve(final int n) {

        final ArrayDeque<Integer> leftHalf = new ArrayDeque<>();
        for (int i = 0; i <= n / 2; i++) {
            leftHalf.addLast(i);
        }

        final ArrayDeque<Integer> rightHalf = new ArrayDeque<>();
        for (int i = n / 2 + 1; i <= n; i++) {
            rightHalf.addLast(i);
        }

        while (leftHalf.size() + rightHalf.size() > 1) {
            rightHalf.pop();
            rightHalf.addLast(leftHalf.pop());

            if ((leftHalf.size() + rightHalf.size()) % 2 == 0) {
                leftHalf.addLast(rightHalf.pop());
            }
        }

        return rightHalf.pop();

    }

}
