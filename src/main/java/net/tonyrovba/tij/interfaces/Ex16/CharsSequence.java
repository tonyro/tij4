package net.tonyrovba.tij.interfaces.Ex16;

import java.nio.CharBuffer;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
public class CharsSequence implements Readable {

    private static Random rand = new Random();
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public CharsSequence(int count) { this.count = count; }

    public int read(CharBuffer cb) {
        if(count-- == 0) {
            return -1;
        }

        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 5; i++) {
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");

        return 6;
    }
}
