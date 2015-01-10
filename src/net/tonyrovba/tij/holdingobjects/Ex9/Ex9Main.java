package net.tonyrovba.tij.holdingobjects.Ex9;

import net.tonyrovba.tij.innerclasses.Ex2.StringHolder;

import java.util.Iterator;

/**
 * Created by tonyr on 2/12/14.
 */
public class Ex9Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        for (int i = 0; i < 7; i++) {
            sequence.add(new StringHolder("string_" + i));
        }

        Iterator<StringHolder> it = sequence.getIterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
