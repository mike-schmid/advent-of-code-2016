package adventofcode2018.day03;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day03Puzzle2 {

    private static final int GRID_SIZE = 1000;

    public static int solve(final List<String> input) {

        final int[][] grid = new int[GRID_SIZE][GRID_SIZE];

        for (int x = 0; x < GRID_SIZE; x++) {
            for (int y = 0; y < GRID_SIZE; y++) {
                grid[x][y] = 0;
            }
        }

        for (String claim : input) {
            final int posX = Integer.parseInt(StringUtils.substringBetween(claim, " @ ", ","));
            final int posY = Integer.parseInt(StringUtils.substringBetween(claim, ",", ": "));
            final int width = Integer.parseInt(StringUtils.substringBetween(claim, ": ", "x"));
            final int height = Integer.parseInt(StringUtils.substringAfterLast(claim, "x"));

            for (int x = posX; x < posX + width; x++) {
                for (int y = posY; y < posY + height; y++) {
                    grid[x][y]++;
                }
            }
        }

        iterateClaims: for (String claim : input) {
            final int posX = Integer.parseInt(StringUtils.substringBetween(claim, " @ ", ","));
            final int posY = Integer.parseInt(StringUtils.substringBetween(claim, ",", ": "));
            final int width = Integer.parseInt(StringUtils.substringBetween(claim, ": ", "x"));
            final int height = Integer.parseInt(StringUtils.substringAfterLast(claim, "x"));

            for (int x = posX; x < posX + width; x++) {
                for (int y = posY; y < posY + height; y++) {
                    if(grid[x][y] != 1){
                        continue iterateClaims;
                    }
                }
            }

            return Integer.parseInt(StringUtils.substringBetween(claim, "#", " @"));

        }

        return -12;
    }


}
