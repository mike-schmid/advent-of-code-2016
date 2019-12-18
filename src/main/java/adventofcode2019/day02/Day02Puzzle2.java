package adventofcode2019.day02;

import adventofcode2019.intcode.IntCode;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mike Schmid
 */
public class Day02Puzzle2 {

    public static int solve(final List<String> input, final int target) {

        List<Integer> ints = input.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        PairSupplier pairSupplier = new PairSupplier();
        return Stream.generate(pairSupplier)
                .filter(pair -> IntCode.execute(getNewList(ints, pair)) == target)
                .findAny()
                .map(pair -> pair.getLeft() * 100 + pair.getRight())
                .orElseThrow();

    }

    private static List<Integer> getNewList(List<Integer> ints, Pair<Integer, Integer> pair) {
        List<Integer> newInts = new ArrayList<>(ints);
        newInts.set(1, pair.getLeft());
        newInts.set(2, pair.getRight());
        return newInts;
    }


}
