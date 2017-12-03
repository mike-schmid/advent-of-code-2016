package adventofcode2016.day22;

import lombok.Value;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Mike Schmid
 */
@Value
public class Node {

    private final int x;
    private final int y;
    private final int size;
    private final int used;
    private final int available;

    public Node(final String line) {
        final String[] data = StringUtils.split(line);

        x = Integer.valueOf(StringUtils.substringBetween(data[0], "node-x", "-y"));
        y = Integer.valueOf(StringUtils.substringAfterLast(data[0], "-y"));

        size = Integer.valueOf(StringUtils.removeEnd(data[1], "T"));
        used = Integer.valueOf(StringUtils.removeEnd(data[2], "T"));
        available = Integer.valueOf(StringUtils.removeEnd(data[3], "T"));

    }
}
