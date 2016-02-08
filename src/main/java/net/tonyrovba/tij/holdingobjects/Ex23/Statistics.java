package net.tonyrovba.tij.holdingobjects.Ex23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by tonnur on 2/8/16.
 */
public class Statistics {

    public static String generate() {
        Random rand = new Random(47);
        Map<Integer, Integer> m =
                new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }

        return m.toString();
    }
}
