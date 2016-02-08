package net.tonyrovba.tij.holdingobjects.Ex22;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tonnur on 2/7/16.
 * <p>
 * (5) Modify the previous exercise so that it uses a class containing a String
 * and a count field to store each different word, and a Set of these objects to maintain the list
 * of words.
 */
public class Ex22Main {
    public static void main(String[] args) {
        final String fileName = "UniqueWords.txt";
        ArrayList<String> words = WordsGenerator.getWordsFromFile(fileName);
        Set<WordHolder> wordContainer = new HashSet<>();

        if (wordContainer.isEmpty()) {
            wordContainer.add(new WordHolder(words.get(0)));
        }
        for (int i = 1; i < words.size(); i++) {
            boolean isThere = false;
            String currentWord = words.get(i);
            for (WordHolder wh : wordContainer) {
                if (wh.equals(currentWord)) {
                    wh.addCount();
                    isThere = true;
                }
            }

            if (!isThere) {
                wordContainer.add(new WordHolder(words.get(i)));
            }
        }

        System.out.println("Total number of words: " + WordHolder.getTotalWords());
    }
}
