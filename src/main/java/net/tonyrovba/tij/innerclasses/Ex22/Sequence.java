package net.tonyrovba.tij.innerclasses.Ex22;

/**
 * Created by tonnur on 18.01.15.
 */
public class Sequence {
    private Object[] sequence;
    private int index = -1;

    public Sequence(int size) {
        sequence = new Object[size];
    }

    public void add(Object x) {
        index++;
        sequence[index] = x;
    }

    private class ReverseSelector implements Selector {

        public boolean hasNext() {
            return !(index < 0);
        }

        public Object next() {
            return sequence[index--];
        }
    }

    public Selector getSelector() {
        return new ReverseSelector();
    }
}
