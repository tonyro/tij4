package net.tonyrovba.tij.holdingobjects.Ex16;

import java.io.File;
import java.security.CodeSource;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by arovba on 11/8/15.
 */
public class Ex16Main {
    public static void main(String[] args) {
        final char[] VOWELS_STRING = "AEIOUYaeiouy".toCharArray();
        final String FILE_NAME = "UniqueWords.txt";
        String FILE_PATH;
        ArrayList<String> words = new ArrayList<>();
        int overallVowelsCount = 0;

        Set<Character> vowels = new HashSet<>();
        for (char ch: VOWELS_STRING)
            vowels.add(ch);

        CodeSource src = Ex16Main.class.getProtectionDomain().getCodeSource();
        try {
            FILE_PATH = src.getLocation().toURI().getPath() + FILE_NAME;
            File file = new File(FILE_PATH);

            Scanner in = new Scanner(file).useDelimiter(Pattern.compile("[\\W']+"));
            while (in.hasNext())
                Collections.addAll(words, in.next());

        } catch (Exception e) {
            e.printStackTrace();
        }

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
