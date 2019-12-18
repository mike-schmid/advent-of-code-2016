package adventofcode2019.day02;

import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Supplier;

public class PairSupplier implements Supplier<Pair<Integer, Integer>> {

    private int noun = 0;
    private int verb = -1;
    private boolean shouldIncreaseNoun;

    @Override
    public Pair<Integer, Integer> get() {

        if (noun == 99 && verb == 99) {
            throw new IllegalStateException("no solution...");
        }

        if (shouldIncreaseNoun) {
            noun++;
            shouldIncreaseNoun = false;
            return Pair.of(noun, verb);
        }

        if (verb == 99) {
            verb = 0;
            shouldIncreaseNoun = true;
        } else {
            verb++;
        }

        return Pair.of(noun, verb);
    }


}
