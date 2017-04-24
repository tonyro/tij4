package net.tonyrovba.tij.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by arovba on 4/24/17.
 *
 * Util class with generic methods for List objects
 *
 */

public class ListHelper {
    public static List<Integer> fillInListWithInts(int numberOfElements) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }
}
