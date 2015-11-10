package net.tonyrovba.tij.utils;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by arovba on 11/9/15.
 */
public class WordsGenerator {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

    public static ArrayList<String> generateRandomWords(int wordsCount, int wordsLength) {
        Random random = new Random();
        char[] word = new char[wordsLength];
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            for (int j = 0; j < wordsLength; j++) {
                word[j] = LETTERS.charAt(random.nextInt(26));
            }
            words.add(String.valueOf(word));
        }
        return words;
    }
}
