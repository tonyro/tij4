package net.tonyrovba.tij.innerclasses.Ex5;

/**
 * Created by Anton on 07.09.2014.
 */
public class Outer {
    public Outer() {
        System.out.println("Outer constructor");
    }

    public class Inner {
        public Inner() {
            System.out.println("Inner constructor");
        }
    }
}
