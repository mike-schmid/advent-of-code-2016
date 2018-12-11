package adventofcode2018.day05.helper;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static String[] generateEmptyElementList(final int length) {

        final String[] emptyArray = new String[length];
        for (int i = 0; i < length; i++) {
            emptyArray[i] = StringUtils.EMPTY;
        }

        return emptyArray;
    }

    public static String[] generateSearchList() {

        final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        final String upperCase = lowerCase.toUpperCase();

        final List<String> pairs = new ArrayList<>();
        for (int i = 0; i < lowerCase.length(); i++) {
            pairs.add("" + lowerCase.charAt(i) + upperCase.charAt(i));
            pairs.add("" + upperCase.charAt(i) + lowerCase.charAt(i));
        }

        return pairs.toArray(new String[0]);
    }
}
