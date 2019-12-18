package adventofcode2019.day02;

import adventofcode2019.intcode.IntCode;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle {

    public static int solve(final List<String> input) {
            return IntCode.executeString(input);
    }

}
