package net.tonyrovba.tij.holdingobjects.Ex21;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.util.*;

/**
 * Created by arovba on 11/22/15.
 * <p>
 * (3) Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the occurrence
 * of words in a file. Sort the results using Collections.sort( ) with a second argument of String.CASE_INSENSITIVE_ORDER
 * (to produce an alphabetic sort), and display the result.
 */
public class Ex21Main {
    public static void main(String[] args) {
        final String fileName = "UniqueWords.txt";
        ArrayList<String> words = WordsGenerator.getWordsFromFile(fileName);
        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words)
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }

        System.out.println(wordsCount);
        List<String> keys = new LinkedList<>(wordsCount.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);

        String print = "{";

        for (String key: keys)
            print += key + "=" + wordsCount.get(key) + ", ";

        print += "}";

        System.out.println(print);
        System.out.println(wordsCount.size());
    }
}
