package adventofcode2017.day01;

/**
 * @author Mike Schmid
 */
public class Day01Puzzle2 {

    public static int solve(final String input) {

        int sum = 0;
        final int length = input.length();

        for (int i = 0; i < length; i++) {
            final char currentChar = input.charAt(i);
            final char nextChar = input.charAt((i + length / 2) % length);

            if(currentChar == nextChar){
                sum += Character.getNumericValue(currentChar);
            }
        }

        return sum;
    }

}
