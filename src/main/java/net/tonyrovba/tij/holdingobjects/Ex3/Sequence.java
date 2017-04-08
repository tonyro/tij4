package net.tonyrovba.tij.holdingobjects.Ex3;

import java.util.ArrayList;

/**
 * @author tonyro
 *
 * (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.
 *
 */

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private ArrayList<Object> items;

    public Sequence() { items = new ArrayList<>(); }

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        Sequence sequence1 = new Sequence();
        for(int i = 0; i < 30; i++)
            sequence1.add(Integer.toString(i));
        Selector selector1 = sequence1.selector();
        while(!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
