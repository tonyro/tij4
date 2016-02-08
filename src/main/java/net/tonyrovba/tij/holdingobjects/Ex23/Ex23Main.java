package net.tonyrovba.tij.holdingobjects.Ex23;

import net.tonyrovba.tij.utils.WordsGenerator;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tonnur on 2/8/16.
 */
public class Ex23Main {
    public static void main(String[] args) {
        ArrayList<String> words = WordsGenerator.getWordsFromString(Statistics.generate());
        Map<Integer, Integer> numbersCount = new HashMap<>();

        for (String word : words)
            if (StringUtils.isNumeric(word)) {
                Integer number = Integer.parseInt(word);
                if (numbersCount.containsKey(number))
                    numbersCount.put(number, numbersCount.get(number) + 1);
                else
                    numbersCount.put(number, 1);
            }

        for (Integer number : numbersCount.keySet())
            if (numbersCount.get(number) > 1)
                System.out.println(number + " : " + numbersCount.get(number));
    }
}
