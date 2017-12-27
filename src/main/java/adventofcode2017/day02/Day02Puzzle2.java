package adventofcode2017.day02;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle2 {

    public static int solve(final String input) {

        final String[] lines = StringUtils.split(input, "\n");
        int sum = 0;

        for (String line : lines) {
            final List<Integer> rows = convertToIntList(line);
            sum += processRow(rows);
        }

        return sum;
    }

    private static int processRow(List<Integer> rows) {
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j <rows.size(); j++) {
                if (i == j) {
                    continue;
                }

                if (rows.get(i) % rows.get(j) == 0) {
                    return rows.get(i) / rows.get(j);
                }
            }
        }
        return 0;
    }

    private static List<Integer> convertToIntList(final String input) {
        return Arrays.stream(StringUtils.split(input, "\t"))
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());
    }

}