package net.tonyrovba.tij.holdingobjects.Ex15;

/**
 * Created by anton on 9/26/15.
 */
public class StringProcessor {

    static public void process(String phrase) {
        phrase.replaceAll("\\s", "");

        System.out.println(phrase);
    }
}
