package adventofcode.day06;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Mike Schmid
 */
public class Day06Puzzle {

    public static String solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        final List<Map<Character, Integer>> columns = new ArrayList<>();
        for (int i = 0; i < lines.get(0).length(); i++) {
            columns.add(new HashMap<>());
        }

        for (String line : lines) {
            final char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                final Map<Character, Integer> columnFrequency = columns.get(i);
                final char churrentChar = chars[i];

                if(columnFrequency.containsKey(churrentChar)){
                    columnFrequency.put(churrentChar, columnFrequency.get(churrentChar) + 1);
                } else {
                    columnFrequency.put(churrentChar, 1);
                }
            }
        }

        final StringBuilder result = new StringBuilder();
        for (Map<Character, Integer> column : columns) {
            Map.Entry<Character, Integer> top = null;
            for (Map.Entry<Character, Integer> entry : column.entrySet()) {
                if(top == null || entry.getValue() > top.getValue()){
                    top = entry;
                }
            }
            result.append(top.getKey());
        }

        return result.toString();
    }

}


