package net.tonyrovba.tij.holdingobjects.Ex15;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by anton on 9/26/15.
 */
public class StringProcessor {
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    static public void process(String phrase) {

        phrase = cleanString(phrase);
        parse(phrase);

        System.out.println(phrase);
    }

    static private String cleanString (String string) {
        return string.replaceAll("\\s", "");
    }

    private static Map<String, String> parse(String phrase) {
        Multimap<String, String> actions = HashMultimap.create();

        if (!phrase.startsWith("+")) {
            System.out.println("[ ERROR ]  The phrase starts not from '+' sign!");
            return null;
        }

        if (!LETTERS.contains(phrase.substring(1, 2))) {
            System.out.println("[ ERROR ]  There is no letter next to the first '+'!");
            return null;
        } else {
            actions.put("+", phrase.substring(1, 2));
        }

        for (int i = 2; i < phrase.length();) {
            if (phrase.charAt(i) == '+') {
                if (!LETTERS.contains(phrase.substring(i+1, i+2))) {
                    System.out.println("[ ERROR ]  There is no letter next to '+'!");
                    return null;
                } else {
                    actions.put(phrase.substring(i, i+1), phrase.substring(i+1, i+2));
                }
            }
        }

        return null;
    }

    static private LinkedList<String> evaluate(Map<String, String> actions) {


        return null;
    }
}
