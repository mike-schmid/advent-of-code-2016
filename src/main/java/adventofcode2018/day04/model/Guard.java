package adventofcode2018.day04.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class Guard {

    private final int id;

    private Map<Integer, Integer> sleepMinutes = new HashMap<>();
    private int totalSleepTime;

    public void logSleep(int startSleep, int endSleep) {
        for (int i = startSleep; i < endSleep; i++) {
            sleepMinutes.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
            totalSleepTime++;
        }
    }

    public int getSleepyMinute(){
        return sleepMinutes.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);
    }


    public int getSleepyMinuteCount(){
        return sleepMinutes.getOrDefault(getSleepyMinute(), 0);
    }


}
