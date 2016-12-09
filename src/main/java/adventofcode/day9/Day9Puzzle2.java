package adventofcode.day9;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day9Puzzle2 {

    public static long solve(String input) {

        long result = 0;
        List<Pair<Integer, Integer>> modifiers = new ArrayList<>();

        while (StringUtils.isNotEmpty(input)) {
            if (StringUtils.startsWith(input, "(")) {
                final Integer length = Integer.valueOf(StringUtils.substringBetween(input, "(", "x"));
                final Integer times = Integer.valueOf(StringUtils.substringBetween(input, "x", ")"));
                final int bracketLength = ("(" + length + "x" + times + ")").length();

                input = StringUtils.substringAfter(input, ")");
                modifiers = updateModifier(modifiers, bracketLength);
                modifiers.add(Pair.of(length, times));
            } else {
                input = StringUtils.substring(input, 1);
                result += getCombinedModifier(modifiers);
                modifiers = updateModifier(modifiers, 1);
            }
        }

        return result;
    }

    private static List<Pair<Integer, Integer>> updateModifier(List<Pair<Integer, Integer>> modifiers, int steps) {

        final List<Pair<Integer, Integer>> newModifiers = new ArrayList<>();
        for (Pair<Integer, Integer> pair : modifiers) {
            newModifiers.add(Pair.of(pair.getLeft() - steps, pair.getRight()));
        }
        newModifiers.removeIf(pair -> pair.getLeft() <= 0);

        return newModifiers;
    }

    private static long getCombinedModifier(List<Pair<Integer, Integer>> modifiers) {
        return modifiers.stream()
                .mapToInt(Pair::getRight)
                .reduce(1, (a, b) -> a * b);
    }

}