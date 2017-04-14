package net.tonyrovba.tij.utils;

import java.io.File;
import java.security.CodeSource;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Util class to generate words and get words from several sources.
 *
 * @author Anton Rovba (tony.rovba@gmail.com)
 * @since 11/9/15
 *
 */
public class WordsGenerator {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

    public static ArrayList<String> generateRandomWords(int wordsCount, int wordsLength) {
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            words.add(String.valueOf(generateWord(wordsLength)));
        }
        return words;
    }

    public static String generateWord(int length) {
        Random random = new Random();
        char[] word = new char[length];

        for (int j = 0; j < length; j++) {
            word[j] = LETTERS.charAt(random.nextInt(26));
        }

        return new String(word);
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
