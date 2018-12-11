package adventofcode2018.day04.helper;

import adventofcode2018.day04.model.Guard;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GuardCreationHelper {

    public static Map<Integer, Guard> createGuardMap(List<String> input) {
        final List<String> list = input.stream().sorted().collect(Collectors.toList());

        final Map<Integer, Guard> guards = new HashMap<>();

        Guard currentGuard = null;
        for (int i = 0; i < list.size() - 1; i++) {
            final String currentLine = list.get(i);
            final String nextLine = list.get(i + 1);

            if (StringUtils.contains(currentLine, "begins shift")) {
                final int guardId = Integer.parseInt(StringUtils.substringBetween(currentLine, "#", " begins"));
                currentGuard = guards.computeIfAbsent(guardId, Guard::new);
            }

            if (StringUtils.contains(currentLine, "falls asleep")) {
                final int startSleep = Integer.parseInt(StringUtils.substringBetween(currentLine, ":", "]"));
                final int endSleep = Integer.parseInt(StringUtils.substringBetween(nextLine, ":", "]"));
                currentGuard.logSleep(startSleep, endSleep);
            }

        }
        return guards;
    }
}
