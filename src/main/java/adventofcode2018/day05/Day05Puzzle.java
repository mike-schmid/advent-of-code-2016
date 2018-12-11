package adventofcode2018.day05;

import adventofcode2018.day05.helper.ListHelper;
import adventofcode2018.day05.helper.PolymerReductionHelper;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle {

    public static int solve(final String input) {
        final String[] searchList = ListHelper.generateSearchList();
        final String[] emptyElementList = ListHelper.generateEmptyElementList(searchList.length);
        return PolymerReductionHelper.calculateReducedLength(input, searchList, emptyElementList);

    }

}
