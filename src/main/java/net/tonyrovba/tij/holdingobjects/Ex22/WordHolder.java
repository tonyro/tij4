package net.tonyrovba.tij.holdingobjects.Ex22;

/**
 * Created by tonnur on 2/7/16.
 */
public class WordHolder {
    private static int totalWords = 0;
    private String word;
    private int count;

    public WordHolder(String word) {
        this.word = word;
        this.count = 1;
        totalWords++;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public static int getTotalWords() {
        return totalWords;
    }

    public void addCount() {
        count++;
    }

    public boolean equals(String word) {
        return this.word.equals(word);
    }
}
