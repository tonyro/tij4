package net.tonyrovba.tij.holdingobjects.Ex14;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Anton on 16.05.2015.
 */
public class Ex14Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.listIterator(list.size() / 2).add(i);
            System.out.println(list);
        }
    }
}
