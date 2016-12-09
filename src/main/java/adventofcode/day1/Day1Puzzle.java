package adventofcode.day1;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day1Puzzle {

    public static int solve(List<String> list) {
        int blocksAway = 0;
        int currentDirection = 0;

        for (String s : list) {
            int walkDistance = Integer.valueOf(StringUtils.substring(s, 1));

            if (StringUtils.startsWith(s, "R")) {
                currentDirection = (currentDirection + 1) % 4;
            } else {
                currentDirection = (currentDirection + 3) % 4;
            }

            if (currentDirection <= 1) {
                blocksAway += walkDistance;
            } else {
                blocksAway -= walkDistance;
            }
        }

        return Math.abs(blocksAway);
    }

}
