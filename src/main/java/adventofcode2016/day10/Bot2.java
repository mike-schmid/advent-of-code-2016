package adventofcode2016.day10;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Mike Schmid
 */
@Data
@RequiredArgsConstructor
public class Bot2 {

    private final boolean isOutput;
    private final int id;
    private Bot2 lowTarget;
    private Bot2 highTarget;
    private List<Integer> values = new ArrayList<>();

    public void processValue(final int value) {

        values.add(value);

        if (values.size() == 2 && !isOutput) {

            final Integer min = Collections.min(values);
            final Integer max = Collections.max(values);

            values.clear();
            lowTarget.processValue(min);
            highTarget.processValue(max);
        }

    }

}
