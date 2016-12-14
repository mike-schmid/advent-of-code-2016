package adventofcode.day13;

import org.xguzm.pathfinding.grid.GridCell;

/**
 * @author Mike Schmid
 */
public class GridFactory {

    public static GridCell[][] createCells(final int width, final int height, final int seed) {

        final GridCell[][] cells = new GridCell[width][height];

        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                int value = (x * x + 3 * x + 2 * x * y + y + y * y) + seed;
                final boolean isWalkable = Integer.bitCount(value) % 2 == 0;
                cells[x][y] = new GridCell(x, y, isWalkable);
            }
        }

        return cells;
    }

}
