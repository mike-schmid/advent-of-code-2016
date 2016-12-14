package adventofcode.day13;

import org.apache.commons.lang3.tuple.Pair;
import org.xguzm.pathfinding.grid.GridCell;
import org.xguzm.pathfinding.grid.NavigationGrid;
import org.xguzm.pathfinding.grid.finders.AStarGridFinder;
import org.xguzm.pathfinding.grid.finders.GridFinderOptions;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day13Puzzle2 {

    public static int solve(final Pair<Integer, Integer> startPos, final int maxSteps, int seed) {
        final GridCell[][] cells = GridFactory.createCells(maxSteps, maxSteps, seed);

        final NavigationGrid<GridCell> navGrid = new NavigationGrid<>(cells, true);
        final GridFinderOptions opt = new GridFinderOptions();
        opt.allowDiagonal = false;

        final AStarGridFinder<GridCell> finder = new AStarGridFinder<>(GridCell.class, opt);

        int result = 0;
        for (int x = 0; x < maxSteps; x++) {
            for (int y = 0; y < maxSteps; y++) {
                final List<GridCell> pathToEnd = finder.findPath(startPos.getLeft(), startPos.getRight(), x, y, navGrid);
                if (pathToEnd != null && pathToEnd.size() <= maxSteps) {
                    result++;
                }
            }
        }

        return result;
    }


}


