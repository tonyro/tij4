package net.tonyrovba.tij.innerclasses.Ex22;

/**
 * Created by tonnur on 03.02.15.
 */
public class MainEx22 {

    public static void main(String[] args) {
        Sequence seq = new Sequence(5);

        for (int i = 0; i < 5; i++)
            seq.add(new StringHolder("String_" + i));

        Selector sel = seq.getSelector();

        while (sel.hasNext()) {
            System.out.println(sel.next());
        }
    }
}
