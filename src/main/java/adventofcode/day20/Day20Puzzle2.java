package adventofcode.day20;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Mike Schmid
 */
public class Day20Puzzle2 {

    public static long solve(final String blackList) {
        final List<String> lines = Arrays.asList(StringUtils.split(blackList, '\n'));

        final Map<Long, Long> ranges = new TreeMap<>();
        for (String line : lines) {
            final Long from = Long.valueOf(StringUtils.substringBefore(line, "-"));
            final Long to = Long.valueOf(StringUtils.substringAfter(line, "-"));
            ranges.put(from, to);
        }

        long currentMin = 0;
        long count = 0;

        for (Map.Entry<Long, Long> entry : ranges.entrySet()) {

            if(currentMin > entry.getKey()){
                if(currentMin < entry.getValue()){
                    currentMin = entry.getValue() + 1;
                }
                continue;
            }

            if(entry.getKey() != currentMin){

                while (currentMin < entry.getKey()){
                    count++;
                    currentMin++;
                }

            }

            currentMin = entry.getValue() + 1;
        }

        return count - 1 ;
    }

}
