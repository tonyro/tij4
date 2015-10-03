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
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";

    static public void process(String phrase) {

//        phrase = cleanString(phrase);
        System.out.println(parse(phrase));
    }

    static private String cleanString (String string) {
        return string.replaceAll("\\s", "");
    }

    private static Stack<String> parse(String phrase) {
        Stack<String> storage = new Stack<>();
        int index = 0;

        if (!phrase.startsWith("+")) {
            System.out.println("[ ERROR ]  The phrase starts not from '+' sign!");
            return null;
        }

        if (!LETTERS.contains(phrase.substring(index+1, index+2))) {
            System.out.println("[ ERROR ]  There is no letter next to the first '+'!");
            return null;
        } else {
            storage.push(phrase.substring(index+1, index+2));
            index+=2;
        }

        while (index < phrase.length()) {
            if (phrase.charAt(index) == '+') {
                if (!LETTERS.contains(phrase.substring(index+1, index+2))) {
                    System.out.println("[ ERROR ]  There is no letter next to '+' at index [ " + index + " ] !");
                    return null;
                } else {
                    storage.push(phrase.substring(index+1, index+2));
                    index+=2;
                }
            }
            if (phrase.charAt(index) == '-') {
                System.out.print(storage.pop());
                index++;
            }
        }

        return storage;
    }
}
