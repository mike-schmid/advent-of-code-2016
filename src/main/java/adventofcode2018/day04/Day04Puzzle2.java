package adventofcode2018.day04;

import adventofcode2018.day04.helper.GuardCreationHelper;
import adventofcode2018.day04.model.Guard;

import java.util.Comparator;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day04Puzzle2 {

    public static int solve(final List<String> input) {

        return GuardCreationHelper.createGuardMap(input)
                .values()
                .stream()
                .max(Comparator.comparing(Guard::getSleepyMinuteCount))
                .map(guard -> guard.getId() * guard.getSleepyMinute())
                .orElse(-1);
    }




}
