package adventofcode.day05;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle2 {

    public static String solve(final String input) {

        final HashSupplier hashSupplier = new HashSupplier(input);
        final StringBuilder result = new StringBuilder("________");
        final Set<String> replacedPos = new HashSet<>();

        while (replacedPos.size() < 8) {
            String hash = hashSupplier.get();

            if (StringUtils.startsWith(hash, "00000")) {
                final String posString = StringUtils.substring(hash, 5, 6);

                if (shouldReplace(replacedPos, posString)) {
                    final int newPos = Integer.valueOf(posString);
                    final String newString = StringUtils.substring(hash, 6, 7);

                    result.setCharAt(newPos, newString.charAt(0));
                    replacedPos.add(posString);
                }
            }
        }

        return result.toString();
    }

    private static boolean shouldReplace(Set<String> replacedPos, String posString) {
        return StringUtils.isNumeric(posString) && Integer.valueOf(posString) < 8 && !replacedPos.contains(posString);
    }

}


