package adventofcode2016.day03;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Mike Schmid
 */
public class Day03Puzzle2 {

    public static long solve(final String input) {
        long validTirangels = 0;
        final List<String> lines = Arrays.asList(StringUtils.split(input));

        final Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            List<Integer> intList1 = new ArrayList<>();
            List<Integer> intList2 = new ArrayList<>();
            List<Integer> intList3 = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                intList1.add(Integer.valueOf(iterator.next()));
                intList2.add(Integer.valueOf(iterator.next()));
                intList3.add(Integer.valueOf(iterator.next()));
            }

            if (isValidTriangle(intList1))
                validTirangels++;

            if (isValidTriangle(intList2))
                validTirangels++;

            if (isValidTriangle(intList3))
                validTirangels++;

        }

        return validTirangels;
    }

    private static boolean isValidTriangle(List<Integer> list) {
        Collections.sort(list);
        return list.get(0) + list.get(1) > list.get(2);
    }

}


