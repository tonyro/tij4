package net.tonyrovba.tij.innerclasses.Ex13;

import net.tonyrovba.tij.innerclasses.Ex9.Destination;

/**
 * Created by Anton on 18.09.2014.
 */
public class Parcel5 {
    public Destination destination(final String s) {
        return new Destination() {
            private String label;
           { label = s; }
            public String readLabel() { return label; }
        };
    }
}