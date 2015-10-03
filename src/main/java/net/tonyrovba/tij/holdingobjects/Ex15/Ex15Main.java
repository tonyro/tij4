package net.tonyrovba.tij.holdingobjects.Ex15;

/**
 * Created by anton on 9/26/15.
 */
public class Ex15Main {

    private static final String PHRASE = "+U+n+c--+e+r+t--+a-+i-+n+t+y--+ -+r+u--+l+e+s--";

    public static void main(String[] args) {
        StringProcessor.process(PHRASE);

        System.out.println(PHRASE.substring(-1, 5));
    }
}
