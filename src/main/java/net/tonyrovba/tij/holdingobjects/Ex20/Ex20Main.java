package net.tonyrovba.tij.holdingobjects.Ex20;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.io.File;
import java.security.CodeSource;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by arovba on 11/10/15.
 *
 * (3) Modify Exercise 16 from this package so that you keep a count of the occurrence of each vowel.
 *
 */

public class Ex20Main {
    static Map<Character,Integer> eachVowelCount = new HashMap<>();

    static {
        eachVowelCount.put('a', 0);
        eachVowelCount.put('e', 0);
        eachVowelCount.put('i', 0);
        eachVowelCount.put('o', 0);
        eachVowelCount.put('u', 0);
        eachVowelCount.put('y', 0);
    }


    public static void main(String[] args) {
        final char[] VOWELS_STRING = "aeiouy".toCharArray();
        final String fileName = "UniqueWords.txt";
        ArrayList<String> words = WordsGenerator.getWordsFromFile(fileName);
        int overallVowelsCount = 0;

        Set<Character> vowels = new HashSet<>();
        for (char ch: VOWELS_STRING)
            vowels.add(ch);

        for (String word: words){
            int wordVowelsCount = 0;
            String normilizedWord = word.toLowerCase();
            for (int i = 0; i < normilizedWord.length(); i++) {
                Character character = normilizedWord.charAt(i);
                if (vowels.contains(character)) {
                    wordVowelsCount++;
                    overallVowelsCount++;
                    eachVowelCount.put(character, eachVowelCount.get(character) + 1);
                }
            }
            System.out.println("Word: [ " + word + " ] contains [ " + wordVowelsCount + " ] vowel(s).");
        }

        System.out.println("All words contain [ " + overallVowelsCount + " ] vowel(s).");
        System.out.println(eachVowelCount);
    }
}
