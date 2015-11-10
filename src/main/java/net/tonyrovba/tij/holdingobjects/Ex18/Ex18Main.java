package net.tonyrovba.tij.holdingobjects.Ex18;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.util.*;

/**
 * Created by arovba on 11/9/15.
 */
public class Ex18Main {
    public static void main(String[] args) {
        int count = 5;
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<String> words = WordsGenerator.generateRandomWords(count, count);

        System.out.println("Words: " + words);

        for (int i = 0; i < count; i++) {
            hashMap.put(words.get(i), i);
        }

        System.out.println("HashMap: " + hashMap);

        ArrayList<String> keys = new ArrayList<>(hashMap.keySet());
        System.out.println("List of keys: " + keys);

        Collections.sort(keys);
        System.out.println("Sorted keys: " + keys);

        for (String key: keys)
            linkedHashMap.put(key, hashMap.get(key));

        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}