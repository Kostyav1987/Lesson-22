package by.overone.lesson22;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static boolean isUnique(Map<String, String> input) {
        Collection<String> values = input.values();

        for (String names : values) {
            Iterator<String> wordList = values.iterator();
            int repeat = 0;

            if (wordList.hasNext()) {
                if (wordList.next().equals(names)) {
                    repeat++;
                }
            }
            if (repeat > 1) {
                return false;
            }
        }
        return true;
    }
}
