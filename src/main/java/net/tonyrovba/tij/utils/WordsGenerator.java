package net.tonyrovba.tij.utils;

import java.io.File;
import java.security.CodeSource;
import java.util.*;
import java.util.regex.Pattern;

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

    public static ArrayList<String> getWordsFromFile(String fileName) {
        ArrayList<String> words = new ArrayList<>();
        String filePath;

        CodeSource src = WordsGenerator.class.getProtectionDomain().getCodeSource();
        try {
            filePath = src.getLocation().toURI().getPath() + fileName;
            File file = new File(filePath);

            Scanner in = new Scanner(file).useDelimiter(Pattern.compile("[\\W']+"));
            while (in.hasNext())
                Collections.addAll(words, in.next());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return words;
    }

    public static ArrayList<String> getWordsFromString(String string) {
        ArrayList<String> words = new ArrayList<>();

        Scanner in = new Scanner(string).useDelimiter(Pattern.compile("[\\W']+"));
        while (in.hasNext())
            Collections.addAll(words, in.next());

        return words;
    }
}
