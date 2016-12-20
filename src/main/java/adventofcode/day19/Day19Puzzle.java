package adventofcode.day19;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
public class Day19Puzzle {

    public static int solve(final int n) {

        // https://www.youtube.com/watch?v=uCsD3ZGzMgE
        final String binaryN = Integer.toBinaryString(n);
        final String binaryResult = StringUtils.substring(binaryN, 1) + "1";
        return Integer.parseInt(binaryResult, 2);
    }

}
