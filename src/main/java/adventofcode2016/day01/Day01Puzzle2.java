package adventofcode2016.day01;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle2 {

    public static int solve(List<String> list) {

        int xPos = 0;
        int yPos = 0;
        int currentDirection = 0;
        final Set<String> visitedPositions = new HashSet<>();
        visitedPositions.add("0x0");

        for (String s : list) {

            int walkDistance = Integer.valueOf(StringUtils.substring(s, 1));

            if (StringUtils.startsWith(s, "R")) {
                currentDirection = (currentDirection + 1) % 4;
            } else {
                currentDirection = (currentDirection + 3) % 4;
            }

            for (int i = walkDistance; i > 0; i--) {

                switch (currentDirection) {
                    case 0:
                        yPos++;
                        break;
                    case 1:
                        xPos++;
                        break;
                    case 2:
                        yPos--;
                        break;
                    case 3:
                        xPos--;
                        break;
                    default:
                        throw new IllegalStateException("Something went wrong with the direction detection");
                }

                if (visitedPositions.contains(xPos + "x" + yPos)) {
                    return Math.abs(xPos) + Math.abs(yPos);
                }

                visitedPositions.add(xPos + "x" + yPos);
            }

        }

        return -1; // no solution
    }

}
