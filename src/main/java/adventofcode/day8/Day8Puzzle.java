package adventofcode.day8;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class Day8Puzzle {
    private static final char DEAD = '.';
    private static final char ALIVE = '#';

    public static long solve(final String input, final int width, final int height) {
        return calculateRotations(input, width, height).stream()
                .mapToInt(s -> StringUtils.countMatches(s, ALIVE))
                .sum();

    }

    public static List<String> calculateRotations(final String input, final int width, final int height){
        final List<String> board = createBoard(width, height);
        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        for (String line : lines) {

            if (StringUtils.startsWith(line, "rect")) {
                final Integer x = Integer.valueOf(StringUtils.substringAfterLast(line, "x"));
                final Integer y = Integer.valueOf(StringUtils.substringBetween(line, "rect ", "x"));
                fillRect(board, x, y);
            } else if (StringUtils.startsWith(line, "rotate row")) {
                final Integer row = Integer.valueOf(StringUtils.substringBetween(line, "y=", " by"));
                final Integer distance = Integer.valueOf(StringUtils.substringAfterLast(line, "by "));
                shiftRow(board, row, distance % width);
            } else if (StringUtils.startsWith(line, "rotate column")) {
                final Integer column = Integer.valueOf(StringUtils.substringBetween(line, "x=", " by"));
                final Integer distance = Integer.valueOf(StringUtils.substringAfterLast(line, "by "));
                shiftColumn(board, column, distance % height);
            }

        }
        return board;
    }

    private static void shiftColumn(final List<String> board, final int column, final int distance) {
        if (distance != 0) {

            final List<Character> columnValues = new ArrayList<>();
            for (String row : board) {
                columnValues.add(row.charAt(column));
            }

            final int boardSize = board.size();
            for (int i = 0; i < boardSize; i++) {
                final StringBuilder sb = new StringBuilder(board.get(i));
                final int sourceRowIndex = ((i - distance % boardSize) + boardSize) % boardSize;
                final char newChar = columnValues.get(sourceRowIndex);
                sb.setCharAt(column, newChar);
                board.set(i, sb.toString());
            }

        }
    }

    private static void shiftRow(final List<String> board, final int row, final int distance) {
        if (distance != 0) {
            final String originalRow = board.get(row);
            final String newRow = StringUtils.right(originalRow, distance) + StringUtils.substring(originalRow, 0, originalRow.length() - distance);
            board.set(row, newRow);
        }
    }

    private static void fillRect(final List<String> board, final int x, final int y) {
        for (int i = 0; i < x; i++) {
            final char[] chars = board.get(i).toCharArray();
            for (int j = 0; j < y; j++) {
                chars[j] = ALIVE;
            }
            board.set(i, String.copyValueOf(chars));
        }
    }

    private static List<String> createBoard(int width, int height) {
        final List<String> board = new ArrayList<>(height);

        for (int i = 0; i < height; i++) {
            final StringBuilder row = new StringBuilder();
            for (int i1 = 0; i1 < width; i1++) {
                row.append(DEAD);
            }
            board.add(row.toString());
        }
        return board;
    }

}