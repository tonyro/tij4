package net.tonyrovba.tij.innerclasses.Ex4;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    public class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        public Sequence getSequence() {
            return Sequence.this;
        }
        public String toString() {
            return "Here is SequenceSelector!";
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public String toString() {
        return "Here is Sequence!";
    }
}
