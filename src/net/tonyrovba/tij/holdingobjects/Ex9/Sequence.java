package net.tonyrovba.tij.holdingobjects.Ex9;

import net.tonyrovba.tij.innerclasses.Ex2.StringHolder;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tonyr on 2/12/14.
 */
public class Sequence {
    private ArrayList<StringHolder> items;
    //private int next = 0;

    // Constructor
    public Sequence() { items = new ArrayList<StringHolder>(); }

    public void add(StringHolder x) {
        items.add(x);
    }

    public Iterator<StringHolder> getIterator() {
        return items.iterator();
    }
}
