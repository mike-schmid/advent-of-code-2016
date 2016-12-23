package adventofcode.day21;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
public class CommandUtils {


    public static String swapLetters(String input, String x, String y) {
        return StringUtils.replaceEach(input, new String[]{x, y}, new String[]{y, x});
    }

    public static String move(String line, int from, int to) {

        final char character = line.charAt(from);

        final StringBuilder sb = new StringBuilder(line);
        sb.deleteCharAt(from);
        sb.insert(to, character);

        return sb.toString();
    }

    public static String reverse(String line, int from, int to) {

        to++;
        final String left = StringUtils.left(line, from);
        final String right = StringUtils.right(line, line.length() - to);
        final String center = StringUtils.substring(line, from, to);

        return left + StringUtils.reverse(center) + right;
    }

    public static String rotateStringBasedOn(String input, String character) {
        int offset = StringUtils.indexOf(input, character);

        if (offset >= 4) {
            offset += 1;
        }
        offset += 1;

        return rotateRight(input, offset);
    }

    public static String rotateRight(String line, int offset) {
        offset = offset % line.length();

        final String left = StringUtils.left(line, line.length() - offset);
        final String right = StringUtils.right(line, offset);

        return right + left;
    }

    public static String rotateLeft(String line, int offset) {
        offset = offset % line.length();

        final String left = StringUtils.left(line, offset);
        final String right = StringUtils.right(line, line.length() - offset);

        return right + left;
    }

    public static String swapPositionXWithY(String input, int x, int y) {
        char[] c = input.toCharArray();
        char temp = c[y];
        c[y] = c[x];
        c[x] = temp;

        return new String(c);
    }

}
