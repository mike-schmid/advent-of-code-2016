package adventofcode2016.day05;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mike Schmid
 */
public class Day05Puzzle {

    public static String solve(final String input) {

        return Stream.iterate(0, i -> i + 1)
                .map(i -> input + i)
                .map(DigestUtils::md5Hex)
                .filter(hash -> StringUtils.startsWith(hash, "00000"))
                .limit(8)
                .map(hash -> hash.charAt(5))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}