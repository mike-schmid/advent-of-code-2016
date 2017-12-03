package adventofcode2016.day16;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
public class Day16Puzzle {

    public static String solve(final String initialState, final int length) {

        String result = initialState;
        while (StringUtils.length(result) < length) {
            final String reversed = StringUtils.reverse(result);
            final String b = StringUtils.replaceEach(reversed, new String[]{"1", "0"}, new String[]{"0", "1"});
            result = result + "0" + b;
        }

        String data = StringUtils.left(result, length);
        StringBuilder checksum = new StringBuilder(length);

        while (checksum.length() % 2 == 0) {

            checksum = new StringBuilder();
            Iterable<String> pieces = Splitter.fixedLength(2).split(data);
            for (String piece : pieces) {
                if (StringUtils.equals(piece, "00") || StringUtils.equals(piece, "11")) {
                    checksum.append(1);
                } else {
                    checksum.append(0);
                }
            }

            data = checksum.toString();
        }


        return checksum.toString();
    }

}
