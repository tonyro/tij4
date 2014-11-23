package net.tonyrovba.tij.innerclasses.tmp.two;

import net.tonyrovba.tij.innerclasses.Ex10.Destination;

/**
 * Created by Anton on 23.11.2014.
 */
public class Parcel9 {
    // Argument must be final to use inside
    // anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
