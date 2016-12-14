package adventofcode.day12;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mike Schmid
 */
public class Day12Puzzle {

    public static int solve(final String input) {
        return solve(input, 0);
    }

    public static int solve(final String input, final int registerCStartValue){
        final Map<String, Integer> register = new HashMap<>();
        register.put("a", 0);
        register.put("b", 0);
        register.put("c", registerCStartValue);
        register.put("d", 0);

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i).startsWith("jnz")) {
                final String currentLine = lines.get(i);
                final String checkValueString = StringUtils.substringBetween(currentLine, "jnz ", " ");
                final Integer distance = Integer.valueOf(StringUtils.substringAfterLast(currentLine, " "));

                final int possibleNewValue;
                if (register.containsKey(checkValueString)) {
                    possibleNewValue = register.get(checkValueString);
                } else {
                    possibleNewValue = Integer.valueOf(checkValueString);
                }

                if (possibleNewValue != 0) {
                    i += distance;
                    if (i >= lines.size()) {
                        break;
                    }
                }

            }

            final String line = lines.get(i);

            if (line.startsWith("inc")) {
                final String currentRegister = StringUtils.substringAfter(line, "inc ");
                register.put(currentRegister, register.get(currentRegister) + 1);
                continue;
            }

            if (line.startsWith("dec")) {
                final String currentRegister = StringUtils.substringAfter(line, "dec ");
                register.put(currentRegister, register.get(currentRegister) - 1);
                continue;
            }

            if (line.startsWith("cpy")) {
                final String source = StringUtils.substringBetween(line, "cpy ", " ");
                final String targetRegister = StringUtils.substringAfterLast(line, " ");

                if (register.containsKey(source)) {
                    register.put(targetRegister, register.get(source));
                } else {
                    register.put(targetRegister, Integer.valueOf(source));
                }

            }

        }


        return register.get("a");
    }

}


