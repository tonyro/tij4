package net.tonyrovba.tij.innerclasses.Ex2;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
public class MainEx2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(2);

        for (int i = 0; i < 7; i++) {
            sequence.add(new StringHolder("string_" + i));
        }

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
