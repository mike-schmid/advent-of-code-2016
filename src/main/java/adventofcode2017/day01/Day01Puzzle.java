package adventofcode2017.day01;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle {

    public static int solve(final String input) {

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            final char currentChar = input.charAt(i);
            final char nextChar = input.charAt((i + 1) % input.length());

            if(currentChar == nextChar){
                sum += Character.getNumericValue(currentChar);
            }
        }

        return sum;
    }

}
