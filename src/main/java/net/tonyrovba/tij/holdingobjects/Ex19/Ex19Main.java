package net.tonyrovba.tij.holdingobjects.Ex19;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by arovba on 11/10/15.
 *
 * (2) Repeat the previous exercise with a HashSet and LinkedHashSet.
 *
 */

public class Ex19Main {
    public static void main(String[] args) {
        int count = 6;
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        ArrayList<String> words = WordsGenerator.generateRandomWords(count, count);

        System.out.println("Words: " + words);

        hashSet.addAll(words);
        System.out.println("HashSet: " + hashSet);

        linkedHashSet.addAll(words);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
