package adventofcode2016.day13;

import org.apache.commons.lang3.tuple.Pair;
import org.xguzm.pathfinding.grid.GridCell;
import org.xguzm.pathfinding.grid.NavigationGrid;
import org.xguzm.pathfinding.grid.finders.AStarGridFinder;
import org.xguzm.pathfinding.grid.finders.GridFinderOptions;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day13Puzzle {

    public static int solve(final Pair<Integer, Integer> startPos, final Pair<Integer, Integer> endPos, int seed) {
        final GridCell[][] cells = GridFactory.createCells(endPos.getLeft()*2, endPos.getRight()*2, seed);

        final NavigationGrid<GridCell> navGrid = new NavigationGrid<>(cells, true);
        final GridFinderOptions opt = new GridFinderOptions();
        opt.allowDiagonal = false;

        final AStarGridFinder<GridCell> finder = new AStarGridFinder<>(GridCell.class, opt);
        final List<GridCell> pathToEnd = finder.findPath(startPos.getLeft(), startPos.getRight(), endPos.getLeft(), endPos.getRight(), navGrid);

        return pathToEnd.size();
    }


}


