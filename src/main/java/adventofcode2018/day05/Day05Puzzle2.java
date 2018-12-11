package adventofcode2018.day05;

import adventofcode2018.day05.helper.ListHelper;
import adventofcode2018.day05.helper.PolymerReductionHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.IntStream;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle2 {

    public static int solve(final String input) {
        final String[] searchList = ListHelper.generateSearchList();
        final String[] emptyElementList = ListHelper.generateEmptyElementList(searchList.length);

        return IntStream.rangeClosed('a', 'z')
                .parallel()
                .mapToObj(i -> String.valueOf((char) i))
                .map(letter -> StringUtils.removeIgnoreCase(input, letter))
                .mapToInt(text -> PolymerReductionHelper.calculateReducedLength(text, searchList, emptyElementList))
                .min()
                .orElse(-1);

    }

}
