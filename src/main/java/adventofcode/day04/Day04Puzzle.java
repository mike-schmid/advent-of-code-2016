package adventofcode.day04;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Mike Schmid
 */
public class Day04Puzzle {

    public static long solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));


        final Comparator<Map.Entry<Character, Long>> byFrequency = Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        final Comparator<Map.Entry<Character, Long>> byAlphabet = Comparator.comparing(Map.Entry::getKey);

        long total = 0;
        for (String line : lines) {

            final String word = StringUtils.remove(StringUtils.substringBeforeLast(line, "-"), "-");

            final String hash = word.chars()
                    .mapToObj(i -> (char) i)
                    .collect(
                            Collectors.groupingBy(
                                    Function.identity(), Collectors.counting()
                            )
                    )
                    .entrySet()
                    .stream()
                    .sorted(byFrequency.thenComparing(byAlphabet))
                    .limit(5)
                    .map(entry -> String.valueOf(entry.getKey()))
                    .collect(Collectors.joining());

            if(StringUtils.contains(line, "[" + hash + "]")){
                String roomId = StringUtils.substringAfterLast(line,"-");
                roomId = StringUtils.substringBeforeLast(roomId, "[");
                total += Integer.valueOf(roomId);
            }

        }

        return total;
    }
}


