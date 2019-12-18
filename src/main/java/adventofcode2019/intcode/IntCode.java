package adventofcode2019.intcode;

import java.util.List;
import java.util.stream.Collectors;

public class IntCode {


    public static int executeString(final List<String> input) {
        List<Integer> ints = input.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        return execute(ints);
    }

    public static int execute(final List<Integer> ints) {
        for (int i = 0; i < ints.size() - 4; i += 4) {

            int opCode = ints.get(i);

            if (opCode == 99) {
                break;
            }

            int resultPosition = ints.get(i + 3);
            int op1pos = ints.get(i + 1);
            int op2pos = ints.get(i + 2);

            if (opCode == 1) {
                int sum = ints.get(op1pos) + ints.get(op2pos);
                ints.set(resultPosition, sum);
            } else if (opCode == 2) {
                int product = ints.get(op1pos) * ints.get(op2pos);
                ints.set(resultPosition, product);
            } else {
                throw new IllegalArgumentException("Program is not valid. Unknown opCode " + opCode);
            }

        }

        return ints.get(0);
    }

}
