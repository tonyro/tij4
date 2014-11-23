package net.tonyrovba.tij.innerclasses.Ex4;

import net.tonyrovba.tij.innerclasses.Ex4.*;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
public class MainEx4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(4);

        for (int i = 0; i < 4; i++) {
            sequence.add(new StringHolder("string_" + i));
        }

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }

        System.out.println(selector.getSequence().toString());
    }
}
