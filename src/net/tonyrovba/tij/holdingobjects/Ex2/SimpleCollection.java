package net.tonyrovba.tij.holdingobjects.Ex2;

/**
 * Created by tonyr on 2/6/14.
 */

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>() {
        };
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}