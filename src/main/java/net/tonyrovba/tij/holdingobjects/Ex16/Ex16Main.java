package net.tonyrovba.tij.holdingobjects.Ex16;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.io.File;
import java.security.CodeSource;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by arovba on 11/8/15.
 *
 * (5) Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels
 * in each input word, and also display the total number of vowels in the input file.
 *
 */

public class Ex16Main {
    public static void main(String[] args) {
        final char[] VOWELS_STRING = "AEIOUYaeiouy".toCharArray();
        final String fileName = "UniqueWords.txt";
        ArrayList<String> words = WordsGenerator.getWordsFromFile(fileName);
        int overallVowelsCount = 0;

        Set<Character> vowels = new HashSet<>();
        for (char ch: VOWELS_STRING)
            vowels.add(ch);

        for (String word: words){
            int wordVowelsCount = 0;

            for (int i = 0; i < word.length(); i++)
                if (vowels.contains(word.charAt(i))){
                    wordVowelsCount++;
                    overallVowelsCount++;
                }
            System.out.println("Word: [ " + word + " ] contains [ " + wordVowelsCount + " ] vowel(s).");
        }

        System.out.println("All words contain [ " + overallVowelsCount + " ] vowel(s).");
    }
}
