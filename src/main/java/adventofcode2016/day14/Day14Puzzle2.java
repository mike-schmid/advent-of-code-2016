package adventofcode2016.day14;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mike Schmid
 */
public class Day14Puzzle2 {

    public static final Pattern TRIPLES = Pattern.compile(".*?(.)\\1{2}.*");
    public static final Pattern QUINTUPLES = Pattern.compile(".*?(.)\\1{4}.*");

    public static int solve(final String salt) {

        final Multimap<String, Integer> triples = ArrayListMultimap.create();
        final Set<Integer> foundKeys = new TreeSet<>();

        int index = 0;
        int additionalIterations = 1000;

        while (true) {

            final String hash = getHash(salt + index);

            final Matcher tripleMatcher = TRIPLES.matcher(hash);
            if (tripleMatcher.matches()) {

                final Matcher quintupleMatcher = QUINTUPLES.matcher(hash);
                if (quintupleMatcher.matches()) {

                    final String character = quintupleMatcher.group(1);
                    final Collection<Integer> lastOccurences = triples.get(character);

                    for (int lastOccurence : lastOccurences) {
                        if (index - lastOccurence < 1000) {
                            foundKeys.add(lastOccurence);
                        }
                    }
                }

                triples.put(tripleMatcher.group(1), index);
            }

            if (foundKeys.size() >= 64) {
                additionalIterations--;
                if (additionalIterations == 0) {
                    return new ArrayList<>(foundKeys).get(63);
                }
            }

            index++;
        }

    }

    private static String getHash(String hash) {

        for (int i = 0; i < 2017; i++) {
            hash = DigestUtils.md5Hex(hash);
        }

        return hash;
    }
}





