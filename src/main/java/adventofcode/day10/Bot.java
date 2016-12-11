package adventofcode.day10;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Mike Schmid
 */
@Data
@RequiredArgsConstructor
public class Bot {

    private final boolean isOutput;
    private final int id;
    private Bot lowTarget;
    private Bot highTarget;
    private List<Integer> values = new ArrayList<>();

    public int processValue(int value, int result, int targetMin, int targetMax) {

        values.add(value);
        int lowResult = result;
        int highResult = result;

        if (values.size() == 2 && !isOutput) {

            final Integer min = Collections.min(values);
            final Integer max = Collections.max(values);

            if (result == -1 && min == targetMin && max == targetMax) {
                result = id;
            }

            values.clear();
            lowResult = lowTarget.processValue(min, result, targetMin, targetMax);
            highResult = highTarget.processValue(max, result, targetMin, targetMax);

        }

        return Collections.max(Arrays.asList(result, lowResult, highResult));
    }

}
