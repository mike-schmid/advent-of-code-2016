package adventofcode2016.day22;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day22Puzzle {

    public static int solve(final String input) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));
        final List<Node> nodes = new ArrayList<>();

        lines.forEach(line -> {

            if (StringUtils.startsWith(line, "/dev")) {
                nodes.add(new Node(line));
            }

        });

        int pairs = 0;
        for (int i = 0; i < nodes.size(); i++) {
            final Node a = nodes.get(i);
            if(a.getUsed() <= 0){
                continue;
            }

            for (int j = 0; j < nodes.size(); j++) {
                final Node b = nodes.get(j);
                if(i != j && a.getUsed() < b.getAvailable()){
                    pairs++;
                }
            }

        }

        return pairs;

    }


}
