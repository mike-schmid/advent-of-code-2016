package adventofcode2018.day05.helper;

import org.apache.commons.lang3.StringUtils;

public class PolymerReductionHelper {

    public static int calculateReducedLength(String input, String[] searchList, String[] emptyElementList) {
        String previousString = input;
        while (true) {
            final String newString = StringUtils.replaceEach(previousString, searchList, emptyElementList);
            if (newString.equals(previousString)) {
                return newString.length();
            }
            previousString = newString;
        }
    }
}
