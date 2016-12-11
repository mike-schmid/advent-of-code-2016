package adventofcode.day10;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mike Schmid
 */
public class Day10Puzzle {

    private static final Map<Integer, Bot> bots = new HashMap<>();
    private static final Map<Integer, Bot> outputs = new HashMap<>();


    public static int solve(final String input, final int targetMin, final int targetMax) {

        final List<String> lines = Arrays.asList(StringUtils.split(input, '\n'));

        initBotsAndOutputs(lines);
        initBotRules(lines);

        int result = -1;
        for (String line : lines) {
            if (StringUtils.startsWith(line, "value")) {
                final int value = Integer.valueOf(StringUtils.substringBetween(line, "value ", " goes"));
                final int targetBot = Integer.valueOf(StringUtils.substringAfterLast(line, "bot "));
                result = bots.get(targetBot).processValue(value, result, targetMin, targetMax);
                if (result != -1) {
                    break;
                }
            }
        }

        return result;
    }

    private static void initBotRules(final List<String> lines) {
        lines.forEach(line -> {

            if (StringUtils.startsWith(line, "bot")) {
                final int botId = Integer.valueOf(StringUtils.substringBetween(line, "bot ", " gives"));
                final Bot bot = bots.get(botId);

                int lowTarget;
                if (StringUtils.contains(line, "low to output")) {
                    lowTarget = Integer.valueOf(StringUtils.substringBetween(line, "low to output ", " and"));
                    bot.setLowTarget(outputs.get(lowTarget));
                } else {
                    lowTarget = Integer.valueOf(StringUtils.substringBetween(line, "low to bot ", " and"));
                    bot.setLowTarget(bots.get(lowTarget));
                }

                int highTarget;
                if (StringUtils.contains(line, "high to output")) {
                    highTarget = Integer.valueOf(StringUtils.substringAfterLast(line, "high to output "));
                    bot.setHighTarget(outputs.get(highTarget));
                } else {
                    highTarget = Integer.valueOf(StringUtils.substringAfterLast(line, "high to bot "));
                    bot.setHighTarget(bots.get(highTarget));
                }
            }
        });
    }

    private static void initBotsAndOutputs(final List<String> lines) {
        lines.forEach(line -> {
            if (StringUtils.startsWith(line, "bot")) {
                final int botId = Integer.valueOf(StringUtils.substringBetween(line, "bot ", " gives"));
                bots.put(botId, new Bot(false, botId));

                if (StringUtils.contains(line, "output")) {

                    int outputId;
                    if (StringUtils.contains(line, "low to output ")) {
                        outputId = Integer.valueOf(StringUtils.substringBetween(line, "low to output ", " and"));
                        outputs.put(outputId, new Bot(true, outputId));
                    }

                    if (StringUtils.contains(line, "high to output")) {
                        outputId = Integer.valueOf(StringUtils.substringAfterLast(line, "high to output "));
                        outputs.put(outputId, new Bot(true, outputId));
                    }

                }

            }
        });
    }

}